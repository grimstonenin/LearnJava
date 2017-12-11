package LearnTDD.test;

import LearnTDD.main.SimpleUserService;
import LearnTDD.main.User;
import LearnTDD.main.UserServiceInt;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestEmptyUserService {

    private UserServiceInt userService;
    private LearnTDD.test.MockAuditLog mockAuditLog = new LearnTDD.test.MockAuditLog();
    private LearnTDD.test.FakeUserStore fakeUserStore = new LearnTDD.test.FakeUserStore();
    private LearnTDD.test.StubTimeSource stubTimeSource = new LearnTDD.test.StubTimeSource();

    @Before
    public void init(){
        this.userService = new SimpleUserService(mockAuditLog,fakeUserStore,stubTimeSource);
        mockAuditLog.enable();
    }

    @Test
    public void testDefaultUserServiceHasNoUsers(){
        assertEquals(0,userService.users().size());
    }

    @Test
    public void testFindingNonExistingUser(){
        assertNull(userService.find("Bob"));
    }

    @Test
    public void testRegisteringSingleUser(){
        mockAuditLog.expect("user","registernew","bob");
        userService.register("bob");

        List<User> users = userService.users();

        assertEquals(1,users.size());
        assertEquals("bob", users.get(0).getUsername());
        assertEquals(stubTimeSource.currentTime(),users.get(0).getTimeSource());
        mockAuditLog.verify();
    }
}
