/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public class VectorMaterialTextureParameter extends java.util.AbstractList<MaterialTextureParameter> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VectorMaterialTextureParameter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VectorMaterialTextureParameter obj) {
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
        GDXJNI.delete_VectorMaterialTextureParameter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public VectorMaterialTextureParameter(MaterialTextureParameter[] initialElements) {
    this();
    reserve(initialElements.length);

    for (MaterialTextureParameter element : initialElements) {
      add(element);
    }
  }

  public VectorMaterialTextureParameter(Iterable<MaterialTextureParameter> initialElements) {
    this();
    for (MaterialTextureParameter element : initialElements) {
      add(element);
    }
  }

  public MaterialTextureParameter get(int index) {
    return doGet(index);
  }

  public MaterialTextureParameter set(int index, MaterialTextureParameter e) {
    return doSet(index, e);
  }

  public boolean add(MaterialTextureParameter e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, MaterialTextureParameter e) {
    modCount++;
    doAdd(index, e);
  }

  public MaterialTextureParameter remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public VectorMaterialTextureParameter() {
    this(GDXJNI.new_VectorMaterialTextureParameter__SWIG_0(), true);
  }

  public VectorMaterialTextureParameter(VectorMaterialTextureParameter other) {
    this(GDXJNI.new_VectorMaterialTextureParameter__SWIG_1(VectorMaterialTextureParameter.getCPtr(other), other), true);
  }

  public void reserve(long n) {
    GDXJNI.VectorMaterialTextureParameter_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return GDXJNI.VectorMaterialTextureParameter_isEmpty(swigCPtr, this);
  }

  public VectorMaterialTextureParameter(int count, MaterialTextureParameter value) {
    this(GDXJNI.new_VectorMaterialTextureParameter__SWIG_2(count, MaterialTextureParameter.getCPtr(value), value), true);
  }

  private int doSize() {
    return GDXJNI.VectorMaterialTextureParameter_doSize(swigCPtr, this);
  }

  private void doAdd(MaterialTextureParameter x) {
    GDXJNI.VectorMaterialTextureParameter_doAdd__SWIG_0(swigCPtr, this, MaterialTextureParameter.getCPtr(x), x);
  }

  private void doAdd(int index, MaterialTextureParameter x) {
    GDXJNI.VectorMaterialTextureParameter_doAdd__SWIG_1(swigCPtr, this, index, MaterialTextureParameter.getCPtr(x), x);
  }

  private MaterialTextureParameter doRemove(int index) {
    return new MaterialTextureParameter(GDXJNI.VectorMaterialTextureParameter_doRemove(swigCPtr, this, index), true);
  }

  private MaterialTextureParameter doGet(int index) {
    return new MaterialTextureParameter(GDXJNI.VectorMaterialTextureParameter_doGet(swigCPtr, this, index), false);
  }

  private MaterialTextureParameter doSet(int index, MaterialTextureParameter val) {
    return new MaterialTextureParameter(GDXJNI.VectorMaterialTextureParameter_doSet(swigCPtr, this, index, MaterialTextureParameter.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    GDXJNI.VectorMaterialTextureParameter_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}