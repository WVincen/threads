package com.example._exercise;

//synchronized 关键词：对某个对象加锁
public class _002_Synchronized_This {

    private int count = 10;

    public void m() {
        synchronized (this) {//任何线程操作要执行下面的代码，必须拿到 this 的锁
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }
}
