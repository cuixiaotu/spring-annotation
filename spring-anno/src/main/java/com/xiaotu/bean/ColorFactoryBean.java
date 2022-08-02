package com.xiaotu.bean;

import org.springframework.beans.factory.FactoryBean;

public class ColorFactoryBean implements FactoryBean {

    @Override
    public boolean isSingleton() {
        return false;
    }

    //返回color对象，这个对象添加到容器中
    @Override
    public Object getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }
}
