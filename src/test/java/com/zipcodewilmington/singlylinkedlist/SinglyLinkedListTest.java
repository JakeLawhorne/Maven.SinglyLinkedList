package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList<String> list;
    @Before
    public void before(){
        list = new SinglyLinkedList<String>();
    }

    @Test
    public void testAdd(){
        //Given
        String expected = "test";

        //When
        list.add(expected);

        //Then
        Assert.assertTrue(list.size() > 0);

    }

    @Test
    public void testRemove(){
        //Given
        String expected = "test";
        list.add(expected);

        //When
        list.remove(expected);

        //Then
        Assert.assertTrue(list.size() == 0);
    }

    @Test
    public void testContains(){
        //Given
        String expected = "test";

        //When
        list.add(expected);

        //Then
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void testFind1() {
        //Given
        int expected = 1;
        String val = "target";
        list.add("");
        list.add(val);

        //When
        int actual = list.find(val);

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFind2() {
        //Given
        int expected = -1;
        String val = "target";
        list.add("");
        list.add("");

        //When
        int actual = list.find(val);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        //Given
        int expected = 2;

        //When
        list.add("");
        list.add("");
        int actual = list.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        //Given
        String expected = "Batman";

        list.add("SpiderMan");
        list.add("Ironman");
        list.add("Batman");

        //When
        String actual = list.get(2).data;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCopy() {
        //Given
        list.add("Batman");
        list.add("Spiderman");
        list.add("Ironman");

        //When
        SinglyLinkedList<String> newList = list.copy;

        //Then
        Assert.assertNotEquals(list.toString(), newList.toString());
        for(int i = 0; i < list.size(); i++){
            Assert.assertEquals(list.get(i).data, newList.get(i).data);
        }
    }

    @Test
    public void testSort() {
        //Given
        list.add("Mordekaiser");
        list.add("Asol");
        list.add("Olaf");

        list.sort();

        Assert.assertEquals(list.get(0).data, "Asol");
        Assert.assertEquals(list.get(1).data, "Mordekaiser");
        Assert.assertEquals(list.get(2).data, "Olaf");


    }
}








