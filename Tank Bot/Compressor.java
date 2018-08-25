package org.usfirst.frc.team5535.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Compressor;



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
  JoystickButton xbox1a, xboxselect1, xboxstart1, xboxx, xboxb, xboxy; //declares buttons
  Solenoid solenoid; //declares solenoids
  Compressor c = new Compressor(0); //declares compressor




	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
  
		xbox = new Joystick(0); //sets joystick value
		tank = new RobotDrive(7, 8); //sets talons for drivetrain
		tank.setExpiration(0.005); //eliminates an error
    xbox1a = new JoystickButton(xbox, 1); //xbox a button
		xboxselect1 = new JoystickButton(xbox, 7); //xbox select
		xboxstart1 = new JoystickButton(xbox, 8); //xbox start
		xboxb = new JoystickButton(xbox, 2); //xbox b button
    solenoid = new Solenoid(1); //sets solenoid value

		c.setClosedLoopControl(false); //disables compressor upon robot start






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
    
    if(xbox1a.get()){
			exampleSolenoid.set(true); //fires solenoid
		}
		else if(xboxb.get()){
		}
		else if (xboxselect1.get()){
    			c.setClosedLoopControl(false); //disables compressor

		}
		else if (xboxstart1.get()){
    			c.setClosedLoopControl(true); //enables compressor

		}
		else{
			exampleSolenoid.set(false); //disables the solenoid if not fired

		}
		Timer.delay(0.005); //adds a .5 delay to prevent errors

	}


	}


	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic() {

	}

}
