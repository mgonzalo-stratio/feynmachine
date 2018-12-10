/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ogmacorp.ogmaneo;

public class vectorvf {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected vectorvf(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(vectorvf obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jogmaneoJNI.delete_vectorvf(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public vectorvf() {
    this(jogmaneoJNI.new_vectorvf__SWIG_0(), true);
  }

  public vectorvf(long n) {
    this(jogmaneoJNI.new_vectorvf__SWIG_1(n), true);
  }

  public long size() {
    return jogmaneoJNI.vectorvf_size(swigCPtr, this);
  }

  public long capacity() {
    return jogmaneoJNI.vectorvf_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    jogmaneoJNI.vectorvf_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return jogmaneoJNI.vectorvf_isEmpty(swigCPtr, this);
  }

  public void clear() {
    jogmaneoJNI.vectorvf_clear(swigCPtr, this);
  }

  public void add(ValueField2D x) {
    jogmaneoJNI.vectorvf_add(swigCPtr, this, ValueField2D.getCPtr(x), x);
  }

  public ValueField2D get(int i) {
    return new ValueField2D(jogmaneoJNI.vectorvf_get(swigCPtr, this, i), false);
  }

  public void set(int i, ValueField2D val) {
    jogmaneoJNI.vectorvf_set(swigCPtr, this, i, ValueField2D.getCPtr(val), val);
  }

}