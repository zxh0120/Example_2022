package org.example.designPattern.behavior.strategy;

/**
 * @author zxh
 * @date 2022/7/25
 * @description 环境角色
 */
public class Context {
    /**
     * 指向抽象算法
     */
    private Algorithm algorithm;

    public Context(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * 执行压缩算法
     *
     * @param source
     * @param to
     * @return
     */
    public boolean compress(String source, String to) {
        return algorithm.compress(source, to);
    }

    /**
     * 执行解压缩算法
     * @param source
     * @param to
     * @return
     */
    public boolean uncompress(String source, String to) {
        return  algorithm.uncompress(source,to);
    }


}
