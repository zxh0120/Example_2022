package org.example.designPattern.behavior.cmd;

/**
 * @author zxh
 * @date 2022/7/25
 * @description 抽象接收者
 */
public interface IReceiver {
    /**
     * 压缩
     * @param source
     * @param to
     * @return
     */
    boolean compress(String source, String to);

    /**
     * 解压缩
     *
     * @param source
     * @param to
     * @return
     */
    boolean uncompress(String source, String to);
}
