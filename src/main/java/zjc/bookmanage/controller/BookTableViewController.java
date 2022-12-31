package zjc.bookmanage.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zjc.bookmanage.org.model.Book;
import zjc.bookmanage.org.to.BookList;
import zjc.bookmanage.service.BookService;
import zjc.bookmanage.util.Msg;

import java.util.List;

@Api(value = "图书服务",description = "获取某图书分类下所有图书")
@RestController
@RequestMapping(produces = "application/json; charset=utf-8")
public class BookTableViewController {
    @Autowired
    BookService bookService;

    @ApiOperation("获取某图书分类下所有图书")
    @GetMapping(value = "/BookManage/findBookByBookClassId={bookClassId}")
    public Msg findBookByBookClassId(@PathVariable("bookClassId")Integer bookKindId){
        List<Book> books = (List<Book>) bookService.findBookByBookClassId(bookKindId);
        System.out.println(bookKindId);
        return Msg.success().add("books",books);
    }

//    @ApiOperation("获取某图书分类下所有图书-->Json")
//    @GetMapping(value = "/BookManagejyc/findBookByBookClassId={bookClassId}")
//    public String findBookByBookClassIdtoJson(@PathVariable("bookClassId")Integer bookKindId){
//        List<Book> books = bookService.findBookByBookClassId(bookKindId);
//        System.out.println(bookKindId);
//        BookList bookList = new BookList();
//        bookList.setBooks(books);
//        Gson gson = new Gson();
//        return gson.toJson(bookList,new TypeToken<BookList>(){}.getType());
//    }

}
