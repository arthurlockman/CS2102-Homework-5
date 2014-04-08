public class DailyReport
{
	private Date date;
	private int temperature;

	DailyReport(Date date, int temperature)
	{
		this.date = date;
		this.temperature = temperature;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public void setTemperature(int temperature)
	{
		this.temperature = temperature;
	}

	public Date getDate()
	{
		return date;
	}

	public int getTemperature()
	{
		return temperature;
	}

	public int getMonth()
	{
		return date.getMonth();
	}
}
