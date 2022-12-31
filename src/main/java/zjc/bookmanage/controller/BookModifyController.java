package zjc.bookmanage.controller;

import com.google.gson.Gson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zjc.bookmanage.org.model.Book;
import zjc.bookmanage.service.BookService;
import zjc.bookmanage.util.Msg;

@Api(value = "图书服务",description = "修改图书信息")
@RestController
@RequestMapping(produces = "application/json; charset=utf-8")
public class BookModifyController {
    @Autowired
    BookService bookService;

    @ApiOperation("修改设备")
    @GetMapping(value = "/BookManage/updateBookById")
    public Msg updateBookById(Book book){
        bookService.updateBook(book);
        Gson gson = new Gson();
        System.out.println("book-->"+gson.toJson(book));
        return Msg.success();
    }

//    @ApiOperation("修改图书名称和价格-->Json")
//    @GetMapping(value = "/BookManagejyc/updateBookById")
//    public String updateBookByIdtoJson(Book book){
//        bookService.updateBook(book);
//        Gson gson = new Gson();
//        System.out.println("book"+gson.toJson(book));
//        System.out.println(gson.toJson("修改图书成功"));
//        return gson.toJson("success");
//    }
}
