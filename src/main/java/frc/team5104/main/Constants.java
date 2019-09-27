/*BreakerBots Robotics Team 2019*/
package frc.team5104.main;

import com.ctre.phoenix.motorcontrol.NeutralMode;

import frc.team5104.statemachines.IWE.IWEControl;
import frc.team5104.util.Units;

public class Constants {
	//Console
	public static final boolean OVERWRITE_NON_MATCH_LOGS = true;
	public static final boolean OVERWRITE_MATCH_LOGS = false;
	
	//Loops
	public static final int MAIN_LOOP_SPEED = 50;
	public static final int ODOMETRY_LOOP_SPEED = 100;
	
	//Robot Meta
	public static final double ROBOT_LENGTH = Units.inchesToFeet(32.0 + 4.0);
	public static final double ROBOT_WIDTH = Units.inchesToFeet(28.0 + 4.0);
	public static final String ROBOT_NAME = "High-Tide";
	
	//Drive (teleop tuning variables in DriveHelper)
	public static final double DRIVE_WHEEL_DIAMETER = 6.0/12.0; //ft
	public static final double DRIVE_TICKS_PER_REVOLUTION = 4096.0 * 3.0 * (54.0/30.0);
	public static final double DRIVE_WHEEL_BASE_WIDTH = 24.25 / 12.0; //ft
	public static final int DRIVE_CURRENT_LIMIT = 40; //amps
	public static final double DRIVE_KP = 0.285;
	public static final double DRIVE_KI = 0;
	public static final double DRIVE_KD = 12.0;
	public static final double DRIVE_KF = 0;
	
	//IWE General
	public static final short IWE_EJECT_TIME = 1000;
	public static final IWEControl IWE_DEFAULT_CONTROL = IWEControl.MANUAL;
	
	//Wrist
	public static final double WRIST_CALIBRATE_SPEED = 0.1;
	public static final int WRIST_CURRENT_LIMIT = 20;
	public static final NeutralMode WRIST_NEUTRAL_MODE = NeutralMode.Brake;
	public static final double WRIST_MOTION_KP = 0;
	public static final double WRIST_MOTION_KI = 0;
	public static final double WRIST_MOTION_KD = 0;
	public static final double WRIST_MOTION_KF = 0;
	public static final int WRIST_MOTION_ACCEL = 0;
	public static final int WRIST_MOTION_CRUISE_VELOCITY = 0;
	
	//Intake
	public static final double INTAKE_INTAKE_SPEED_HATCH = 0.8;
	public static final double INTAKE_EJECT_SPEED_HATCH = 1;
	public static final double INTAKE_HOLD_SPEED_HATCH = 0.1;
	public static final double INTAKE_INTAKE_SPEED_CARGO = 0.8;
	public static final double INTAKE_EJECT_SPEED_CARGO = 1;
	public static final double INTAKE_HOLD_SPEED_CARGO = 0.1;
	public static final int INTAKE_CURRENT_LIMIT = 10;
	public static final NeutralMode INTAKE_NEUTRAL_MODE = NeutralMode.Coast;
	
	//Elevator
	public static final double ELEVATOR_SPOOL_CIRC = 1.25 * Math.PI;
	public static final double ELEVATOR_CALIBRATE_SPEED = 0.1;
	public static final int ELEVATOR_CURRENT_LIMIT = 20;
	public static final NeutralMode ELEVATOR_NEUTRAL_MODE = NeutralMode.Coast;
	public static final double ELEVATOR_MOTION_KP = 0;
	public static final double ELEVATOR_MOTION_KI = 0;
	public static final double ELEVATOR_MOTION_KD = 0;
	public static final double ELEVATOR_MOTION_KF = 0;
	public static final int ELEVATOR_MOTION_ACCEL = 0;
	public static final int ELEVATOR_MOTION_CRUISE_VELOCITY = 0;
	
	//Autonomous
	public static final double AUTO_MAX_VELOCITY = 10; //ft/s
	public static final double AUTO_MAX_ACCEL = 10;
	public static final double AUTO_MAX_JERK = 20;
	public static final double AUTO_CORRECTION_FACTOR = 0.2; //>0
	public static final double AUTO_DAMPENING_FACTOR  = 0.5; //0-1
}