package com.example.learn.GenericsDemo;

public interface GenericsInterface<E> {
    /**
     * 泛型接口
     * 1.接口中的泛型，可以在实现类中指定
     * 2.也可以在实现类中不指定，而在实现类中指定
     * @param e
     */
    void show(E e);
}
