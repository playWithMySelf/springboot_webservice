package com.example.demo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.io.UnsupportedEncodingException;

/**
 * @author: inwei
 * @create: ${Date} ${time}
 * @description:
 * @param: ${params}
 * @return: ${returns}
 */
@WebService
public interface AppService {
    @WebMethod
    String getUserName(@WebParam(name = "id") String id) throws UnsupportedEncodingException;
    @WebMethod
    public String getUser(String id) throws UnsupportedEncodingException;
}
