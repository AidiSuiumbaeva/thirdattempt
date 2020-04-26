package kg.megacom.secondattempt.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Data
@Entity
@Table(name = "lots")
public class Lot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @NotBlank
    private String name;
    @Min(value=50,message = "Минимальная cтоимость 50")
   @JsonFormat(pattern = "dd.MM.yyyy")
    private Date startDate;
  @JsonFormat(pattern = "dd.MM.yyyy")
    @FutureOrPresent
    private Date endDate;
    private double minPrice;
    @Max(value = 100000,message = "Максимальная стоимость лота не должна превышать 100000")
    private double maxPrice;
    @Positive
    private double step;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
}
