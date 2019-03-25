package com.example.demo.webservice;

import javax.jws.WebService;
import java.io.UnsupportedEncodingException;

/**
 * @author: inwei
 * @create: ${Date} ${time}
 * @description:
 * @param: ${params}
 * @return: ${returns}
 */
//name暴露的服务名称, targetNamespace:命名空间,设置为接口的包名倒写(默认是本类包名倒写). endpointInterface接口地址
@WebService(name = "test" ,targetNamespace ="http://webservice.demo.example.com/" ,endpointInterface = "com.example.demo.webservice.AppService")
public class AppServiceImpl implements AppService {
    @Override
    public String getUserName(String id) throws UnsupportedEncodingException {
        System.out.println("===========================getUserName:"+id);
        return "webserviceServer--getUserName: my name is jw";
    }

    @Override
    public String getUser(String id) throws UnsupportedEncodingException {
        System.out.println("===========================getUser:"+id);
        return "webserviceServer--getUserName: this is jw,18 years old";
    }
}
