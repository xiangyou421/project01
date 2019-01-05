package cn.fjsmu.java;

import java.util.ArrayList;

/**
 * @author Qian YuHua
 * @create 2019-01-05 16:40
 */
public class fe {
    private static final int SUM = 10;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        String[] s= {"123", "456", "789"};
        for (String arg : s) {
            System.out.println(arg);
        }
        for (int i = 0; i < s.length; i++) {
            String s1 = s[i];
            System.out.println(s1);
        }
        ArrayList<String> arr = new ArrayList<>();
        arr.add("qwe");
        arr.add("asd");
        arr.add("zxc");
        for (String s1 : arr) {
            System.out.println(s1);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }


    }
}
