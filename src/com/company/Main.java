package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println(" method overloading");
        add(20, 30);
        add(2.2, 4.4);
        add(20, 4.4);
        add("shuruthi", "manoharan");
    }

   static   int add(int num1, int num2) {
       if (num1 > num2) {
           System.out.println(num1 + num2);
       } else {
           System.out.println(num1 - num2);
       }

       return num1 + num2;
   }

     static double add(double num1, double num2)
     {
         if(num1!=num2)
         {
             System.out.println(num1 + num2);
         }
        return num1 + num2;
    }

  static  void add(int num1, double num2)
  {
        System.out.println(num1+num2);
    }


    static String add(String num1, String num2) {
        String sum=num1+num2;
        System.out.println(sum);
        return sum;
    }
}