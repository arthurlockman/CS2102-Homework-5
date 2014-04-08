/**
 * @author Arthur Lockman | ajlockman | CS 2102 D14 | Section D02
 * @author Erin Ferguson | eeferguson | CS 2102 D14 | Section D02
 */
public class Date
{
	private int month, day, year;

	Date(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

	public int getDay()
	{
		return day;
	}

	public int getMonth()
	{
		return month;
	}

	public int getYear()
	{
		return year;
	}

	public boolean equals(Date d)
	{
		return (this.month == d.month) && (this.day == d.day) && (this.year == d.year);
	}
}
