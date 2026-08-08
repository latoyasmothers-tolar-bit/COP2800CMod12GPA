// DataWrapper.java
// Latoya Smothers-Tolar
// 08/08/2026
// Generic data wrapper utility class

package edu.fscj.cop2800c.util;

import java.util.List;

public class DataWrapper<T> {
  private T value;
  // constuctor
  public DataWrapper() {
    value = null;
  }
  // constructor that accept value
  public DataWrapper(T value) {
    this.value = value;
  }
  // Return wrapped value
  public T getValue() {
    return value;
  }
  // Display
  public static <T> void displayList(List<DataWrapper<T>> list) {
    for (DataWrapper<T> element : list) {
      System.out.println(element.getValue());
    }
  }
} 
