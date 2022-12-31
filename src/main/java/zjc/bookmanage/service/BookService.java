package zjc.bookmanage.service;

import zjc.bookmanage.org.model.Book;

import java.util.List;

public interface BookService {
//    1 根据图书分类号查找所有图书
    public List<Book> findBookByBookClassId(Integer bookKindId);

//    2 根据图书号查找图书
    public Book findBookById(Integer bookId);

//    3 修改指定编号图书名称和价格
    public void updateBook(Book book);
}
