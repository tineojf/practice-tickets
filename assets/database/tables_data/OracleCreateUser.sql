ALTER SESSION SET "_ORACLE_SCRIPT"= TRUE;

CREATE USER USER_TINEO IDENTIFIED BY "tineo" DEFAULT TABLESPACE "USERS" TEMPORARY TABLESPACE "TEMP";

ALTER USER USER_TINEO QUOTA UNLIMITED ON USERS;

GRANT CREATE SESSION TO USER_TINEO;

GRANT "RESOURCE" TO USER_TINEO;

ALTER USER USER_TINEO DEFAULT ROLE "RESOURCE";