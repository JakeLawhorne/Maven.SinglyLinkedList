package com.zipcodewilmington.singlylinkedlist;

public class Node<T extends Comparable<T>> implements Comparable<T> {
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        next = null;
    }

    @Override
    public int compareTo(T o) {
        if(this == o){
            return 0;
        }else if(this.compareTo(o) < 0){
            return -1;
        }
        return 1;
    }
}
