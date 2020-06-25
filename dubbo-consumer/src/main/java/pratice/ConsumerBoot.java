/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package pratice;

import org.dubbo.pratice.model.UserInfo;
import org.dubbo.pratice.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Objects;

/**
 * @author zhenlong
 * @version $Id: ConsumerBoot.java, v 0.1 2020年06月25日 8:53 AM zhenlong Exp $
 */
public class ConsumerBoot {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        UserInfo userInfo = new UserInfo();
        userInfo.setName("zhenlong.yl");
        userInfo.setAge(29);
        String userId = userService.addUser(userInfo);
        System.out.println(userId);
        userInfo = userService.queryById(userId);
        if (Objects.nonNull(userInfo)) {
            System.out.println(userInfo.getName());
        }
    }
}