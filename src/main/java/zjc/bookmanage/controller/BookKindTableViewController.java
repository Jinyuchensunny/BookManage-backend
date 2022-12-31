package zjc.bookmanage.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zjc.bookmanage.org.model.Bookkind;
import zjc.bookmanage.org.to.BookKindList;
import zjc.bookmanage.service.BookkindService;
import zjc.bookmanage.util.Msg;

import java.util.List;

@Api(value = "图书分类服务",description = "获取所有图书分类")
@RestController
@RequestMapping(produces = "application/json; charset=utf-8")
public class BookKindTableViewController {
    @Autowired
    BookkindService bookkindService;

    @ApiOperation("获取所有图书分类")
    @GetMapping(value = "/BookManage/findAllBookClass")
    public Msg findAllBookClass(){
        List<Bookkind> findAllBookClass = bookkindService.findAllBookClass();
        return Msg.success().add("bookClass",findAllBookClass);
    }


//    @ApiOperation("获取所有图书分类-->Json")
//    @GetMapping(value = "/BookManagejyc/findAllBookClass")
//    public String findAllBookClasstoJson() {
//        List<Bookkind> allbookkinds = bookkindService.findAllBookClass();
//        BookKindList bookKindList = new BookKindList();
//        bookKindList.setBookkinds(allbookkinds);
//        Gson gson = new Gson();
//        return gson.toJson(bookKindList, new TypeToken<BookKindList>() {
//        }.getType());
//    }
}
