package com.nomythic.frclib;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.*;

public class MyTestClass extends SubsystemBase {

  private XboxController myController;

  public MyTestClass() {
    this.myController = new XboxController(0);
  }

  public boolean isThisWorking() {
    return this.myController.getAButton();
  }

  public void getStuff() {
  
  }
  public void sayHello() {
    System.out.println("Hello");
  }


}
