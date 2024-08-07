 /*
	1. DBMS : DataBase Management System,  데이터베이스를 관리하고 데이터를 저장, 검색, 수정, 삭제하는 데 사용되는 소프트웨어 시스템
    2. RDBMS / NoSQL
      - Relational DataBase Management System : 관계형 데이터베이스를 생성, 업데이트, 관리하는 데 사용하는 프로그램(MySQL 등등)
      - Not only SQL : SQL만을 사용하지 않는 데이터베이스 관리 시스템(DBMS)을 지칭하는 단어,
					   관계형 데이터베이스를 사용하지 않는다는 의미가 아닌, 여러 유형의 데이터베이스를 사용하는 것
    3. DBMS 시스템을 활용했을 시, File-System 사용 대비 장점은?
      - 데이터 무결성 : DBMS는 데이터의 일관성과 무결성을 유지하는 다양한 제약 조건과 트랜잭션 관리 기능을 제공
	  - 데이터 중복 최소화 : DBMS는 데이터를 구조화된 방식으로 저장하여 중복을 줄이고 저장 공간을 효율적으로 사용
	  - 동시성 제어 : 여러 사용자가 동시에 데이터를 접근, 수정할 수 있도록 동시성 제어 기능을 제공
	  - 백업 및 복구 : DBMS는 데이터 백업과 복구 기능을 제공하여 데이터 손실을 방지
	  - 보안 : 데이터 접근 제어 및 권한 관리 기능을 통해 데이터를 보호
    4. 네트워크? LAN?
      - 네트워크 : 컴퓨터와 기타 장치들이 서로 연결되어 데이터를 주고받을 수 있는 시스템
      - LAN : 좁은 지역(예: 건물, 사무실, 학교 등) 내에서 장치들을 연결하는 네트워크
    5. IP 주소? Port 번호? 
      - IP 주소 : 인터넷 프로토콜 주소로, 네트워크에 연결된 장치들을 식별하는 고유한 주소
      - Port 번호 : 네트워크에서 장치들끼리 통신을 하기 위한 고유 번호
    6. Client - Server Model
      - 네트워크 아키텍처로, 클라이언트는 서비스를 요청하고 서버는 클라이언트에게 서비스를 제공하는 역할을 함
        클라이언트는 사용자 인터페이스를 제공하고, 서버는 데이터와 애플리케이션 로직을 관리
    7. Table? Row? Column?
      - Table : 데이터베이스에서 데이터를 저장하는 구조화된 형태의 데이터 집합
	  - Row(행) : 테이블 내의 개별 레코드
	  - Column(열) : 테이블 내에서 특정한 데이터 속성을 나타냄
    8. 고정 길이 문자열과 가변 길이 문자열 타입은? 그리고 차이점은?
      - 고정 길이 문자열 : 설정한 범위만큼의 문자열 길이를 고정적으로 갖고 있음, 입력값이 고정 길이보다 작더라도 무조건 설정한 범위의 길이로 설정됨
      - 가변 길이 문자열 : 실제 데이터 길이에 따라 저장 공간을 갖고 있음
	  - 차이점 : 고정 길이는 더 많은 공간을 낭비할 수 있으나 조회 성능이 더 우수할 수 있음
    9. SQL? Structunal Query Language
     9-1. DML? DDL? 
       - DML(Data Manipulation Language) : 정의된 DB에 입력된 레코드를 조회하거나 수정하거나 삭제하는 등의 역할,  Select, Insert, update, delete
       - DDL (Data Definition Language) : DB 구조 정의하는데 사용, Create, drop, alter, truncate
*/
CREATE TABLE IF NOT EXISTS Subway (
    code int,
    city VARCHAR(20),
    date VARCHAR(11),
    cardFee INT,
    moneyFee INT
);
drop table subway;
desc Subway;

insert into Subway values (1, '서울','2024-06-30',1400,1500),
	(2, '부산','2024-06-30',1600,1700),
    (3, '대구','2024-06-30',1500,1700),
	(4, '인천','2024-06-30',1400,1500),
    (5, '광주','2024-06-30',1250,1400),
    (6, '대전','2024-06-30',1550,1700);

select * from subway;
select *,moneyfee-cardfee as "현금가-카드가" from subway;