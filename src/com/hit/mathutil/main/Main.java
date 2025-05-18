/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hit.mathutil.main;

import com.hit.mathutil.core.MathUtil;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is main method");
        System.out.println("This Jar file is built based on ANT co-operating with JUnit");
        tryTDDFirst();
//        testFactorialGivenWrongArgumentThrowExpception();
    }
    
    public static void testFactorialGivenWrongArgumentThrowExpception(){
        //Test case #3: đưa data cà chớn, n âm, n quá lớn
        //              hàm được thiết kế nèm về ngoại lệ!!!
        //Thấy ngoại lệ mừng rơi nước mắt khi đưa vào -5
        //Thấy ngoại lệ xuất hiện như kỳ vọng -> passed cái test -> màu xanh
        System.out.println("Hope to see the Exception| Illegal Argument Exception");
        
        MathUtil.getFactorial(-5);
        
    }
    
    // Hàm này đc viết ra để dùng kỹ thuật viết code TDD
    // gọi thử/dùng thử hàm chính bên core/bên mathUtil
    // xem nó sai đúng ra sao, ở ngay mức khởi đầu viết hàm
    public static void tryTDDFirst(){
        
        //Test case #1 (tình huống hiểm thử hàm số 1/ xài thử hàm lần 1): 
        //- Input: n = 1;
        //- gọi hàm getFactorial(1)
        //- Hy vọng hàm trả về 1, vì 1! = 1
        
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        //so sánh expected vs actual coi chúng có gống nhau hem?
        //giống -> hàm đúng với case đang test
        //sai ->  bug rồi !!! với case đang test
        System.out.println("Test 1! | Status: "+
                            "Expected : " + expected + 
                            " | Actual: " + actual);
        
        
        //Test case #2 (tình huống hiểm thử hàm số 2/ xài thử hàm lần 2): 
        //- Input: n = 2;
        //- gọi hàm getFactorial(2)
        //- Hy vọng hàm trả về 1, vì 2! = 2
        System.out.println("Test 2! | Status: "+
                            "Expected : 2 " + 
                            " | Actual: " + MathUtil.getFactorial(2));
        
        
    }   
    
}
// TEST CASE LÀ GÌ??
//Là 1 tình huống xài app/ kiểm thử app/kiểm thử tính năng/màng hình
//chức năng/sử lý của appp
// Test case là tình huống kiểm thử app/chức năng mà khi đó
// ta phải 
//-đưa vào data gải/mẫu/test,
//-đưa ra giá trị kỳ vọng ta mong chờ app trả ra
//sau đó chờ hàm/tính năng xử lý xong trả ra kết quả!!!
//và nhìn kết quả và ta so sánh với kì vọng trc đó!!!
//để kết luận hàm ổn/tính năg ổn, TEST CASE PASSED
//                                 TEST CASE FAILED

