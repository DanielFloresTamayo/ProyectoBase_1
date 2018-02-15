-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-02-2018 a las 03:44:05
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `compras`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes1`
--

CREATE TABLE IF NOT EXISTS `clientes1` (
  `cod_cli` varchar(20) NOT NULL,
  `nom_cli` varchar(15) NOT NULL,
  `apel_cli` varchar(15) NOT NULL,
  `sexo_cli` varchar(10) NOT NULL,
  `tel_cli` int(10) NOT NULL,
  `ruc_cli` int(20) NOT NULL,
  `email_cli` varchar(20) NOT NULL,
  `dir_cli` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes1`
--

INSERT INTO `clientes1` (`cod_cli`, `nom_cli`, `apel_cli`, `sexo_cli`, `tel_cli`, `ruc_cli`, `email_cli`, `dir_cli`) VALUES
('CC0001', 'Evelin', 'Mosquera', 'Femenino', 255589454, 172113008, 'evelin@hotmail.com', 'Guamani'),
('CC0002', 'Andres', 'Mejia', 'Masculino', 25584884, 123456789, 'andres@hotmail.com', 'Quito');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallefactura1`
--

CREATE TABLE IF NOT EXISTS `detallefactura1` (
  `des_pro` varchar(10) NOT NULL,
  `cant_pro` int(10) NOT NULL,
  `pre_unit` decimal(10,0) NOT NULL,
  `pre_tot` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura1`
--

CREATE TABLE IF NOT EXISTS `factura1` (
  `num_fac` int(10) NOT NULL,
  `subtotal` decimal(10,0) NOT NULL,
  `igv` int(10) NOT NULL,
  `total` decimal(10,0) NOT NULL,
  `fec_fac` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos1`
--

CREATE TABLE IF NOT EXISTS `productos1` (
  `cod_pro` varchar(15) NOT NULL,
  `descripcion` varchar(15) NOT NULL,
  `precio` int(10) NOT NULL,
  `Stock` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes1`
--
ALTER TABLE `clientes1`
 ADD PRIMARY KEY (`cod_cli`);

--
-- Indices de la tabla `factura1`
--
ALTER TABLE `factura1`
 ADD PRIMARY KEY (`num_fac`);

--
-- Indices de la tabla `productos1`
--
ALTER TABLE `productos1`
 ADD PRIMARY KEY (`cod_pro`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
