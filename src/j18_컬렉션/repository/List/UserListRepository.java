package j18_컬렉션.repository.List;

import java.util.ArrayList;
import java.util.List;

import j18_컬렉션.repository.User;
import j18_컬렉션.repository.UserRepository;

public class UserListRepository implements UserRepository {
	
	private List<User> userList;
	
	public UserListRepository() {
		userList = new ArrayList<User>();
	}

	//추가
	@Override
	public boolean addUser(User user) {
		return userList.add(user);
	}

	//조회
	@Override
	public List<User> getUserListAll() {
		return userList;
	}

	@Override
	public User findUserByUsername(String username) {
		
		for(int i = 0; i < userList.size(); i++) {
			if(userList.get(i).getUsername().equals(username)) {
				return userList.get(i);
			}
		}
		
		return null;
	}

	//수정
	@Override
	public boolean updateUserEmail(String username, String email) {
		return false;
	}

	@Override
	public boolean updateUserPassword(String username, String password, String newPassword) {
		return false;
	}

	//삭제
	@Override
	public boolean deleteUserByUsername(String username) {
		return false;
	}
	
}
