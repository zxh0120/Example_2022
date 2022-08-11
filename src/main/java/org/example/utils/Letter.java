package org.example.utils;

import lombok.extern.slf4j.Slf4j;
import sun.management.MappedMXBeanType;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zxh
 * @date 2022/8/3
 * @description
 */
@Slf4j
public class Letter {
    public static void main(String[] args) {
        String kmmc = "A级管理费";
        String rank = kmmc.substring(0, 1);
        log.info("支付" + rank + "级管理费");

        Map<String, String> rankMap = new HashMap();
        int i = 0;
        if (i > 0) {

        } else {

        }
    }
}
