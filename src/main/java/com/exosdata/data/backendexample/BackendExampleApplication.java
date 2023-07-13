package com.exosdata.data.backendexample;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.cfg.Environment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.net.InetAddress;

@SpringBootApplication(scanBasePackages = "com.exosdata")
@EnableJpaRepositories(basePackages = {"com.exosdata"})
@EntityScan(basePackages = {"com.exosdata"})
@Slf4j
public class BackendExampleApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BackendExampleApplication.class);

        ConfigurableEnvironment env = app.run(args).getEnvironment();
        String protocol = "http";

        String hostAddress = "localhost";

        try {
            hostAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e) {
            log.warn("The host name could not be determined, using `localhost` as fallback");
        }

        log.info(
                "\n----------------------------------------------------------\n\t"
                        + "{} '{}' is S running! Access URLs:\n\t"
                        + "Local: \t\t{}://localhost:{}\n\t"
                        + "External: \t{}://{}:{}\n\t"
                        + "Profile(s): \t{}\n----------------------------------------------------------",
                BackendExampleApplication.class.getName(),
                env.getProperty("spring.application.name"),
                protocol,
                env.getProperty("server.port"),
                protocol,
                hostAddress,
                env.getProperty("server.port"),
                env.getActiveProfiles());
    }

}
