package com.muyu.abstractFactory;

/**
 * IFactory
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public interface IFactory {
    public IGun productGun();
    public IBullet productBullet();
}
