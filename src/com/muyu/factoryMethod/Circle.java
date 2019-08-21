package com.muyu.factoryMethod;



/**
 * Circle
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class Circle implements IShape {
    //具体的类
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
