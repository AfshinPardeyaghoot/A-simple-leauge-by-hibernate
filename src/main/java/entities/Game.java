package entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date ;

    @ManyToOne
    @JoinColumn(name = "home_id")
    private Team homeId ;

    @ManyToOne
    @JoinColumn(name = "away_id")
    private Team awayId ;

    @ManyToOne
    @JoinColumn(name = "stadium_id")
    private Stadium stadiumId ;

    @OneToMany(mappedBy = "gameId")
    private Set<GameEvent> gameEvents ;

}
