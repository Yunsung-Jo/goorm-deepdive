package org.example.common_interface.aop;

import java.util.Map;
import org.example.common_interface.common.employee.ZookeeperDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZooService {
    private final ZooDAO zooDAO;

    @Autowired
    public ZooService(ZooDAO zooDAO) {
        this.zooDAO = zooDAO;
    }

    public Map<Integer, ZookeeperDTO> selectZookeepers() {
        System.out.println("모든 사육사를 조회합니다.");
        return zooDAO.selectZookeepers();
    }

    public ZookeeperDTO selectZookeeper(int id) {
        System.out.println(id + "번 사육사를 조회합니다.");
        return zooDAO.selectZookeeper(id);
    }
}
