package org.example.designPattern.blend.commandAndChain;

/**
 * @author zxh
 * @date 2022/8/10
 * @description 文件管理类(3个实现类都关联到FileManager ， 它是负责与操作系统交互, 要把unix的命令迁移到windows上运行, 就需要调用windows的底层函数, 实现起来比较复杂, 和本章内容没有太大的关系)
 */
public class FileManage {
    /**
     * ls 命令
     *
     * @return
     * @param s
     */
    public static String ls(String s) {
        return "file\nfile2\nfile3\nfile4";
    }

    /**
     * ls -l 命令
     */
    public static String ls_l(String path) {
        String str = " drw-rw-rw root system 1024 2022-08-10 10:43 file1\n";
        str = str + " drw-rw-rw root system 1024 2022-08-10 10:43 file1\n";
        str += " drw-rw-rw root system 1024 2022-08-10 10:43 file1\n";
        return str;
    }

    /**
     * ls -a 命令
     */
    public static String ls_a(String path) {
        return ".\n..\nflie1\nfile2\nfile3";
    }
}
