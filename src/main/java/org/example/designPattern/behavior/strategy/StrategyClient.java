package org.example.designPattern.behavior.strategy;

import lombok.extern.slf4j.Slf4j;

import java.util.zip.ZipFile;

/**
 * @author zxh
 * @date 2022/7/25
 * @description 策略模式的场景类
 */
@Slf4j
public class StrategyClient {
    public static void main(String[] args) {
        //定义环境角色
        Context context;
        //对文件执行zip压缩算法
        log.info("执行算法");
        // context = new Context(new Zip());
        /**
         * 切换算法
         */
        context = new Context(new Gzip());
        context.compress("C:/test.zip", "d:/test.zip");
        context.uncompress("C:/test.zip", "d：/test.zip");
    }
}
