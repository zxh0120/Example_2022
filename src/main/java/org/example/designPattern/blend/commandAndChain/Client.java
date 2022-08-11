package org.example.designPattern.blend.commandAndChain;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zxh
 * @date 2022/8/10
 * @description 责任链 +命令模式场景类
 */
@Slf4j
public class Client {
    public static void main(String[] args) throws IOException {
        Invoker invoker = new Invoker();
        while (true) {
            //unix下的默认提示符号
            log.info("#");
            //捕获输出
            String input = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            //输入quit或exit则退出
            if (input.equals("quit") || input.equals("exit")) {
                return;
            }
            log.info("context:{}", invoker.exec(input));
        }
    }
}
