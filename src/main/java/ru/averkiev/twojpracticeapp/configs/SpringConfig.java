package ru.averkiev.twojpracticeapp.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Класс описывает конфигурацию Spring приложения.
 * @author mrGreenNV
 */
@Configuration
public class SpringConfig {

    /**
     * Создание Bean для объекта {@link ModelMapper}.
     * @return Новый объект {@link ModelMapper}.
     */
    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
