CREATE TABLE `Passenger` (
  `PassengerID` SERIAL PRIMARY KEY,
  `firstName` VARCHAR(255),
  `LastName` VARCHAR(255),
  `Email` VARCHAR(255),
  `PhoneNumber` VARCHAR(255)
);

CREATE TABLE `Reservation` (
  `ReservationNumber` Serial PRIMARY KEY,
  `PassengerID` INT,
  `BookingDate` Date,
  `HotelID` INT,
  `FlightID` INT,
  `PackageID` int,
  `carid` int
);

CREATE TABLE `Hotel` (
  `HotelID` SERIAL PRIMARY KEY,
  `HotelName` VARCHAR(255),
  `Rating` VARCHAR(255),
  `PhoneNumber` VARCHAR(255),
  `Address` VARCHAR(255),
  `country` VARCHAR(255)
);

CREATE TABLE `Flight` (
  `ArrivalDate` Date,
  `ArrivalAirport` TEXT,
  `FlightID` Serial PRIMARY KEY,
  `DepartureAirport` VARCHAR(255),
  `DepartureDate` Date,
  `FlightNumber` INT
);

CREATE TABLE `Carrental` (
  `CarType` TEXT,
  `carid` Serial PRIMARY KEY,
  `price` float,
  `itinerary` text
);

CREATE TABLE `branch` (
  `BranchID` SERIAL PRIMARY KEY,
  `StaffID` int,
  `address` text,
  `Email` text,
  `PhoneNumber` INT
);

CREATE TABLE `STAFF` (
  `FirstName` text,
  `LastName` text,
  `StaffID` SERIAL PRIMARY KEY,
  `Email` text,
  `BranchID` int,
  `PhoneNumber` int
);

CREATE TABLE `package` (
  `name` text,
  `rating` int,
  `PackageID` SERIAL PRIMARY KEY,
  `price` float
);

ALTER TABLE `Reservation` ADD FOREIGN KEY (`FlightID`) REFERENCES `Flight` (`DepartureAirport`);

ALTER TABLE `Reservation` ADD FOREIGN KEY (`HotelID`) REFERENCES `Hotel` (`HotelID`);

ALTER TABLE `Reservation` ADD FOREIGN KEY (`PassengerID`) REFERENCES `Passenger` (`PassengerID`);

ALTER TABLE `Reservation` ADD FOREIGN KEY (`PackageID`) REFERENCES `package` (`PackageID`);

ALTER TABLE `Reservation` ADD FOREIGN KEY (`carid`) REFERENCES `Carrental` (`carid`);

ALTER TABLE `STAFF` ADD FOREIGN KEY (`BranchID`) REFERENCES `branch` (`BranchID`);
