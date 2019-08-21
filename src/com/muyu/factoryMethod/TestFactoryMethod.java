package com.muyu.factoryMethod;

/**
 * TestFactoryMethod
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class TestFactoryMethod {
    public static void main(String[] args){

       IFactory circleFactory = new CircleFactory();
       IShape circle = circleFactory.getShap();
       circle.draw();
    }
}
