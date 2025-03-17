package org.example.common_interface.common.employee;

import org.example.common_interface.common.animal.Carnivore;

public class ZookeeperDTO implements Employee {

    private int sequence;
    private String name;
    private Carnivore carnivore;

    public ZookeeperDTO() {
    }

    public ZookeeperDTO(int sequence, String name, Carnivore carnivore) {
        this.sequence = sequence;
        this.name = name;
        this.carnivore = carnivore;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Carnivore getCarnivore() {
        return carnivore;
    }

    public void setCarnivore(Carnivore carnivore) {
        this.carnivore = carnivore;
    }

    @Override
    public void work() {
        System.out.println(name + " 사육사가 일을 시작합니다.");
    }

    @Override
    public String toString() {
        return "ZookeeperDTO{" +
                "sequence=" + sequence +
                ", name='" + name + '\'' +
                ", carnivore=" + carnivore +
                '}';
    }
}
