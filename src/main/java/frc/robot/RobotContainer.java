package frc.robot;

import frc.robot.commands.DefaultIntake;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {

  public Joystick driverController = new Joystick(Constants.controle1);
  public Joystick systemsController = new Joystick(Constants.controle2);
  private static IntakeSubsystem inSubsystem = new IntakeSubsystem();
  
  public RobotContainer() {
    configureBindings();
    
    inSubsystem.setDefaultCommand(new DefaultIntake(inSubsystem, systemsController));
  }

  
  private void configureBindings() {
    
    new JoystickButton(systemsController, Constants.RT)
    .onTrue(Commands.runOnce(() -> inSubsystem.motorOn(Constants.k1)))
    .onFalse(Commands.runOnce(() -> inSubsystem.motorOff()));

    
    m_driverController.b().whileTrue(m_exampleSubsystem.exampleMethodCommand());
  }

  
  public Command getAutonomousCommand() {
   
    //return Autos.exampleAuto(m_exampleSubsystem);
  }
}
