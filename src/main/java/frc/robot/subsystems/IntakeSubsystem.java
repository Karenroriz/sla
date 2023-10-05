
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.utils.Driver;

public class IntakeSubsystem extends SubsystemBase {
 
VictorSPX red1 = new VictorSPX(Constants.red1);
VictorSPX red2 = new VictorSPX(Constants.red2);

public IntakeSubsystem() {}

@Override
public void periodic() {}

@Override
public void simulationPeriodic() {}

  
public void initMotor() {
  
  red2.setNeutralMode(NeutralMode.Brake);
  red2.setNeutralMode(NeutralMode.Brake);

  red2.follow(red1);
    
}

public void in(double lt, double rt){

  if(rt != 0)
  red1.set(ControlMode.PercentOutput, Constants.k1);
  
  else if (lt != 0)
  red2.set(ControlMode.PercentOutput, - Constants.k1);

  else
  red1.set(ControlMode.PercentOutput, 0);

  }

}

