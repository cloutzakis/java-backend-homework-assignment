package com.owiwi.repositories.base;

import com.owiwi.model.Entity;

import java.util.List;

public abstract class BaseRepository<K, T extends Entity<K>> implements IRepository<K, T> {

	protected List<T> dataList;

}
