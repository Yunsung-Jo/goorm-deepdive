package org.example;

import org.example.common.ItemDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public ItemDTO getItem() {
        return new ItemDTO(2, "자바", 1500, "설명입니다.");
    }
}
