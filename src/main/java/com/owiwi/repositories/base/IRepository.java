package com.owiwi.repositories.base;

import com.owiwi.model.Entity;

import java.util.List;

public interface IRepository<K, T extends Entity<K>> {

	/**
	 * @return the whole data set.
	 */
	List<T> getAll();

	/**
	 * @param id The id of the entity.
	 * @return the entity object.
	 */
	T findById(K id);

}
