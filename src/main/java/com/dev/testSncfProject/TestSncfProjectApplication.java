package com.dev.testSncfProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.dev.testSncfProject.configuration.DbTypesConfiguration;
import com.dev.testSncfProject.domain.Source;
import com.dev.testSncfProject.domain.Type;
import com.dev.testSncfProject.service.SourceService;
import com.dev.testSncfProject.service.TypeService;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class TestSncfProjectApplication {

  @Autowired
  DbTypesConfiguration configuration;

  public static void main(String[] args) {
    SpringApplication.run(TestSncfProjectApplication.class, args);
  }



  @Bean
  CommandLineRunner run(TypeService s, SourceService ss) {
    return args -> {
      Source s1 = ss.addSource(new Source(1, "name", "ORACLE"));
      s.addType(new Type(1, "t1", s1));
    };
  }

}
