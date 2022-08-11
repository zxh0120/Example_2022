package org.example.designPattern.structure.bridge;

/**
 * @author zxh
 * @date 2022/8/1
 * @description 桥接模式场景类
 */
public class BridgeClient {
    public static void main(String[] args) {
        //创建一封Text格式的邮件
        MainTemplate mainTemplate = new HtmlMail("A.@aaa.com", "B.bbb.com", "开会", "讨论桥接模式");
        //创建一个mail发送程序
        MailServer mailServer = new SendMain(mainTemplate);
        //发送邮件
        mailServer.sendMail();
    }
}
