package com.dev.testSncfProject.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Source {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String sourceName;

  public Source(long id, String sourceName, String sourceType) {
    super();
    this.id = id;
    this.sourceName = sourceName;
    this.sourceType = sourceType;
  }

  @Column(unique = true)
  private String sourceType;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "source")
  private List<Type> types;

}
