package com.example.spring.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationMapper {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
