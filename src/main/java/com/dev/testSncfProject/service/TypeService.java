package com.dev.testSncfProject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dev.testSncfProject.configuration.DbTypesConfiguration;
import com.dev.testSncfProject.domain.Type;
import com.dev.testSncfProject.repository.TypeRepo;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class TypeService {

  @Autowired
  DbTypesConfiguration configuration;

  private final TypeRepo repo;

  public String addType(Type t) {
    repo.save(t);
    return "destination saved successfully";
  }


  public List<String> getTypes(String source) throws Exception {
    if (source.equals("oracle")) {
      return configuration.getOracleTypes();
    } else if (source.equals("pg")) {
      return configuration.getPostgresqlTypes();
    }
    throw new Exception();
  }


}
