import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Arrays;

public class TestString {

    public static void main(String[] args) {
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes,1,2);
        System.out.println(str);

        String str2 = "abcde";
        byte[] bytes2 = str2.getBytes();
        System.out.println(Arrays.toString(bytes2));


        String str3 = "gaobo";
        try {
            byte[] bytes3 = str3.getBytes("gbk");
            System.out.println(Arrays.toString(bytes3));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static String reverse(String string) {
        //字符串转为数组
        char[] chars = string.toCharArray();
        int i = 0;
        int j = chars.length-1;
        while (i < j) {
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i++;
            j--;
        }
        //return chars;
        //数组转化为字符串
        //return new String(chars);
        //return String.copyValueOf(chars);
        return String.valueOf(chars);
    }

    public static void main12(String[] args) {
        String str = "abcdef";
        //逆置
        String ret = reverse(str);
        System.out.println(ret);
    }


    public static void main11(String[] args) {
        char[] value = {'h','e','l','l','o'};
        String str3 = new String(value,1,2);
        System.out.println(str3);

        String str = "abcdef";
        char ch = str.charAt(1);
        System.out.println(ch);

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
    }

    /**
     * 反射是可以做到的
     * Java里面有一个技术：反射
     *    用到：Spring
     * @param args
     */
    public static void main10(String[] args) {
        String str1 = "abc";
        Class c1 = String.class;//Class对象
        try {
            Field field = c1.getDeclaredField("value");//2、获取对应的字段
            field.setAccessible(true);
            try {
                char[] value = (char[]) field.get(str1);
                System.out.println(Arrays.toString(value));
                System.out.println(str1);
                value[0]='G';
                System.out.println(str1);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /**
     * 对于这样的 代码 以后不要出现在项目当中（尽量）
     * StringBuffer       StringBuilder
     * @param args
     */
    public static void main9(String[] args) {
        String str1 = "abc";
        for(int i = 0;i <= 10;i++) {
            str1 += i;
        }
        System.out.println(str1);
    }
    public static void main8(String[] args) {
        String str1 = "abc";
        str1 = str1+"de";
        str1 = str1 +"fg";
        System.out.println(str1);
    }

    public static void main7(String[] args) {
        String str1 = null;
        String str3 = "abcde";

        //boolean flg = str1.equals("abcde");
        boolean flg2 = "abcde".equals(str1);

        System.out.println(flg2);
    }

    public static void main6(String[] args) {
        String str1 = "Hello";
        String str2 = str1;
        str1 = "hello";
        System.out.println(str2);
        System.out.println(str1);
    }

    public static void main5(String[] args) {
        String str1 = "Hello";
        //str2指向了str1指向的对象
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str2 == str1);
    }


    public static void main4(String[] args) {
        String str2 = new String("abcde").intern();
        String str1 = "abcde";
        System.out.println(str1 == str2);//false
    }

    public static void main3(String[] args) {
        String str1 = "abcde";

        String str2 = new String("abcde");
        System.out.println(str1 == str2);//false

        //String str3 = "abc"+"de";//编译时 就进行了拼接 "abcde"
        String str3 = "abcde";
        System.out.println(str3 == str1);//true

        String str4 = new String("abc")+new String("de");
        System.out.println(str1 == str4);//false

        String str5 = new String("abc")+"de";
        System.out.println(str1 == str5);//false

        System.out.println(str4 == str5);//false

    }

    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        char[] value = {'h','e','l','l','o'};
        String str3 = new String(value);
        System.out.println(str1 == str2);//false
        System.out.println(str1 == str3);//false
        System.out.println(str2 == str3);//false


    }
    public static void main1(String[] args) {
        String str = "hello";
        System.out.println(str);

        String str2 = new String("hello");
        System.out.println(str2);

        char[] value = {'h','e','l','l','o'};
        String str3 = new String(value);
        System.out.println(str3);

    }
}
