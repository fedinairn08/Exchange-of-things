package com.project.exchangeOfThings.evtity;

import com.project.exchangeOfThings.enums.ThingStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Thing {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ThingStatus thingStatus;

    @NotBlank
    private String name;

    private String description;

    private Integer numberOfViews;
}
