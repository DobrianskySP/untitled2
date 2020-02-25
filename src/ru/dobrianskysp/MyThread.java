package ru.dobrianskysp;

public class MyThread extends Thread {
    public MyThread(String name) {
        setName(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(this.getName());
    }
}
