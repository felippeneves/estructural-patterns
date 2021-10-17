package br.com.felippeneves.bridge.backend.services;

import br.com.felippeneves.bridge.backend.dao.UserDao;
import br.com.felippeneves.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}