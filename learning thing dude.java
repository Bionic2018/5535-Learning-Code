/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5535.robot;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Compressor;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
@SuppressWarnings("unused")
public class Robot extends IterativeRobot {
Joystick xbox;
Talon Left, Right;
RobotDrive tank;
JoystickButton xbox1a, xboxselect1, xboxstart1, xboxx, xboxb, xboxy;
Solenoid solenoid;
Compressor c;
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void robotInit() {
		
		xbox = new Joystick(0);
		tank = new RobotDrive(7,8);
		tank.setExpiration(0.005);
		xbox1a = new JoystickButton(xbox, 1);
		xboxselect1 = new JoystickButton(xbox, 7);
		xboxstart1 = new JoystickButton(xbox, 8);
		xboxb = new JoystickButton(xbox, 2);
		solenoid = new Solenoid(1);
		c = new Compressor(0);
		
		c.setClosedLoopControl(false);
		
	}

	/**
	 * This function is run once each time the robot enters autonomous mode.
	 */
	@Override
	public void autonomousInit() {

	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {

	}
	/**
	 * This function is called once each time the robot enters teleoperated mode.
	 */
	@Override
	public void teleopInit() {
	}

	/**
	 * This function is called periodically during teleoperated mode.
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void teleopPeriodic() {
		tank.tankDrive(xbox.getRawAxis(1),xbox.getRawAxis(5));
		
		
		if(xbox1a.get()){
			solenoid.set(true);
	}
		else if (xboxb.get()){		
	}
		else if (xboxselect1.get()){
			c.setClosedLoopControl(false);

	}
		else if (xboxstart1.get()){
			c.setClosedLoopControl(true);

	}
		else{
			solenoid.set(false);
		}
		
		Timer.delay(0.005);
	}
		
		
		
	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
