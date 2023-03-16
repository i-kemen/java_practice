package com.nhk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.naming.Name;

public class Book implements Comparable<Book> {
    private String title;
    private Date publishDate;
    private String comment;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    // equals 오버라이드
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null)
            return false;
        if (!(o instanceof Book))
            return false;
        Book book = (Book) o;
        if (!(this.title.equals(book.title)) && !(this.publishDate.equals(book.publishDate))) {
            return false;
        }
        return true;
    }

    // hashCode 재정의
    @Override
    public int hashCode() {
        int result = 23;
        result = result * 32 + title.hashCode();
        result = result * 32 + publishDate.hashCode();
        return result;
    }

    // 비교
    public int compareTo(Book o) {
        return this.publishDate.compareTo(o.publishDate);
    }

    // clone메서드
    @Override
    public Book clone() {
        Book book = new Book(title, publishDate, comment);
        book.title = this.title;
        book.publishDate = this.publishDate;
        book.comment = this.comment;

        return book;
    }


    public static void main(String[] args) throws ParseException {
        // TODO Auto-generated method stub
        Date now = new Date();


        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d1 = format.parse("2011/09/22 01:23:45");
        Date d2 = format.parse("2011/09/22 01:23:45");


        Book book1 = new Book("오준석의 생존코딩", d1, "유익하고 좋아요");
        Book book2 = new Book("오준석의 생존코딩", d2, "유익하고 좋아요");

        // 같은 객체인지 확인하기
        System.out.println(book1.equals(book2));

        // hashSet에서 같은 객체로 인식되는지 확인하기
        Set<Book> bookset = new HashSet<>();
        bookset.add(book1);
        bookset.add(book2);
        System.out.println(bookset.size());


        // Book 인스턴스를 books 리스트에 추가한 후 출간일이 오래된 순서대로 정렬
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        Collections.sort(books);

        // 출력해보기
        // for (Book book : books) {
        // System.out.println("Title: " + book.getTitle() + ", Publish Date: " +
        // book.getPublishDate() + ", Comment: " + book.getComment());
        // }

        // 클론하기
        Book clonedBook = book1.clone();
        System.out.println("Title: " + clonedBook.getTitle() + ", Publish Date: "
                + format.format(clonedBook.getPublishDate()) + ", Comment: "
                + clonedBook.getComment());

    }


}
