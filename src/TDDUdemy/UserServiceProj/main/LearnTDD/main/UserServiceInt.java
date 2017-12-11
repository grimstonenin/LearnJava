package LearnTDD.main;

import java.util.List;

public interface UserServiceInt {

    public abstract List<User> users();

    public abstract void register(String user);

    public abstract User find(String username);

}
