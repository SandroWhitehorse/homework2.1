package com.trylabs;


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа а-знаменатель, b-делитель для того чтобы узнать результат деления:");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        System.out.println ((b==0)?"бесконечность":a/b);}
}