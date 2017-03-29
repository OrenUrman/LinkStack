package ru.OrenUrman.LinkStackClass;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by OrenUrman on 29.03.2017.
 * тест для проверки push pop для связного стека
 */
public class LinkStackTest {
    @Test
    public void pushOver() throws Exception {
        LinkStack<Integer> stack = new LinkStack<>();
        for (int i=0;i<15;i++){
            stack.push(new Integer(i));
        }
    }

    @Test
    public void pushNormal() throws Exception {
        LinkStack<Integer> stack = new LinkStack<>();
        for (int i=0;i<10;i++){
            stack.push(new Integer(i));
        }
    }


    @Test
    public void pop() throws Exception {
        LinkStack<Integer> stack = new LinkStack<>();
        for (int i=0;i<5;i++){
            stack.push(new Integer(i));
        }
        for (int i=0;i<5;i++){
            System.out.println(stack.pop());
        }
    }

}