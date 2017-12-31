--NUMBER THEORY DATABASE
create table student (
sid NUMBER(5) PRIMARY KEY,
s_password VARCHAR2(30) NOT NULL,
name VARCHAR2(50) NOT NULL
);

CREATE TABLE teacher(
tid NUMBER(5) PRIMARY KEY,
t_password VARCHAR2(30) NOT NULL,
name VARCHAR2(50) NOT NULL
);

CREATE TABLE exam (
name VARCHAR2(30),
exam_date DATE,
tid NUMBER(5) REFERENCES teacher(tid) NOT NULL,
duration NUMBER(3) NOT NULL,
PRIMARY KEY (name,exam_date,tid)
);

CREATE TABLE student_exams(
sid NUMBER(5) REFERENCES student(sid) NOT NULL,
ename VARCHAR2(30) NOT NULL,
exam_date DATE NOT NULL,
tid NUMBER(5) NOT NULL,
grade NUMBER(3) NOT NULL,
PRIMARY KEY(sid ,ename,exam_date),
FOREIGN KEY (ename,exam_date,tid ) REFERENCES exam (name,exam_date,tid)
);

CREATE TABLE  exam_questions(
q_txt VARCHAR2(200) NOT NULL,
q_number NUMBER(3) NOT NULL,
ename VARCHAR2(30) NOT NULL,
exam_date DATE NOT NULL,
tid NUMBER(5) NOT NULL,
FOREIGN KEY (ename,exam_date ,tid) REFERENCES exam ( name,exam_date ,tid)
);


CREATE TABLE teacher_students(
sid NUMBER(5) REFERENCES student(sid) NOT NULL,
study_year NUMBER(4) NOT NULL,
tid NUMBER(5) REFERENCES teacher(tid) NOT NULL,
PRIMARY KEY ( sid , study_year)
);






--- add some entries
insert into teacher values (30001 , '1' , 'Ahmed');
insert into teacher values (30002 , '2' , 'Ali');

insert into exam values ('Quiz_1',date'2016-12-30',30001);
insert into exam values ('Quiz_1',date'2017-12-30',30001);
insert into exam values ('Quiz_2',date'2017-11-24',30001);
insert into exam values ('Final',date'2017-12-31',30001);
insert into exam values ('Quiz_1',date '2017-10-11',30002);
insert into exam values ('Midterm',date '2018-01-04',30002);

insert into student values (10001 , '1' , 'Salem');
insert into student values (10002 , '2' , 'Khaled');

insert into teacher_students values (10001, 2016,30001);
insert into teacher_students values (10002, 2016,30001);
insert into teacher_students values (10001, 2017,30001);
insert into teacher_students values (10002, 2017,30002);

insert into student_exams values (10001,'Quiz_1',date'2017-12-30',30001,87);


commit;
