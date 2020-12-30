package entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "city_name")
    private String name ;

    @OneToMany(mappedBy = "stadiumCity")
    private Set<Stadium> stadiums ;

}
