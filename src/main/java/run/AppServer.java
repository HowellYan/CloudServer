package run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by HowellYang on 19/6/17 PM2:27.
 * E-Mail:th15817161961@gmail.com
 */

@ComponentScan("cn.com.alien")
@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class AppServer {
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取所有服务
     */
    @RequestMapping("/services")
    public Object services() {
        return discoveryClient.getServices();
    }

    @RequestMapping("/home")
    public String home() {
        return "Hello World CloudServer";
    }

    public static void main(String[] args) {
        SpringApplication.run(AppServer.class, args);
    }
}
