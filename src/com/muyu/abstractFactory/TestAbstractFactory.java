package com.muyu.abstractFactory;

/**
 * TestAbstractFactory
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class TestAbstractFactory {
    public static void main(String[] args){

        IFactory factory;
        IGun gun;
        IBullet bullet;

        factory = new AKFactory();
        bullet = factory.productBullet();
        bullet.load();

        gun = factory.productGun();
        gun.shooting();

    }
}
