package com.study.basic.ch02.basic5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTest2 {

    public static void main(String[] args) {

        // 현재 시간
        LocalTime now = LocalTime.now(); // 시간을 표현하는 클래스
        // 현재시간 출력
        System.out.println(now); // 06:20:57.008731300
        // 포맷 정의하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
        // 포맷 적용하기
        String formatedNow = now.format(formatter);
        // 포맷 적용된 현재 시간 출력
        System.out.println(formatedNow); // 06시 20분 57초

        // 시, 분, 초 구하기
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();

    }
}
