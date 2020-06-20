
public class bike
{
	public int gear;
	public int speed;
	public bike(int gear, int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}
	public void applybrake(int decrement)
	{
		speed -= decrement;
	}
	public string toString()
	{
		return("No of gears are "+ gear + "speed: " + speed);
	}
}
class mountainbike extend bike()
{
	public int seatheight;
	public mountainbike(int gear, int speed, int height)
	{
		super(gear, speed);
		seatheight = height;
	}
	@override
}
