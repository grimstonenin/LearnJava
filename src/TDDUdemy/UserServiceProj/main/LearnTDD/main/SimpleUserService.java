package LearnTDD.main;

import java.util.List;

public class SimpleUserService implements UserServiceInt {

    private AuditLog auditLog;
    private UserStore userStore;
    private TimeSource timeSource;

    public SimpleUserService(AuditLog auditLog, UserStore userStore, TimeSource timeSource){
        this.auditLog = auditLog;
        this.userStore = userStore;
        this.timeSource = timeSource;
    }


    @Override
    public List<User> users() {
        return this.userStore.findAll();
    }

    @Override
    public void register(String user) {
        if(hasUser(user)){
            auditLog.log("user","duplicate",user);
        } else {
            auditLog.log("user","registernew",user);
            userStore.store(new User(user, timeSource.currentTime()));
        }
    }

    private boolean hasUser(String user) {
        User found = find(user);
        return found != null;
    }

    @Override
    public User find(String username) {

        List<User> allUsers = userStore.findAll();
        for(User user: allUsers){
            if(user.getUsername().equals(username)){
                return user;
            }
        }

        return null;
    }
}
