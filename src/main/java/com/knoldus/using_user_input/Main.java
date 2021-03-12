package com.knoldus.using_user_input;

import com.knoldus.using_user_input.max_number.Find_Max;
import com.knoldus.using_user_input.next_even.Next_Even;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String num1,num2,number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers for comparison");
        num1=scanner.nextLine();
        num2=scanner.nextLine();
        Find_Max find_max=new Find_Max();
        System.out.println(find_max.calculateMax(num1,num2));

        System.out.println("Enter the number to find next even number");
        number=scanner.nextLine();
        Next_Even next_even=new Next_Even();
        System.out.println(next_even.nextEvenNumber(number));
    }

}
