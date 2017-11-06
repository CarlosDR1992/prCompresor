package org.pepito.depenciainversionprinciple;

public class Manager {
  private IWorker worker;
  
  public void setWorker(IWorker worker) {
    this.worker = worker;
  }
  
  public void manage() {
    worker.work();
  }
}
