package zjc.bookmanage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zjc.bookmanage.service.BookService;
import zjc.bookmanage.service.BookkindService;

@SpringBootTest
class BookmanageApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    BookkindService bookkindService;

    @Test
    void testBookkind(){
        bookkindService.findAllBookClass();
    }

    @Autowired
    BookService bookService;
    @Test
    void  testBook(){
        System.out.println(bookService.findBookByBookClassId(2));
//        System.out.println(bookService.findBookById(1));
    }


}
