package org.example.designPattern.behavior.cmd;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/7/25
 * @description zip 接收者
 */
@Slf4j
public class ZipReceiver implements IReceiver {
    /**
     * zip格式的压缩算法
     *
     * @param source
     * @param to
     * @return
     */
    @Override
    public boolean compress(String source, String to) {
        log.info("{}->{} zip 压缩成功", source, to);
        return true;
    }

    /**
     * zip格式的解压缩算法
     *
     * @param source
     * @param to
     * @return
     */
    @Override
    public boolean uncompress(String source, String to) {
        log.info("{}->{} zip 解压缩成功", source, to);
        return true;
    }
}
