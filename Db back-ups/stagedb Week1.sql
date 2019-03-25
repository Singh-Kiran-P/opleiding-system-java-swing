-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Gegenereerd op: 21 mrt 2019 om 15:33
-- Serverversie: 10.1.38-MariaDB
-- PHP-versie: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stagedb`
--

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `opleiding`
--

CREATE TABLE `opleiding` (
  `id` int(11) NOT NULL,
  `opleiding` longtext NOT NULL,
  `location` mediumtext NOT NULL,
  `datum` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `opleiding`
--

INSERT INTO `opleiding` (`id`, `opleiding`, `location`, `datum`) VALUES
(27, 'HYBRIS TECHNICAL LEAD', 'CORDA 1', '2019-04-12'),
(28, 'FRONT-END DEVELOPER', 'CORDA 1', '2019-05-12'),
(29, 'BUSINESS ANALYST', 'CORDA 1', '2019-06-12'),
(30, 'SCRUM MASTER', 'CORDA 1', '2019-07-12'),
(31, 'JAVA DEVELOPER', 'CORDA 1', '2019-08-12'),
(32, 'JUNIOR FUNCTIONAL ANALYST', 'CORDA 3', '2019-09-12'),
(34, 'APPLICATION DEVELOPER', 'CORDA 3', '2019-11-12'),
(35, 'DIGITAL MARKETEER', 'CORDA 4', '2019-11-12'),
(36, 'HYBRIS DEVELOPER', 'CORDA 1', '2019-12-12'),
(40, 'hello', 'hello', '2012-12-12'),
(41, 'az', 'az', '1999-12-02');

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `role` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `firstname` varchar(52) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `birthDate` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `active` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `user`
--

INSERT INTO `user` (`id`, `role`, `name`, `firstname`, `gender`, `birthDate`, `username`, `password`, `email`, `active`) VALUES
(12, 'admin', 'a', 'a', '', '', 'a', 'a', 'a', 0),
(13, 'admin', 'Kiran', 'Singh', '', '', 'singh', 's', 'singh@singh.com', 0),
(14, 'student', 'q', 'q', 'q', '12-12-1299', 'q', 'q', 'q', 0),
(15, 'student', ' ', ' ', '', '', ' ', ' ', 'sin@sqsd.com', 0),
(16, 'student', 'ds', 'ds', '', '', 'ds', 'ds', 'ds@ds.com', 0),
(17, 'student', 'test', 'test', '', '', 'test', 'test', 'test@test.com', 0);

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `user_opleiding`
--

CREATE TABLE `user_opleiding` (
  `id` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `opleidingId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `user_opleiding`
--

INSERT INTO `user_opleiding` (`id`, `userId`, `opleidingId`) VALUES
(13, 14, 27),
(14, 14, 31),
(15, 14, 41),
(18, 17, 31);

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `vragen`
--

CREATE TABLE `vragen` (
  `id` int(11) NOT NULL,
  `vraag` varchar(1000) NOT NULL,
  `antwoord` varchar(500) NOT NULL,
  `opleidingId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexen voor geëxporteerde tabellen
--

--
-- Indexen voor tabel `opleiding`
--
ALTER TABLE `opleiding`
  ADD PRIMARY KEY (`id`);

--
-- Indexen voor tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indexen voor tabel `user_opleiding`
--
ALTER TABLE `user_opleiding`
  ADD PRIMARY KEY (`id`);

--
-- Indexen voor tabel `vragen`
--
ALTER TABLE `vragen`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT voor geëxporteerde tabellen
--

--
-- AUTO_INCREMENT voor een tabel `opleiding`
--
ALTER TABLE `opleiding`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT voor een tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT voor een tabel `user_opleiding`
--
ALTER TABLE `user_opleiding`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT voor een tabel `vragen`
--
ALTER TABLE `vragen`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
