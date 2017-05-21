package it.yudharta.peminjamanlcd.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import it.yudharta.peminjamanlcd.entity.Barang;

public interface BarangRepository extends PagingAndSortingRepository<Barang, Integer>{
    
    Barang findByKode(String kode);
}
