package org.example.designPattern.behavior.cmd;

/**
 * @author zxh
 * @date 2022/7/25
 * @description 抽象压缩命令
 */
public abstract class AbstractCmd {

    /**
     * 对接收者的引用
     */
    protected IReceiver zip = new ZipReceiver();
    protected IReceiver gzip = new GzipReceiver();

    /**
     * 抽象方法，命令的具体单元
     *
     * @param source
     * @param to
     * @return
     */
    public abstract boolean execute(String source, String to);

}
