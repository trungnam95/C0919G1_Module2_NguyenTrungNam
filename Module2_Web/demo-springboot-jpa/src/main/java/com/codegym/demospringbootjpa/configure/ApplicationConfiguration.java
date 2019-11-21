package com.codegym.demospringbootjpa.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.codegym.demospringbootjpa.repositories")
public class ApplicationConfiguration {

}
