/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package org.dubbo.pratice.model;

import java.io.Serializable;

/**
 *
 * @author zhenlong
 * @version $Id: UserInfo.java, v 0.1 2020年06月25日 8:54 AM zhenlong Exp $
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 9195416681450335588L;
    private String userId;
    private String name;
    private int age;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}