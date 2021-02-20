// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

/** Add your docs here. */
public class OI {

    Constants constants;

    public Joystick driverJoy;
    public JoystickButton intakeOpenButton;
    public JoystickButton intakeCloseButton;

    public OI() {
        constants = new Constants();
        driverJoy = new Joystick(0);
        intakeOpenButton = new JoystickButton(driverJoy, 0); // zmienić port!
        intakeOpenButton = new JoystickButton(driverJoy, 0); // zmienić port!

        intakeOpenButton.whenPressed();
        intakeCloseButton.whenPressed();
    }

    private Command IntakeOpen() {
        return null;
    }

    public Joystick getDriverJoy() {
        return driverJoy;
    }
}