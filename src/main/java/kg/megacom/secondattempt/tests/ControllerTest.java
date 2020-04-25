package kg.megacom.secondattempt.tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import kg.megacom.secondattempt.models.dto.UserDto;
import kg.megacom.secondattempt.services.UserService;
import org.dom4j.util.UserDataAttribute;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest
public class ControllerTest {
    @Autowired
    private MockMvc mockMvc;
    private  UserDto userDto;
    @MockBean
    private UserService service;

    private  ObjectMapper om;
    @Before
    public  void beforeAll(){
        userDto=new UserDto();
        userDto.setName("aidi");
        userDto.setPassword("fjjf");
        Mockito.when(service.saveUser(userDto))
                .thenReturn(userDto);
        om=new ObjectMapper();
    }
    @Test
    public void testSaveCTRL() throws Exception {


        mockMvc.perform(post("/user/save")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
        .content(om.writeValueAsString(userDto)))

                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
}
