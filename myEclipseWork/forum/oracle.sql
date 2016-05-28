-----------------------------------------------------
-- Export file for user SCOTT                      --
-- Created by Administrator on 2013-3-22, 14:40:23 --
-----------------------------------------------------

spool Êý¾Ý¿â.log

prompt
prompt Creating table CATEGORY
prompt =======================
prompt
create table SCOTT.CATEGORY
(
  ID           NUMBER(6) not null,
  DATECATEGORY DATE,
  DELETED      CHAR(1),
  VERSION      NUMBER(6),
  NAME         VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.CATEGORY
  add constraint CATEPRIMARYKEY primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table BOARD
prompt ====================
prompt
create table SCOTT.BOARD
(
  ID             NUMBER(6) not null,
  DATECREATED    TIMESTAMP(6),
  DELETED        VARCHAR2(4),
  VERSION        NUMBER(6),
  DESCRIPTION    VARCHAR2(255),
  NAME           VARCHAR2(255),
  REPLYCOUNT     NUMBER(6),
  THREADCOUNT    NUMBER(6),
  CATEGORY_ID    NUMBER(6),
  LAST_REPLY_ID  NUMBER(6),
  LAST_THREAD_ID VARCHAR2(4000)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.BOARD
  add constraint BOARD_PK primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.BOARD
  add constraint FK3C6F6C698F6174B foreign key (CATEGORY_ID)
  references SCOTT.CATEGORY (ID);

prompt
prompt Creating table PERSON
prompt =====================
prompt
create table SCOTT.PERSON
(
  ID          NUMBER(6) not null,
  DATECREATED DATE,
  DELETED     CHAR(1),
  account     varchar2(20),
  sex         varchar2(4),
  VERSION     NUMBER(6),
  NAME        VARCHAR2(50),
  birthday    varchar2(50),
  email       varchar2(50),
  ipCreated   varchar2(50),
  dateLastActived DATE,
  ipLastActived   varchar(50),
  PASSWORD    VARCHAR2(50)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.PERSON
  add constraint XX primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table BOARD_ADMINISTRATOR
prompt ==================================
prompt
create table SCOTT.BOARD_ADMINISTRATOR
(
  BOARD_ID  NUMBER(6) not null,
  PERSON_ID NUMBER(6) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.BOARD_ADMINISTRATOR
  add constraint B_P primary key (BOARD_ID, PERSON_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.BOARD_ADMINISTRATOR
  add constraint FK_BOARD foreign key (BOARD_ID)
  references SCOTT.BOARD (ID) on delete cascade;
alter table SCOTT.BOARD_ADMINISTRATOR
  add constraint FK_PERSON foreign key (PERSON_ID)
  references SCOTT.PERSON (ID) on delete cascade;

prompt
prompt Creating table BONUS
prompt ====================
prompt
create table SCOTT.BONUS
(
  ENAME VARCHAR2(10),
  JOB   VARCHAR2(9),
  SAL   NUMBER,
  COMM  NUMBER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;

prompt
prompt Creating table COURSE
prompt =====================
prompt
create table SCOTT.COURSE
(
  COURSEID NUMBER(6) not null,
  NAME     VARCHAR2(20)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.COURSE
  add constraint AAA primary key (COURSEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table DEPT
prompt ===================
prompt
create table SCOTT.DEPT
(
  DEPTNO NUMBER(2) not null,
  DNAME  VARCHAR2(14),
  LOC    VARCHAR2(13)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.DEPT
  add constraint PK_DEPT primary key (DEPTNO)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table EMP
prompt ==================
prompt
create table SCOTT.EMP
(
  EMPNO    NUMBER(4) not null,
  ENAME    VARCHAR2(10),
  JOB      VARCHAR2(9),
  MGR      NUMBER(4),
  HIREDATE DATE,
  SAL      NUMBER(7,2),
  COMM     NUMBER(7,2),
  DEPTNO   NUMBER(2)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.EMP
  add constraint PK_EMP primary key (EMPNO)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.EMP
  add constraint FK_DEPTNO foreign key (DEPTNO)
  references SCOTT.DEPT (DEPTNO);

prompt
prompt Creating table SALGRADE
prompt =======================
prompt
create table SCOTT.SALGRADE
(
  GRADE NUMBER,
  LOSAL NUMBER,
  HISAL NUMBER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table STUDENT
prompt ======================
prompt
create table SCOTT.STUDENT
(
  STUID NUMBER(6) not null,
  NAME  VARCHAR2(20)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.STUDENT
  add constraint AA primary key (STUID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table STUDENT_COURSE
prompt =============================
prompt
create table SCOTT.STUDENT_COURSE
(
  STUID    NUMBER(6) not null,
  COURSEID NUMBER(6) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.STUDENT_COURSE
  add constraint XXX primary key (STUID, COURSEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.STUDENT_COURSE
  add constraint XXXX foreign key (STUID)
  references SCOTT.STUDENT (STUID) on delete cascade;
alter table SCOTT.STUDENT_COURSE
  add constraint XXXXXX foreign key (COURSEID)
  references SCOTT.COURSE (COURSEID) on delete cascade;

prompt
prompt Creating table THREAD
prompt =====================
prompt
create table SCOTT.THREAD
(
  ID                     NUMBER(6) not null,
  DATECREATED            DATE,
  DELETED                VARCHAR2(2),
  VERSION                NUMBER(6),
  CONTENT                LONG,
  DATELASTREPLIED        TIMESTAMP(6) WITH LOCAL TIME ZONE,
  HIT                    NUMBER(6),
  IPCREATED              VARCHAR2(255),
  READONLY               VARCHAR2(6),
  REPLYCOUNT             NUMBER(6),
  TITLE                  VARCHAR2(255),
  TOPPED                 VARCHAR2(4),
  AUTHOR_LAST_REPLIED_ID NUMBER(6),
  BOARD_ID               NUMBER(6)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.THREAD
  add constraint THREAD_PK primary key (ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SCOTT.THREAD
  add constraint THREAD_BOARD_FK1 foreign key (BOARD_ID)
  references SCOTT.BOARD (ID);

prompt
prompt Creating sequence HIBERNATE_SEQUENCE
prompt ====================================
prompt
create sequence SCOTT.HIBERNATE_SEQUENCE
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_CATEGORY
prompt ==============================
prompt
create sequence SCOTT.SEQ_CATEGORY
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_PERSON
prompt ============================
prompt
create sequence SCOTT.SEQ_PERSON
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;


spool off
