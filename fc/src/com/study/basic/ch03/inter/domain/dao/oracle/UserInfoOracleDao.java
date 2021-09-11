package com.study.basic.ch03.inter.domain.dao.oracle;

import com.study.basic.ch03.inter.domain.UserInfo;
import com.study.basic.ch03.inter.domain.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

    public void insertUserInfo(UserInfo userInfo){
        System.out.println("insert into ORACLE DB userId = " + userInfo.getUserId() );
    }

    public void updateUserInfo(UserInfo userInfo){
        System.out.println("update into ORACLE DB userId = " + userInfo.getUserId());
    }

    public void deleteUserInf(UserInfo userInfo){
        System.out.println("delete from ORACLE DB userId = " + userInfo.getUserId());
    }

}
