import com.sun.org.apache.xpath.internal.objects.XString;

/**
 * <p></p>
 *
 * @Author Yang yingjie(杨英杰)
 * @Created 2020/6/1 23:36
 */
public class Mytest {
    public static void main(String[] args) {
        convertPhone("13701350889");

    }
    private static   String convertPhone(String pno){
        System.out.println(pno);
        System.out.println(pno.substring(3,7));
        System.out.println(pno.charAt(4));
        String re=pno.substring(3,7);
        for (int i = 4; i < 8; i++) {
            pno.replace(pno.charAt(i),'*');
        }
        System.out.println(pno);
        return pno;
    }
}
