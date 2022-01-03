package ex8;
import java.util.*;
/**
 * @author mxj
 * @date 0023, 2019, 8, 23��  11:16
 * 1. ʹ��List��Map��Ŷ��ͼ����Ϣ��
 * �����������������Ʒ���ԣ���ţ����ƣ����ۣ�������;
 * ʹ����Ʒ�����ΪMap�е�key��
 */
public class Test1{
    public static void main(String[] args) {
        //new����Books����
        Books books1 = new Books(1001, "Java", 888.0, "Sun������");
        Books books2 = new Books(1002, "Python", 257.0, "Python������");
        Books books3 = new Books(1003, "C++", 155.0, "C++������");

        //Ȼ��Ž�HashMap��,Key��ͼ��ı��,value��ͼ�����
        HashMap<Integer, Books> booksHashMap = new HashMap<>();
        booksHashMap.put(books1.getNum(), books1);
        booksHashMap.put(books2.getNum(), books2);
        booksHashMap.put(books3.getNum(), books3);

        /**
         * Ҳ���Բ��ô���Books��,ֱ����HashMap���ϴ洢ͼ�������
         * Ȼ��Ž�list������,������Ϊ���� ͼ������Ϊkey
         */
        List<HashMap<Integer, Books>> booksList = new ArrayList<>();
        booksList.add(booksHashMap);
        
        System.out.println("���\t����\t����\t������");
        for (HashMap<Integer, Books> h : booksList) {
            //��ȡkey
            Set<Integer> key = h.keySet();
            for (Integer i : key) {
                //��ͨ��key��value
                System.out.println(i
                        + "\t" + h.get(i).getName()
                        + "\t" + h.get(i).getPrice()
                        + "\t" + h.get(i).getPress());
            }
        }
    }
}

/**
 * Books(ͼ����)
 * ���ڴ��ͼ�������
 */
class Books {
    /**
     * num ���
     * name ����
     * price �۸�
     * press ������
     */
    private int num;
    private String name;
    private double price;
    private String press;

    public Books() {

    }

    Books(int num, String name, double price, String press) {
        super();
        this.num = num;
        this.name = name;
        this.price = price;
        this.press = press;
    }

    int getNum() {
        return num;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    String getPress() {
        return press;
    }
}