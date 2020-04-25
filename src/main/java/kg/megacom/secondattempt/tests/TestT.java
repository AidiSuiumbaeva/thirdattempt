package kg.megacom.secondattempt.tests;

import kg.megacom.secondattempt.mapper.ClassMapper;
import kg.megacom.secondattempt.mapper.UserMapper;
import kg.megacom.secondattempt.models.User;
import kg.megacom.secondattempt.models.dto.UserDto;
import kg.megacom.secondattempt.services.UserService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)/*мост*/
@SpringBootTest/*иммитирует запуск сервиса,чтобы бины были созданы*/
public class TestT {

    @Test
  public void testUserDtoToUser(){
      UserDto actual=new UserDto(){
          {
              setId(1l);
              setName("aidai");
              setActive(true);
              setLogin("aidi@gmail.com");
              setPassword("1455684ggfgd");
          }
      };


      User user= UserMapper.getInstance.userDtoToUser(actual);
      UserDto found=UserMapper.getInstance.userToUserDto(user);

      assertEquals(actual.getId(),found.getId());
      assertEquals(actual.getName(),found.getName());
      assertEquals(actual.getLogin(),found.getLogin());
      assertEquals(actual.getPassword(),found.getPassword());
      assertEquals(actual.isActive(),found.isActive());
  }

  //написать tests для мапперов
}
