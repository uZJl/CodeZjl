package operation;

import book.BookList;

public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.exit(1);
        System.out.println("成功退出系统！");
    }
}
