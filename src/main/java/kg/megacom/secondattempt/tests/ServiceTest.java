package kg.megacom.secondattempt.tests;

import kg.megacom.secondattempt.mapper.LotMapper;
import kg.megacom.secondattempt.models.Lot;
import kg.megacom.secondattempt.models.dto.LotDto;
import kg.megacom.secondattempt.repositories.LotRep;
import kg.megacom.secondattempt.services.LotService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.Date;

import static org.mockito.ArgumentMatchers.any;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {
  @Autowired
    private LotService service;
  private Lot lot;
  @MockBean
  LotRep lotRep;

  private LotDto lotDto;

  @Before
  public void init()
  {lotDto=new LotDto(){{
      setName("kjdkdhkdh");
      setStep(10);
      setEndDate(new Date());
  }};
     lot=LotMapper.getInstance.lotDtoToLot(lotDto);
     lot.setId(1l);
  Mockito.when(lotRep.save(any()))
          .thenReturn(lot);
  }
  @Test
  public void testSave(){
      lotDto=service.save(lotDto);

      Assert.assertNotNull(lotDto.getId());
  }
}
