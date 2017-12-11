package LearnTDD.main;

import java.util.List;

public interface UserStore {
    public List<User> findAll();

    public void store(User user);
}
