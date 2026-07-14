CREATE DATABASE covid_db;
USE covid_db;
CREATE TABLE countries (
    country_id INT AUTO_INCREMENT PRIMARY KEY,
    country_name VARCHAR(50),
    continent_id INT,
    population BIGINT
);

CREATE TABLE continents (
    continent_id INT AUTO_INCREMENT PRIMARY KEY,
    continent_name VARCHAR(50)
);

CREATE TABLE covid_cases (
    case_id INT AUTO_INCREMENT PRIMARY KEY,
    country_id INT,
    report_date DATE,
    confirmed_cases INT,
    deaths INT,
    recoveries INT,
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);

CREATE TABLE covid_deaths (
    death_id INT AUTO_INCREMENT PRIMARY KEY,
    country_id INT,
    report_date DATE,
    total_deaths INT,
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);

CREATE TABLE covid_vaccines (
    vaccine_id INT AUTO_INCREMENT PRIMARY KEY,
    country_id INT,
    report_date DATE,
    vaccination_status VARCHAR(30),
    FOREIGN KEY (country_id) REFERENCES countries(country_id)
);

