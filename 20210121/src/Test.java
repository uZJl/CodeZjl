/**
 * Created by JiaLe on 2021/1/21 14:47
 */

class A<T> {
    T value;

    A(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class Test<E> {
    public static void main(String[] args) {
        A<Integer> test = new A<>(10);
        System.out.println(test.get());
    }
}
