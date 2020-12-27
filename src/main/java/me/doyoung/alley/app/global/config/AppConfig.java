package me.doyoung.alley.app.global.config;

import me.doyoung.alley.app.domain.accounts.application.AccountService;
import me.doyoung.alley.app.domain.accounts.domain.Account;
import me.doyoung.alley.app.domain.accounts.domain.AccountRole;
import me.doyoung.alley.app.global.properties.AppProperties;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return new ApplicationRunner() {

            @Autowired
            AccountService accountService;

            @Autowired
            AppProperties appProperties;

            @Override
            public void run(ApplicationArguments args) {

                Account admin = Account.builder()
                        .email(appProperties.getAdminUsername())
                        .password(appProperties.getAdminPassword())
                        .phoneNumber(appProperties.getAdminPhoneNumber())
                        .dayOfBirth(appProperties.getAdminDayOfBirth())
                        .roles(Stream.of(AccountRole.ADMIN, AccountRole.USER).collect(Collectors.toSet()))
                        .build();
                accountService.saveAccount(admin);

                Account user = Account.builder()
                        .email(appProperties.getUserUsername())
                        .password(appProperties.getUserPassword())
                        .phoneNumber(appProperties.getClientPhoneNumber())
                        .dayOfBirth(appProperties.getClientDayOfBirth())
                        .roles(Stream.of(AccountRole.USER).collect(Collectors.toSet()))
                        .build();
                accountService.saveAccount(user);

            }
        };
    }

}
