import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
//

        /**
         * simpleDateFormat
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = simpleDateFormat.format(date);
        System.out.println(s);

        String str = "2024-04-23 02:23:30";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf. parse(str); // java.text.ParseException
        System.out.println(d);

        Calendar instanceCalendar = Calendar.getInstance();

        instanceCalendar.set(2044,2,1);// 设置时间为2044-3-1 month 从0开始
        instanceCalendar.add(Calendar.DATE,-1); // 3月1日往前推一天 就是2月的最后一天

        int day = instanceCalendar.get(Calendar.DATE); // 得到该年的2月份有多少天
        System.out.println(day);
    }
}
