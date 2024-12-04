public class Main {
    public static void main(String[] args) {
        //Преобразование String в StringBuffer и StringBuilder:
        String str = "Hello, World!";
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuilder stringBuilder = new StringBuilder(str);

        //Преобразование StringBuffer в String:
        StringBuffer strBuf = new StringBuffer("Hello, StringBuffer!");
        String strFromBuffer = strBuf.toString();

        //Преобразование StringBuilder в String:
        StringBuilder strBuild = new StringBuilder("Hello, StringBuilder!");
        String strFromBuilder = strBuild.toString();

        //Преобразование StringBuffer в StringBuilder:
        StringBuffer strBuf1 = new StringBuffer("Hello!");
        StringBuilder strBuild1 = new StringBuilder(strBuf1.toString());

        //Преобразование StringBuilder в StringBuffer:
        StringBuilder strBuild2 = new StringBuilder("Hello!");
        StringBuffer strBuf2 = new StringBuffer(strBuild2.toString());
    }
}