package org.example.designPattern.blend.commandAndChain;

/**
 * @author zxh
 * @date 2022/8/10
 * @description ls 命令
 */
public class Ls extends AbstractLs {
    @Override
    protected String getOperateParam() {
        return DEFAULT_PARAM;
    }

    @Override
    protected String echo(CommandVo commandVo) {
        return  FileManage.ls(commandVo.formatData());
    }
}
