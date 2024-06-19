package org.linktic.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user", schema = "ecommerce")
public class UserEntity {
    @Id
    private Long pkid_user;
    private String creation_date;
    private String expiration_date;
    private String user;
    private String password;
    private Long fk_pkid_user_information;
    private int number_attempts;
}
