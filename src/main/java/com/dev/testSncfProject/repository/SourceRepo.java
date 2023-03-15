package com.dev.testSncfProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dev.testSncfProject.domain.Source;

public interface SourceRepo extends JpaRepository<Source, Long> {

}
