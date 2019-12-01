package com.himanshu.innerClass;

import java.util.ArrayList;

public class GearBox {
  private ArrayList<Gear> gears;
  private int maxGears;
  private int currentGear = 0;
  private boolean clutchIsIn;
  
  public GearBox(int maxGears) {
    this.maxGears = maxGears;
    this.gears = new ArrayList<>();
    Gear neutral = new Gear(0,0.0);
    this.gears.add(neutral);    
    
    for(int i=1;i<maxGears;i++) {
      this.addGear(i, i*5.3);
    }
  }
  
  public void operateClutch(boolean in) {
    this.clutchIsIn = in;
  }
  
  public void changeGear(int newGear) {  
    if((newGear>0) && (newGear < this.gears.size()) && this.clutchIsIn) { 
      this.currentGear = newGear;
      System.out.println("Gear " +newGear+ " selected.");
    }else {
      System.out.println("Grind!");
      this.currentGear = 0;
    }
  }
  
  public void addGear(int number, double ratio) {
    if((number > 0) && (number <= maxGears)) {
      this.gears.add(new Gear(number, ratio));
    }
  }
  
  public double wheelSpeed(int revs) {
    if(clutchIsIn) {
      System.out.println("Scream!");
      return 0.0;
    }
    return revs * gears.get(currentGear).getRatio();
  }
  
  private class Gear{
    private int GearNumber;
    private double ratio;
    
    public Gear(int GearNumber, double ratio) {
      this.GearNumber = GearNumber;
      this.ratio = ratio;
    }
    
    protected double getRatio() {
      return ratio;
    }

    public double driveSpeed(int revs) {
      return revs*(this.ratio);
    }
  }
}
