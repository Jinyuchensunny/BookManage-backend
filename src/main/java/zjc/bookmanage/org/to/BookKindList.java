package zjc.bookmanage.org.to;

import lombok.Data;
import zjc.bookmanage.org.model.Bookkind;

import java.util.ArrayList;
import java.util.List;

@Data
public class BookKindList {
    private List<Bookkind> bookkinds = new ArrayList<>();
}
