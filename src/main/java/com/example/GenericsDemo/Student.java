package com.example.GenericsDemo;

public class Student<E> {
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Student{" +
                "e=" + e +
                '}';
    }
}
