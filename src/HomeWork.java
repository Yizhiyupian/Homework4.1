import java.util.*;

;

/**
 * 描述：完成一份Java的代码，包括Java random，Math，String类相关成员函数的使用，Arraylist，Set，HashMap等各种容器类的使用
 * 邮件地址：haiyuzhu@sjtu.edu.cn
 * &author:haiyu
 * &time:2018/4/1/19:13
 */
public class HomeWork {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.print(list);
        System.out.println("----------");
        System.out.println(Math.abs(random.nextFloat()));
        System.out.println(Math.ceil(random.nextDouble()));
        System.out.println(Math.sqrt(random.nextInt(100)));
        System.out.println(Math.log10(random.nextInt(100)));
        System.out.println("----------");
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(((Integer) random.nextInt(100)).toString());
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (string.contains("2")) {
                continue;
            } else System.out.println(string);
        }
        System.out.println("----------");
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, ((Integer) random.nextInt(100)).toString());
        }
        Set<Integer> indexSet = map.keySet();
        for (int index : indexSet) {
            System.out.println(index + ":" + map.get(index));
        }

    }
}

