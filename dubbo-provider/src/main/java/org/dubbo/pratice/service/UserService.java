/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package org.dubbo.pratice.service;

import org.dubbo.pratice.model.UserInfo;

/**
 *
 * @author zhenlong
 * @version $Id: UserService.java, v 0.1 2020年06月25日 8:53 AM zhenlong Exp $
 */
public interface UserService {

    String addUser(UserInfo userInfo);

    UserInfo queryById(String userId);
}