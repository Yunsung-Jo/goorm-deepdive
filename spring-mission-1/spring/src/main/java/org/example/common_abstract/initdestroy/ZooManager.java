package org.example.common_abstract.initdestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class ZooManager {
    @PostConstruct
    public void openZoo() {
        System.out.println("동물원을 열었습니다.");
    }

    @PreDestroy
    public void closeZoo() {
        System.out.println("동물원을 닫았습니다.");
    }
}
