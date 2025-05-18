/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hit.mathutil.core;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author user
 */
public class MathUtilTest {
    
    // Ta đi test ngoại lệ, tức là so sánh/đo lường xem ngoại lệ
    // có xuất hiện hay không khi ta đưa data cà chớn, n < 0 || n > 20
    // thay vì so sánh Expected value vs. actual value
    // lúc này ta sẽ đi so sánh/ước lượng xem ngoại lệ có xuất hiện như kỳ vọng
    // hay ko, nếu có XH như kỳ vọng, sure, hàm thiết kế: NGON
    // nếu ngoại lệ XH như kỳ vọng, thì GEEN - thấy RED ngoại lệ mừng rơi nước mắt
    
    @Test (expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowExpception(){
        //Test case #3: đưa data cà chớn, n âm, n quá lớn
        //              hàm được thiết kế nèm về ngoại lệ!!!
        //Thấy ngoại lệ mừng rơi nước mắt khi đưa vào -5
        //Thấy ngoại lệ xuất hiện như kỳ vọng -> passed cái test -> màu xanh
        System.out.println("Hope to see the Exception| Illegal Argument Exception");
        
        MathUtil.getFactorial(-5);
        
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2(){
        
        
        //Test case #4 n = 3, hi vọng hàm trả về 6, thực tế???
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5 n = 4, hi vọng hàm trả về 24, thực tế???
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        //Test case #6 n = 5, hi vọng hàm trả về 120, thực tế???
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        
    }
    
    
    
    
    @Test //coding convention - quy tắc viết code
          //tên hàm kiểm thử /tên hàm của test script
          //phải nói lên ý nghĩa của việc kiểm thử
          //tình huồng này, ta mún test hàm getF() tham số tử tế
          //n = 0...20!!!
    public void testFactorialGivenRightArgumentReturnsWell(){
        
        //Test case số #1: n = 10, hi vọng trả hàm về 1
        //                         thực tế hàm trả về mấy, đoán xem!!!
        long expected = 1;
        long actual  = MathUtil.getFactorial(0); //hàm chạy đi thì mới biết
        //so sánh giữa expected vs. actual, máy tự so, ko cần
        //sout() khổ cực
        Assert.assertEquals(expected, actual);
        
        //Test case #2 n = 1, hi vọng hàm trả về 1, thực tế???
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        
        //Test case #3 n = 2, hi vọng hàm trả về 2, thực tế???
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        
    }
    //@Test   ra lệnh cho thư viện JUnit mình đã Add//import
    //tự động generate ra cái hàm public static void main()
    //biến hàm tryJUnitComparation() thành hàm main()
    //và gửi main() này cho JVM chay - java Virtual Machine
    // @Test ~~~ main()
    //ko @Test thì class ko có main(), lấy gì mà chạy no runable methods
    
    @Test    
    public void tryJUnitComparation() {
        //Hàm này thử nghiệm việc so sánh expected vs. actual
        //coi sai đúng ra màu thế nào !!
        //ta đang sài hàm của thư viện
        //bãi mà phải viết theo quy trình
        //quy tắc định trc nằm ở @
        Assert.assertEquals(39, 39);
    }
    
}

//Class này DEV sẽ viết những câu lệnh dùng để TEST hàm
//của CODE chính, TEST các hàm của class MathUtil
//trong class này sẽ có những lời gọi hàm getFactorial()
//có những lệnh so sánh giữa EXPECTED và ACTUAL
//giống giống mình đã làm test ở bên MAIN()
//nhưng khác ở chỗ, SAI-> RED, ĐÚNG -> GREEN
//mắt ko cần nhìn các dòng output từ hàm System.out cho mất sức
//mắt giờ chỉ nhìn 2 màu RED and  GREEN
//Muốn có đc điều này ta sẽ dùng thêm các UNIT TESTING FRAMEWORK
//VÍ DỤ: JUnit, TestNG(Java)
//       xUnit, MSTest, NUnit (C#)
//       PHPUnit (PHP)

//Việc viết code để TEST CODE GỌI LÀ UNIT TESTING
//ĐOẠN CODE TRONG CLASS NÀY DUGF JUNIT/UNIT TESTING FRAMEWORK
//ĐỂ KIỂM THỬ HÀM CODE CHÍNH
//ĐOẠN CODE KIỂM THỬ NÀY ĐC GỌI LÀ: TEST SCRIPT
//Code dùng để test code (chính) gọi là test script
//Test Script là các đoạn code đc viết ra để viết ra để test code chính(DAO
//DTO, Controller, API...)
//Muốn test thì cần phải phác thảo các TEST CASE
//Test Script sẽ sử dụng các Test Case
//Ví dụ: Viết code để test hàm getFactorial() với các case
//n = -4, 0, 1, ...

// Quy tắc xanh đỏ: 
/*
    màu xanh khi tất cả các test case phải cùng xanh,
    tức là expected == actual
    cho tất cả các tình huống test

    Màu đỏ: chỉ cần 1  trong những Test Cases bị SAI, 
    chỉ cần 1 các Expected != ACTUAL, kết luận mạnh tay/gắt: Hàm sai quá sai

    ý nghĩa của quy tắc: nếu đã test, nếu đã liệt kê các test case, thì chúng
    phải đúng hết, con chỉ cần 1 thằng sai, hàm ko ổn định về việc return -> hàm sai
    ĐÚNG ĐÚNG hết, SAI chỉ cần 1 thằng
    
    EXPECTED == ACTUAL -> CASE ĐÚNG, TEST CASE PASSED
    EXPECTED != ACTUAL -> CASE FAILED
        NẾU EXPECTED LÀ CHÍNH XÁC, HÀM ĐÃ XỬ LÝ SAI, bug
        CŨNG CÓ KHI EXPECTED, CÁI TA KỲ VỌNG BỊ SAI!!! LỖI DO DÂN QC TÍNH TOÁN
        BẰNG TAY BỊ SAI

        
*/