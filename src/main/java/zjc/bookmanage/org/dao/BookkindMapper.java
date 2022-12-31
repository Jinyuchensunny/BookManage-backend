package zjc.bookmanage.org.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import zjc.bookmanage.org.model.Bookkind;
import zjc.bookmanage.org.model.BookkindExample;

@Mapper
public interface BookkindMapper {
    long countByExample(BookkindExample example);

    int deleteByExample(BookkindExample example);

    int deleteByPrimaryKey(Integer bookkindid);

    int insert(Bookkind record);

    int insertSelective(Bookkind record);

    List<Bookkind> selectByExample(BookkindExample example);

    Bookkind selectByPrimaryKey(Integer bookkindid);

    int updateByExampleSelective(@Param("record") Bookkind record, @Param("example") BookkindExample example);

    int updateByExample(@Param("record") Bookkind record, @Param("example") BookkindExample example);

    int updateByPrimaryKeySelective(Bookkind record);

    int updateByPrimaryKey(Bookkind record);
}