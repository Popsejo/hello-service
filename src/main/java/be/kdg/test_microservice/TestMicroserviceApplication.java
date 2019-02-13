package be.kdg.test_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableEurekaClient
@SpringBootApplication
public class TestMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMicroserviceApplication.class, args);
    }

    @RequestMapping
    public String helloWorld() {
        return "hello";
    }

}

