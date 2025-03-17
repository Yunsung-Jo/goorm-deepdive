package org.example.common_interface.javaconfig;

import org.example.common_interface.common.animal.Carnivore;
import org.example.common_interface.common.animal.Tiger;
import org.example.common_interface.common.employee.ZookeeperDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("javaconfig")
public class ContextConfiguration {

    @Bean
    public Carnivore animalGenerator() {
        return new Tiger("시베리아호랑이");
    }

    @Bean
    public ZookeeperDTO zookeeperGenerator() {
        ZookeeperDTO zookeeper = new ZookeeperDTO();
        zookeeper.setSequence(1);
        zookeeper.setName("홍길동");
        zookeeper.setCarnivore(animalGenerator());
        return zookeeper;
    }
}
