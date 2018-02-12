package com.owiwi.repositories.base;

import com.owiwi.data.UserDatabase;
import com.owiwi.model.User;

import java.util.List;

public class UserRepository extends BaseRepository<Long, User> {

	public UserRepository() {
		this.dataList = UserDatabase.generateUsers();
	}

	public List<User> getAll() {
//		TODO to be filled
		return null;
	}

	public User findById(Long id) {
//		TODO to be filled
		return null;
	}
}
