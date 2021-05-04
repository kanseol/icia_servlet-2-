package example23;

import java.time.*;
import java.util.*;

public class MockUserDao {
	private static List<User> list = new ArrayList<>();
	
	static {
		User user = User.builder().username("spring").irum("홍길동").email("spring@naver.com")
			.password("1234").joinday(LocalDate.now()).build();
		list.add(user);
	}
	
	public static void insert(User user) {
		System.out.println("회원 추가 : " + user);
		list.add(user);
	}
	
	public static User findByIdAndPassword(String username, String password) {
		for(User user:list) {
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
	
	public static User findById(String username) {
		for(User user:list) {
			if(user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}
}
