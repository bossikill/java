package 多线程编程.并发.ch02_并发编程的其他基础知识.se06_JAVA中的volatile关键字;

//线程不安全
public class ThreadNotSafeInteger {
    private int value;

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }
}
