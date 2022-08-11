package org.example.designPattern.structure.bridge;

/**
 * @author zxh
 * @date 2022/8/1
 * @description Postfix 邮件服务器
 */
public class Postfix extends MailServer {


    public Postfix(MainTemplate mainTemplate) {
        super(mainTemplate);
    }

    /**
     * 修正邮件发送程序
     */
    @Override
    public void sendMail() {
        //增加邮件服务器信息
        String context = "Received :form XXX (unknow xxx.xxx.xxx.xxx) by";
        super.mainTemplate.add(context);
        super.sendMail();
    }
}
