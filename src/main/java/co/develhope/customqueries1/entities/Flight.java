package co.develhope.customqueries1.entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table
@Data
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;
    private String fromAirport;
    private String toAirport;
    private FlightStatus status;
}