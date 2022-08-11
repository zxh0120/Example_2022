package org.example.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zxh
 * @date 2022/7/27
 * @description
 */
@Slf4j
public class Test {
    public static void main(String[] args) {

        List<Money> moneyList = new ArrayList<>();
        moneyList.add(new Money().setFundCode("codeA").setConfirmMount("100000.01").setDistributorCharge("303.03").setManagerCharge("0.00"));
        moneyList.add(new Money().setFundCode("code").setConfirmMount("100000.21").setDistributorCharge("202.02").setManagerCharge("0.00"));
        moneyList.add(new Money().setFundCode("codeB").setConfirmMount("1").setDistributorCharge("202.02").setManagerCharge("44.00"));
        moneyList.add(new Money().setFundCode("codeB").setConfirmMount("1").setDistributorCharge("202.02").setManagerCharge("55.10"));
        moneyList.add(new Money().setFundCode("codeC").setConfirmMount("2").setDistributorCharge("202.02").setManagerCharge("0.00"));
        moneyList.add(new Money().setFundCode("codeD").setConfirmMount("2").setDistributorCharge("202.02").setManagerCharge("0.00"));
        //对象直接打印,不用toString
        log.info("集合：{}", moneyList);

        Map<String, List<Money>> collect = moneyList.stream().collect(Collectors.groupingBy(Money::getFundCode));
        Double getManagerChargeSum = null;
        for (Map.Entry<String, List<Money>> data : collect.entrySet()) {
            System.out.println(data.getKey() + " = " + data.getValue());
            if (data.getKey().endsWith("A")) {
                getManagerChargeSum = data.getValue().stream().filter(x -> x.getManagerCharge() != null && x.getManagerCharge().length() > 0).
                        mapToDouble(x -> (Double.parseDouble(x.getManagerCharge()))).sum();
            } else if (data.getKey().endsWith("B")) {
            } else if (data.getKey().endsWith("C")) {
            } else if (data.getKey().endsWith("D")) {
            } else if (data.getKey().endsWith("E")) {
            }
            System.out.println(getManagerChargeSum);
        }


        //list集合 money对象中的某一列求和(某一列不能为空)
        Double sum = moneyList.stream().filter(x -> x.getConfirmMount() != null && x.getConfirmMount().length() > 0).
                mapToDouble(x -> Double.parseDouble(x.getConfirmMount())).sum();
        System.out.println(sum);

        double getManagerCharge = moneyList.stream().filter(x -> x.getManagerCharge() != null && x.getManagerCharge().length() > 0).
                mapToDouble(x -> (Double.parseDouble(x.getManagerCharge()))).sum();
        System.out.println(getManagerCharge);


        long a = 0;
        long b = 0;
        if (a + b > 0) {
            log.info("{}", a);
        }
        log.info("------------------------------------------------------");

    }

}
