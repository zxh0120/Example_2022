package org.example.designPattern.behavior.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/7/25
 * @description zip 压缩算法
 */
@Slf4j
public class Zip implements Algorithm {
    /**
     * zip格式压缩算法
     *
     * @param source
     * @param to
     * @return
     */
    @Override
    public boolean compress(String source, String to) {
        log.info("{}-->{} ZIP压缩成功",source,to);
        return true;
    }

    /**
     * zip格式解压缩算法
     * @param source
     * @param to
     * @return
     */
    @Override
    public boolean uncompress(String source, String to) {
        log.info("{}-->{} ZIP解压成功",source,to);
        return true;
    }
}
