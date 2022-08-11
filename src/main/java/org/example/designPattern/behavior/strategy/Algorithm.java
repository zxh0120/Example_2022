package org.example.designPattern.behavior.strategy;

/**
 * @author zxh
 * @date 2022/7/25
 * @description 抽象压缩算法
 */
public interface Algorithm {
    /**
     * 压缩算法
     *
     * @param source
     * @param to
     * @return
     */
    boolean compress(String source, String to);

    /**
     * 解压缩算法
     *
     * @param source
     * @param to
     * @return
     */
    boolean uncompress(String source, String to);
}
