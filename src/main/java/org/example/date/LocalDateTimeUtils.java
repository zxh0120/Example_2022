package org.example.date;

import lombok.extern.slf4j.Slf4j;

import java.time.*;

/**
 * @author zxh
 * @date 2022/7/5
 * @description
 */
@Slf4j
public class LocalDateTimeUtils {
  
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("获取系统现在时间：{}", localDateTime.toString());
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, Month.APRIL, 10, 15, 16);
        log.info("指定时间{}", localDateTime1.toString());
        LocalDate localDate = LocalDate.of(2023, 01, 02);
        LocalTime localTime = LocalTime.of(9, 24, 11);
        LocalDateTime localDateTime2 = localDate.atTime(localTime);
        log.info("拼接LocalDateTime的时间1:{}", localDateTime2);

        LocalTime localTime1 = LocalTime.of(12, 11, 13);
        LocalDate localDate1 = LocalDate.of(2025, 1, 12);
        LocalDateTime localDateTime3 = localTime1.atDate(localDate1);
        log.info("拼接LocalDateTime的时间2:{}", localDateTime3);
        LocalDate localDate2 = localDateTime3.toLocalDate();
        log.info("LocalDateTime转LocalDate:{}", localDate2);


    }
}
