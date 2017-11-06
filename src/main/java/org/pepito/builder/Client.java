package org.pepito.builder;

public class Client {
  private Algoritmo algoritmo1;
  private Algoritmo algoritmo2;

  public Client() {
    algoritmo1 = new Algoritmo("QuickShort", 10, 10, 20, "Sum");

    algoritmo2 = new AlgoritmoBuilder()
        .setName("MergeShort")
        .setMaximunNumberOfEvaluations(10)
        .setMemoryRequirement(10)
        .setOperator("Sum")
        .build();
  }
}
