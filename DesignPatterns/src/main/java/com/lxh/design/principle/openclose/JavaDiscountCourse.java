package com.lxh.design.principle.openclose;

public class JavaDiscountCourse extends JavaCourse{
    private int discountFactor;
    public JavaDiscountCourse(Integer id, String name, Double price,int discountFactor) {
        super(id, name, price);
        this.discountFactor = discountFactor;
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*this.discountFactor/10;
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }
}
