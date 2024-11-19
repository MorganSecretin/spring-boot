package ynov.main.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Pouvoir {
    @Id
    private Long id;
    
    private String name;
}
