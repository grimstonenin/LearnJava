package LearnTDD.test;

import LearnTDD.main.User;
import LearnTDD.main.UserStore;

import java.util.ArrayList;
import java.util.List;

public class FakeUserStore implements UserStore {

    private List<User> userStore = new ArrayList<>();

    @Override
    public List<User> findAll() {
        return userStore;
    }

    @Override
    public void store(User user) {
        userStore.add(user);
    }
}
