package org.pepito.builder;

public class AlgoritmoBuilder {
  private String name;
  private int maximunNumberOfEvaluations;
  private int maximunComputingTime;
  private int memoryRequirement;
  private String operator;


  public AlgoritmoBuilder() {

  }

  public AlgoritmoBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public AlgoritmoBuilder setMaximunNumberOfEvaluations(int maximunNumberOfEvaluations) {
    this.maximunNumberOfEvaluations = maximunNumberOfEvaluations;
    return this;
  }

  public AlgoritmoBuilder setMaximunComputingTime(int maximunComputingTime) {
    this.maximunComputingTime = maximunComputingTime;
    return this;
  }

  public AlgoritmoBuilder setMemoryRequirement(int memoryRequirement) {
    this.memoryRequirement = memoryRequirement;
    return this;
  }

  public AlgoritmoBuilder setOperator(String operator) {
    this.operator = operator;
    return this;
  }

  public Algoritmo build() {
    return new Algoritmo(name, maximunNumberOfEvaluations, maximunComputingTime, memoryRequirement,
        operator);
  }
}

