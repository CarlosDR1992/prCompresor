package org.pepito.builder;

public class Algoritmo {
  private String name;
  private int maximunNumberOfEvaluations;
  private int maximunComputingTime;
  private int memoryRequirement;
  private String operator;
  
  public Algoritmo(String name, int maximunNumberOfEvaluations, int maximunComputingTime,
      int memoryRequirement, String operator) {
    this.name = name;
    this.maximunNumberOfEvaluations = maximunNumberOfEvaluations;
    this.maximunComputingTime = maximunComputingTime;
    this.memoryRequirement = memoryRequirement;
    this.operator = operator;
  }
}