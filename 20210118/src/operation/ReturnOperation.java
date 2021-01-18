package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要归还的图书的名字");
        String name = scanner.nextLine();
        int i = 0;
        for (; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBooks(i);
            if(book.getName().equals(name)) {
                book.setStatus(false);
                break;
            }
        }
        if(i >= bookList.getUsedSize()) {
            System.out.println("没有要归还的这本书!");
            return;
        }
    }
}
