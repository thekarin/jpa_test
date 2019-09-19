package me.ggulmool.jpatest;

import lombok.extern.slf4j.Slf4j;
import me.ggulmool.jpatest.domain.support.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class JpaTestApplication implements ApplicationRunner {

    @Autowired
    private AccountService accountService;

    public static void main(String[] args) {
        SpringApplication.run(JpaTestApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        accountService.list();
    }
}
