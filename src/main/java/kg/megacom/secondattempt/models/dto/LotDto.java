package kg.megacom.secondattempt.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kg.megacom.secondattempt.models.Status;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;
@Data
@ApiModel(value = "Класс Лот",description = "Для хранения информации о лотах")
public class LotDto {
    private Long id;
    private String name;
    private Date startDate;
    private Date endDate;
    @ApiModelProperty(value = "Минимальная стоимость лота")
    private double minPrice;
    private double maxPrice;
    @ApiModelProperty(value = "Шаг ")
    private double step;
   // @ApiModelProperty(value = "Статус лота")
    //private StatusDto statusDto;
}
