package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {
	private UserService userService;
	
	public UserManagementController(UserService userService) {
		this.userService = userService;
	}
	
	//Create
	public User createUser() {
		User user = userService.insertUser();
		
		System.out.println("[새로 추가된 사용자]");
		System.out.println(user.toString());
		return user;
	}
	//Read
	public void getUser() {
		
	}
	//Update
	public void updateUser() {
		
	}
	//Delete
	public void deleteUser() {
		
	}
}
