package com.ohgiraffers.Section05.logical;

public class Application02 {

    public static void main(String[] args) {

        /* 수업 목표. 논리연산자의 우선순위에 대해 이해하고 활용할 수 있다. */
        /* 필기.
        * 논리연산자의 우선순위와 활용
        * && : 11순위
        * || : 12순위
        *  논리 and 연산자의 순위가 논리 or 연산자보다 우선순위가 높다.
        **/

        /* 목차 1. 1부터 100 사이의 값인지 확인 */
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : " + (num1 >=1 && num1<=100));

        int num2 = 166;
        System.out.println("1부터 100 사이인지 확인 " + (num2 >= 1 && num2 <=100));

        /* 목차 2. 영어 대문자인지 확인 */
        char ch1 ='G';
        System.out.println("영어 대문자 확인 " + (ch1 >= 'A' && ch1 <= 'Z'));

        char ch2 = 'g';
        System.out.println("영어 대문자 확인 " + (ch2 >= 'A' && ch2 <= 'Z'));  //a=97, g=104

        /* 목차 3. 영문자인지 확인 */
        /* 필기. A : 65, Z : 90, a : 97, z : 122 (중간에 91 ~ 96까지는 영문자가 아님) */
        char ch3 = 'f';
        System.out.println("영문자인지 확인 " + ((ch3 >= 'A' && ch3 <= 'Z') || (ch3 >= 'a' && ch3 <= 'z')));
        System.out.println("영어 대문자 확인 " + ((ch3 >= 65 && ch1 <= 90) || (ch3 >= 97 && ch3 <= 122)));

        char ch4 = 'F';
        System.out.println("영문자인지 확인 " + ((ch4 >= 'A' && ch4 <= 'Z') || (ch4 >= 'a' && ch4 <= 'z')));
        System.out.println("영어 대문자 확인 " + ((ch4 >= 65 && ch4 <= 90) || (ch4 >= 97 && ch4 <= 122)));














    }









}
