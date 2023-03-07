package com.interview.java;

import java.util.Stack;

/**
 * @author HermitLee
 * @create 2023/3/7
 */

class CQueue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    public CQueue() {

    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if(s1.isEmpty()) return -1;
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int b = s2.pop();
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return b;
    }
}

public class offer09 {

}
