package com.dev.testSncfProject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Type {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String typeName;

  @ManyToOne
  @JsonIgnore
  private Source source;

  public Type(long id, String typeName) {
    super();
    this.id = id;
    this.typeName = typeName;
  }


}
