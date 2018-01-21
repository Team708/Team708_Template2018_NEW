package org.usfirst.frc.team708.robot.commands.visionProcessor;

import org.usfirst.frc.team708.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DisableLED extends Command {
	
    public DisableLED() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.visionProcessor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.visionProcessor.setNTInfo("ledMode", 1.0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}