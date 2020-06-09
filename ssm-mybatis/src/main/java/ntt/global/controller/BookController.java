package ntt.global.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ntt.global.pojo.Book;
import ntt.global.service.BookService;
import ntt.global.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.print.attribute.standard.RequestingUserName;
import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/4 9:58
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allbooks")
    public String queryBook(Model model) {
        List<Book> list = bookService.query();
        model.addAttribute("list",list);
        return "allbook";
    }

    @RequestMapping("/{id}")
    public String queryBook(@PathVariable(name = "id") int id,Model model) {
        Book book= bookService.queryBookById(id);
        model.addAttribute("book",book);
        return "book";
    }
    //跳转到 添加是图书页面
    @RequestMapping("/addpage")
    public String bookaddpage() {
        return "book/add";
    }
    @RequestMapping(value = "/addbook",method = RequestMethod.POST,produces = "text/application;charset=utf-8")
    public String addbook(Book book) {
        if(book.toString().length()>0){
            int  isuccess= bookService.add(book);
            return "redirect:allbooks";
        }
        return null;
    }

    //跳转到修改页面
    @RequestMapping("/editPage")
    public String editPage(int bookID,Model model) {
        Book book = bookService.queryBookById(bookID);
        model.addAttribute("QBook",book);
        return "book/edit";
    }
    //图书修改
    @RequestMapping(value ="/editBook",method = RequestMethod.POST,produces = "text/application;charset=utf-8")
    public String editBook(Book book) {
        System.out.println(book);
        int isuccess = bookService.update(book);
        System.out.println("更新结果"+isuccess);
        return "redirect:allbooks";// 指定向图书列表

    }

    //图书删除
    @RequestMapping(value ="/deleteBook/{bookID}")
    public String deleteBook(int bookID) {
        int isuccess = bookService.delete(bookID);
        System.out.println("删除 结果"+isuccess);
        return "redirect:allbooks";// 指定向图书列表
    }

    //根据名字查询图书
    @RequestMapping(value = "/queryBook")
    public String queryBookByName(String bookName,Model model){
        List<Book> list=new ArrayList<Book>();
        Book book = bookService.queryBookByName(bookName);
        if (book ==null){
            list=bookService.query();
            model.addAttribute("result","未查询到");
        }
        list.add(book);
        model.addAttribute("list",list);
        return "allbook";
    }

    //根据名字模糊查询图书
    @RequestMapping(value = "/queryBooks")
    public String queryBookByNames(String bookName,Model model){
        List<Book> list = bookService.queryBookByNames(bookName);
        if(list.size()< 1){
            list=bookService.query();
            model.addAttribute("result","未查询到");
        }
        model.addAttribute("list",list);
        return "allbook";
    }



}
