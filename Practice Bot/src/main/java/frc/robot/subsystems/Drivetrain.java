package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase{
    private Spark frontLeftMotor = new Spark(Constants.DrivetrainConstants.FRONT_LEFT_MOTOR_ID);
    private Spark frontRightMotor = new Spark(Constants.DrivetrainConstants.FRONT_RIGHT_MOTOR_ID);
    private Spark backLeftMotor = new Spark(Constants.DrivetrainConstants.BACK_LEFT_MOTOR_ID);
    private Spark backRightMotor = new Spark(Constants.DrivetrainConstants.BACK_RIGHT_MOTOR_ID);
    private SpeedControllerGroup leftGroup = new SpeedControllerGroup(new SpeedController[] {frontLeftMotor,backLeftMotor});
    private SpeedControllerGroup rightGroup = new SpeedControllerGroup(new SpeedController[] {frontRightMotor,backRightMotor});

    private final DifferentialDrive m_drive = new DifferentialDrive(leftGroup, rightGroup);

    public Drivetrain(){
        super();
       
    }

    public void arcadeDrive(double speed, double rotation){
         m_drive.arcadeDrive(speed, rotation);
    }
}
