package zjc.bookmanage.controller;

import com.google.gson.Gson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zjc.bookmanage.org.dao.BookMapper;
import zjc.bookmanage.org.model.Book;
import zjc.bookmanage.service.BookService;
import zjc.bookmanage.util.Msg;

@Api(value = "图书服务",description = "获取指定编号的图书")
@RestController
@RequestMapping(produces = "application/json; charset=utf-8")
public class BookViewController {
    @Autowired
    BookService bookService;

    @ApiOperation("获取指定编号的图书")
    @GetMapping(value = "/BookManage/findBookById/bookId={bookId}")
    public Msg findBookById(@PathVariable("bookId")Integer bookId){
        Book book = bookService.findBookById(bookId);
        System.out.println(bookId);
        return Msg.success().add("book",book);
    }

//    @ApiOperation("获取指定编号的图书-->Json")
//    @GetMapping(value = "/BookManagejyc/findBookById/bookId={bookId}")
//    public String findBookByIdtoJson(@PathVariable("bookId")Integer bookId) {
//        Book book = bookService.findBookById(bookId);
//        System.out.println(bookId);
//        Gson gson = new Gson();
//        return gson.toJson(book);
//    }
}
