package entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "team_name")
    private String name ;

    @ManyToOne
    @JoinColumn(name = "coach_id")
    private User coachId ;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City TeamCityId ;

    @OneToMany(mappedBy = "userTeamId")
    private Set<User> teamUsers ;

}
