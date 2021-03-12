package com.knoldus.using_user_input.next_even;

public class Next_Even {
    public long nextEvenNumber(String num) {
        Even_Interface even = number -> number % 2 == 0 ? number + 2 : number + 1;
        return even.nextEven_Number(Long.parseLong(num));
    }
}


