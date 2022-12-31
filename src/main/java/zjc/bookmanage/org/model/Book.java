package zjc.bookmanage.org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer bookid;
    private Integer bookkindid;
    private String bookname;
    private String bookprice;
}