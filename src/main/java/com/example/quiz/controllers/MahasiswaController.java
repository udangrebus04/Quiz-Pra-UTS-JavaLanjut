package com.example.quiz.controllers;

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

  // running di http://localhost:8110/mahasiswa
  // kerjakan bagian service dan controller
  // model jangan dirubah
  // kerjakan tanpa menggunakan AI
  // hargai kemampuan diri sendiri dan junjung tinggi kejujuran
  // nilai bukan hasil yang utama. 
  // selamat mengerjakan

  // @GetMapping()
  // 1. tampilkan semua data mahasiswa

  // @GetMapping("/{nim}")
  // 2. tampilkan data mahasiswa berdasarkan nim

  // @PostMapping()
  // 3. tambahkan data mahasiswa

  // @PutMapping("/{nim}")
  // 4. update data mahasiswa

  // @DeleteMapping("/{nim}")
  // 5. hapus data mahasiswa
}


