/**
 * @author Arthur Lockman | ajlockman | CS 2102 D14 | Section D02
 * @author Erin Ferguson | eeferguson | CS 2102 D14 | Section D02
 */
public interface IReportList
{
	public Integer getHigh(Date date);
	public int getMonthlyHigh(int month, int year);
	public Integer getLow(Date date);
	public int getMonthlyLow(int month, int year);
	public void addReport(Date date, int high, int low);
}
