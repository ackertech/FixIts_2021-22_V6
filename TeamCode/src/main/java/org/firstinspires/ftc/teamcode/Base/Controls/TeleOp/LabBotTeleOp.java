package org.firstinspires.ftc.teamcode.Base.Controls.TeleOp;


import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Base.Robot.FixItBot;
import org.firstinspires.ftc.teamcode.Base.Robot.LabBot;

@Disabled
@TeleOp(name = "TeleOp:LabBot", group = "FixIt")

public class LabBotTeleOp extends OpMode {

    //TeleOp Variables
    public double speedMultiply = 1;                        // Controls Speed

    // Construct the Physical Bot based on the Robot Class.  Name your Robot.
    public LabBot Bot = new LabBot();


    // TeleOp Initialize Method.  This is the Init Button on the Driver Station Phone
    @Override
    public void init()    {

        Bot.initRobot(hardwareMap);
    }

    // TeleOp Loop Method.  This start AFTER clicking the Play Button on the Driver Station Phone

    public void loop () {

        drive();
        speedControl();

    }


    // The control methods for driving the  Robot during TeleOp

    public void drive(){

        if (gamepad1.left_stick_y > .1) {

            Bot.driveForward( speedMultiply * gamepad1.left_stick_y);
        }
        else if (gamepad1.left_stick_y < -.1) {

            Bot.driveBackward(speedMultiply * gamepad1.left_stick_y);
        }
        else if (gamepad1.left_stick_x > .1) {

            Bot.rotateRight(speedMultiply * gamepad1.left_stick_x);
        }
        else if (gamepad1.left_stick_x < -.1) {

            Bot.rotateLeft(speedMultiply * gamepad1.left_stick_x);
        }
        else {

            Bot.stopMotors();
        }
    }


    // Control methods for changing speed
    public void speedControl() {

        if (gamepad1.dpad_down) {
            speedMultiply = 0.5;
        }
        else if (gamepad1.dpad_up) {
            speedMultiply = 1;
        }
    }








}
