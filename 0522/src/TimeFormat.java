import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * Created by JiaLe on 2021/5/23 11:43
 */
public class TimeFormat {
    public static void main(String[] args) {

    }
    private static void myFormatTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
        String result = simpleDateFormat.format(date);
    }
}
