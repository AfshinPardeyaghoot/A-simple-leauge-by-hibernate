package entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


@Entity
@Getter
@Setter
public class GameEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "type")
    private String type ;

    @Column(name = "time_minute")
    private Integer timeMinute ;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game gameId ;

}
