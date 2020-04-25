package kg.megacom.secondattempt.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;
    @NotBlank(message = "Имя не может быть пустным")
    private String name;
    @Email(message = "Введите почту")
    private String login;
    private String password;
    private boolean isActive;
}
