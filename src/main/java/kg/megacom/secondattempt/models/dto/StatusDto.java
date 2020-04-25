package kg.megacom.secondattempt.models.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data@ApiModel(value = "Класс Статус",description = "Для хранения информации о статусах")
public class StatusDto {
    private Long id;
    private String name;
}
