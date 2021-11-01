package com.agiledeveloper;

abstract public class Engine {
  public Engine() {}
  protected Engine(Engine other) {}

  public abstract Engine clone();
}
