package org.pepito.prCompresor;

import org.pepito.prCompresor.Compressor;

public class Zip implements Compressor {
  public Data compress(Data data) {
    return new Data("Zip - " + data.getData());
  }
}
