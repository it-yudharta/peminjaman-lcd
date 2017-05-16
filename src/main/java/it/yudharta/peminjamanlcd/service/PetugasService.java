package it.yudharta.peminjamanlcd.service;

import it.yudharta.peminjamanlcd.entity.Petugas;
import it.yudharta.peminjamanlcd.repository.PetugasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PetugasService {

    @Autowired
    PetugasRepository petugasRepository;

    public Iterable<Petugas> findAll() {
        return petugasRepository.findAll();
    }

    public Page<Petugas> findAll(Pageable pageable) {
        return petugasRepository.findAll(pageable);
    }
    
    public Petugas findOne(Integer id) {
        return petugasRepository.findOne(id);
    }

    public void save(Petugas petugas) {
        petugasRepository.save(petugas);
    }

    public void delete(Integer id) {
        petugasRepository.delete(id);
    }

}
