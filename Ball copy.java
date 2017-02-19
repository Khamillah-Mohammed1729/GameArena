/**
 * Models a simple solid sphere. 
 * This class represents a Ball2 object. When combined with the GameArena class,
 * instances of the BallE class can be displayed on the screen.
 */
public class Ball
{
	// The following instance variables define the
	// information needed to represent a BallE
	// Feel free to more instance variables if you think it will 
	// support your work... 
	
	private double xPosition;			// The X coordinate of this Ball
	private double yPosition;			// The Y coordinate of this Ball
	private double size;				// The diameter of this Ball
	private String colour = "WHITE";	// The colour of this Ball

										// Permissable colours are 8 bit hexadecimal 
                                        // RGB values in the format #RRGGBB. e.g.
                                        //
                                        // Pure red is FF0000
                                        // Pure red is 00FF00
                                        // Pure red is 0000FF

    private double xSpeed;
	private double ySpeed;

    private double GRAVITY = 0.4;
    private double FRICTION = 0.5;






    
	public Ball(double x, double y, double diameter, String col)
	{
		xPosition = x;
		yPosition = y;

		size = diameter;
		colour = col;
	}	

	/**
	 * Obtains the current position of this Ball.
	 * @return the X coordinate of this Ball within the GameArena.
	 */
	public double getXPosition()
	{
		return xPosition;
	}

	/**
	 * Obtains the current position of this Ball.
	 * @return the Y coordinate of this Ball within the GameArena.
	 */
	public double getYPosition()
	{
		return yPosition;
	}

	/**
	 * Moves the current position of this Ball to the given co-ordinates
	 * @param x the new x co-ordinate of this Ball
	 */
	public void setXPosition(double x)
	{
		this.xPosition = x;
	}

	/**
	 * Moves the current position of this Ball to the given co-ordinates
	 * @param y the new y co-ordinate of this Ball
	 */
	public void setYPosition(double y)
	{
		this.yPosition = y;
	}

	/**
	 * Obtains the size of this Ball.
	 * @return the diameter of this Ball,in pixels.
	 */
	public double getSize()
	{
		return size;
	}

	/**
	 * Obtains the colour of this Ball.
	 * @return a textual description of the colour of this Ball.
	 */
	public String getColour()
	{
		return colour;
	}
    
    
    /**
    * sets the speed in the x direction i.e horizontal speed of this Ball.
    * @param speed The x component of speed of the Ball as it moves
    *
    **/
    public void setXSpeed(double speed)
    {
        xSpeed = speed;
    }

    /**
    * sets the speed in the y direction i.e vertical speed of this Ball.
    * @param speed The y component of speed of the Ball as it moves.
    *
    **/
    public void setYSpeed(double speed)
    {
        ySpeed = speed;
    }


    /**
    * Increments Ball position in x and y direction, with the size of the increment 
    * determined by user when they input the x and y speed and so moves this Ball.
    * 
    **/
    public void move()
    {
		xPosition += xSpeed;
		yPosition += ySpeed;
    }

	public void bounce(double maxX, double maxY)
	{
        move();
		if (xPosition > maxX || xPosition < 0)
        {
			xSpeed = -xSpeed;
		    xPosition += xSpeed;
            xSpeed = xSpeed * FRICTION;
        }

		if (yPosition > maxY || yPosition < 0)
        {
			ySpeed = -ySpeed;
		    yPosition += ySpeed;
            ySpeed = ySpeed * FRICTION;
        }
	}

	public void gravity(double maxX, double maxY)
	{
        ySpeed = ySpeed + GRAVITY;
        bounce(maxX, maxY);
    }





}
