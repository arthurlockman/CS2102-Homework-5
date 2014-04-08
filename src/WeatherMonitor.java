import java.util.LinkedList;

public class WeatherMonitor
{
	private LinkedList<DailyReport> reports = new LinkedList<DailyReport>();

	public WeatherMonitor()
	{

	}

	public Integer averageHighForMonth(int month)
	{
		int count = 0;
		int accumulator = 0;
		for(DailyReport report : reports)
		{
			if(report.getMonth() == month)
			{
				accumulator += report.getHigh();
				count++;
			}
		}
		if (count == 0)
			return null;
		else
			return accumulator / count;
	}

	public Integer averageLowForMonth(int month)
	{
		int count = 0;
		int accumulator = 0;
		for(DailyReport report : reports)
		{
			if(report.getMonth() == month)
			{
				accumulator += report.getLow();
				count++;
			}
		}
		if (count == 0)
			return null;
		else
			return accumulator / count;
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

		DailyReport n = new DailyReport(date, max, min);

		reports.add(n);
	}
}
