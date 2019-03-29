-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Gegenereerd op: 29 mrt 2019 om 14:32
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
-- Tabelstructuur voor tabel `antwoorden`
--

CREATE TABLE `antwoorden` (
  `id` int(11) NOT NULL,
  `antwoord` varchar(10000) NOT NULL,
  `vraagId` int(11) NOT NULL,
  `userId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `meerkeuzevraag`
--

CREATE TABLE `meerkeuzevraag` (
  `id` int(11) NOT NULL,
  `kueze` text NOT NULL,
  `vraagId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `meerkeuzevraag`
--

INSERT INTO `meerkeuzevraag` (`id`, `kueze`, `vraagId`) VALUES
(4, 'leuk,heel leuk', 23),
(5, 'leuk,heel leuk', 25);

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
(28, 'FRONT-END DEVELOPER', 'CORDA 1', '2019-05-12'),
(29, 'BUSINESS ANALYSTS', 'CORDA 1', '2019-06-12'),
(30, 'SCRUM MASTER', 'CORDA 1', '2019-07-12'),
(31, 'JAVA DEVELOPER', 'CORDA 1', '2019-08-12'),
(32, 'JUNIOR FUNCTIONAL ANALYST', 'CORDA 3', '2019-09-12'),
(34, 'APPLICATION DEVELOPER', 'CORDA 3', '2019-11-12'),
(35, 'DIGITAL MARKETEER', 'CORDA 4', '2019-11-12'),
(36, 'HYBRIS DEVELOPER', 'CORDA 1', '2019-12-12');

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
(13, 'admin', 'Kiran', 'Singh', '', '', 'singh', 'singh', 'singh@singh.com', 0);

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `user_opleiding`
--

CREATE TABLE `user_opleiding` (
  `id` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `opleidingId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `vragen`
--

CREATE TABLE `vragen` (
  `id` int(11) NOT NULL,
  `vraag` text NOT NULL,
  `vraagSoort` varchar(1000) NOT NULL,
  `opleidingId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `vragen`
--

INSERT INTO `vragen` (`id`, `vraag`, `vraagSoort`, `opleidingId`) VALUES
(24, 'Was het leuk?', 'ja-nee', 28),
(25, 'Hoe was het?', 'meerkeuze', 28),
(26, 'Vertel nog wat over u zelf.', 'open-vraag', 28);

--
-- Indexen voor geëxporteerde tabellen
--

--
-- Indexen voor tabel `antwoorden`
--
ALTER TABLE `antwoorden`
  ADD PRIMARY KEY (`id`);

--
-- Indexen voor tabel `meerkeuzevraag`
--
ALTER TABLE `meerkeuzevraag`
  ADD PRIMARY KEY (`id`);

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
-- AUTO_INCREMENT voor een tabel `antwoorden`
--
ALTER TABLE `antwoorden`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT voor een tabel `meerkeuzevraag`
--
ALTER TABLE `meerkeuzevraag`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT voor een tabel `opleiding`
--
ALTER TABLE `opleiding`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT voor een tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT voor een tabel `user_opleiding`
--
ALTER TABLE `user_opleiding`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT voor een tabel `vragen`
--
ALTER TABLE `vragen`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
