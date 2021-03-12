package com.knoldus.next_even_number;

public class NextEven {

    public long nextEvenNumber(long num){
        Even even=number -> number%2==0?number+2:number+1;
        return even.nextEvenNumber(num);
    }

}
