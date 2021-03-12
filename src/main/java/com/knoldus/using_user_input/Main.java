package com.knoldus.using_user_input;

import com.knoldus.max_number.FindMax;
import com.knoldus.next_even_number.NextEven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String num1="0",num2="0O",number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter numbers to compare");
        try{
            num1 = scanner.nextLine();
            num2 = scanner.nextLine();
        }
        catch (Exception e){
            System.err.println("Incorrect parameters");
        }
        FindMax findMax=new FindMax();
        System.out.println(findMax.calculateMax(Integer.parseInt(num1),Integer.parseInt(num2)));



        System.out.println("Enter the number to find the next even number");
        number=scanner.nextLine();
        NextEven nextEven=new NextEven();
        System.out.println(nextEven.nextEvenNumber(Integer.parseInt(number)));
    }
}
