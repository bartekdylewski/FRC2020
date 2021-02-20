// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.IntakeClose;
import frc.robot.commands.IntakeOpen;

/** Add your docs here. */
public class OI {

    Constants constants;

    public Joystick driverJoy;
    public JoystickButton intakeOpenButton;
    public JoystickButton intakeCloseButton;

    public OI() {
        constants = new Constants();
        driverJoy = new Joystick(0);
        intakeOpenButton = new JoystickButton(driverJoy, 0); // Guzik A
        intakeOpenButton = new JoystickButton(driverJoy, 1); // Guzik B

        intakeOpenButton.whenPressed(new IntakeOpen());
        intakeCloseButton.whenPressed(new IntakeClose());
    }

    public Joystick getDriverJoy() {
        return driverJoy;
    }
}