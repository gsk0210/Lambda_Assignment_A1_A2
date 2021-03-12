package com.knoldus.max_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMaxTest {

    FindMax findMax=new FindMax();

    @Test
    void calculateMax1() {
        assertAll("Possible Input",
                ()->assertEquals(17,findMax.calculateMax(2,17)),
                ()->assertEquals(93,findMax.calculateMax(93,10)),
                ()->assertEquals(11,findMax.calculateMax(11,11)));


    }

}