package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的图书的名字");
        String name = scanner.nextLine();
        int i = 0;
        for (; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBooks(i);
            if(book.getName().equals(name)) {
                break;
            }
        }
        if(i >= bookList.getUsedSize()) {
            System.out.println("没有要删除的这本书!");
            return;
        }
        int pos = i;
        for (int j = pos; j < bookList.getUsedSize()-1; j++) {
            Book book = bookList.getBooks(j+1);
            bookList.setBooks(j,book);
        }
        bookList.setUsedSize(bookList.getUsedSize()-1);
        System.out.println("成功删除图书！");

    }
}
