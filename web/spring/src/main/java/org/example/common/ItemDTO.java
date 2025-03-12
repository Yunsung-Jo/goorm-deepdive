package org.example.common;

public class ItemDTO {
    private int seq;
    private String name;
    private int value;
    private String desc;

    public ItemDTO() {
    }

    public ItemDTO(int seq, String name, int value, String desc) {
        this.seq = seq;
        this.name = name;
        this.value = value;
        this.desc = desc;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "seq=" + seq +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", desc='" + desc + '\'' +
                '}';
    }
}
