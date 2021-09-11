package com.study.basic.ch03.inter.domain.dao;

import com.study.basic.ch03.inter.domain.UserInfo;

// 인터페이스 설계 작업은 어렵지만 중요하다!
public interface UserInfoDao {

    // 인터페이스만 보고 사용 가능
    // 메소드명 가독성이 좋아야 할듯
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInf(UserInfo userInfo);

}
