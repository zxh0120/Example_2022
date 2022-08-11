package org.example.designPattern.blend.commandAndChain;

/**
 * @author zxh
 * @date 2022/8/10
 * @description 具体的ls命令
 */
public class LsCommand extends Command {

    @Override
    public String execute(CommandVo commandVo) throws ClassNotFoundException {
        //返回链表的首节点
        CommandName firstNode = super.buildChina(AbstractLs.class).get(0);
        return firstNode.handleMessage(commandVo);
    }
}
