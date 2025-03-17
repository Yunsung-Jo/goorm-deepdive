package org.example.common_interface.javaconfig;

import org.example.common_interface.common.employee.ZookeeperDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        ZookeeperDTO zookeeper = context.getBean(ZookeeperDTO.class);

        zookeeper.work();
        System.out.println(zookeeper.getCarnivore().cry()); // 울기(실패)
        System.out.println(zookeeper.getCarnivore().eat()); // 밥 먹기
        System.out.println(zookeeper.getCarnivore().getHunger()); // 허기 확인
        System.out.println(zookeeper.getCarnivore().cry()); // 울기
    }
}
