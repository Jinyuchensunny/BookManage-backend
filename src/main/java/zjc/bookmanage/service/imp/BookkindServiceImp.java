package zjc.bookmanage.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zjc.bookmanage.org.dao.BookkindMapper;
import zjc.bookmanage.org.model.Bookkind;
import zjc.bookmanage.org.model.BookkindExample;
import zjc.bookmanage.service.BookkindService;

import java.util.List;

@Service
public class BookkindServiceImp implements BookkindService {
    @Autowired
    private BookkindMapper bookkindMapper;
    @Override
    public List<Bookkind> findAllBookClass() {
        BookkindExample example = new BookkindExample();
        example.createCriteria().getAllCriteria();
        List<Bookkind> bookkinds = bookkindMapper.selectByExample(example);
        for (Bookkind bookkind : bookkinds){
            System.out.println(bookkind);
        }
        return bookkinds;
    }
}
