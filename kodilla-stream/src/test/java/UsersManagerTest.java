import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsersManagerTest {

    @Test
    void testFilterChemistGroupUsernames(){
        UsersManager usersManager =  new UsersManager();
        List<String> chemistGroupUsernames = UsersManager.filterChemistGroupUsernames();
        assertEquals(2,chemistGroupUsernames.size());
    }

    @Test
    void testFilterUser(){
        UsersManager usersManager = new UsersManager();
        List<User> users = UsersManager.filterUser(40);
        assertEquals(4,users.size());
    }

    @Test
    void testFilterNumberOfPost(){
        UsersManager usersManager = new UsersManager();
        List<User> users = UsersManager.filterNumberOfPost();
        assertEquals(2,users.size());
    }
}
