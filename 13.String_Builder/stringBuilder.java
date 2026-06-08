import java.util.*;

class stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");

        // char at index 0
        System.out.println(sb.charAt(0)); // T

        // set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb); // Pony

        // insert
        sb.insert(0, 'S');
        System.out.println(sb); // SPony

        // insert at index 2
        sb.insert(3, 'n');
        System.out.println(sb); // SPonny

        // deletion the extra 'n'
        sb.delete(3, 5);
        System.out.println(sb); // SPoy

        // length
        System.out.println(sb.length());

        // append
        StringBuilder sb2 = new StringBuilder("h");
        // In String str = str + 'e'; --> which create new memory
        // but using StringBuilder we modify existing String
        sb2.append('e');
        sb2.append('l');
        sb2.append('l');
        sb2.append('o');
        System.out.println(sb2);

        // Qs : Reverse a String
        StringBuilder sb3 = new StringBuilder("hello");

        for (int i = 0; i < sb3.length() / 2; i++) {
            int front = i;
            int back = sb3.length() - 1 - i; // 5-1-0 -->4

            char frontChar = sb3.charAt(front);
            char backChar = sb3.charAt(back);

            sb3.setCharAt(front, backChar);
            sb3.setCharAt(back, frontChar);
        }

        System.out.println(sb3);

    }
}