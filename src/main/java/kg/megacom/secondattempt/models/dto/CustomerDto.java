package kg.megacom.secondattempt.models.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
@Data
@ApiModel(value = "Класс Клиент",description = "Для хранения информации о клиентах")
public class CustomerDto {
    private Long id;
    @ApiModelProperty(value = "Телефон клиента")
    private String phone;
}
