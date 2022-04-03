package ilia;


public class Student<T> {
    private T t;
    public void add(T t){
        this.t = t;
    }
    public T getT(){
        return t;
    }
}
