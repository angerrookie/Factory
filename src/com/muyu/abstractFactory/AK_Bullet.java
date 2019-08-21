package com.muyu.abstractFactory;

/**
 * AK_Bullet
 *
 * @author aRookie
 * @Date 2019/8/21
 * 文件说明:
 */
public class AK_Bullet implements IBullet{
    @Override
    public void load() {
        System.out.println("AK_Bullet");
    }
}
