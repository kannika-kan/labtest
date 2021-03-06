package com.sut.se.g05.entity;

import lombok.*;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@ToString
@Getter @Setter
@NoArgsConstructor
@EqualsAndHashCode
@Table (name="Provincesen")
public class Provincesen {

    @Id
    @SequenceGenerator(name = "provincesen_seq", sequenceName = "provincesen_seq")
    @GeneratedValue(generator = "provincesen_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "PROVINCESEN_ID", unique = true, nullable = true)

    private Long provincesenId;
    private @NonNull String provincesen;



}
