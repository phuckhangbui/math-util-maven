/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.phuckhangbui.mathutil.core;

/**
 *
 * @author khang
 */
public class MathUtility {

    public static final double PI = 3.1415;

    //ham tinh giai thua
    //0!, 1! = 1
    //k áp dụng giai thừa cho n < 0, n < 0 => ném ngoại lệ
    //k áp dụng giai thừa cho n > 20, vì 20! khớp long
    //21! ném ngoại lệ
//    public static long getFactorial(int n) {
//        
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n, n must be between 0 and 20.");
//
//        if(n == 0 || n == 1) 
//            return 1;
//        
//        long product = 1; //tích khởi đầu là 1, sau đó nhân dồn vào
//        for (int i = 2; i <= n; i++)
//            product *= i;
//        
//        return product;
//    } 
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must be between 0 and 20.");
        }

        if (n == 0 || n == 1) {
            return 1;
        }


        return n * getFactorial(n - 1);

    }
}
