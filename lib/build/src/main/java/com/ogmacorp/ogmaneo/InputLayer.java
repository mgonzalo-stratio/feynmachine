/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ogmacorp.ogmaneo;

public class InputLayer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected InputLayer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InputLayer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jogmaneoJNI.delete_InputLayer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public InputLayer() {
    this(jogmaneoJNI.new_InputLayer(), true);
  }

}