package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "client")
@Getter
@Setter
@ToString
public class Client {
    @Id
    private long id;
    private String fullName;
    private String email;
    private String phone;
    private String date;
}
