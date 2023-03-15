package com.dev.testSncfProject.service;

import org.springframework.stereotype.Service;
import com.dev.testSncfProject.domain.Source;
import com.dev.testSncfProject.repository.SourceRepo;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SourceService {

  private final SourceRepo repo;

  public Source addSource(Source s) {
    repo.save(s);
    return s;
  }

}
