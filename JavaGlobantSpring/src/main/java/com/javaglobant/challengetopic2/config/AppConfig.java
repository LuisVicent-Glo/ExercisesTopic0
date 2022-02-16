package com.javaglobant.challengetopic2.config;

import com.javaglobant.challengetopic2.model.CanonColorAndBAW;
import com.javaglobant.challengetopic2.model.HPBlackAndWhite;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CanonColorAndBAW canonColorAndBAW(){
        return new CanonColorAndBAW();
    }

    @Bean
    public HPBlackAndWhite hpBlackAndWhite(){
        return new HPBlackAndWhite();
    }



}
