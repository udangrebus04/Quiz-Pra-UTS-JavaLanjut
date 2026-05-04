package com.example.quiz.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz.services.MahasiswaService;


@RestController
@RequestMapping("mahasiswa")
public class MahasiswaController {
  private final MahasiswaService mahasiswaService;

  public MahasiswaController(MahasiswaService mahasiswaService) {
    this.mahasiswaService = mahasiswaService;
  }

  @GetMapping()
  public String index () {
    return this.mahasiswaService.getAllMahasiswa();
  }
}
