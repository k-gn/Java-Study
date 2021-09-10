package com.study.basic.ch02.basic5;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTest {

    public static void main(String[] args) {
        // 현재 날짜 구하기 (시스템 시계, 시스템 타임존)
        LocalDate now = LocalDate.now(); // 날짜를 표현하는 클래스
        // 현재 날짜 구하기(Paris)
        LocalDate parisNow = LocalDate.now(ZoneId.of("Europe/Paris"));
        // 결과 출력
        System.out.println(now); // 2021-06-17
        System.out.println(parisNow); // 2021-06-16

        // DateTimeFormatter 클래스를 이용하여 원하는 형태로 출력할 수 있습니다.
        // 포맷 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        // 포맷 적용
        String formatedNow = now.format(formatter);
        // 결과 출력
        System.out.println(formatedNow); // 2021/06/17

        // 연도, 월(문자열, 숫자), 일, 일(year 기준), 요일(문자열, 숫자)
        int year = now.getYear();
        String month = now.getMonth().toString();
        int monthValue = now.getMonthValue();
        int dayOfMonth = now.getDayOfMonth();
        int dayOfYear = now.getDayOfYear();
        String dayOfWeek = now.getDayOfWeek().toString();
        int dayOfWeekValue = now.getDayOfWeek().getValue();

    }
}
