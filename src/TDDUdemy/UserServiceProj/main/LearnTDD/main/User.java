package LearnTDD.main;

import java.time.LocalDateTime;

public class User {

    private String username;
    private LocalDateTime timeSource;

    public User(String username,LocalDateTime timeSource){
        this.timeSource = timeSource;
        this.username = username;
    }

    public LocalDateTime getTimeSource() {
        return timeSource;
    }

    public String getUsername() {
        return username;
    }

}
