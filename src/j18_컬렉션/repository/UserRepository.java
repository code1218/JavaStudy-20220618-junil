package j18_컬렉션.repository;

import java.util.List;

public interface UserRepository {

	public boolean addUser(User user);
	public List<User> getUserListAll();
	public User findUserByUsername(String username);
	public boolean updateUserEmail(String username, String email);
	public boolean updateUserPassword(String username, String password, String newPassword);
	public boolean deleteUserByUsername(String username);
}
