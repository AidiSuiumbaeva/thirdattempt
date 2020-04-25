package kg.megacom.secondattempt.tests;

import junit.framework.Assert;
import kg.megacom.secondattempt.mapper.ClassMapper;
import kg.megacom.secondattempt.mapper.UserMapper;
import kg.megacom.secondattempt.models.User;
import kg.megacom.secondattempt.models.dto.UserDto;
import kg.megacom.secondattempt.repositories.UserRep;
import kg.megacom.secondattempt.services.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;



import static org.mockito.ArgumentMatchers.any;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {
    @Autowired
    private UserService service;

    @MockBean
    private UserRep userRep;

    private UserDto userDto;
    private User user;


    @Before
    public void init(){
        userDto=new UserDto()

        {{
            setPassword("jhfjsfh");
            setName("aidai");
        }};
user= UserMapper.getInstance.userDtoToUser(userDto);
user.setId(1l);
        Mockito.when(userRep.save(any()))
                .thenReturn(user);
    }


    @Test
    public void testSave(){
       userDto= service.saveUser(userDto);
        Assert.assertNotNull(userDto.getId());
    }
}
