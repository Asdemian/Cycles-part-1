public class Main {
    public static void main(String[] args) {
        //task1
        for (int i = 1; i <= 10; i ++) {
            System.out.println( "Итерация цикла " +i);
        }
        //task 2
        for (int i = 10; i >= 0; i --) {
            System.out.println( "Итерация цикла " +i);
        }
        //task 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println( "Итерация цикла " +i);
        }
        //task 4
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println( "Итерация цикла " +i);
        }
        //task 1-1
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i+ " год является високосным.");
        }
        //task 1-2
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        //task 1-3
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }
}