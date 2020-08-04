package baiwa.mysql.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import baiwa.mysql.model.Users;
import baiwa.mysql.repo.UsersRepo;

@Service
public class UsersService {

	@Autowired
	private UsersRepo usersRepo;

	public void save() {
		Users user = Users.builder()
				.fullName("fullName")
				.username("username")
				.createdAt(new Date())
				.build();
		usersRepo.save(user);
	}
}
