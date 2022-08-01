package com.xiaotu.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyTypeFilter implements TypeFilter {
    /**
     * 参数：
     * metadataReader:读取到的当前正在扫描的类的信息
     * metadataReaderFactory:可以获取到其他任何类的信息的（工厂）
     * */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取当前类注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // 获取当前正在扫描的类的类信息 比如他的类型 实现的接口
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 获取当前类的资源信息 类的路径等信息
        Resource resource = metadataReader.getResource();
        // 获取正在扫描的类名
        String className =  classMetadata.getClassName();

        System.out.println("====>"+ className);
//        System.out.println("====>"+ annotationMetadata);
//        System.out.println("====>"+ classMetadata);
//        System.out.println("====>"+ resource);
        if (className.contains("er")){
            return true;
        }

        return false;
    }
}
