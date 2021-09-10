package com.study.basic.ch02.basic2;

public class BirthDay {

    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        // 일 유효성 로직 ...

        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) return;
        isValid = true;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        // 연도 유효성 검증 ...

        this.year = year;
    }

    public void showDate() {
        if(isValid) {
            System.out.println("show");
        }else {
            System.out.println("not show");
        }
    }
}
