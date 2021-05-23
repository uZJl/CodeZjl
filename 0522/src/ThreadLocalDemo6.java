/**
 * Created by JiaLe on 2021/5/23 15:48
 */
public class ThreadLocalDemo6 {
    public static void main(String[] args) {
        //模拟用户的用户登录
        User user = new User();
        user.setUsername("Java");

        Order order = new Order();
        order.getOrder();
    }

    static class ThreadLocalUtil {
        static ThreadLocal<User> threadLocal = new ThreadLocal<>();

    }
    static class User {
        private String username;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    static class Logger {
        public void addLog() {
            User user = ThreadLocalUtil.threadLocal.get();

            System.out.println("添加日志：" + user.getUsername());
        }
    }

    static class Order{
        public void getOrder() {
            User user = ThreadLocalUtil.threadLocal.get();

            System.out.println("订单列表：" + user.getUsername());
        }
    }
}
