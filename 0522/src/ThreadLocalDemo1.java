/**
 * Created by JiaLe on 2021/5/23 14:59
 */
public class ThreadLocalDemo1 {
    ThreadLocal<String> threadLocal = new ThreadLocal(){
        @Override
        protected Object initialValue() {
            System.out.println("执行了初始化");
            return "java";
        }
    };
}
