/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package org.dubbo.pratice;

import org.dubbo.pratice.model.UserInfo;
import org.dubbo.pratice.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Objects;

/**
 * @author zhenlong
 * @version $Id: ProviderBoot.java, v 0.1 2020年06月25日 8:53 AM zhenlong Exp $
 */
public class ProviderBoot {

    public static void main(String[] args) throws Exception{
        ApplicationContext ac = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        ((ClassPathXmlApplicationContext) ac).start();
        System.in.read();
    }
}