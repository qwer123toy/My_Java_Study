
CREATE TABLE GREENMEMBER(
	MEM_NO INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(10),
    PHONENUMBER VARCHAR(15)
    );

CREATE TABLE HOBBY(
	NO INT PRIMARY KEY AUTO_INCREMENT,
    HOBBY VARCHAR(10)
    );


CREATE TABLE HOBBY(
    HOBBY VARCHAR(10) PRIMARY KEY
    );


    
create table if not exists membersHobbys(
memID int,
hobbyID int,
foreign key(memID) references GREENMEMBER (MEM_NO),
foreign key(hobbyID) references HOBBY (NO)
);

drop table membershobbys;

drop table HOBBY;
drop table greenmember;

drop table membersHobbys;
SELECT * FROM HOBBY;
SELECT * FROM greenmember;
select * from membersHobbys;

insert into membersHobbys values(1,1),(1,2),(2,2),(3,2),
			(3,1),(3,3),(4,3),(4,4),(5,5),(5,6),(6,7);


INSERT INTO HOBBY(HOBBY) VALUES('바둑'),('낚시'),('게임'),('음악감상'),('영화감상'),('드라이브'),('없음');
insert into greenmember(NAME, phonenumber) 
	values ('Tom', '010-123'),
		('Brad', '010-456'),('Alex', '010-789'),('Choi', '010-111'),
        ('Park', '010-222'),('Kim', '010-333');

insert into greenmember(name, phonenumber, mem_hobby) 
	values ('Tom', '010-123','바둑'),('Tom', '010-123','낚시'),
		('Brad', '010-456','낚시'),('Alex', '010-789','낚시'),('Alex', '010-789','바둑'),
        ('Alex', '010-789','게임'),('Choi', '010-111','게임'),('Choi', '010-111','음악감상'),
        ('Park', '010-222','영화감상'),('Park', '010-222','드라이브'),('Kim', '010-333',NULL);