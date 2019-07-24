package com.practice.design.pattern.creational.singleton.multithreaded;

public class MainApp {

    public static class Thread1 extends Thread {

        public void run() {
            Dto dto = Dto.getInstance();
            System.out.println(dto.hashCode());
        }
    }

    public static class Thread2 extends Thread {

        @Override
        public void run() {
            Dto dto = Dto.getInstance();
            System.out.println(dto.hashCode());
        }
    }

    public static void main(String[] args) throws Exception {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.run();
        thread2.run();
        Thread.sleep(10000);
    }

}
