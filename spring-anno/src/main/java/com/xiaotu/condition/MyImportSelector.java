package com.xiaotu.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {


    /**
     * 返回值：就是导入到容器中的组件的全类名
     * AnnotationMetadata:当前标注@Import注解的类的所有注解信息，
     * */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //不能返回null 否则会引起空指针报错
        return new String[]{"com.xiaotu.bean.Blue","com.xiaotu.bean.Yellow"};
    }
}
