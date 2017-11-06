package org.pepito.depenciainversionprinciple;

public class Client {

  public static void main(String[] args) {
    Worker worker1 = new Worker();
    SuperWorker superWorker = new SuperWorker();

    Manager manager = new Manager();
    manager.setWorker(superWorker);
    manager.manage();
    manager.setWorker(worker1);
    manager.manage();
    
    Worker worker2 = new Worker();
    manager.setWorker(worker2);
    manager.manage();
    
    MiniWorker worker3 = new MiniWorker();
    manager.setWorker(worker3);
    manager.manage();
  }
}
