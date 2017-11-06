package org.pepito.Observer;

public class Client {
  public static void main(String[] args) {
    DataStore observable = new DataStore();
    DataStoreObserver observer1 = new DataStoreObserver("Observer 1");
    DataStoreObserver observer2 = new DataStoreObserver("Observer 2");
    DataStoreObserver observer3 = new DataStoreObserver("Observer 3");
    
    observable.addObserver(observer1);
    observable.addObserver(observer2);
    
    observable.setData("Hello");
    
    observable.addObserver(observer3);
    observable.setData("Good Bye");
  }
}
