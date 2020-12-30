package entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "first_name")
    private String firstName ;

    @Column(name = "last_name")
    private String lastName ;

    @Column(name = "user_type")
    private String userType ;

    @ManyToOne
    @JoinColumn(name = "user_team_id")
    private Team UserTeamId ;
}
