package com.owiwi.repositories.base;

import com.owiwi.data.ConnectionDatabase;
import com.owiwi.model.Connection;

import java.util.List;

public class ConnectionRepository extends BaseRepository<Long, Connection> {

	public ConnectionRepository() {
		this.dataList = ConnectionDatabase.generateConnections();
	}

	public List<Connection> getAll() {
//		TODO to be filled
		return null;
	}

	public Connection findById(Long id) {
//		TODO to be filled
		return null;
	}
}
