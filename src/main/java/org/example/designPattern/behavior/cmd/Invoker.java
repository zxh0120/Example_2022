package org.example.designPattern.behavior.cmd;

/**
 * @author zxh
 * @date 2022/7/25
 * @description 调用者
 */
public class Invoker {
    /**
     * 抽象命令的引用
     */
    private AbstractCmd abstractCmd;

    public Invoker(AbstractCmd abstractCmd) {
        this.abstractCmd = abstractCmd;
    }

    /***
     * 执行命令
     * @param source
     * @param to
     * @return
     */
    public  boolean execute(String source,String to){
        return abstractCmd.execute(source, to);
    }
}
