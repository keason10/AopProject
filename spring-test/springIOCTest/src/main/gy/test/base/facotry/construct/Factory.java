package gy.test.base.facotry.construct;

/**
 * Created by yantao on 2017/3/24.
 */
public class Factory {
    private   static  Factory factory= new Factory();
    public  static Factory getFactoryInstance() {
        return factory;
    }
}
