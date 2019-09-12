package top.gzxu.iboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(IBootApplication.class, args);
        System.out.println("徐国忠的IBoot启动成功");
    }
}
