package com.example.Learn.GenericsDemo;

public class GenericsImpl1<E> implements GenericsInterface<E>{
    /**
     * 泛型接口
     * 实现类不指定泛型的类型，在实现类中指定
     * @param e
     */
    @Override
    public void show(E e) {

    }
    /**
     * 泛型通配符
     * ？extend E：代表任意的数据类型
     * 泛型限定，必须继承Student类，或者是Student类本身
     */
    public void show1(GenericsInterface<? extends Student> genericsInterface){

    }

    /**
     * 泛型通配符
     * ？super E：代表任意的数据类型
     * 泛型限定，必须是Student类的父类，或者是Student类本身
     * @param genericsInterface
     */
    public void show2(GenericsInterface<? super Student> genericsInterface){

    }
}
