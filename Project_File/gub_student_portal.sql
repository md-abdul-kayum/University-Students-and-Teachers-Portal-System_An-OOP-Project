-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 18, 2022 at 07:55 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 7.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gub_student_portal`
--

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `student_id` varchar(30) NOT NULL,
  `course_id` varchar(15) NOT NULL,
  `course_name` varchar(30) NOT NULL,
  `credit` varchar(10) NOT NULL,
  `section` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`student_id`, `course_id`, `course_name`, `credit`, `section`) VALUES
('201002334', 'CSE 210', 'Database System Lab', '1.5', 'DJ'),
('201002300', 'CSE 210', 'Database System Lab', '1.5', 'DB'),
('201002300', 'CSE 210', 'Database System Lab', '1.5', 'DB'),
('201002324', 'CSE 210', 'Database System Lab', '1.5', 'DF'),
('201002334', 'CSE-201', 'OOP', '3', 'DB');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `student_id` varchar(15) NOT NULL,
  `student_name` varchar(30) NOT NULL,
  `Course` varchar(30) NOT NULL,
  `ct1` varchar(15) NOT NULL,
  `ct2` varchar(15) NOT NULL,
  `ct3` varchar(15) NOT NULL,
  `mid` varchar(15) NOT NULL,
  `final` varchar(15) NOT NULL,
  `assignment` varchar(15) NOT NULL,
  `Total` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`student_id`, `student_name`, `Course`, `ct1`, `ct2`, `ct3`, `mid`, `final`, `assignment`, `Total`) VALUES
('334', 'Kaiyum', 'CSE-201', '12', '11', '13', '25', '32', '12', '81'),
('123', 'abc', 'cse', '11', '12', '13', '25', '32', '12', '81'),
('123', 'abc', 'cse', '11', '12', '13', '25', '32', '12', '81'),
('201222', 'Arafat', 'eee', '12', '14', '11', '28', '38', '13', '91.333333333333'),
('1', 'q', 'a', '12', '11', '13', '23', '26', '12', '73'),
('2131', 'gchgfhg', 'cse', '5', '4', '3', '1', '0', '2', '7'),
('201002334', 'Md. Abdul Kaiyum', 'CSE-210', '13', '12', '9', '23', '32', '13', '79.333333333333');

--
-- Triggers `result`
--
DELIMITER $$
CREATE TRIGGER `Total_calculation` BEFORE INSERT ON `result` FOR EACH ROW BEGIN
set new.total=new.final+new.mid+new.assignment+((new.ct1+new.ct2+new.ct3)/3);
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `student_info`
--

CREATE TABLE `student_info` (
  `ID` varchar(15) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Department` varchar(15) NOT NULL,
  `Phone` varchar(15) NOT NULL,
  `Mail` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_info`
--

INSERT INTO `student_info` (`ID`, `Name`, `Department`, `Phone`, `Mail`) VALUES
('201002334', 'Abdul Kaiyum', 'CSE', '1961859445', 'kaiyum.gub@gmai');

-- --------------------------------------------------------

--
-- Table structure for table `student_login`
--

CREATE TABLE `student_login` (
  `id` varchar(15) NOT NULL,
  `pass` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_login`
--

INSERT INTO `student_login` (`id`, `pass`) VALUES
('201002334', 'kaiyum334');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_evaluation`
--

CREATE TABLE `teacher_evaluation` (
  `T_id` varchar(255) NOT NULL,
  `Teacher_name` varchar(30) NOT NULL,
  `Course` varchar(15) NOT NULL,
  `Marks` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher_evaluation`
--

INSERT INTO `teacher_evaluation` (`T_id`, `Teacher_name`, `Course`, `Marks`) VALUES
('1', 'Shahela Akter', 'EEE 203', '10');

--
-- Triggers `teacher_evaluation`
--
DELIMITER $$
CREATE TRIGGER `marks_to_teacher_info` BEFORE INSERT ON `teacher_evaluation` FOR EACH ROW BEGIN
update teacher_info set Marks=new.marks where T_id=new.T_id and Course=new.Course;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `teacher_info`
--

CREATE TABLE `teacher_info` (
  `T_id` varchar(255) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Course` varchar(15) NOT NULL,
  `Phone` varchar(15) NOT NULL,
  `Mail` varchar(30) NOT NULL,
  `Marks` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher_info`
--

INSERT INTO `teacher_info` (`T_id`, `Name`, `Course`, `Phone`, `Mail`, `Marks`) VALUES
('0', 'Mahmuda Rahman', 'CSE 210', '01747676507', 'mahmuda.cse@gmail.com', ''),
('1', 'Shahela Akter', 'EEE 203', '017********', 'shahela.eee@gmail.com', '10');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_login`
--

CREATE TABLE `teacher_login` (
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `question` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher_login`
--

INSERT INTO `teacher_login` (`username`, `password`, `question`) VALUES
('Mahmuda Rahman', '201002334', 'Pizza');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
