package org.pepito.prCompresor;

import org.pepito.prCompresor.Compressor;

public class Rar implements Compressor {
  public Data compress(Data data) {
    return new Data("Rar - " + data.getData());
  }
}
