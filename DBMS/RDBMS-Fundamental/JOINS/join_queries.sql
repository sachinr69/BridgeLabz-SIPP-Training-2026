SELECT c.country_name,
       cc.confirmed_cases
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id=c.country_id
WHERE report_date='2021-06-01'
ORDER BY confirmed_cases DESC
LIMIT 1;

SELECT c.country_name,
       d.total_deaths,
       v.vaccination_status
FROM covid_deaths d
LEFT JOIN covid_vaccines v
ON d.country_id=v.country_id
AND d.report_date=v.report_date
INNER JOIN countries c
ON d.country_id=c.country_id;