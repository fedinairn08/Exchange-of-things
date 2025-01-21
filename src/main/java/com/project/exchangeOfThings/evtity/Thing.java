package com.project.exchangeOfThings.evtity;

import com.project.exchangeOfThings.enums.ThingStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Thing {
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private ThingStatus thingStatus;
    private String name;
    private String description;
    private String linkToPhoto;
    private Integer numberOfViews;
}
