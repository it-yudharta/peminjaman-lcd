CREATE TABLE `Barang` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kode` varchar(25) DEFAULT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `status` enum('ADA','KELUAR') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
