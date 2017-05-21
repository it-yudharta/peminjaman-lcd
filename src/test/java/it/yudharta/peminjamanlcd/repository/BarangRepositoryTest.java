package it.yudharta.peminjamanlcd.repository;

import it.yudharta.peminjamanlcd.entity.Barang;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BarangRepositoryTest {
    
    @Autowired
    private BarangRepository barangRepository;
    
    @Test
    @Transactional
    public void testTambahDataBarang() {
        Barang b = new Barang("BR001", "LCD", "ADA");
        barangRepository.save(b);
        Barang barang = this.barangRepository.findByKode("BR001");
        assertThat(barang.getNama()).isEqualTo("LCD");
        assertThat(barang.getStatus()).isEqualTo("ADA");
    }
}
