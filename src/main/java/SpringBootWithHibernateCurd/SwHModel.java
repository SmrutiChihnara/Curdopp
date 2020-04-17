package SpringBootWithHibernateCurd;

import RestCurdEx.RestModel;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SwHModel  {
    @Id
    private int id;
    private String name;


}
