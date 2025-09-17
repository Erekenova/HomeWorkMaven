package org.example;

import lombok.Data;


@Data
public class Sum
{
   private int a;
    private int b;

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Sum sum1 = new Sum(6,2);
        int result = sum1.a + sum1.b  ;
        System.out.println("Result "  + result);
        System.out.println("Git commit");

    }
}
