/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public class ModelRefWrapper {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ModelRefWrapper(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ModelRefWrapper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        GDXJNI.delete_ModelRefWrapper(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHasRef(boolean value) {
    GDXJNI.ModelRefWrapper_hasRef_set(swigCPtr, this, value);
  }

  public boolean getHasRef() {
    return GDXJNI.ModelRefWrapper_hasRef_get(swigCPtr, this);
  }

}
