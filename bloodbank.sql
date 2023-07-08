-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2020 at 03:42 PM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bloodbank`
--

-- --------------------------------------------------------

--
-- Table structure for table `bloodpackets`
--

CREATE TABLE `bloodpackets` (
  `Packets` int(255) NOT NULL,
  `Group` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bloodpackets`
--

INSERT INTO `bloodpackets` (`Packets`, `Group`) VALUES
(4, 'A'),
(3, 'A-'),
(1, 'AB'),
(1, 'AB-'),
(4, 'B'),
(2, 'B-'),
(2, 'O'),
(1, 'O-');

-- --------------------------------------------------------

--
-- Table structure for table `buyers`
--

CREATE TABLE `buyers` (
  `No` int(255) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Mobile` bigint(255) NOT NULL,
  `Bloodgroup` varchar(10) NOT NULL,
  `Date` date NOT NULL,
  `Address` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buyers`
--

INSERT INTO `buyers` (`No`, `Name`, `Mobile`, `Bloodgroup`, `Date`, `Address`) VALUES
(101, 'yogendra', 7894561230, 'O-', '2020-01-01', 'gopakl				'),
(123456, 'gopal', 7893970521, 'O', '2020-01-23', 'jhgjhgjgjguiguyggyhgjjhgjhgjhgjhgjhgjhjhgjgjhg');

-- --------------------------------------------------------

--
-- Table structure for table `doners`
--

CREATE TABLE `doners` (
  `No` int(255) NOT NULL,
  `donorname` varchar(50) NOT NULL,
  `country` varchar(50) NOT NULL,
  `date` date NOT NULL,
  `bloodgroup` varchar(20) NOT NULL,
  `city` varchar(50) NOT NULL,
  `sex` varchar(20) NOT NULL,
  `mobile` bigint(255) NOT NULL,
  `age` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doners`
--

INSERT INTO `doners` (`No`, `donorname`, `country`, `date`, `bloodgroup`, `city`, `sex`, `mobile`, `age`) VALUES
(101, 'madan lal', 'Pakistan', '2019-12-31', 'B', 'loonakaransar', 'Other', 7891397052, 20),
(102, 'bhanuu ', 'Oman', '2019-12-06', 'A-', 'bikaner', 'Female', 8209901909, 20),
(103, 'kamal', 'Kazakhstan', '2019-12-18', 'O', 'nagour', 'Other', 9413535735, 30),
(104, 'ajay sharma', 'Uganda', '1982-12-16', 'A-', 'bikaner', 'Other', 9009009009800, 100),
(105, 'rohit', 'Angola', '2019-12-10', 'B-', 'bikaner', 'Female', 12, 16),
(106, 'aditi', 'Antigua and Barbuda', '2019-12-13', 'A-', 'shahwa', 'Other', 9413537793, 18),
(107, 'shrikant', 'Burkina Faso', '2019-12-18', 'AB-', 'nokha ', 'Male', 8211034220, 65),
(108, 'pawan singh', 'Andorra', '2019-12-25', 'O', 'lakhawar', 'Other', 9009009006, 20),
(109, 'golu', 'Jamaica', '2020-01-02', 'A', 'bikaner', 'Female', 7891397052, 20),
(110, 'Golu', 'Colombia', '2020-01-02', 'A', 'Bikaner', 'Female', 8209901909, 22),
(111, 'Golu', 'Jamaica', '2020-01-02', 'A', 'Bikaner', 'Female', 7891381231, 20),
(112, 'selly', 'Belgium', '2020-01-10', 'A', 'nokha', 'Female', 9000222122, 20),
(113, 'binu', 'Laos', '2020-01-09', 'B', 'louna', 'Other', 1236544789, 21),
(114, 'harshikh', 'Dominica', '2020-01-16', 'AB', 'bikaner', 'Female', 1234567899, 20),
(115, 'kavi', 'Lebanon', '2020-01-09', 'B', 'loonakaransar', 'Female', 2222222222, 32),
(116, 'gopu', 'Algeria', '2020-01-02', 'B', 'bikaner', 'Female', 4561237891, 23),
(117, 'anni', 'Algeria', '2020-01-02', 'O-', 'chomu', 'Female', 7894561233, 63),
(120, 'mohan', 'Qatar', '2020-01-02', 'O-', 'yono', 'Male', 1234567890, 55),
(204, 'Kailash sharma ', 'Albania', '2018-12-31', 'B-', 'sindhu morkhana ', 'Male', 81084467621, 21),
(123456, 'dinesh', 'India', '2019-12-27', 'O', 'bikaner', 'Male', 9649069917, 19);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bloodpackets`
--
ALTER TABLE `bloodpackets`
  ADD UNIQUE KEY `Group` (`Group`);

--
-- Indexes for table `buyers`
--
ALTER TABLE `buyers`
  ADD PRIMARY KEY (`No`),
  ADD UNIQUE KEY `No` (`No`);

--
-- Indexes for table `doners`
--
ALTER TABLE `doners`
  ADD UNIQUE KEY `No` (`No`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
