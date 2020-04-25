package kg.megacom.secondattempt.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import java.util.Date;

@Data
@Entity
@Table(name = "bids")
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bid_id")
    private Long id;
@JsonFormat(pattern = "dd.MM.yyyy")
@FutureOrPresent
    private Date addDate;

    @PositiveOrZero(message = "Ставка не может быть отрицательной")
    private double bidValue;
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "lot_id")
    private Lot lot;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


}
