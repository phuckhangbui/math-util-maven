/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.phuckhangbui.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.phuckhangbui.mathutil.core.MathUtility.getFactorial;

/**
 *
 * @author khang
 */
public class MathUtilAdvanceTest {
    
     public static Object[][] initTestData() {
        //hàm chuẩn bị bộ data test để sau đó fill vào hàm assertEquals
        Object testData[][] = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {4, 24}, 
                               {6, 1}};
        
        return testData;
    }

    //sử dụng cơ chế tham số hóa
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, getFactorial(n));
    }
    
    @Test
    public void testFactorialGivenWrongArgumentThrowsException(){
        
        //lambda function
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5) );
    }
    
}
