package com.lxh.design.principle.openclose;

public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * @return
     */
    @Override
    public Integer getId() {
        return this.id;
    }

    /**
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * @return
     */
    @Override
    public Double getPrice() {
        return this.price;
    }
}
