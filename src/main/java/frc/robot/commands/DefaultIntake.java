package frc.robot.commands;

import edu.wpi.first.math.controller.LTVDifferentialDriveController;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.IntakeSubsystem;

public class DefaultIntake extends CommandBase {
  
  private final IntakeSubsystem intake;

  private double lt, rt;
  private Joystick systemController;

  public DefaultIntake (IntakeSubsystem subsystem, Joystick controller) {
    
    intake = subsystem;
    this.systemController = controller;
    rt = systemController.getRawAxis(Constants.RT);
    lt = systemController.getRawAxis(Constants.LT);
    addRequirements(intake);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {

    rt = systemController.getRawAxis(Constants.RT);
    lt = systemController.getRawAxis(Constants.LT);
  }

  @Override
  public void end(boolean interrupted) {}

  
  @Override
  public boolean isFinished() {
    return false;
  }
}
