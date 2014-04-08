import java.util.LinkedList;

/**
 * @author Arthur Lockman | ajlockman | CS 2102 D14 | Section D02
 * @author Erin Ferguson | eeferguson | CS 2102 D14 | Section D02
 */
public class WeatherReportList implements IReportList
{
	private LinkedList<DailyReport> reports = new LinkedList<DailyReport>();

	@Override
	public Integer getHigh(Date date)
	{
		Integer h = null;
		for(DailyReport report : reports)
		{
			if (report.getDate().equals(date))
				h = report.getHigh();
		}
		return h;
	}

	@Override
	public int getMonthlyHigh(int month, int year)
	{
		int high = reports.getFirst().getHigh();
		for(DailyReport report : reports)
		{
			if (report.getHigh() > high && report.getMonth() == month && report.getYear() == year)
				high = report.getHigh();
		}
		return high;
	}

	@Override
	public Integer getLow(Date date)
	{
		Integer l = null;
		for(DailyReport report : reports)
		{
			if (report.getDate().equals(date))
				l = report.getLow();
		}
		return l;
	}

	@Override
	public int getMonthlyLow(int month, int year)
	{
		int low = reports.getFirst().getHigh();
		for(DailyReport report : reports)
		{
			if (report.getLow() < low)
				low = report.getHigh();
		}
		return low;
	}

	@Override
	public void addReport(Date date, int high, int low)
	{
		DailyReport r = new DailyReport(date, high, low);
		reports.add(r);
	}
}
