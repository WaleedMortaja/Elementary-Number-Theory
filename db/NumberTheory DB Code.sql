--NUMBER THEORY DATABASE
create table student (
student_id NUMBER(5) PRIMARY KEY,
student_password VARCHAR2(30) NOT NULL,
student_name VARCHAR2(50) NOT NULL,
CONSTRAINT stdn_id_chk CHECK (student_id >10000 and student_id<20000)
);

CREATE TABLE teacher(
teacher_id NUMBER(5) PRIMARY KEY,
teacher_password VARCHAR2(30) NOT NULL,
teacher_name VARCHAR2(50) NOT NULL,
CONSTRAINT tchr_id_chk CHECK (teacher_id >30000 and teacher_id<40000)
);

CREATE TABLE exam (
exam_name VARCHAR2(30),
exam_date DATE,
teacher_id NUMBER(5) REFERENCES teacher(teacher_id) NOT NULL,
duration NUMBER(3) NOT NULL,
PRIMARY KEY (exam_name,exam_date,teacher_id)
);

CREATE TABLE student_exams(
student_id NUMBER(5) REFERENCES student(student_id) NOT NULL,
exam_name VARCHAR2(30) NOT NULL,
exam_date DATE NOT NULL,
teacher_id NUMBER(5) NOT NULL,
grade NUMBER(3) NOT NULL,
PRIMARY KEY(student_id ,exam_name,exam_date),
FOREIGN KEY (exam_name,exam_date,teacher_id ) REFERENCES exam (exam_name,exam_date,teacher_id)
);

CREATE TABLE exam_questions(
question_text VARCHAR2(200) NOT NULL,
question_number NUMBER(3) NOT NULL,
exam_name VARCHAR2(30) NOT NULL,
exam_date DATE NOT NULL,
teacher_id NUMBER(5) NOT NULL,
PRIMARY KEY (question_number , exam_name,exam_date, teacher_id),
FOREIGN KEY (exam_name,exam_date ,teacher_id) REFERENCES exam ( exam_name,exam_date ,teacher_id),
CONSTRAINT exm_qstion_num_chk CHECK (question_number>0)
);


CREATE TABLE teacher_students(
student_id NUMBER(5) REFERENCES student(student_id) NOT NULL,
study_year NUMBER(4) NOT NULL,
teacher_id NUMBER(5) REFERENCES teacher(teacher_id) NOT NULL,
PRIMARY KEY ( student_id , study_year)
);






--- add some entries
insert into teacher values (30001 , '1' , 'Ahmed');
insert into teacher values (30002 , '2' , 'Ali');

insert into exam values ('Quiz_1',date '2017-12-30',30001  , 10);
insert into exam values ('Quiz_1',date '2018-12-30',30001  , 20);
insert into exam values ('Quiz_2',date '2018-11-24',30001  , 20);
insert into exam values ('Final',date '2018-12-31',30001   , 120);
insert into exam values ('Quiz_1',date '2018-10-11',30002  , 15);
insert into exam values ('Midterm',date '2019-01-04',30002 , 30);

insert into student values (10001 , '1' , 'Salem');
insert into student values (10002 , '2' , 'Khaled');

insert into teacher_students values (10001, 2017,30001);
insert into teacher_students values (10002, 2017,30001);
insert into teacher_students values (10001, 2018,30001);
insert into teacher_students values (10002, 2018,30002);

insert into student_exams values (10001,'Quiz_1',date'2018-12-30',30001,87);

insert into exam_questions values ('test Question', 1, 'Quiz_1', to_date('30-12-2018','dd-mm-yyyy'), 30001);

commit;
