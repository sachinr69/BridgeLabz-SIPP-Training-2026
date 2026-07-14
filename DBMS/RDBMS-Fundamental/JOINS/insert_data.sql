INSERT INTO continents(continent_name)
VALUES
('Asia'),
('North America'),
('Europe');

INSERT INTO countries(country_name,continent_id,population)
VALUES
('India',1,1380004385),
('USA',2,331002651),
('UK',3,67886011);

INSERT INTO covid_cases(country_id,report_date,confirmed_cases,deaths,recoveries)
VALUES
(1,'2021-06-01',28000000,330000,26000000),
(2,'2021-06-01',33300000,595000,27000000),
(3,'2021-06-01',4500000,128000,4300000);

INSERT INTO covid_deaths(country_id,report_date,total_deaths)
VALUES
(1,'2021-06-01',330000),
(2,'2021-06-01',595000),
(3,'2021-06-01',128000);

INSERT INTO covid_vaccines(country_id,report_date,vaccination_status)
VALUES
(1,'2021-06-01','Fully Vaccinated'),
(2,'2021-06-01','Partially Vaccinated');

