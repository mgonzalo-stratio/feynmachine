/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ogmacorp.ogmaneo;

public class Hierarchy {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected Hierarchy(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Hierarchy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jogmaneoJNI.delete_Hierarchy(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void activate(vectorvf inputsFeed) {
    jogmaneoJNI.Hierarchy_activate(swigCPtr, this, vectorvf.getCPtr(inputsFeed), inputsFeed);
  }

  public void learn(vectorvf inputsPredict, float tdError) {
    jogmaneoJNI.Hierarchy_learn__SWIG_0(swigCPtr, this, vectorvf.getCPtr(inputsPredict), inputsPredict, tdError);
  }

  public void learn(vectorvf inputsPredict) {
    jogmaneoJNI.Hierarchy_learn__SWIG_1(swigCPtr, this, vectorvf.getCPtr(inputsPredict), inputsPredict);
  }

  public SWIGTYPE_p_std__vectorT_cl__Image2D_t getInputImagesFeed() {
    return new SWIGTYPE_p_std__vectorT_cl__Image2D_t(jogmaneoJNI.Hierarchy_getInputImagesFeed(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__vectorT_cl__Image2D_t getInputImagesPredict() {
    return new SWIGTYPE_p_std__vectorT_cl__Image2D_t(jogmaneoJNI.Hierarchy_getInputImagesPredict(swigCPtr, this), false);
  }

  public vectorvf getPredictions() {
    return new vectorvf(jogmaneoJNI.Hierarchy_getPredictions(swigCPtr, this), false);
  }

  public SWIGTYPE_p_ogmaneo__Predictor getPredictor() {
    return new SWIGTYPE_p_ogmaneo__Predictor(jogmaneoJNI.Hierarchy_getPredictor(swigCPtr, this), false);
  }

  public void readChunkStates(int li, ValueField2D valueField) {
    jogmaneoJNI.Hierarchy_readChunkStates(swigCPtr, this, li, ValueField2D.getCPtr(valueField), valueField);
  }

  public void load(ComputeSystem cs, String fileName) {
    jogmaneoJNI.Hierarchy_load(swigCPtr, this, ComputeSystem.getCPtr(cs), cs, fileName);
  }

  public void save(ComputeSystem cs, String fileName) {
    jogmaneoJNI.Hierarchy_save(swigCPtr, this, ComputeSystem.getCPtr(cs), cs, fileName);
  }

  public Hierarchy() {
    this(jogmaneoJNI.new_Hierarchy(), true);
  }

}