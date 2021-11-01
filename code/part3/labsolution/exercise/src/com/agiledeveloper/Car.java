package com.agiledeveloper;

public class Car {
  private final int year; //please keep this final
  private final Engine engine; //please keep this final

  public Car(int theYear, Engine theEngine) {
    year = theYear;
    engine = theEngine;
  }

  public Car clone() {
    return new Car(this);
  }

  protected Car(Car other) {
    year = other.year;
    engine = other.engine.clone();
  }

//  public Car(Car other) { // This violates OCP, tightcoupling and not extensible
//    year = other.year;
//
//    if(other.engine instanceof TurboEngine) {
//      engine = new TurboEngine((TurboEngine)(other.getEngine()));
//    } else {
//      engine = new PistonEngine((PistonEngine) (other.getEngine()));
//    }
//  }
  //To solve this problem we may be tempted to use clone.
  //But, Effective Java book says don't use clone but use copy constructor because
  //clone does not handle final fields properly. But, two problems.
  //1. Copy constructor does not work as we see above.
  //2. The problem stated in Effective Java is a Java problem not a clone problem.
  //
  //We can use a double dispatching solution to address the issues here.
  //Write a public clone that turns around and calls a protected copy constructor.

  //public static Car copyCar(Car car) {
  //  return new Car(car);
  //}

  public static Car copyCar(Car car) {
    return car.clone();
  }

  public int getYear() { return year; }
  public Engine getEngine() { return engine; }
}