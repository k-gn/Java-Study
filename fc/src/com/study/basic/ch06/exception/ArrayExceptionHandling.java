package com.study.basic.ch06.exception;

public class ArrayExceptionHandling {

    // try-catch 문
    // try 블록에는 예외가 발생할 가능성이 있는 코드를 작성하고 try 블록 안에서 예외가 발생하믄 경우 catch 블록이 수행됨

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try{
            for(int i=0; i<=5; i++){
                System.out.println(arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("비정상 종료되지 않았습니다.");
    }

}
