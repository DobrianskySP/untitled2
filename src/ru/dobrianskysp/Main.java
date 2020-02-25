package ru.dobrianskysp;

public class Main {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread t1 = new MyThread("MyThread-1");
        MyThread t2 = new MyThread("MyThread-2");
    }
}
