public class DailyReport
{
	private Date date;
	private int high, low;

	DailyReport(Date date, int high, int low)
	{
		this.date = date;
		this.high = high;
		this.low = low;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public Date getDate()
	{
		return date;
	}

	public int getMonth()
	{
		return date.getMonth();
	}

	public int getHigh()
	{
		return high;
	}

	public int getLow()
	{
		return low;
	}

	public void setHigh(int high)
	{
		this.high = high;
	}

	public void setLow(int low)
	{
		this.low = low;
	}
}
