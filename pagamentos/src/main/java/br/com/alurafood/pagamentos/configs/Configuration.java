package br.com.alurafood.pagamentos.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    ModelMapper createModelMapper() {
        return new ModelMapper();
    }
}
