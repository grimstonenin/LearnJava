package LearnTDD.test;

import LearnTDD.main.TimeSource;

import java.time.LocalDateTime;

public class StubTimeSource implements TimeSource {
    @Override
    public LocalDateTime currentTime() {
        return LocalDateTime.of(2017,1,1,1,1);
    }
}
