

package frc.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;

public class Robot extends IterativeRobot {

  Joystick Sticky1 =new Joystick (0); 
  Joystick Sticky2 =new Joystick (1);
  Talon Wheelie1 = new Talon (0);
  Talon Wheelie2 = new Talon (1);

  @Override
  public void robotInit() {
   

  }

  
  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {
    {
      
       
        
    }
  }

 
  @Override
  public void teleopPeriodic() {
    Wheelie1.set (Sticky1.getY());
    Wheelie2.set (Sticky2.getY());
  }

  
  @Override
  public void testPeriodic() {
  }
}

