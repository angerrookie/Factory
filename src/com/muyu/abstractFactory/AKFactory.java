package com.muyu.abstractFactory;

/**
 * AKFactory
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class AKFactory implements IFactory {
    @Override
    public IGun productGun() {
        return new AK();
    }

    @Override
    public IBullet productBullet() {
        return new AK_Bullet();
    }
}
