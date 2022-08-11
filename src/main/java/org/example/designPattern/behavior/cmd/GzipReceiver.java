package org.example.designPattern.behavior.cmd;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/7/25
 * @description gzip 接收者
 */
@Slf4j
public class GzipReceiver implements IReceiver {

    /**
     * gzip格式的压缩算法
     *
     * @param source
     * @param to
     * @return
     */
    @Override
    public boolean compress(String source, String to) {
        log.info("{}->{} gzip 压缩成功", source, to);
        return true;
    }

    /**
     * gzip格式的解压缩算法
     *
     * @param source
     * @param to
     * @return
     */
    @Override
    public boolean uncompress(String source, String to) {
        log.info("{}->{} gzip 解压缩成功", source, to);
        return true;
    }
}
