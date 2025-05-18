/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.hit.mathutil.core;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.hit.mathutil.core.MathUtil.*;
/**
 *
 * @author user
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //Chuẩn bị Data, mảng 2 chiều vì nó có n đưa vào và expected [2]
    //và có nhiều cặp như thế [7]
    //mảng 2 chiều [7][2]
    
    @Parameterized.Parameters
    public static Object[][] initData(){
        int a[] = {5, 10, 15, 20, 25};
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
        int c[][] = {{1, 0}, 
                     {1, 1}, 
                     {2, 2}, 
                     {6, 3}, 
                     {24, 4}, 
                     {120, 5}, 
                     {720, 6}};
        
        return new Integer[][] {{1, 0}, 
                                {1, 1}, 
                                {2, 2}, 
                                {6, 3}, 
                                {24, 4}, 
                                {120, 5}, 
                                {720, 6}};
        
    } // xài Wrapper class nếu chơi với số, ví dụ Integer (int) Long (long)
    
    //Sau khi có bộ data qua mảng 2 chiều, JUnit sẽ tự lặp for
    //để lôi ra từng cặp  (1, 0) (1, 1), (2, 2), (6, 3)...
    //nhồi cặp này ra vào trong hàm so sánh...
    //nhưng nhồi- cách nào, gán value này vào biến nào đó
    //gán vào biến - THAM SỐ HÓA PARAMETERIZED
    //TA SẼ MAP/ÁNH XẠ 2 CỘT ỨNG VỚI 2 BIẾN: CỘT 0 - EXPECTED
    //                                           1 -    N ĐƯA VÀO HÀM GETF() 
    @Parameterized.Parameter(value = 0)
    public long expected;
    
    @Parameterized.Parameter(value = 1)
    public int n;
    
    //Test hoii vì đã có các test case và data
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        
        assertEquals(expected,getFactorial(n));
    }
}





/*
//Class này sẽ chứa code dùng để Test Code chính ở bên Class MathUtil
//Class này để chứa code dùng để Test Hàm getF() coi hàm chạy đúng ko
//Code viết ra dùng để test code khác(Hàm khác/Class khác)
//thì đoạn code này, class này đc gọi tên là: TEST SCRIPT
//chờ xem  hàm xử lý kết quả có như kỳ vọng hay ko??
//Một Test Script sẽ chứa nhiều TEST CASES
//                mỗi Test case tương ứng với 1 tình huống xài hàm

//Phân tích Test Stript cũ(trước đó)
//trong Test Script cũ xuất hiện BAD SMELL, sự trùng lặp về câu lệnh
//dưới đây
//Assert.assertEquals(120, MathUtil.getFactorial(5));
//lệnh so sánh giá trị, lệnh gọi hàm đc lặp đi lặp lại với mỗi bộ Test Case
//Cũng hàm này, cũng lệnh này, nhưng nó phải viết lại cho các bộ
//Data sau:

//Expected              n
//0                     0
//1                     1
//2                     2
//6                     3
//24                    4
//120                   5
//720                   6

//[7][2]

// có cách nào kiểu thay 2 con số trong lệnh so sánh = 2 ??? nào đó
//Assert.assertEquals(???, MathUtil.getFactorial(????));

//Assert.assertEquals(expected, MathUtil.getFactorial(???));

// Nếu ta tách đc toàn bộ data trong các câu lệnh so sánh ở trên
// ra 1 chỗ riêng biệt như hàng cột ở trên, sau đó
// ta chỉ việc pick/lấy/tỉa data này nạp dần vào/nhồi dần vào cái lệnh
// gọi hàm, thì ta sẽ đạt đc:
//- Code gọn gàng hơn ko bị trùng lặp
//- Nhìn tổng quan biết có bao nhiêu test case va liệu rằng chúng ta đã 
//đủ hay chưa

//Kỹ thuật viết Test Script (câu lệnh test) mà tách biệt Data ra khỏi
//lệnh so sánh đc gọi bằng những tên sau:

//-- PARAMETERIZED - THAM SỐ HÓA, BIẾN DATA RA 1 CHỖ, ĐẶT CHO CHÚNG CÁI
//TÊN BIẾN, LÁT HỒI NHỒI CHÚNG TRỞ LẠI LỆNH SO SÁNH

//-- DDT - DATA DRIVEN TESTING VIẾT CODE KIỂM THỬ THEO STYLE TÁCH DATA
//JUNIT FM HỖ TRỢ SẴN TA VỤ TÁCH DATA, DUYỆT VÒNG FOR TRÊN DATA
//NHỒI CHÚNG VÀO HÀM TƯƠNG ỨNG

//ĐỂ CHƠI VỚI DDT, TA CẦN:
//-- Tách data ra 1 chỗ - MẢNG
//-- Map cái data này vào các biến tương ứng
//-- Nhồi các biến tương ứng này vào câu lệnh so sánh/gọi hàm
*/