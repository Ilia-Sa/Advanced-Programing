package classE;

/*
Created by Ilia Safarian - 40012341054047
Lesson 9 - Class Exercise
 */

public class Main {
    public static void main(String[] args) {
        UserReader userReader = new UserReader();

        Thread thread1 = new Thread() {
            @Override
            public void run(){
                UserReader.read();
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run(){
                UserWriter.write();
            }
        };
        thread1.start();
        thread2.start();
    }
}
