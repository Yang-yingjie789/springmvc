package ntt.global.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/3 17:59
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private  int bookID;
    private String bookName;
    private int bookCounts;
    private  String detail;
}
