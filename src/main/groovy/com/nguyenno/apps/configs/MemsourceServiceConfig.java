package com.nguyenno.apps.configs;

import com.nguyenno.apps.rest.MemSourceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MemsourceRestProperties.class)
public class MemsourceServiceConfig {

    @Bean
    public MemSourceService memSourceService(MemsourceRestProperties memsourceRestProperties){
        return new MemSourceService(memsourceRestProperties);
    }
}
