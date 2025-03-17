package org.example.common_interface.aop;

import java.util.HashMap;
import java.util.Map;
import org.example.common_interface.common.animal.Tiger;
import org.example.common_interface.common.employee.ZookeeperDTO;
import org.springframework.stereotype.Repository;

@Repository
public class ZooDAO {
    private int id = 0;
    private final Map<Integer, ZookeeperDTO> zookeeperMap;

    public ZooDAO() {
        zookeeperMap = new HashMap<>();
        insertZookeeper(new ZookeeperDTO(id, "홍길동", new Tiger("호랑이")));
        insertZookeeper(new ZookeeperDTO(id, "이순신", new Tiger("시베리아호랑이")));
    }

    private void insertZookeeper(ZookeeperDTO zookeeperDTO) {
        zookeeperMap.put(id, zookeeperDTO);
        id++;
    }

    public Map<Integer, ZookeeperDTO> selectZookeepers() {
        return zookeeperMap;
    }

    public ZookeeperDTO selectZookeeper(int id) {
        ZookeeperDTO zookeeper = zookeeperMap.get(id);
        if (zookeeper == null) {
            throw new RuntimeException("해당하는 id의 사육사가 없습니다");
        }
        return zookeeper;
    }
}
