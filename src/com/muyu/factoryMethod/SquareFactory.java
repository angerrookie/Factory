package com.muyu.factoryMethod;


/**
 * CircleFactory
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:正方形工厂  返回一个对象
 */
public class SquareFactory implements IFactory{
    @Override
    public IShape getShap() {
        return new Square();
    }
}
