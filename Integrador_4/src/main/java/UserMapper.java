import java.util.List;

public interface UserMapper {
    List<User> getAllUsers();
    User getUserById(Long id);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}

