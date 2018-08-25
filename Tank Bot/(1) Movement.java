package org.usfirst.frc.team5535.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.IterativeRobot;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	Joystick xbox; //declares joystick
	Talon left, right; //declares talons
	RobotDrive tank; //declares drivetrain name

}



	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
  
		xbox = new Joystick(0); //sets joystick value
		tank = new RobotDrive(7, 8); //sets talons for drivetrain
		tank.setExpiration(0.005); //eliminates an error







	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString line to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the switch structure below with additional strings.
	 * If using the SendableChooser make sure to add them to the chooser code above as well.
	 */

	public void autonomousInit() {
		



	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {
		

	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() {

		tank.tankDrive(xbox.getRawAxis(1), xbox.getRawAxis(5));  //joystick movement
    
   


	}


	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic() {

	}

}
