package com.muyu.simpleFactory;

/**
 * ShapeFactory
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:图形工厂
 */
public class ShapeFactory {
    //用getShape获取对应的对象
    public static Shape getShape(String shapeType){

        if (shapeType==null){
            return null;
        }
        if ("circle".equals(shapeType)){
            return new Circle();
        } else if ("rectangle".equals(shapeType)) {

            return new Rectangle();
        }else if ("square".equals(shapeType)){
            return new Square();
        }else {
           return null;
        }
    }
}
