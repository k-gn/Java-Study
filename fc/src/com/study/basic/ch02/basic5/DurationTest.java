package com.study.basic.ch02.basic5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.logging.Logger;

public class DurationTest {

    public static void main(String[] args) {
//        LocalDateTime startDateTime = LocalDateTime.of(2020, 12, 20, 9, 30, 30);
//        LocalDateTime endDateTime = LocalDateTime.of(2020, 12, 20, 10, 0, 40);
//        Duration duration = Duration.between(startDateTime, endDateTime);
//        System.out.println(duration.getSeconds());

        LocalDate startDateTime = LocalDate.now();
        LocalDate endDateTime = LocalDate.of(2021, 9, 10);
        Period period = Period.between(startDateTime, endDateTime);
        System.out.println(period.getDays());

    }
}
