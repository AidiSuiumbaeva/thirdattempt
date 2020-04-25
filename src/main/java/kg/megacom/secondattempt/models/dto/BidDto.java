package kg.megacom.secondattempt.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import kg.megacom.secondattempt.models.Customer;
import kg.megacom.secondattempt.models.Lot;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.PositiveOrZero;
import java.util.Date;

@Data
@ApiModel(value = "Класс Ставка",description = "Для хранения информации о ставках")
public class BidDto {
    private Long id;
    private Date addDate;
    private double bidValue;
    @ApiModelProperty(value = "Активен или не активен")
    private boolean active;
    @ApiModelProperty(value = "На какой лот ставка")
    private LotDto lotDto;
    @ApiModelProperty(value = "Информация о клиенте ")
    private CustomerDto customerDto;

}
