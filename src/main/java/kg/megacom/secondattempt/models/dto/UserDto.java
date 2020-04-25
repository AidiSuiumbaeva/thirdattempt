package kg.megacom.secondattempt.models.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "Класс Пользователь",description = "Для хранения информации о пользователях")
public class UserDto {
    private Long id;
    private String name;
    private String login;
    private String password;
    @ApiModelProperty(value = "Активен или неактивен")
    private boolean isActive;
}
