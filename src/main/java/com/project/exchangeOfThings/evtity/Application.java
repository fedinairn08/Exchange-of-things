package com.project.exchangeOfThings.evtity;

import com.project.exchangeOfThings.enums.ApplicationStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
public class Application {
    @Id
    private Long id;

    private Long desirableThingId;
    private Long thingToExchangeId;
    private Long userOfDesirableThingId;
    private Long userOfThingToExchangeId;
    private Date requestDate;
    @Enumerated(EnumType.STRING)
    private ApplicationStatus applicationStatus;

}
