package org.example.date;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author zxh
 * @date 2022/6/30
 * @description
 */

@Slf4j
public class DateUtil {

    public static final String DATE_PATTERN = "yyyy-MM-dd";
    public static final String UNSIGNED_DATE_PATTERN = "yyyyMMdd";

    /**
     * String转LocalDate
     *
     * @param str
     * @return
     */
    public static LocalDate getStrConvertLocalDate(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        return LocalDate.parse(str, formatter);
    }

    /**
     * LocalDate转String
     *
     * @param localDate
     * @return
     */
    public static String getLocalDateConvertStr(LocalDate localDate, String UNSIGNED_DATE_PATTERN) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern(UNSIGNED_DATE_PATTERN);
        return localDate.format(fmt);
    }

    /**
     * LocalDate转Date
     *
     * @param localDate
     * @return
     */
    public static Date localDateConvertDate(LocalDate localDate) {
        if (null == localDate) {
            return null;
        }
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());

    }

    /**
     * Date转LocalDate
     *
     * @param date
     */
    public static LocalDate dateConvertLocalDate(Date date) {
        if (null == date) {
            return null;
        }
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    }


    /**
     * 获取指定⽇期范围内的所有指定星期，包含开始⽇期和结束⽇期
     *
     * @param weeks 1,3,7表⽰周⼀，周三，周⽇
     * @return List<LocalDate>
     */
    public static List<LocalDate> getWeekLocalDateListByRange(LocalDate startDay, LocalDate endDay, List<Integer> weeks) {
        List<LocalDate> localDateList = new ArrayList<>();
        TemporalField fieldISO = WeekFields.of(DayOfWeek.of(1), 1).dayOfWeek();
        LocalDate tempDay;
        for (Integer week : weeks) {
            tempDay = startDay.with(fieldISO, Long.valueOf(week));
            if (tempDay.isBefore(startDay)) {
                tempDay = tempDay.plusWeeks(1);
            }
            while (tempDay.isBefore(endDay) || tempDay.isEqual(endDay)) {
                localDateList.add(tempDay);
                tempDay = tempDay.plusWeeks(1);
            }
        }
        return localDateList;
    }

    /**
     * 获取指定⽇期范围内的所有指定天，包含开始⽇期和结束⽇期
     *
     * @param months 1,29,31表⽰每⽉的1号，29号，31号
     * @return List<LocalDate>
     */
    public static List<LocalDate> getLocalDateListByMonth(LocalDate startDate, LocalDate endDate, List<Integer> months) {
        List<LocalDate> localDateList = new ArrayList<>();
        LocalDate localDate;
        for (Integer month : months) {
            LocalDate tempDate = startDate;
            while (tempDate.isBefore(endDate) || tempDate.getMonthValue() == endDate.getMonthValue()) {
                if (tempDate.lengthOfMonth() >= month) {
                    localDate = tempDate.withDayOfMonth(month);
                    if (localDate.isAfter(startDate) || localDate.isEqual(startDate)) {
                        localDate = tempDate.withDayOfMonth(month);
                        if (localDate.isEqual(endDate) || localDate.isBefore(endDate)) {
                            localDateList.add((localDate));
                        }
                    }
                }
                tempDate = tempDate.plusMonths(1);
            }
        }
        return localDateList;
    }

    /**
     * 获取指定范围内所有⽇期，包含开始⽇期和结束⽇期
     *
     * @return List<LocalDate>
     */
    public static List<LocalDate> getLocalDateByDay(LocalDate startDate, LocalDate endDate) {
        List<LocalDate> localDateList = Stream.iterate(startDate, date -> date.plusDays(1)).
                limit(ChronoUnit.DAYS.between(startDate, endDate))
                .collect(Collectors.toList());
        localDateList.add(endDate);
        return localDateList;
    }

    /**
     * 获取当前日期的上一个月的最后一个自然日
     *
     * @param hkrq
     * @return
     */
    public static String getMonthLastDay(String hkrq) {
        String tempDay = hkrq.substring(0, 6) + "01";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar cal = Calendar.getInstance();
        Date parse = null;
        try {
            parse = dateFormat.parse(tempDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        cal.setTime(parse);
        cal.add(Calendar.DATE, -1);
        return dateFormat.format(cal.getTime());
    }

    public static void main(String[] args) {
        String str = getMonthLastDay("20220630");
        log.info("{}", str);
    }


}