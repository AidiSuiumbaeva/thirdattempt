package kg.megacom.secondattempt.tests;

import kg.megacom.secondattempt.models.Lot;
import kg.megacom.secondattempt.models.User;
import kg.megacom.secondattempt.repositories.LotRep;
import kg.megacom.secondattempt.repositories.UserRep;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static  org.junit.Assert.*;
@RunWith(SpringRunner.class)
@DataJpaTest
public class RepositoryTest {
    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private LotRep lotRep;

    @Test
    public void testSave(){
        Lot lot=new Lot();

            lot.setName("aidi");
            lot.setMaxPrice(1000);

             Lot found=testEntityManager.persist(lot);


      assertNotNull(found.getId());

    }
}
