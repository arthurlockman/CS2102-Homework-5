/**
 * @author Arthur Lockman | ajlockman | CS 2102 D14 | Section D02
 * @author Erin Ferguson | eeferguson | CS 2102 D14 | Section D02
 */

import tester.Tester;

import java.util.LinkedList;

public class Examples
{
	private WeatherMonitor monitor;

	Examples()
	{
		LinkedList<DailyReport> reports = new LinkedList<DailyReport>();
		reports.add(new DailyReport(new Date(3,24,2014), 40, 20));
		reports.add(new DailyReport(new Date(3,20,2014), 42, 30));
		reports.add(new DailyReport(new Date(3,12,2014), 30, 10));
		reports.add(new DailyReport(new Date(4,20,2014), 50, 45));
		reports.add(new DailyReport(new Date(4,21,2014), 55, 30));

		monitor = new WeatherMonitor(reports);
	}
}
