package com.owiwi.model;

import java.time.ZonedDateTime;

/**
 * An entity will always have an id and a creation date.
 */
public abstract class Entity<T> {

	private final T id;

	private ZonedDateTime createdDate;

	Entity(T id, ZonedDateTime createdDate) {
		this.id = id;
		this.createdDate = createdDate;
	}

	public T getId() {
		return id;
	}

	public ZonedDateTime getCreatedDate() {
		return createdDate;
	}
}
