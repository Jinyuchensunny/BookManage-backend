package zjc.bookmanage.org.to;

import lombok.Data;
import zjc.bookmanage.org.model.Book;

import java.util.ArrayList;
import java.util.List;

@Data
public class BookList {
    private List<Book> books = new ArrayList<>();
}
