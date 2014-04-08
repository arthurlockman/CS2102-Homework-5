import java.util.LinkedList;

/**
 * @author Arthur Lockman | ajlockman | CS 2102 D14 | Section D02
 * @author Erin Ferguson | eeferguson | CS 2102 D14 | Section D02
 */
public class WeatherMonitor implements IWeatherMonitor
{
	private IReportList reports = new WeatherReportList();

	public WeatherMonitor()
	{

	}

	public WeatherMonitor(LinkedList<DailyReport> reports)
	{
		for(DailyReport report : reports)
			this.reports.addReport(report.getDate(), report.getHigh(), report.getLow());
	}

	public Integer averageHighForMonth(int month, int year)
	{
		return reports.getMonthlyHigh(month, year);
	}

	public Integer averageLowForMonth(int month, int year)
	{
		return reports.getMonthlyLow(month, year);
	}

	public void addDailyReport(Date date, LinkedList<Integer> temps)
	{
		int max = temps.getFirst();
		int min = temps.getFirst();

		for(Integer temp : temps)
		{
			if (temp > max)
				max = temp;
			if (temp < min)
				min = temp;
		}
		reports.addReport(date, max, min);
	}
}
