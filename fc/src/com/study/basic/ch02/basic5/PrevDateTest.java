package com.study.basic.ch02.basic5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PrevDateTest {

    public static void main(String[] args) {
        // 현재 날짜/시간
        Date now = new Date();
        // 현재 날짜/시간 출력
        System.out.println(now); // Thu Jun 17 06:57:32 KST 2021
        // 포맷팅 정의
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        // 포맷팅 적용
        String formatedNow = formatter.format(now);
        // 포맷팅 현재 날짜/시간 출력
        System.out.println(formatedNow); // 2021년 06월 17일 06시 57분 32초

        // 현재 날짜/시간
        Date cNow = Calendar.getInstance().getTime();
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeZone());
        // 현재 날짜/시간 출력
        System.out.println(cNow);

    }
}
