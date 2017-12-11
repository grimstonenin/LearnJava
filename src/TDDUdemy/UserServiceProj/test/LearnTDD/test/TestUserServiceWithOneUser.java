package LearnTDD.test;

import LearnTDD.main.SimpleUserService;
import LearnTDD.main.User;
import LearnTDD.main.UserServiceInt;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class TestUserServiceWithOneUser {

    private UserServiceInt userService;
    private MockAuditLog mockAuditLog = new MockAuditLog();
    private FakeUserStore fakeUserStore = new FakeUserStore();
    private StubTimeSource stubTimeSource = new StubTimeSource();

    @Before
    public void init(){
        this.userService = new SimpleUserService(mockAuditLog,fakeUserStore,stubTimeSource);
        userService.register("bob");
        mockAuditLog.enable();
    }

    @Test
    public void testFindingUserByName(){

        User user = userService.find("bob");
        assertNotNull(user);
        assertEquals("bob",user.getUsername());

    }

    @Test
    public void testRegisteringDuplicateUser(){

        mockAuditLog.expect("user","duplicate","bob");

        userService.register("bob");

        List<User> users = userService.users();

        assertEquals(1,users.size());
        assertEquals("bob", users.get(0).getUsername());
        assertEquals(stubTimeSource.currentTime(),users.get(0).getTimeSource());
        mockAuditLog.verify();

         }

    @Test
    public void testRegisteringSecondUser(){
        mockAuditLog.expect("user","registernew","alice");
        userService.register("alice");

        List<User> users = userService.users();

        assertEquals(2,users.size());
        assertEquals("alice", users.get(1).getUsername());
        assertEquals(stubTimeSource.currentTime(),users.get(1).getTimeSource());
        mockAuditLog.verify();
    }
}
