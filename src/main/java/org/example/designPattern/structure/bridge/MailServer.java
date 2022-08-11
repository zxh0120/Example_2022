package org.example.designPattern.structure.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/8/1
 * @description 邮件服务器
 */

@Slf4j
public abstract class MailServer {

    /***
     * 发的是那封邮件
     */
    protected  MainTemplate mainTemplate;

    public MailServer(MainTemplate mainTemplate) {
        this.mainTemplate = mainTemplate;
    }

    /**
     * 发送邮件
     */
    public void sendMail() {
        log.info("--------------------------------正在发送邮件信息----------------------------------");
        //发件人
        log.info("发件人：{}", mainTemplate.getFrom());
        //收件人
        log.info("收件人：{}", mainTemplate.getTo());
        //标题
        log.info("标题：{}", mainTemplate.getSubject());
        //邮件内容
        log.info("邮件内容：{}", mainTemplate.getContent());
    }
}
