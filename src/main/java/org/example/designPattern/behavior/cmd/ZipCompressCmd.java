package org.example.designPattern.behavior.cmd;

/**
 * @author zxh
 * @date 2022/7/25
 * @description zip压缩命令
 */
public class ZipCompressCmd extends AbstractCmd {
    @Override
    public boolean execute(String source, String to) {
        return super.zip.compress(source, to);
    }

}
