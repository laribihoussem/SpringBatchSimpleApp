package com.dev.testSncfProject.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dev.testSncfProject.service.TypeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/type")
@AllArgsConstructor
public class TypeController {

  private final TypeService typeService;

  // @PostMapping()
  // public ResponseEntity addDestination(@RequestBody Type t) throws IOException {
  // return ResponseEntity.ok().body(typeRepo.save(t));
  // }

  @GetMapping("/{id}")
  public List<String> getAllDestination(@PathVariable("id") String Source) throws Exception {
    return typeService.getTypes(Source);
  }
}
