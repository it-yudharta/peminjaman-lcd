ALTER TABLE `products`
  RENAME TO `Barang`,
  ADD UNIQUE INDEX `kode_UNIQUE` (`kode` ASC);