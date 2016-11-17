package com.github.markzhai.recyclerview;

/**
 * Created by donglua on 16-11-16.
 */

public interface DiffInterface<T> {

  boolean areItemsTheSame(T oldItem, T newItem);
  boolean areContentsTheSame(T oldItem, T newItem);
}
