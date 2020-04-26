package kg.megacom.secondattempt.tests;

import kg.megacom.secondattempt.mapper.ClassMapper;
import kg.megacom.secondattempt.mapper.LotMapper;
import kg.megacom.secondattempt.mapper.UserMapper;
import kg.megacom.secondattempt.models.Lot;
import kg.megacom.secondattempt.models.User;
import kg.megacom.secondattempt.models.dto.LotDto;
import kg.megacom.secondattempt.models.dto.UserDto;
import kg.megacom.secondattempt.services.UserService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)/*мост*/
@SpringBootTest/*иммитирует запуск сервиса,чтобы бины были созданы*/
public class TestT {

    @Test
  public void testLotDtoToLot(){
      LotDto actual=new LotDto(){
          {
              setId(1l);
              setName("djkddd");
              setStep(20.00);
              setMaxPrice(2000.00);
              setMinPrice(1000);
              setStartDate(new Date());
              setEndDate(new Date());

          }
      };


      Lot user= LotMapper.getInstance.lotDtoToLot(actual);
      LotDto found=LotMapper.getInstance.lotToLotDto(user);

      assertEquals(actual.getId(),found.getId());
      assertEquals(actual.getName(),found.getName());
      assertEquals(actual.getMaxPrice(),found.getMaxPrice(),0.2);
      assertEquals(actual.getMinPrice(),found.getMinPrice(),0.03);
      assertEquals(actual.getStep(),found.getStep(),0.06);
      assertEquals(actual.getEndDate(),found.getEndDate());
      assertEquals(actual.getStartDate(),found.getStartDate());







  }

  //написать tests для мапперов
}
