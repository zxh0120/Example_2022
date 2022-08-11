package org.example.annotation;

import java.lang.annotation.*;

/**
 * @author zxh
 * @date 2022/7/14
 * @description 性别赋值
 */

@Retention(RetentionPolicy.RUNTIME)
    //RetentionPolicy.source:仅存在于源码中，编译阶段会被丢弃,不包含与class字节码文件中.像@Override、@SuppressWarnings都属于这类注解.
    //RetentionPolicy.class:默认策略,在class字节码文件中存在,在类加载的时候丢弃,运行时无法获取到.
    //RetentionPolicy.Runtime:始终不丢弃,可以使用反射获得该注解的信息.自定义注解常用的使用方式.
@Target({ElementType.FIELD, ElementType.METHOD})
    //ElementType.type:类、接口、注解、enum.
    //ElementType.constructor：构造函数.
    //ElementType.field:成员变量、对象、属性、枚举的变量.
    //ElementType.Local_variable:局部变量
    //ElementType.method:方法
    //ElementType.package:包
    //ElementType.parameter:参数
    //ElementType.Annotation_type:注解
    //ElementType.type_parameter:类型参数,表示这个注解可以用在Type的声明上前,1.8引入的.
    //ElementType.type_use:类型的注解,表示这个注解可以在所有使用Type的地方(如泛型,类型转换等)1.8引入的.
@Documented
    //标识是否将注解的相关信息添加到javadoc文档中
@Inherited
    //定义该注解和子类的关系,使用此注解声明出来的自定义注解,在使用在类上面时,子类会自动继承此注解,否则，子类不会继承此注解。注意只对类生效，对方法，属性等其他无效。

public @interface InitSex {

    enum SEX_TYPE {MAN, WOMAN}

    SEX_TYPE sex() default SEX_TYPE.MAN;

}
