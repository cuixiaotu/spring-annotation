package com.xiaotu.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ThreadScope implements Scope {
    public static final String THREAD_SCOPE = "thread";
    private ThreadLocal<Map<String,Object>> beanMap = new ThreadLocal(){

        @Override
        protected Object initialValue() {
            return new HashMap<>();
        }
    };

    /**
    * 返回当前作用域中的name对应的bean对象
    * @param name:需要检索的bean对象的名称
    * @param objectFactory :如果name对应的bean对象在当前作用域没有找到，则可以调用这个objectFactory来创建这个bean对象
    * */
    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Object bean = beanMap.get().get(name);
        if (Objects.isNull(bean)){
            bean = objectFactory.getObject();
            beanMap.get().put(name,bean);
        }
        return null;
    }

    /**
    * 将name对应的bean对象从当前作用域中移除
    * */
    @Override
    public Object remove(String name) {
        return this.beanMap.get().remove(name);
    }

    /**
    * 用于注册销毁回调，若想要销毁相应的对象,则要由spring容器注册相应的销毁回调，而由自定义的作用域选择是不是要销毁相应的对象
    * */
    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        System.out.println(name);
    }

    /**
     * 用于解析相应的上下文数据，比如request作用域将返回request中的属性
     * */
    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    /**
    *  作用域的会话标识，比如session作用域的会话标识是sessionID
    * */
    @Override
    public String getConversationId() {
        return Thread.currentThread().getName();
    }
}
