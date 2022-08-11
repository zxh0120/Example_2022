package org.example.designPattern.behavior.chain;

import lombok.Data;
import lombok.ToString;

/**
 * @author zxh
 * @date 2022/7/26
 * @description BO对象，DNS服务器解析后的结果
 */
@Data

public class Recorder {
    /**
     * 域名
     */
    private String domain;
    /**
     * IP地址
     */
    private String ip;
    /**
     * 属主
     */
    private String owner;

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("域名: ").append(this.domain)
                .append(",ip: ").append(this.ip)
                .append(",解析者 ").append(this.owner);
        return stringBuffer.toString();
    }
}
