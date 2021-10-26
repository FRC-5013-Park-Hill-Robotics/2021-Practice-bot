package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.DriverControllerConstants;
import frc.robot.subsystems.Drivetrain;

public class DriveCommand extends CommandBase{
    private Drivetrain m_drivetrain;
    private XboxController m_driveController;
    public DriveCommand(Drivetrain drivetrain, XboxController driveController) {
        this.m_drivetrain = drivetrain;
        this.m_driveController = driveController;
        addRequirements(drivetrain);
      }

      @Override
      public void initialize() {
      }
    
      // Called every time the scheduler runs while the command is scheduled.
      @Override
      public void execute() {
        m_drivetrain.arcadeDrive(
          -m_driveController.getRawAxis(DriverControllerConstants.Y_LJOY_ID),
          m_driveController.getRawAxis(DriverControllerConstants.X_RJOY_ID)); 
      }
}
