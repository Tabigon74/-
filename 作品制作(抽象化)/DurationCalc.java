import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author 田平和彦
 * @reviewer 髙橋直樹
 * 
 * 経過日数から、経過年数、月数を計算して出力する
 */
public class DurationCalc {

	/**
	 * 経過日数から経過年数を出力する
	 * @param duration_days 経過日数
	 * @return 経過年数
	 */
    public static int durationYear(int duration_days){
		Date nowDate = new Date();
		Calendar cal = Calendar.getInstance();

		cal.setTime(nowDate);
		String nowYear = new SimpleDateFormat("yyyy",Locale.US).format(cal.getTime());
		cal.add(Calendar.DATE, duration_days);
		String afterYear = new SimpleDateFormat("yyyy",Locale.US).format(cal.getTime());
        int year = Integer.parseInt(afterYear)-Integer.parseInt(nowYear);

        return year;
    }
	
	/**
	 * 経過日数から経過月数を出力する
	 * @param duration_days 経過日数
	 * @return 経過月数
	 */
    public static int durationMonth(int duration_days){
		Date nowDate = new Date();
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(nowDate);
		String nowMonth = new SimpleDateFormat("MM",Locale.US).format(cal.getTime());
		cal.add(Calendar.DATE, duration_days);
		String afterMonth = new SimpleDateFormat("MM",Locale.US).format(cal.getTime());
        int month = Integer.parseInt(afterMonth)<Integer.parseInt(nowMonth)?12+Integer.parseInt(afterMonth)-Integer.parseInt(nowMonth):Integer.parseInt(afterMonth)-Integer.parseInt(nowMonth);

        return month;
    }
    
}
