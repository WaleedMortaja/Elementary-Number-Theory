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
tid NUMBER(5) REFERENCES teacher(tid),
PRIMARY KEY (name,exam_date)
);

CREATE TABLE student_exam(
sid NUMBER(5) REFERENCES student(sid),
ename VARCHAR2(30) ,
exam_date DATE,
grade NUMBER(3) NOT NULL,
PRIMARY KEY(sid ,ename,exam_date),
FOREIGN KEY (ename,exam_date ) REFERENCES exam (name,exam_date)
);

CREATE TABLE  exam_questions(
q_txt VARCHAR2(200) NOT NULL,
q_answer VARCHAR2(200) NOT NULL,
q_number NUMBER(3) NOT NULL,
ename VARCHAR2(30) ,
exam_date DATE,
FOREIGN KEY (ename,exam_date ) REFERENCES exam ( name,exam_date )
);


CREATE TABLE teacher_students(
tid NUMBER(5) REFERENCES teacher(tid),
sid NUMBER(5) REFERENCES student(sid),
study_year NUMBER(4),
PRIMARY KEY ( tid , sid , study_year)
);






--- add some entries
insert into teacher values (30001 , '1' , 'Ahmed');
insert into teacher values (30002 , '2' , 'Ali');

insert into exam values ('Quiz_1',sysdate,30001);
insert into exam values ('Quiz_2',sysdate,30002);

insert into student values (10001 , '1' , 'Salem');
insert into student values (10002 , '2' , 'Khaled');

insert into teacher_students values (30001 , 10001, 2017);
insert into teacher_students values (30001 , 10002, 2016);
insert into teacher_students values (30002 , 10001, 2017);

