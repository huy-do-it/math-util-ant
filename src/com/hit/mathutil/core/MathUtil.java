/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hit.mathutil.core;

/**
 *
 * @author user
 */   
/*
//đây là class mô phỏng lại các hàm tiện ích/dùng chung cho mọi
//class khác, mô phỏng lạo class tiện ishc java.Math của JDK
//phàm cái gì là đồ dùng chung, thường được thiết kế là static     
*/
public class MathUtil {
    public static final double PI = 3.141592653589793;
    
    /*
    Hàm tiện ích tính n! = 1.2.3...n
    lưu ý/quy ước:
    - không tính giai thừa số âm!!!
    0! = 1! = 1
    vì giai thừa tăng cực nhanh, nên 21! vượt qua 18 số 0
    tràn kiểu long
    Ta ko tính 21! trở lên
    */
    public static long getFactorial(int n){
        
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1;
        
        // sống sót đến đây, sure n = 2...20!!!!
        // cắm ko sài ELSE nữa vì khi hàm đã có RETURN phía trc
        long product =1; // biến cộng dồn, nhân dồn, biến con heo đất
                          //acc/accumulation/gửi góp
        for (int i = 2; i <= n; i++) 
            product *= i;
            
        return product;
    }
}

//CODING COVENTION: QUY TẮC VIẾT CODE CTY ÉP PHẢI THEO!!!
// ALT-SHIFT-F CĂN CODE TỰ ĐỘNG, KO LẠM DỤNG
/*
//TA HỌC SƠ VỀ KHÁI NIỆM TDD - TEST DRIVEN DEVELOPMENT
//LÀ KỸ THUẬ LẬP TRÌNH/ÁP DỤNG CHO DÂN DEVELOPER ĐỂ GIA TĂNG
//CHẤT LƯỢNG CODE/GIẢM THIỂU CÔNG SỨC TÌM BUG/PHÁT HIỆN BUG SỚM
//TDD yêu cầu dev khi viết code/viết hàm/class phải viết luôn 
//các bộ kiểm thử/viết luôn test cases/ viết luôn các đoạn 
//code dùng thử hàm/class để kiểm tra tính đúng đắn của hàm/ class

//viết code kèm với viết test cases
//viết code có ý thức viết luôn phần kiểm thử code/hàm/class
//    Development driven                      test

//SAU KHI CÓ ĐC TÊN HÀM(CHỈ TÊN HÀM MÀ THÔI)
//TA VIẾT LUÔN CÁC TÌNH HUỐNG XÀI HÀM
//CHẤP NHẬN KHI CHẠY HÀM CHẠY SAI - DO CODE CHƯA XONG
//SAU ĐÓ TA TỐI ƯU CHỈNH SỬA CODE ĐỂ ĐẢM BẢO CODE CHẠY ĐÚNG!!!
//QUÁ TRÌNH SAI - ĐÚNG - SAI - ĐÚNG diễn ra liên tục (cycle)

*/

