package com.bilgeadam.deneme;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Car")
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name; //metenin araba, hacı amcamın araba, erhan amcamın araba, dedemin araba

    @Column
    private String vendor; //mercedes, volkswagen, merceddes, mercedes

    @Column
    private String plate; //crc 188,...

}
