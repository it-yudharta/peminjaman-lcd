/* ubah nama tabel barang menjadi lowercase. */
ALTER TABLE `Barang`
  RENAME TO `barang`;

/* tambah tabel petugas*/
CREATE TABLE `petugas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `kode` VARCHAR(25) NOT NULL,
  `nama` VARCHAR(50) DEFAULT NULL,
  `password` VARCHAR(50) DEFAULT NULL,
  `jabatan` VARCHAR(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `petugas_kode_UNIQUE` (`kode` ASC)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/* tambah tabel peminjam*/
CREATE TABLE `peminjam` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `kode` VARCHAR(25) NOT NULL,
  `nama` VARCHAR(50) DEFAULT NULL,
  `telp` VARCHAR(20) DEFAULT NULL,
  `alamat` VARCHAR(50) DEFAULT NULL,
  `jurusan` VARCHAR(30) DEFAULT NULL,
  `dosen` VARCHAR(25) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `peminjam_kode_UNIQUE` (`kode` ASC)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/* tambah tabel peminjama*/
CREATE TABLE `peminjaman` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `peminjam_id` INT NOT NULL,
  `barang_id` INT NOT NULL,
  `waktu_pinjam` DATETIME DEFAULT NULL,
  `waktu_kembali` DATETIME DEFAULT NULL,
  `lokasi` VARCHAR(10) DEFAULT NULL,
  `kebutuhan` VARCHAR(50) DEFAULT NULL,
  `jatuh_tempo` INT DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `peminjaman_peminjam`
    FOREIGN KEY (`peminjam_id`)
    REFERENCES `peminjam` (`id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `peminjaman_barang`
    FOREIGN KEY (`barang_id`)
    REFERENCES `barang` (`id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
