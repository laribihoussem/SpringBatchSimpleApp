package com.dev.testSncfProject.batch;

import java.util.List;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;
import com.dev.testSncfProject.domain.User;
import com.dev.testSncfProject.repository.UserRepository;

@Component
public class DbWriter implements ItemWriter<User> {

  private UserRepository userRepository;

  public DbWriter(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public void write(List<? extends User> users) throws Exception {
    System.out.println("Data Saved for Users: " + users);
    userRepository.saveAll(users);
  }



}
