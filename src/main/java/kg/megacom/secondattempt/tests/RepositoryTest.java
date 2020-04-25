package kg.megacom.secondattempt.tests;

import kg.megacom.secondattempt.models.User;
import kg.megacom.secondattempt.repositories.UserRep;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static  org.junit.Assert.*;
@RunWith(SpringRunner.class)
@DataJpaTest
public class RepositoryTest {
    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private UserRep userRep;

    @Test
    public void testSave(){
        User user=new User();

            user.setName("aidi");

            user=testEntityManager.persist(user);


        assertNotNull(user.getId());

    }
}
