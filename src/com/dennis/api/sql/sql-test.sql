show tables;

select * from player;
select * from schedule;
select * from stadium;
select * from team;

-- 문제 1
-- 전체 축구팀 목록을 팀이름 오름차순으로 출력하시오
select * from team order by team_name asc;

-- 문제 2
-- 플레이어의 포지션 종류를 나열하시오. 단 중복은 제거하고, 포지션이 없으면 빈공간으로 두시오
select distinct position from player;

-- 문제3
-- 플레이어의 포지션 종류를 나열하시오. 단 중복은 제거하고, 포지션이 없으면 '신입' 으로 기재하시오
select distinct ifnull(nullif(position,''),'신입') from player;

-- 문제 4
-- 수원팀에서 골키퍼(GK)의 이름을 모두 출력하시오. 단 수원팀 ID는 K02 입니다.
select player_name from player
where position = 'GK' and team_id = 'K02';

-- 문제 5
-- 수원팀에서 성이 고씨이고 키가 170 이상인 선수를 출력하시오. 단 수원팀 ID는 K02 입니다.
select player_name from player
where position = 'GK' and team_id = (select team_id from team t where t.region_name = '수원');

-- 문제
select * from player where player_name like '고%' and height >= 170 and team_id = 'K02';

-- 문제
select team_id from team t where t.region_name = '수원';


-- 문제 6
-- 다음 조건을 만족하는 선수명단을 출력하시오
-- 소속팀이 삼성블루윙즈이거나
-- 드래곤즈에 소속된 선수들이어야 하고,
-- 포지션이 미드필더(MF:Midfielder)이어야 한다.
-- 키는 170 센티미터 이상이고 180 이하여야 한다.
select * from player
where team_id in (select team_id
                  from team
                  where team_name = '삼성블루윙즈' or team_name = '드래곤즈') and position = 'MF' and height between 170 and 180 ;


-- 문제 7-- 수원을 연고지로 하는 골키퍼는 누구인가?
SELECT player_name
FROM player
         JOIN team ON player.team_id = team.team_id
WHERE POSITION = 'GK'
  AND region_name = '수원';


-- 문제 8-- 서울팀 선수들 이름, 키, 몸무게 목록으로 출력하시오
-- 키와 몸무게가 없으면 "0" 으로 표시하시오
-- 키와 몸무게는 내림차순으로 정렬하시오
SELECT
    player_name,
    IFNULL(nullif(height, ''), '0') AS height,
    IFNULL(nullif(weight, ''), '0') AS weight
FROM
    player
WHERE
    team_id = (SELECT team_id
               FROM team
               WHERE region_name = '서울')
ORDER BY
    height DESC,
    weight DESC;

-- 문제 9-- 서울팀 선수들 이름과 포지션과--
-- 키(cm표시)와 몸무게(kg표시)와  각 선수의 BMI지수를 출력하시오--
-- 단, 키와 몸무게가 없으면 "0" 표시하시오--
-- BMI는 "NONE" 으로 표시하시오(as bmi)-- 최종 결과는 이름내림차순으로 정렬하시오
select player_name,
       position,
       CONCAT(IFNULL(nullif(height, ''), '0'),'cm') AS height,
       CONCAT(IFNULL(nullif(weight, ''), '0'),'kg') AS weight,
       ifnull(round(weight / ((height / 100) * (height / 100)),1),'NONE') as bmi
from player
where team_id = (select team_id from team where region_name ='서울')
order by player_name desc;
