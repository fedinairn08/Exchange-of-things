package com.project.exchangeOfThings.dto;

import com.project.exchangeOfThings.enums.ThingStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ThingDTO {
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
