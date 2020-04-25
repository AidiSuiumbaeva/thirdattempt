package kg.megacom.secondattempt.mapper;

import kg.megacom.secondattempt.models.Status;
import kg.megacom.secondattempt.models.User;
import kg.megacom.secondattempt.models.dto.StatusDto;
import kg.megacom.secondattempt.models.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper getInstance= Mappers.getMapper(UserMapper.class);

    User userDtoToUser(UserDto userDto);
    UserDto userToUserDto(User user);

    List<UserDto> userToUserDto(List<User> users);
}
