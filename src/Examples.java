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
		reports.add(new DailyReport(new Date(4,30,2014), 56, 40));
		reports.add(new DailyReport(new Date(3,1,2014), 40, 20));
		reports.add(new DailyReport(new Date(3,2,2014), 42, 30));
		reports.add(new DailyReport(new Date(3,3,2014), 30, 10));
		reports.add(new DailyReport(new Date(4,4,2014), 50, 45));
		reports.add(new DailyReport(new Date(4,5,2014), 55, 30));
		reports.add(new DailyReport(new Date(4,6,2014), 56, 40));
		monitor = new WeatherMonitor(reports);
	}

	/**
	 * Test the averageHigh method in WeatherMonitor.
	 * @param t tester
	 * @return Whether the test passed or not.
	 */
	boolean testAverageHigh(Tester t)
	{
		return t.checkExpect(monitor.averageHighForMonth(3, 2014), 37) &&
				t.checkExpect(monitor.averageHighForMonth(4, 2014), 53);
	}

	/**
	 * Test the averageLow method in WeatherMonitor.
	 * @param t tester
	 * @return Whether the test passed or not.
	 */
	boolean testAverageLow(Tester t)
	{
		return t.checkExpect(monitor.averageLowForMonth(3, 2014), 20) &&
				t.checkExpect(monitor.averageLowForMonth(4, 2014), 38);
	}
}
