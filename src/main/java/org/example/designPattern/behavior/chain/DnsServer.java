package org.example.designPattern.behavior.chain;

import java.util.Random;

/**
 * @author zxh
 * @date 2022/7/26
 * @description 抽象域名服务器
 */
public abstract class DnsServer {
    /**
     * 上级的DNS是谁
     */
    private DnsServer upperServer;

    /**
     * 解析域名
     *
     * @param domain
     * @return
     */
    public final Recorder resolver(String domain) {
        Recorder recorder = null;
        //是本服务器能解析的域名
        if (isLocal(domain)) {
            recorder = echo(domain);
        } else {
            //本服务器不能解析，提交上级DNS进行解析
            recorder = upperServer.resolver(domain);
        }
        return recorder;

    }

    /**
     * 指向上级的DNS
     *
     * @param dnsServer
     */
    public void setUpperServer(DnsServer dnsServer) {
        this.upperServer = dnsServer;
    }

    /**
     * 每个DNS服务器都必须实现解析任务
     *
     * @param domain
     * @return
     */
    protected Recorder echo(String domain) {
        Recorder recorder = new Recorder();
        //获取IP地址
        recorder.setIp(getIPAddress());
        recorder.setDomain(domain);
        return recorder;
    }


    /**
     * 每个DNS都有一个数据处理区(Zone),检查域名是否在本区中
     *
     * @param domain
     * @return
     */
    protected abstract boolean isLocal(String domain);

    private String getIPAddress() {
        Random r = new Random();
        String address = r.nextInt(225) + "." + r.nextInt(255) + "." + r.nextInt(255) + "." + r.nextInt(255);
        return address;
    }


}
