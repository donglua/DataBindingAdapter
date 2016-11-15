package com.github.markzhai.recyclerview;

import android.support.v7.util.DiffUtil;
import java.util.List;

/**
 * Created by donglua on 16-11-15.
 */

public abstract class DiffCallBack<T1, T2> extends DiffUtil.Callback {
  private List<T1> oldData;
  private List<T2> newData;

  public DiffCallBack(List<T1> oldData, List<T2> newData) {
    this.oldData = oldData;
    this.newData = newData;
  }

  @Override public int getOldListSize() {
    return oldData != null ? oldData.size() : 0;
  }

  @Override public int getNewListSize() {
    return newData != null ? newData.size() : 0;
  }

  @Override public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
    return areItemsTheSame(oldData.get(oldItemPosition), newData.get(newItemPosition));
  }

  @Override public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
    return areContentsTheSame(oldData.get(oldItemPosition), newData.get(newItemPosition));
  }

  public abstract boolean areItemsTheSame(T1 t1, T2 t2);
  public abstract boolean areContentsTheSame(T1 t1, T2 t2);

}
