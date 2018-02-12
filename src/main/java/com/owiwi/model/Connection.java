package com.owiwi.model;

import com.owiwi.enumeration.ConnectionType;

import java.time.ZonedDateTime;

public class Connection extends Entity<Long> {

	private final Long fromId;
	private final Long toId;
	private final ConnectionType type;

	public Connection(Long id, Long fromId, Long toId, ConnectionType type, ZonedDateTime createdDate) {
		super(id, createdDate);
		this.fromId = fromId;
		this.toId = toId;
		this.type = type;
	}

	public Long getFromId() {
		return fromId;
	}

	public Long getToId() {
		return toId;
	}

	public ConnectionType getType() {
		return type;
	}
}
