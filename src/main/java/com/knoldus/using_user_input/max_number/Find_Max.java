package com.knoldus.using_user_input.max_number;

public class Find_Max {

        public int calculateMax(String a,String b) {

            Max_Interface max=(num1, num2) -> num1>num2?num1:num2;
            return max.findMax_Number(Integer.parseInt(a),Integer.parseInt(b));

        }

    }

