package ntt.global.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ntt.global.pojo.Book;
import ntt.global.service.BookService;
import ntt.global.service.impl.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/4 9:58
 */
@Controller
@ResponseBody
@RequestMapping("/book")
public class BookController {
    private BookService bookService;

    public void setBookService(BookServiceImpl bookService) {
        this.bookService = bookService;
    }
    @RequestMapping("/{id}")
    public String queryBook(@PathVariable(name = "id") int id) {
        System.out.println(id);
        ObjectMapper objectMapper=new ObjectMapper();
        Book book= bookService.queryBookById(id);
        try {
            return objectMapper.writeValueAsString(book);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
