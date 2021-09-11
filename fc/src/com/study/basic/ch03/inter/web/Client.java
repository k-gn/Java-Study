package com.study.basic.ch03.inter.web;

import com.study.basic.ch03.inter.domain.UserInfo;
import com.study.basic.ch03.inter.domain.dao.UserInfoDao;
import com.study.basic.ch03.inter.domain.dao.mysql.UserInfoMySqlDao;
import com.study.basic.ch03.inter.domain.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Client {

    public static void main(String[] args) throws IOException {

        // FILE I/O
        // 같은 프로젝트 디렉토리를 먼저 찾음
        FileInputStream fis = new FileInputStream("db.properties");

        // Properties 클래스는 Hashtables의 하위 클래스이다.
        // Hashtables를 상속 받았기 때문에 Map의 속성 즉, Key와 Value를 갖는다.
        // HashMap과 큰 차이가 없지만, Properties 클래스는 파일 입출력을 지원한다.
        // key=value 형식으로 작성 된 파일을 key와 value 로 나누어 저장할 때 유용
        Properties prop = new Properties();
        prop.load(fis); // 메서드의 이름 그대로 파일의 내용을 읽어서 키-값의 형태로 분류해서 맵에 보관한다.
        System.out.println(prop.get("DBTYPE"));
        String dbType = prop.getProperty("DBTYPE"); // key의 value값 꺼내기

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPasswd("!@#$%");
        userInfo.setUserName("이순신");

        // 다형성 활용
        UserInfoDao userInfoDao = null;
        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }
        else if(dbType.endsWith("MYSQL")){
            userInfoDao = new UserInfoMySqlDao();
        }
        else{
            System.out.println("db support error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInf(userInfo);
    }

}
