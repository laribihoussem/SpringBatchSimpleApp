package com.dev.testSncfProject.configuration;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import lombok.Getter;
import lombok.Setter;

@Configuration
@Getter
@Setter
@ConfigurationProperties(prefix = "db")
public class DbTypesConfiguration {

  private List<String> oracleTypes;
  private List<String> postgresqlTypes;

  public List<String> getOracleTypes() {
    return oracleTypes;
  }

  public void setOracleTypes(List<String> oracleTypes) {
    this.oracleTypes = oracleTypes;
  }

  public List<String> getPostgresqlTypes() {
    return postgresqlTypes;
  }

  public void setPostgresqlTypes(List<String> postgresqlTypes) {
    this.postgresqlTypes = postgresqlTypes;
  }
}
