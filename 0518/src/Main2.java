/**
 * Created by JiaLe on 2021/5/18 20:09
 */
public class Main2 {
    public static void main(String[] args) {

    }
    //两数之和不用四则运算符
    //1.两个数异或：相当于每一位相加，而不考虑进位；
    //2.两个数相与，并左移一位：相当于求得进位；
    public int Add(int num1,int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return Add(num1 ^ num2, (num1 & num2) << 1);
        }
    }
}
