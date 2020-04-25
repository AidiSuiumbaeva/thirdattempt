package kg.megacom.secondattempt.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.secondattempt.models.dto.UserDto;
import kg.megacom.secondattempt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController@RequestMapping(value = "/user")
@Api(value = "User Management",description = "Методы для управления пользователем")
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping(value = "/save")
    @ApiOperation(value = "Создание или редактирование пользователя")
    public UserDto save(@Valid @RequestBody UserDto userDto){

        userDto.setId(1l);
        System.out.println(userDto);
        return userDto;

        //return service.saveUser(userDto);
    }

    @GetMapping(value = "/get/{id}")
    @ApiOperation(value = "get user by id")
    public UserDto getUserById(@PathVariable Long id){


        UserDto userDto=new UserDto()
        {{
            setId(id);
            setPassword("jgvnklgvn");

        }};
        return userDto;
        //return service.find(id);
}
@GetMapping(value = "/list")
public List<Object> get(){
        UserDto userDto=new UserDto(){{
            setPassword("jvkdsjclk");
            setActive(true);
        }};
        return Arrays.asList(userDto, userDto);
}

}
