package BookRental;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> arr = new ArrayList<>();

    public BookList() {
        this.arr.add(new Book("오준석의 생존코딩"));
        this.arr.add(new Book("80세 박막례 할머니도 하는 자바"));
        this.arr.add(new Book("치킨 튀기는 개발자"));
    }

    public void showAllBookList() {
        for (Book book : this.arr) {
            System.out.println(book);
        }
    }

    public List<Book> getArr() {
        return arr;
    }

    //책 이름을 넣으면 책을 반환
    public Book getBook(String bookName) {
        int cnt = 0;
        for (Book book : this.arr) {
            if (book.getBookName() == bookName) {
                cnt += 1;
                return book;
            }
        }
        if (cnt == 0) {
            System.out.println("해당 도서가 존재하지 않습니다.");
        }
        return null;
    }
}
