CREATE TABLE `Peminjaman` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `peminjam_id` int(11) DEFAULT NULL,
  `barang_id` int(11) DEFAULT NULL,
  `waktu_pinjam` int(11) DEFAULT NULL,
  `waktu_kembali` int(11) DEFAULT NULL,
  `lokasi` varchar(10) DEFAULT NULL,
  `kebutuhan` varchar(50) DEFAULT NULL,
  `jatuh_tempo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
