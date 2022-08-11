package org.example.designPattern.blend.commandAndChain;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author zxh
 * @date 2022/8/10
 * @description 命令对象
 */
@Slf4j
public class CommandVo {
    /**
     * 定义参数名与参数的分割符号，一般为空格
     */
    public final static String DIVIDE_FLAG = " ";
    /**
     * 定义参数前的符号,unix一般是-,如ls -la
     */
    public final static String PREFIX_FLAG = "-";
    /**
     * 命令名，如ls 、du
     */
    private String commandName = "";
    /**
     * 参数列表
     */
    private ArrayList<String> paramList = new ArrayList<>();
    /**
     * 操作数列表
     */
    private ArrayList<String> dataList = new ArrayList<>();

    /**
     * 通过构造函数传递进来命令
     */
    public CommandVo(String commandName) {
        if (commandName != null && commandName.length() > 0) {
            //根据分割符号拆分出执行符号
            String[] complexStr = commandName.split(CommandVo.DIVIDE_FLAG);
            //第一个执行符号
            this.commandName = complexStr[0];
            //把参数放到List中
            for (int i = 1; i < complexStr.length; i++) {
                String str = complexStr[i];
                //包含前缀符号,认为是参数
                if (str.indexOf(CommandVo.PREFIX_FLAG) == 0) {
                    this.paramList.add(str.replace(CommandVo.PREFIX_FLAG, "").trim());
                } else {
                    this.dataList.add(str.trim());
                }
            }
        } else {
            log.info("命令解析失败,必须传递一个命令才能执行");
        }
    }

    /**
     * 得到命令名
     */
    public String getCommandName() {
        return this.commandName;
    }

    /**
     * 获得参数
     */
    public ArrayList<String> getParam() {
        //为了方便处理空参数
        if (this.paramList.size() == 0) {
            this.paramList.add("");
        }
        return new ArrayList<>(new HashSet<>(this.paramList));
    }

    /**
     * 获得操作数
     *
     * @return
     */
    public ArrayList<String> getData() {
        return this.dataList;
    }

    /**
     * 功能： 返回值类型： 参数列表：
     *
     * @return
     */
    public String formatData() {
        return this.getData().toString();
    }
}
