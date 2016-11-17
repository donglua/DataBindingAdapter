package com.github.markzhai.recyclerview;

import android.support.v7.util.DiffUtil;
import java.util.List;

/**
 * Created by donglua on 16-11-15.
 */

public class DiffCallback<T> extends DiffUtil.Callback {
  private List<T> oldData;
  private List<T> newData;
  private DiffInterface<T> diffInterface;

  public DiffCallback(List<T> oldData, List<T> newData, DiffInterface diffInterface) {
    this.oldData = oldData;
    this.newData = newData;
    this.diffInterface = diffInterface;
  }

  @Override public int getOldListSize() {
    return oldData != null ? oldData.size() : 0;
  }

  @Override public int getNewListSize() {
    return newData != null ? newData.size() : 0;
  }

  @Override public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
    return diffInterface.areItemsTheSame(oldData.get(oldItemPosition), newData.get(newItemPosition));
  }

  @Override public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
    return diffInterface.areContentsTheSame(oldData.get(oldItemPosition), newData.get(newItemPosition));
  }
}
