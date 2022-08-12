CREATE TABLE ADMINISTRATOR (
    USERNAME VARCHAR2(20 BYTE) NOT NULL,
    PASSWORD VARCHAR2(20 BYTE),
    BIRTHDATE DATE,
    CONSTRAINT ADMINISTRATOR_PKPRIMARY primary KEY (USERNAME)
);

CREATE TABLE APPOINTMENT (
    APPOINTMENT_ID  VARCHAR2(20 BYTE) NOT NULL,
    TIME_ID VARCHAR2(20 BYTE),
    APPOINTMENT_DATE DATE,
    DOCTOR_SSN VARCHAR2(20 BYTE),
    PATIENT_SSN VARCHAR2(20 BYTE),
    SECRETARY_SSN VARCHAR2(20 BYTE), 
    CONSTRAINT APPOINTMENT_PK PRIMARY KEY (APPOINTMENT_ID)
);

  CREATE TABLE EMPLOYEE(
     SSN VARCHAR2(20 BYTE) NOT NULL , 
	 FNAME VARCHAR2(20 BYTE), 
     MINIT VARCHAR2(20 BYTE), 
	 LNAME VARCHAR2(20 BYTE), 
	 BIRTH_DATE DATE, 
	 EMAIL_ADDRESS VARCHAR2(20 BYTE), 
	 CONTACT_NUMBER NUMBER, 
	 USERNAME VARCHAR2(20 BYTE), 
	 PASSWORD VARCHAR2(20 BYTE), 
	 DOC_SEC_STAFF_FLAG VARCHAR2(20 BYTE), 
	 DOCTOR_SEC_NAME VARCHAR2(20 BYTE), 
	 CONSTRAINT EMPLOYEE_PK PRIMARY KEY (SSN)
);
CREATE TABLE PATIENT(	
     SSN VARCHAR2(20 BYTE) NOT NULL , 
	 FNAME VARCHAR2(20 BYTE), 
	 MINIT VARCHAR2(20 BYTE), 
	 LNAME VARCHAR2(20 BYTE), 
	 BIRTH_DATE DATE, 
	 CONTACT_NUMBER NUMBER, 
	 CONSTRAINT PATIENT_PK PRIMARY KEY (SSN)
);
  CREATE TABLE SECTION (	
     SECTION_NAME VARCHAR2(20 BYTE) NOT NULL , 
	 SECTION_NUM VARCHAR2(20 BYTE), 
	 SECRETARY_SSN VARCHAR2(20 BYTE), 
	 CONSTRAINT SECTION_PK PRIMARY KEY (SECTION_NAME)
);
CREATE TABLE TIMES(	
     TIME_ID VARCHAR2(20 BYTE) NOT NULL , 
	 DAY VARCHAR2(20 BYTE), 
	 START_HOUR NUMBER (24,0), 
	 END_HOUR NUMBER (24,0), 
	 DOCTOR_SSN VARCHAR2(20 BYTE), 
	 CONSTRAINT TIMES_PK PRIMARY KEY (TIME_ID)
);

INSERT INTO APPOINTMENT (APPOINTMENT_ID,TIME_ID,APPOINTMENT_DATE,DOCTOR_SSN,PATIENT_SSN,SECRETARY_SSN)
VALUES('3','4',15-NOV-2021,'11923','1189','11927'),
('4','3',12-DEC-2020,'1194','1188','11926'),
('5','1',06-JAN-2009,'1195','1184','11927'),
('1','1',02-NOV-2021,'1194','1183','1193'),
('2','2',05-NOV-2021,'11920','1184','1192');

INSERT INTO SECTION(SECTION_NAME,SECTION_NUM,SECRETARY_SSN)
VALUES('Radiology','11','11926'),
('First aid 12','11927','11926'),
('Nutrition','13','11928'),
('Pathology','2','1193'),
('Surgery 1','1192'),
('Breast screening','3','1196'),
('Cardiology','4','1197'),
('Critical care','5','1198'),
('Diagnostic imaging','6','1199'),
('ENT','7','11910'),
('Gastroenterology','8','11911'),
('Haematology','9','11912'),
('Ophthalmology','10','11913');

INSERT INTO TIMES(TIME_ID,DAY,START_HOUR,END_HOUR,DOCTOR_SSN)
VALUES('1','Sunday','9','4','1194'),
('2','Monday','6','10','1191'),
('3','Tuesday','5','8','11920'),
('4','Friday','4','8','11918');

INSERT INTO PATIENT(SSN,FNAME,MINIT,LNAME,BIRTH_DATE,CONTACT_NUMBER)
VALUES('1185','Samer','S','Sameer',15-NOV-1998,0589632145),
('1186','Duha','F','Sadeq',12-oct-1989,0582369541),
('1187','Sami','Q','Sameer',10-may-2000,0598523693),
('1188','Tamer','K','Okal',05-jan-2001,0589632159),
('1189','Sadeq','D','Rehbi',02-jul-2001,0569631532),
('118100','Aysam','A','Sawalha',12-NOV-2000,0598961452),
('118101','Sameeha','G','Giller',10-jun-1989,04859631256),
('1181','Sondos','Q','Hijab',09-oct-2001,0593907273n),
('1182','Ahmad','K','Hijaz',02-oct-1985,0582369654),
('1183','Samer','L','Rami',14-may-2002,0541285639),
('1184','Sadeq','L','Malek',11-oct-2001,0526398547);

INSERT INTO ADMINISTRATOR(USERNAME,PASSWORD,BIRTHDATE)
VALUES('Sondos','910200',09-oct-2002),
('Zaina','910201',12-nov-2000);

INSERT INTO EMPLOYEES(SSN,FNAME,MINIT,LNAME,BIRTH_DATE,EMAIL_ADDRESS,CONTACT_NUMBER,USERNAME,PASSWORD,DOCTOR_SEC_STAFF_FLAG,DOCTOR_SEC_NAME)
VALUES('11919','Alaa','V','Qaraali',30-nov-1969,'alaa@gmail.com',0102305891,'khaled',khaled@1,'doc','ENT'),
('1194','Ali','K','Odeh',04-jul-1987,'ali@gmail.com',0458962586,'aliOdeh','ali@1','doc','Pathology'),
('1193','Amr','G','Hasan',05-oct-1989,'amr@gmail.com',0589641258,'amrHasan','amr@1','sec'),
('1194','Aseel','K','Tahseen',01-jan-2001,'aseel@gmail.com',0581296315,'aseel','aseel@1','sec'),
('11917','Aya','T','Kharaz',06-mar-1989,'aya@gmail.com',0452369852,'aya','aya@1','doc','Pathology'),
('11916','Ayham','S','Mismar',01-jan-2001,'ayham@gmail.com',01028563325,'ayham','ayham@1','doc','Cardiology'),
('11922','Duha','Y','Basel',14-nov-1978,'duha@gmail.com',010285632569,'duha','duha@1','doc','Ophthalmology'),
('11910','Eleen','M','Tamer',06-mar-1989,'eleen@gmail.com',0589631258,'eleen','eleen@1','sec'),
('11928','Fadi','K','Saleh',14-jun-2000,'fadi@gmail.com',0485369752,'fadiSaleh','fadiS@1','sec'),
('11923','Jafar','G','Atout',12-oct-2001,'jafar@gmail.com',0594259813,'jafarAtout','jafarA@1','doc','Cardiology'),
('1196','Khaled','L','Omar',02-oct-1969,'khaled@gmail.com',0596325874,'khaledOmar','khaled@1','sec'),
('1199','Lama','L','Sawalha',05-feb-1989,'lama@gmail.com',01289654128,'lama','lama@1','sec'),
('11912','Layan','O','Jaber',09-apr-2001,'layan@gmail.com',01452896352,'layan','layan@1','sec'),
('11911','Leen','N','Omar',07-mar-1978,'leen@gmail.com',04152963285,'leen','leen@1','sec'),
('1191','Loay','L','Hamed',04-oct-1996,'loay@gmail.com',0596328574,'loayHamed','loay@1','doc','Surgery'),
('11927','Loay','J','Saleh',14-jan-2001,'loayJ@gmail.com',0597456325,'loayJ','loayJ@1','sec'),
('1197','Maher','L','Nael',01-jan-2001,'Nael@gmail.com',0594415238,'maherMael','maher@1','sec'),
('11920','Mohammed','W','Soboh',29-jan-2003,'mohammed@gmail.com',0102583694,'mohammed','mohammed@1','doc','ENT'),
('11925','Mostafa','Q','Hijab',14-nov-2005,'mostafa@gmail.com',452783125,'mostafa','mostafa@1','staff'),
('1195','Omar','J','Abd',01-jun-1996,'omarA@gmail.com',0589632145,'omarAbd','omarA@1','staff'),
('11915','Omar','R','Amereh',07-mar-1978,'omar@gmail.com',01255236668,'omar','omar@1','doc','Ophthalmology'),
('11913','Razan','B','Domaidi',10-may-1969,'razan@gmail.com',041253698523,'razan','razan@1','sec'),
('11929','Sawed','M','Maslamani',12-oct-1978,'saed@gmail.com',0458963156,'Saed','Saed@1','sec'),
('11914','Sael','Q','Hawwash',11-jun-1978,'sael@gmail.com',012563258963,'sael','sael@1','doc','Surgery'),
('11926','Sajed','K','Zaher',14-apr-2001,'sajed@gmail.com',0581239645,'sajedZaher','sajedZ@1','sec'),
('11930','Salem','K','Yousef',05-aug-1959,'Salem@gmail.com',0594125813,'Salem','Salem@1','doc','Pathology'),
('11931','Sameer','K','Tamer',12-oct-2005,'sameer@gmail.com',01481526328,'sameer','sameer@1','sec'),
('11924','Sameh','H','Baher',12-nov-2002,'sameh@gmail.com',0581237459,'Sameh','Sameh@1','doc','Surgery'),
('11940','Sondos','L','Kamil',,'sondos@gmail.com',0412859631,'sondos','sondos@1','sec'),
('11921','Sufyan','X','Hijaz',11-oct-2001,'sufyan@gmail.com',010285964523,'sufyan','sufyan@1','doc','Haematology'),
('11918','Taher','U','Jabi',25-oct-2001,'sameer@gmail.com',01025236952,'taher','Taher@1','doc','Cardiology'),
('1192','Tamer','K','Ali',02-nov-1989,'tamer@gmail.com',0452369658,'tamerAli','tamer@1','sec');

create sequence appointmentId
start with 6
increment by 1;

create sequence timeId
start with 15
increment by 1;

ALTER TABLE SECTION
ADD CONSTRAINT FK_SECRETARY_SSN
FOREIGN KEY (SECRETARY_SSN) REFERENCES EMPLOYEE(SSN);

ALTER TABLE APPOINTMENT
ADD CONSTRAINT FK_TIME_ID
FOREIGN KEY (TIME_ID) REFERENCES TIMES (TIME_ID);

ALTER TABLE APPOINTMENT
ADD CONSTRAINT FK_APPOINTMENT_DOCTOR_SSN
FOREIGN KEY (DOCTOR_SSN) REFERENCES EMPLOYEE(SSN);

ALTER TABLE APPOINTMENT
ADD CONSTRAINT FK_APPOINTMENT_SECRETARY_SSN
FOREIGN KEY (SECRETARY_SSN) REFERENCES EMPLOYEE (SSN);

ALTER TABLE APPOINTMENT
ADD CONSTRAINT FK_APPOINTMENT_PATIENT_SSN
FOREIGN KEY (PATIENT_SSN) REFERENCES PATIENT (SSN);


ALTER TABLE EMPLOYEE
ADD CONSTRAINT FK_DOCTOR_SEC_NAME
FOREIGN KEY (DOCTOR_SEC_NAME) REFERENCES SECTION (SECTION_NAME);

ALTER TABLE TIMES
ADD CONSTRAINT FK_DOCTOR_SSN
FOREIGN KEY (DOCTOR_SSN) REFERENCES EMPLOYEE (SSN);

alter table administrator 
ADD CONSTRAINT UC_Password_Admin UNIQUE (password);

alter table section 
ADD CONSTRAINT UC_section_num UNIQUE (section_num);


alter table employee 
ADD CONSTRAINT UC_employee_emailAddress UNIQUE (EMAIL_ADDRESS);

alter table employee 
ADD CONSTRAINT UC_employee_userName UNIQUE (username);

alter table employee 
ADD CONSTRAINT UC_contact UNIQUE (contact_number);

alter table employee 
ADD CONSTRAINT UC_employee_password UNIQUE (password);

alter table appointment 
ADD CONSTRAINT UC_appointment_timeId UNIQUE (time_id);

alter table patient 
ADD CONSTRAINT UC_contactNum UNIQUE (contact_number);

