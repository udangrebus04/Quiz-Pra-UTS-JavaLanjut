package com.example.quiz.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

import com.example.quiz.services.MahasiswaService;
import com.example.quiz.models.Mahasiswa;


@RestController
@RequestMapping("mahasiswa")
public class MahasiswaController {
  private final MahasiswaService mahasiswaService;

  public MahasiswaController(MahasiswaService mahasiswaService) {
    this.mahasiswaService = mahasiswaService;
  }

  @GetMapping()
  public Map<String, Mahasiswa> getAll() {
    return mahasiswaService.getAll();
  }

  @GetMapping("/{nim}")
  public Mahasiswa getByNim(@PathVariable String nim) {
    return mahasiswaService.getByNim(nim);
  }

  @PostMapping()
  public Mahasiswa add(@RequestBody Mahasiswa mahasiswa) {
    return mahasiswaService.add(mahasiswa);
  }

  @PutMapping("/{nim}")
  public Mahasiswa update(@PathVariable String nim, @RequestBody Mahasiswa mahasiswa) {
    return mahasiswaService.update(nim, mahasiswa);
  }

  @DeleteMapping("/{nim}")
  public void delete(@PathVariable String nim) {
    mahasiswaService.delete(nim);
  }
}


