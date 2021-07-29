-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 22 Jul 2021 pada 07.35
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tiket`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tiket_bus`
--

CREATE TABLE `tiket_bus` (
  `id_bus` varchar(20) NOT NULL,
  `id_user` int(11) NOT NULL,
  `nama_bus` enum('SinarJaya','DediJaya','MurniJaya','RosaliaIndah') NOT NULL,
  `tgl_berangkat` date NOT NULL,
  `jam` enum('07.00 WIB','17.00 WIB') NOT NULL,
  `terminal_asal` text NOT NULL,
  `terminal_tujuan` text NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tiket_bus`
--

INSERT INTO `tiket_bus` (`id_bus`, `id_user`, `nama_bus`, `tgl_berangkat`, `jam`, `terminal_asal`, `terminal_tujuan`, `harga`) VALUES
('XXI/III/491', 1, 'MurniJaya', '2021-08-02', '07.00 WIB', 'Gayo', 'Takengon', 130000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `users`
--

CREATE TABLE `users` (
  `id_user` int(11) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nama` text NOT NULL,
  `nohp` int(11) NOT NULL,
  `jk` enum('L','P') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `users`
--

INSERT INTO `users` (`id_user`, `email`, `password`, `nama`, `nohp`, `jk`) VALUES
(1, 'test@gmail.com', 'test', 'Test', 10101001, 'P');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tiket_bus`
--
ALTER TABLE `tiket_bus`
  ADD PRIMARY KEY (`id_bus`),
  ADD KEY `id_user` (`id_user`);

--
-- Indeks untuk tabel `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `users`
--
ALTER TABLE `users`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tiket_bus`
--
ALTER TABLE `tiket_bus`
  ADD CONSTRAINT `tiket_bus_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
