package org.example.designPattern.blend.commandAndChain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/8/10
 * @description 命令分发
 */
@Slf4j
public class Invoker {
    /**
     * 执行命令
     *
     * @param commandStr
     * @return
     */
    public String exec(String commandStr) {
        //定义返回值
        String result = "";
        //首先解析命令
        CommandVo cmd = new CommandVo(commandStr);
        //检查是否支持该命令
        if (CommandEnum.getNames().contains(cmd.getCommandName())) {
            //产生命令对象
            String className = CommandEnum.valueOf(cmd.getCommandName()).getValue();
            Command command;
            try {
                command = (Command) Class.forName(className).newInstance();
                result = command.execute(cmd);
            } catch (Exception e) {
                log.info("Exception:{}", e);
            }
        } else {
            result = "无法执行命令,请检查命令格式";
        }
        return result;
    }
}
