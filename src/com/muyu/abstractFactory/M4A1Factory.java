package com.muyu.abstractFactory;

/**
 * M4A1Factory
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class M4A1Factory implements IFactory {
    @Override
    public IGun productGun() {
        return new M4A1();
    }

    @Override
    public IBullet productBullet() {
        return new M4A1_Bullet();
    }
}
