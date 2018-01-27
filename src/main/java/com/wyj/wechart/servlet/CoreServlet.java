package com.wyj.wechart.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wyj.wechart.service.CoreService;
import com.wyj.wechart.utils.SignUtil;
/**
 * 来接收微信服务器传来信息
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月23日 下午2:17:39
 */
@WebServlet(urlPatterns = "/wechat", description = "wechat")
public class CoreServlet extends HttpServlet {
    private static final long serialVersionUID = -8685285401859800066L;

    /**
     * 确认请求来自微信服务器
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>>>doGet()<<<<<<<<<<<");
        // 微信加密签名  
        String signature = req.getParameter("signature");  
        // 时间戳  
        String timestamp = req.getParameter("timestamp");  
        // 随机数  
        String nonce = req.getParameter("nonce");  
        // 随机字符串  
        String echostr = req.getParameter("echostr");  
  
        PrintWriter out = resp.getWriter();  
        // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败  
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {  
            out.print(echostr);  
        }  
        out.close();  
        out = null;  
    }

    /**
     * 处理微信服务器发来的消息
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>>>doPost()<<<<<<<<<<<");
        // 消息的接收、处理、响应
        // 将请求、响应的编码均设置为UTF-8（防止中文乱码）
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        // 调用核心业务类接收消息、处理消息
        String respXml = CoreService.processRequest(req);

        // 响应消息
        PrintWriter out = resp.getWriter();
        out.print(respXml);
        out.close();
    }

}
