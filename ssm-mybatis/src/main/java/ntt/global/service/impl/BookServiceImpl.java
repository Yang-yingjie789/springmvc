package ntt.global.service.impl;

import ntt.global.mapper.BookMapper;
import ntt.global.pojo.Book;
import ntt.global.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/4 9:51
 */

public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int add(Book book) {
        return bookMapper.add(book);
    }

    public int delete(int bookID) {
        return bookMapper.delete(bookID);
    }

    public List<Book> query() {
        return bookMapper.query();
    }

    public int update(Book book) {
        return bookMapper.update(book);
    }

    public Book queryBookById(int bookID) {
        return bookMapper.queryBookById(bookID);
    }
}
