public class Test {
    public static void main(String args[]) {
        byte b1 = 8;
        short s1 = 64;
        int i1 = 1024;
        long l1 = 1234567890;
        float f1 = 4.4f;
        double d1 = 0.3d;
        char c1 = 'a';
        boolean bl1 = true;

        String a = "10";
        String t1 = a + b1, t2 = a + s1, t3 = a + i1, t4 = a + l1, t5 = a + f1, t6 = a + d1, t7 = a + c1, t8 = a + bl1;

        System.out.println(t1); // 108
        System.out.println(t2); // 1064
        System.out.println(t3); // 101024
        System.out.println(t4); // 101234567890
        System.out.println(t5); // 104.4
        System.out.println(t6); // 100.3
        System.out.println(t7); // 10a
        System.out.println(t8); // 10true
    }
}