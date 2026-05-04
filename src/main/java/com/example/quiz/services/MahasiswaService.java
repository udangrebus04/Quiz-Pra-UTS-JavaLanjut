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
        Mahasiswa mahasiswa1 = new Mahasiswa("23110062", "Cellomita Rahdianti Putri");
        Mahasiswa mahasiswa2 = new Mahasiswa("23110627", "Hasyifa Nur Fadhillah");
        Mahasiswa mahasiswa3 = new Mahasiswa("00000001", "Shin Junghwan");
        mahasiswaMap.put(mahasiswa1.getNim(), mahasiswa1);
        mahasiswaMap.put(mahasiswa2.getNim(), mahasiswa2);
        mahasiswaMap.put(mahasiswa3.getNim(), mahasiswa3);
    }

    public Map<String, Mahasiswa> getAll() {
        return mahasiswaMap;
    }

    public Mahasiswa getByNim(String nim) {
        return mahasiswaMap.get(nim);
    }

    public Mahasiswa add(Mahasiswa mahasiswa) {
        mahasiswaMap.put(mahasiswa.getNim(), mahasiswa);
        return mahasiswa;
    }
    public Mahasiswa update(String nim, Mahasiswa mahasiswa) {
        mahasiswaMap.put(nim, mahasiswa);
        return mahasiswa;
    }

    public void delete(String nim) {
        mahasiswaMap.remove(nim);
    }
}
