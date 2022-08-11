package org.example.designPattern.behavior.chain;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author zxh
 * @date 2022/7/26
 * @description 责任链 场景类
 * 业务场景：有三个DNS服务器：上海DNS服务器(区服务器),中国顶级DNS服务器(父服务器),全球顶级DNS服务器,用责任链模式来实现DNS解析过程
 */
@Slf4j
public class ChinaClient {
    public static void main(String[] args) {
        //上海域名服务器
        DnsServer sh = new SHDnsServer();
        //中国顶级域名服务器
        DnsServer china = new ChinaTopDnsServer();
        //全球顶级域名服务器
        DnsServer top = new TopDnsServer();

        //定义查询路径
        china.setUpperServer(top);
        sh.setUpperServer(china);

        //解析域名
        log.info("域名解析模拟器");

        String shDomain = "www.xxx.sh.cn";
        String chinaDomain = "www.xxx.cn";
        String topDomain = "www.xxx.cn.top";

        Recorder recorder = sh.resolver(topDomain);
        System.out.println("=================DNS服务器解析结果===============");
        System.out.println(recorder);

    }
}
