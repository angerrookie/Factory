package com.muyu.simpleFactory;

/**
 * TestSimleFactory
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class TestSimleFactory {
    public static void main(String[] args){

        // 获取 Circle 的对象，并调用它的 draw 方法
        Circle circle = (Circle) ShapeFactory.getShape("circle");
        circle.draw();
        //获取rectangle对象  调用它的draw方法
        Rectangle rectangle = (Rectangle) ShapeFactory.getShape("rectangle");
        rectangle.draw();
        //获取square的对象 调用对应的draw方法
        Square square = (Square) ShapeFactory.getShape("square");
        square.draw();
    }
}
