package com.frc4343.robot.subsystems;

import com.frc4343.robot.Mappings;
import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Rangefinder extends Subsystem {
    AnalogChannel sonic;

    public Rangefinder() {
        super("Rangefinder");

        System.out.println("Initializing rangefinder.");

        sonic = new AnalogChannel(Mappings.RANGE_FINDER_PORT);
    }

    public void initDefaultCommand() {
    }

    public double getInches() {
        double volt = sonic.getVoltage();
        double inches = volt * 100;
        return inches;
    }
}