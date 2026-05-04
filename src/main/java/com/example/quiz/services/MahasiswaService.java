package com.example.quiz.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.quiz.models.Mahasiswa;

@Service
public class MahasiswaService {

  private final Map<String, Mahasiswa> mahasiswaMap = new HashMap<>();

    public MahasiswaService() {
        // Contoh data awal
        Mahasiswa mahasiswa1 = new Mahasiswa("123", "John Doe");
        Mahasiswa mahasiswa2 = new Mahasiswa("456", "Jane Doe");
        mahasiswaMap.put(mahasiswa1.getNim(), mahasiswa1);
        mahasiswaMap.put(mahasiswa2.getNim(), mahasiswa2);
    }

}
