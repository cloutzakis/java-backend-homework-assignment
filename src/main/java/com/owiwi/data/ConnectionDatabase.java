package com.owiwi.data;

import com.owiwi.enumeration.ConnectionType;
import com.owiwi.model.Connection;
import com.owiwi.model.User;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * In-Memory Connections Database
 */
public class ConnectionDatabase {

	/**
	 * Call this method to generate the connections.
	 */
	public static List<Connection> generateConnections() {

		List<Connection> out = new ArrayList<Connection>();

		List<User> usersList = UserDatabase.generateUsers();

		for (int j = 0; j < 10; j++) {
			for (int a = 0; a < usersList.size(); a++) {
				for (int b = usersList.size() - 1; b >= 0; b--) {
					if (a != b) {
						out.add(new Connection((long) a + b, (long) a, (long) b, generateConnectionType(a + b), ZonedDateTime.now()));
					}
				}
			}
		}

		return out;
	}

	private static ConnectionType generateConnectionType(int n) {
		if (n % 2 == 0) {
			return ConnectionType.FRIEND;
		} else if (n % 3 == 0) {
			return ConnectionType.PROFFESSOR;
		} else if (n % 5 == 0) {
			return ConnectionType.RELATIVE;
		} else {
			return ConnectionType.STRANGER;
		}

	}

}
