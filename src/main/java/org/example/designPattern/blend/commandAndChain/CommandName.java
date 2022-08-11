package org.example.designPattern.blend.commandAndChain;

/**
 * @author zxh
 * @date 2022/8/10
 * @description 抽象命名类(责任链模式中的handle, 也就是中控程序, 控制一个链应该如何建立)
 */
public abstract class CommandName {

    private CommandName nextOperator;

    public final String handleMessage(CommandVo commandVo) {
        //处理结果
        String result = "";
        //判断是否是自己处理的参数
        if (commandVo.getParam().size() == 0 || commandVo.getParam().contains(this.getOperateParam())) {
            result = this.echo(commandVo);
        } else {
            if (this.nextOperator != null) {
                result = this.nextOperator.handleMessage(commandVo);
            } else {
                result = "命令无法执行";
            }
        }
        return result;
    }

    /**
     * 设置剩余参数有谁处理
     *
     * @param commandName
     */
    public void setNext(CommandName commandName) {
        this.nextOperator = commandName;
    }

    /**
     * 每个处理者都要处理一个后缀参数
     *
     * @return
     */
    protected abstract String getOperateParam();

    /**
     * 每个处理者都必须实现处理任务
     *
     * @param commandVo
     * @return
     */
    protected abstract String echo(CommandVo commandVo);
}
