package org.firstinspires.ftc.teamcode.Base.Controls.Auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.Base.Robot.LabBot;

@Disabled
@Autonomous (name = "LabBot:Auto")

public class LabBotAuto extends LinearOpMode {

    LabBot Bot = new LabBot();

    @Override

    public void runOpMode() throws InterruptedException {


        Bot.initRobot(hardwareMap);

        telemetry.addLine("Awaiting Start");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()){

            //square
            telemetry.addLine("Driving Forward");
            telemetry.update();
            Bot.driveForward(1);
            sleep(2000);

            telemetry.addLine("Turning Right");
            telemetry.update();
            Bot.rotateRight(0.5);
            sleep(1000);

            telemetry.addLine("Driving Forward");
            telemetry.update();
            Bot.driveForward(1);
            sleep(2000);

            telemetry.addLine("Turning Right");
            telemetry.update();
            Bot.rotateRight(0.5);
            sleep(1000);

            telemetry.addLine("Driving Forward");
            telemetry.update();
            Bot.driveForward(1);
            sleep(2000);

            telemetry.addLine("Turning Right");
            telemetry.update();
            Bot.rotateRight(0.5);
            sleep(1000);
            Bot.driveForward(1);

            requestOpModeStop();

        }

        idle();

        }

}
