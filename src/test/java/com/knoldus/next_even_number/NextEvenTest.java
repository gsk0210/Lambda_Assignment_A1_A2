package com.knoldus.next_even_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextEvenTest {

    NextEven nextEven=new NextEven();

    @Test
    void nextEvenNumber() {

        assertAll("Possible Inputs",
                ()->assertEquals(1994,nextEven.nextEvenNumber(1993)),
                ()->assertEquals(987654322,nextEven.nextEvenNumber(987654320)),
                ()->assertThrows(Exception.class,()->Integer.parseInt("One")));


    }
}