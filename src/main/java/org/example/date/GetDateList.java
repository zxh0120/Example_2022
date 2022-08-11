package org.example.date;

import lombok.extern.slf4j.Slf4j;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import static org.example.date.DateUtil.getLocalDateByDay;

/**
 * @author zxh
 * @date 2022/6/29
 * @description
 */
@Slf4j
public class GetDateList {
    /**
     * 估值频率 月
     */
    private static final Integer VALUATION_FREQUENCY_MONTH = 4;
    /**
     * 估值频率 周
     */
    private static final Integer VALUATION_FREQUENCY_WEEK = 5;
    /**
     * 估值频率 天
     */
    private static final Integer VALUATION_FREQUENCY_DAY = 6;

    /**
     * 日期模式 1 自然日(所有日期)   3自然日(非交易日顺延到下一个交易日) 4自然日（非交易日提前到上一个交易日）
     */
    private static final Integer DATE_MODE_NATURAL_DAY = 1;
    /**
     * 日期模式   2交易日 (排除节假日，周六周日)
     */
    private static final Integer DATE_MODE_TRADING_DAY = 2;
    /**
     * 日期模式   3自然日(非交易日顺延到下一个交易日)
     */
    private static final Integer DATE_MODE_NATURAL_DAY_BEFORE = 3;
    /**
     * 日期模式   4自然日（非交易日提前到上一个交易日）
     */
    private static final Integer DATE_MODE_NATURAL_DAY_AFTER = 4;


    public static void main(String[] args) {


        log.info("~~~~~~~~~~~~~~~~~~~~~~~");
        LocalDate startDate = DateUtil.getStrConvertLocalDate("2022-06-20");
        List<LocalDate> localDateDay = getLocalDateByDay(startDate, LocalDate.now());

        List<Integer> dayList = new ArrayList<>();
        dayList.add(1);
        List<LocalDate> localDateWeek = DateUtil.getWeekLocalDateListByRange(startDate, LocalDate.now(), dayList);

        List<Integer> monthList = new ArrayList<>();
        monthList.add(27);
        List<LocalDate> localDateMonth = DateUtil.getLocalDateListByMonth(startDate, LocalDate.now(), monthList);

    }

    /**
     * @param date               估值日期
     * @param valuationFrequency 估值频率 4月，5周，6日
     * @param day                第几天 (当估值频率是4和5时,存在第几天)
     * @param dateMode           日期模式 1-自然日(所有日期),2-交易日 (排除节假日，周六周日),
     *                           3-自然日(非交易日顺延到下一个交易日)[当估值频率是4和5时],4-自然日（非交易日提前到上一个交易日）[当估值频率是4和5时]
     * @return
     */
    public List<String> getDateList(Date date, Integer valuationFrequency, Integer day, Integer dateMode) {
        List<String> resultList = new ArrayList<>();

        List<LocalDate> dateList = new ArrayList<>();
        List<Integer> dayList = new ArrayList<>();
        dayList.add(day);

        if (VALUATION_FREQUENCY_MONTH.equals(valuationFrequency)) {
            dateList = DateUtil.getLocalDateListByMonth(DateUtil.dateConvertLocalDate(date), LocalDate.now(), dayList);
            if (DATE_MODE_NATURAL_DAY.equals(dateMode)) {

            }
        } else if (VALUATION_FREQUENCY_WEEK.equals(valuationFrequency)) {
            dateList = DateUtil.getWeekLocalDateListByRange(DateUtil.dateConvertLocalDate(date), LocalDate.now(), dayList);
        } else if (VALUATION_FREQUENCY_DAY.equals(valuationFrequency)) {
            dateList = DateUtil.getLocalDateByDay(DateUtil.dateConvertLocalDate(date), LocalDate.now());
        }

        //


        /**
         * 需求：
         * 写工具类(估计日期截止到现在日期
         *         1.根据估值频率(周、月、日)和频率中的第几天(每周,每月第几天)
         *         2.日期模式(自然日、交易日、自然日的提前到上一个交易日或者顺延到下一个交易日)
         *
         *
         * 分析：
         * 估值日期与当前时间比较包含开始日期结束日期
         * 比如5月1号，现在时间6月29  [5月1号,5月2号。。。 6月29日]
         * 1.
         *  频率选  4月  ，
         *  第几天 ，月的第几天
         *  日期模式为1 自然日,                          获取出自然日，
         *  日期模式为2 交易日,                          获取出交易日，
         *  日期模式为3 自然日(非交易日顺延到下一个交易日)，      只获取自然日做顺延，非自然日不管；？
         *  日期模式为4 自然日（非交易日提前到 交易日）          只获取自然日做顺延，非自然日不管  ？
         *
         * 2.
         *  频率选 5周日 ，
         *  第几天 ，周的第几天
         *  日期模式为1 自然日,                          获取出自然日，
         *  日期模式为2 交易日,                          获取出交易日，
         *  日期模式为3 自然日(非交易日顺延到下一个 交易日)，
         *
         *
         * 3.
         * 1. 频率选 日  ，
         *  第几天 ，就为0
         *  日期模式为1 自然日,                          获取出自然日，
         *  日期模式为2 交易日,                          获取出交易日，
         *  日期模式为3 自然日(非交易日顺延到下一个 交易日)，
         *
         *
         */

        return resultList;
    }
}
