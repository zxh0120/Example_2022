package org.example.designPattern.behavior.cmd;

/**
 * @author zxh
 * @date 2022/7/25
 * @description 命令模式场景类
 */
public class CmdClient {
    public static void main(String[] args) {
        //定义一个命令,压缩文件
        AbstractCmd abstractCmd = new ZipCompressCmd();
        //定义调用者
        Invoker invoker = null;
        invoker = new Invoker(abstractCmd);
        //我命令你对这个文件进行压缩
        invoker.execute("D:/test", "E/test");

        //换一个解压命令
        AbstractCmd unZip = new ZipUncompressCmd();
        invoker = new Invoker(unZip);
        invoker.execute("D:test", "E:/test");
    }
}
