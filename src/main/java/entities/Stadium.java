package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Stadium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "stadium_name")
    private String name ;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City stadiumCityId ;

}
