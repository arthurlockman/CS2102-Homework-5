import java.util.LinkedList;

/**
 * @author Arthur Lockman | ajlockman | CS 2102 D14 | Section D02
 * @author Erin Ferguson | eeferguson | CS 2102 D14 | Section D02
 */
public interface IWeatherMonitor
{
	public Integer averageHighForMonth(int month, int year);
	public Integer averageLowForMonth(int month, int year);
	public void addDailyReport(Date date, LinkedList<Integer> temps);
}
