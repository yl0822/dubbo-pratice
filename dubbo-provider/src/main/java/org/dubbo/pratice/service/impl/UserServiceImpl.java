/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package org.dubbo.pratice.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.dubbo.pratice.model.UserInfo;
import org.dubbo.pratice.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhenlong
 * @version $Id: UserServiceImpl.java, v 0.1 2020年06月25日 8:55 AM zhenlong Exp $
 */
public class UserServiceImpl implements UserService {

    private ConcurrentHashMap<String, UserInfo> dataMap;

    @PostConstruct
    public void init() {
        dataMap = new ConcurrentHashMap<>();
    }

    @Override
    public String addUser(UserInfo userInfo) {
        if (StringUtils.isBlank(userInfo.getUserId())) {
            userInfo.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
        }
        dataMap.put(userInfo.getUserId(), userInfo);
        return userInfo.getUserId();
    }

    @Override
    public UserInfo queryById(String userId) {
        return dataMap.get(userId);
    }
}