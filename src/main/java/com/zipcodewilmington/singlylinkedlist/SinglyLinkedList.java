package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable<T>> {
    Node<T> head;

    public void add(T value) {
        if(head == null){
            head = new Node<T>(value);
        }else{
            Node<T> current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(new Node<T>(value));
        }
    }
    public boolean contains(T value){
        Node<T> current = head;
        while(current != null){
            if(current.getData().equals(value)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }


    public void remove(T val) {
        Node<T> current = head;
        Node<T> temp = current;
            do{
            int counter = 1;
            if(current.getData().equals(val) && (counter == 1)){
                current.setData(null);
                current.setNext(null);
                if(temp.getNext() == null){
                    break;
                }
                current = current.getNext();
                temp = current;
            }else if(current.getData().equals(val)){
                temp.setData(current.getData());
                temp.setNext(current.getNext());
                current.setData(null);
                current.setNext(null);
                current = temp.next;

            }
            current = current.getNext();
        }while(current.getNext() != null);
    }

    public int size() {
        Node<T> current = head;
        int count = 1;

        while(current.getNext() != null){
            count++;
            current = current.getNext();
        }
        return count;
    }

    public int find(T val) {
        Node<T> current = head;
        int counter = 0;
        while(current.getNext() != null){
            if(current.getData().equals(val)){
                return counter;
            }
            current = current.getNext();
            counter++;
        }
        if(current.getData() == val){
            return counter;
        }
        return -1;
    }

    public T get(int i) {
        Node<T> current = head;
        int counter = 0;
        while(current.getNext() != null) {
            if (counter == i) {
                return current.getData();
            }
            current = current.getNext();
            counter++;
        }
        return current.getData();
    }

    public void sort() {
        Node<T> current = head;
        T firstIndex = current.getData();
        Node<T> firstNode = current;
        int counter = 0;
        while(counter < 2) {
            while (current.getNext() != null) {
                if (current.getData().compareTo(current.getNext().getData()) <= 0) {
                    current = current.getNext();
                } else if (current.getData().compareTo(current.getNext().getData()) > 0) {
                    T temp = current.getData();
                    current.setData(current.getNext().getData());
                    current.getNext().setData(temp);
                    current = current.getNext();
                }
            }
            if (current.getData().compareTo(firstIndex) < 0) {
                T temp = current.getData();
                current.setData(firstIndex);
                firstNode.setData(temp);
            }
            counter++;
            current = head;
        }
    }

    public SinglyLinkedList<T> copy() {
        Node<T> current = head;
        SinglyLinkedList<T> result = new SinglyLinkedList<>();
        int counter = 0;
        while(current.getNext() != null) {
            result.add(current.getData());
            current = current.getNext();
        }
        result.add(current.getData());
        return result;
    }
}
