package it.yudharta.peminjamanlcd.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import it.yudharta.peminjamanlcd.entity.Petugas;

public interface PetugasRepository extends PagingAndSortingRepository<Petugas, Integer>{
    
    Petugas findByKode(String kode);
}
