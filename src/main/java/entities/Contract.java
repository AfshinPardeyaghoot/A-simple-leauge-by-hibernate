package entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "term_of_contact")
    private String termOfContact ;

    @Column(name = "type")
    private String type ;

    @Column(name = "salary")
    private Double salary ;

    @Column(name = "contract_time")
    @Temporal(TemporalType.DATE)
    private Date contractTime ;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId ;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team teamId ;


}
