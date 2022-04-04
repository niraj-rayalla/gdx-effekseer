/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public class Vector3D {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Vector3D(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Vector3D obj) {
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
        GDXJNI.delete_Vector3D(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(float value) {
    GDXJNI.Vector3D_x_set(swigCPtr, this, value);
  }

  public float getX() {
    return GDXJNI.Vector3D_x_get(swigCPtr, this);
  }

  public void setY(float value) {
    GDXJNI.Vector3D_y_set(swigCPtr, this, value);
  }

  public float getY() {
    return GDXJNI.Vector3D_y_get(swigCPtr, this);
  }

  public void setZ(float value) {
    GDXJNI.Vector3D_z_set(swigCPtr, this, value);
  }

  public float getZ() {
    return GDXJNI.Vector3D_z_get(swigCPtr, this);
  }

  public Vector3D() {
    this(GDXJNI.new_Vector3D__SWIG_0(), true);
  }

  public Vector3D(float x, float y, float z) {
    this(GDXJNI.new_Vector3D__SWIG_1(x, y, z), true);
  }

}