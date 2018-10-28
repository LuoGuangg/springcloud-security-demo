package demo.guang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version V1.0
 * @author: LuoGuang
 * @Package com.guang.springcloud
 * @Description:
 * @date: 2018/8/13 11:34
 */
@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7002_App {
    public static void main(String[] args){
        SpringApplication.run(EurekaServer7002_App.class, args);
    }
}
