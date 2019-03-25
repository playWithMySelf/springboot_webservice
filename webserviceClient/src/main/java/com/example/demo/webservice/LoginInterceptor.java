package com.example.demo.webservice;


import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.util.List;

/**
 * @author: inwei
 * @create: ${Date} ${time}
 * @description:
 * @param: ${params}
 * @return: ${returns}
 */
public class LoginInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
    private String username="root";
    private String password="admin";
    public LoginInterceptor(String username, String password) {
        //设置在发送请求前阶段进行拦截
        super(Phase.PREPARE_SEND);
        this.username=username;
        this.password=password;
    }

    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
        List<Header> headers = soapMessage.getHeaders();
        Document doc = DOMUtils.createDocument();
        Element auth = doc.createElementNS("webservice.demo.example.com/","SecurityHeader");
        Element UserName = doc.createElement("username");
        Element UserPass = doc.createElement("password");

        UserName.setTextContent(username);
        UserPass.setTextContent(password);

        auth.appendChild(UserName);
        auth.appendChild(UserPass);

        headers.add(0, new Header(new QName("SecurityHeader"),auth));
    }
}