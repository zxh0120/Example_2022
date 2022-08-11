package org.example.designPattern.behavior.cmd;

/**
 * @author zxh
 * @date 2022/7/25
 * @description gzip 压缩命令
 */
public class GzipCompressCmd extends AbstractCmd {
    @Override
    public boolean execute(String source, String to) {
        return super.gzip.compress(source, to);
    }
}
