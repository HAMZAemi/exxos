package com.exosdata.data.backendexample.entities;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "example")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Getter
@SuperBuilder
@NoArgsConstructor
public class Example {

    @Column(name = "id")
    @Id
    private String id;

    @Column(name = "code")
    private String code;
}
