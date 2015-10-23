package InheritanceExample;
/**
 * <h1> This is an example program to show inheritance!</h1>
 * <p> It has one constructor
 * <p> <b> It has four methods</b>
 * @author palak
 * @version 1.0
 * @since 2015-10-15
 */

public class Bicycle {
    
  /**
   *  the Bicycle class has three fields
   */
  public int cadence;
  public int gear;
  public int speed;
      
  /**
   *  the Bicycle class has one constructor
   * @param startCadence
   * @param startSpeed
   * @param startGear
   */
  public Bicycle()
  {
	  gear=1;
	  cadence=1;
	  speed=50;
  }
  
  public Bicycle(int startCadence, int startSpeed, int startGear) {
      gear = startGear;
      cadence = startCadence;
      speed = startSpeed;
  }
      
  /**
   *  the Bicycle class has four methods
   * @param newValue
   */
  public void setCadence(int newValue) {
      cadence = newValue;
  }
      
  public void setGear(int newValue) {
      gear = newValue;
  }
      
  public void applyBrake(int decrement) {
      speed -= decrement;
  }
      
  public void speedUp(int increment) {
      speed += increment;
  }
    
}
