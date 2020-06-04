import ntt.global.mapper.BookMapper;
import ntt.global.pojo.Book;
import ntt.global.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/3 21:59
 */
public class DbTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        List<Book> books = mapper.query();
        for (Book book : books) {
            System.out.println(book);
        }
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        Book book=new Book(1,"考研数学",13,"学到老活到老");
      int b_f= mapper.add(book);
        System.out.println(b_f);
    }
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        Book book=new Book(5,"考研tiyu",13,"学到老活到老");
        int d_f = mapper.update(book);
        System.out.println(d_f);

    }
    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        for (int i = 1; i <6 ; i++) {
            Book book = mapper.queryBookById(i);
            System.out.println(book);

        }
    }
    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        int d_f= mapper.delete(5);
            System.out.println(d_f);
    }

}
