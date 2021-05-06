import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/6 20:03
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String addend = scanner.nextLine();
            String augend = scanner.nextLine();
            System.out.println(AddLongInteger(addend,augend));
        }
    }
    public static String AddLongInteger(String addend, String augend) {
        char[] a1 = addend.toCharArray();
        char[] a2 = augend.toCharArray();
        int len = Math.max(addend.length(),augend.length()) + 1;
        char[] b1 = new char[a1.length];
        char[] b2 = new char[a2.length];
        for (int i = 0; i < a1.length; i++) {
            b1[i]= a1[a1.length - 1 - i];
        }
        for (int i = 0; i < a2.length; i++) {
            b2[i] = a2[a2.length - 1 - i];
        }
        char[] c1 = new char[len];
        for (int i = 0; i < c1.length; i++) {
            c1[i] = '0';
        }
        for (int i = 0; i < len - 1; i++) {
            int count=0;
            if(b1.length-1-i>=0 && b2.length-1-i>=0){
                count=b1[i]-'0'+b2[i]-'0';
            }
            else if(b1.length-1-i>=0 && b2.length-1-i<0){
                count=b1[i]-'0';
            }
            else if(b1.length-1-i<0 && b2.length-1-i>=0){
                count=b2[i]-'0';
            }
            int value=c1[i]-'0'+count;
            c1[i]=(char)(value%10+'0');
            c1[i+1]+=value/10;
        }
        while (c1[len - 1] == '0') {
            len--;
        }
        char[] c2=new char[len];
        for(int i = 0; i < len; i++){
            c2[len - 1 - i] = c1[i];
        }
        String str = new String(c2);
        return str;
    }
}
