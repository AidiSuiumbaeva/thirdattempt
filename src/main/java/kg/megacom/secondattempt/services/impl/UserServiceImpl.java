package kg.megacom.secondattempt.services.impl;

import kg.megacom.secondattempt.mapper.ClassMapper;
import kg.megacom.secondattempt.mapper.StatusMapper;
import kg.megacom.secondattempt.mapper.UserMapper;
import kg.megacom.secondattempt.models.User;
import kg.megacom.secondattempt.models.dto.UserDto;
import kg.megacom.secondattempt.repositories.UserRep;
import kg.megacom.secondattempt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
 private UserRep userRep;
    @Override
    public UserDto saveUser(UserDto userDto) {
        User user=UserMapper.getInstance.userDtoToUser(userDto);
       user= userRep.save(user);
    userDto=UserMapper.getInstance.userToUserDto(user);
return userDto;
    }

    @Override
    public UserDto find(Long id) {

        return UserMapper.getInstance.userToUserDto(userRep.findById(id).orElse(null));
    }

    @Override
    public List<UserDto> getList() {
        return UserMapper.getInstance.userToUserDto(userRep.findAll());
    }

    @Override
    public int findMax(int[] nums) {

        return Arrays.stream(nums)
                .max().getAsInt();
    }
}
