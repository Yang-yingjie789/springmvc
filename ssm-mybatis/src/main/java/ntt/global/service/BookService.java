package ntt.global.service;

import ntt.global.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/4 9:50
 */
public interface BookService {
    //CRUD 增删查改
    int add(Book book);
    //删除图书
    int delete(int bookID);
    // 查询 图书
    List<Book> query();
    //更新图书
    int update(Book book);
    //根据 id 查询图书
    Book queryBookById(int bookID);

}
