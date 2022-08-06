package com.lxh.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(101,"Java从入门到放弃",256.0,8);
       JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)iCourse;
        System.out.println("课程ID："+javaDiscountCourse.getId()+" 课程名称："+javaDiscountCourse.getName()+" 课程价格："+javaDiscountCourse.getOriginPrice()+" 课程折扣价格："+javaDiscountCourse.getPrice());
    }
}
