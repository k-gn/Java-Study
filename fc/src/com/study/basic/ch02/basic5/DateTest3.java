package com.study.basic.ch02.basic5;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTest3 {

    public static void main(String[] args) {

        // 현재 날짜/시간
        LocalDateTime now = LocalDateTime.now(); // 날짜와 시간을 표현하는 클래스
        // 현재 날짜/시간 출력
        System.out.println(now); // 2021-06-17T06:43:21.419878100
        // 포맷팅
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
        // 포맷팅 현재 날짜/시간 출력
        System.out.println(formatedNow); // 2021년 06월 17일 06시 43분 21초

        // 년, 월(문자열, 숫자), 일(월 기준, 년 기준), 요일(문자열, 숫자), 시, 분, 초 구하기
        int year = now.getYear(); // 연도
        String month = now.getMonth().toString(); // 월(문자열)
        int monthValue = now.getMonthValue(); // 월(숫자)
        int dayOfMonth = now.getDayOfMonth(); // 일(월 기준)
        int dayOfYear = now.getDayOfYear(); // 일(년 기준)
        String dayOfWeek = now.getDayOfWeek().toString(); // 요일(문자열)
        int dayOfWeekValue = now.getDayOfWeek().getValue(); // 요일(숫자)
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();


    }
}
