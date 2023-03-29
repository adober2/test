package detyra;

public class auto {
	
	   private double velocity;
	   private double acceleration;
	   private double time;

	  public auto(double velocity, double acceleration) {
	    this.velocity = velocity;
	    this.acceleration = acceleration;
	    this.time = 0;
	  }

	  public double getPosition() {
	    return velocity * time + (1/2) * acceleration * time * time;
	  }

	  public void updateTime() {
	    time++;
	  }
	}
	
