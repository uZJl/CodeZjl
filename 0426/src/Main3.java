import java.util.Scanner;

/**
 * Created by JiaLe on 2021/4/26 20:19
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            int feb = 28;
            int sum =0;
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                feb = 29;
            }
            switch(month) {
                case 1:
                    sum = day;
                    break;
                case 2:
                    sum = 31 + day;
                    break;
                case 3:
                    sum = 31 + feb + day;
                    break;
                case 4:
                    sum = 31 + feb + 31 + day;
                    break;
                case 5:
                    sum = 31 + feb + 31 + 30 + day;
                    break;
                case 6:
                    sum = 31 + feb + 31 + 30 + 31 + day;
                    break;
                case 7:
                    sum = 31 + feb + 31 + 30 + 31 + 30 + day;
                    break;
                case 8:
                    sum = 31 + feb + 31 + 30 + 31 + 30 + 31 + day;
                    break;
                case 9:
                    sum = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + day;
                    break;
                case 10:
                    sum = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
                    break;
                case 11:
                    sum = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
                    break;
                case 12:
                    sum = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
            }
            System.out.println(sum);
        }
    }
}
