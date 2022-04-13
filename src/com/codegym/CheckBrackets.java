package com.codegym;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào biểu thức: ");
        String str = scanner.nextLine();
//        Stack<String> stack = new Stack<>();
//        stack.push("(");
//        System.out.println(stack);
        if (check(str)){
            System.out.println("well");
        }else {
            System.out.println("miss brackets");
        }
    }
    public static boolean check(String str){
        Stack<String> bStack = new Stack<>();
        String left;
        String[] arr = str.split("");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//            }
        boolean rs = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("(")){
                bStack.push("(");
//                System.out.println(bStack);
            }
            if (arr[i].equals(")")){
                if (bStack.isEmpty()){
                    rs = false;
                }else {
                    left = bStack.pop();
//                    System.out.println(left);
                }
            }
        }
        if (!bStack.isEmpty()){
            rs = false;
        }
        return rs;
    }
}
