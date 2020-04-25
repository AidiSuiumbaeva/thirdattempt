package kg.megacom.secondattempt.services;

import kg.megacom.secondattempt.models.User;
import kg.megacom.secondattempt.models.dto.StatusDto;
import kg.megacom.secondattempt.models.dto.UserDto;

import java.util.Arrays;
import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);
    UserDto find(Long id);
    List<UserDto> getList();
    int findMax(int[] nums);

}
