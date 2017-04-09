CREATE TABLE `Peminjam` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kode` varchar(25) DEFAULT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `telp` varchar(20) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `jurusan` varchar(30) DEFAULT NULL,
  `dosen` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
