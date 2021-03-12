package com.knoldus.using_user_input;


import com.knoldus.using_user_input.max_number.Find_Max;
import com.knoldus.using_user_input.next_even.Next_Even;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {

    Main main = new Main();

    @Test
    void mainForMax1() {
        Find_Max findMax = new Find_Max();
        assertEquals(125, findMax.calculateMax("25", "125"));
    }

    @Test
    void mainForMax2() {
        Find_Max findMax = new Find_Max();
        assertThrows(NumberFormatException.class, () -> findMax.calculateMax("One", "Two"));
    }

    @Test
    void mainForMax3() {
        Find_Max findMax = new Find_Max();
        assertEquals(100, findMax.calculateMax("100", "75"));
    }

    @Test
    void mainForMax4(){
        Find_Max findMax = new Find_Max();
        assertEquals(-17,findMax.calculateMax("-171","-17"));
    }

    @Test
    void mainForNextEven(){
        Next_Even nextEven=new Next_Even();
        assertEquals(24,nextEven.nextEvenNumber("22"));
    }

    @Test
    void mainForNextEven2(){
        Next_Even nextEven=new Next_Even();
        assertEquals(18,nextEven.nextEvenNumber("17"));
    }

    @Test
    void mainForNextEven3(){
        Next_Even nextEven=new Next_Even();
        assertThrows(NumberFormatException.class,()->nextEven.nextEvenNumber("Twenty Nine"));
    }
}

