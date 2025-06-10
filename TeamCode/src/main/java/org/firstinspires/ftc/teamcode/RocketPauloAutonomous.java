package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import  com.qualcomm.robotcore.util.ElapsedTime;

import java.net.PortUnreachableException;

@Autonomous(name="RocketPauloAutonomous", group="Robot")
@Disabled

public class RocketPauloAutonomous extends LinearOpMode {

    private DcMotor FL0 = null;
    private DcMotor FR1 = null;
    private DcMotor BL2 = null;
    private DcMotor BR3 = null;

    private ElapsedTime    runtime = new ElapsedTime();

    static final double COUNTS_PER_MOTOR_REV  = 1440;
    static final  double   DRIVE_GEAR_REDUCTION = 20.0;
    static final double   WHEEL_DIAMETER_INCHES = 4.0
    static final double   COUNTS_PER_INCH = (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION) /
                                            (WHEEL_DIAMETER_INCHES * 3.1415);
    static final double DRIVE_SPEED = 0.6;

    static final double     TURN_SPEED = 0.5;

    @Override
    public void runOpMode () {

}
