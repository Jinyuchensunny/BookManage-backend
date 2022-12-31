package zjc.bookmanage.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zjc.bookmanage.org.dao.BookMapper;
import zjc.bookmanage.org.model.Book;
import zjc.bookmanage.org.model.BookExample;
import zjc.bookmanage.service.BookService;

import java.util.List;

@Service
public class BookServiceImp implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> findBookByBookClassId(Integer bookKindId) {
        BookExample example = new BookExample();
        example.createCriteria().andBookkindidEqualTo(bookKindId);
        List<Book> books = bookMapper.selectByExample(example);
        return books;
    }
    @Override
    public Book findBookById(Integer bookId) {
        Book book = bookMapper.selectByPrimaryKey(bookId);
        return book;
    }
    @Override
    public void updateBook(Book book) {
        bookMapper.updateByPrimaryKeySelective(book);
    }
}
