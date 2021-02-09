package jp.ac.uryukyu.ie.e195345;

public class Main{


    public static void test(String str) {
        try {
            System.out.println(str.length());
        } catch(NullPointerException e) {
            System.out.println("エラーが起こりました。");
            System.out.println("エラー内容:"+ e.getMessage());
        }

    }

    public static void main(String[] args) {
        String str = null;
        test(str);
    
    }

}  