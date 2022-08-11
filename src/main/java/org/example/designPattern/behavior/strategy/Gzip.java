package org.example.designPattern.behavior.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/7/25
 * @description Gzip压缩算法
 */
@Slf4j
public class Gzip implements Algorithm {
    /**
     * Gzip格式压缩算法
     *
     * @param source
     * @param to
     * @return
     */
    @Override
    public boolean compress(String source, String to) {
        log.info("{}-->{} GZIP压缩成功",source,to);
        return true;
    }

    /**
     * Gzip格式解压缩算法
     * @param source
     * @param to
     * @return
     */
    @Override
    public boolean uncompress(String source, String to) {
        log.info("{}-->{} GZIP解压成功",source,to);
        return true;
    }
}
