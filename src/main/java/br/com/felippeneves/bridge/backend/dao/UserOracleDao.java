package br.com.felippeneves.bridge.backend.dao;

import br.com.felippeneves.bridge.backend.model.User;

public class UserOracleDao implements UserDao {

	@Override
	public void save(User user) {
		System.out.println("Saving the user: " + user.getName() + " in the Oracle Database!");
	}
}