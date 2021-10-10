CREATE SCHEMA DISCOVERY;

CREATE TABLE DISCOVERY.MEMBER (
    Member_ID               NUMBER(10) CONSTRAINT PK_MEMBER PRIMARY KEY
);

CREATE TABLE DISCOVERY.CURRENCY (
                                    Currency_ID             NUMBER(10) CONSTRAINT PK_CURRENCY PRIMARY KEY,
                                    Currency_Type           VARCHAR2(25) NOT NULL,
                                    CONSTRAINT UNQ_CURRENCY UNIQUE(Currency_Type)
);

CREATE TABLE DISCOVERY.ACCOUNT_TYPE (
                                        Acc_Type_ID             NUMBER(10) CONSTRAINT PK_ACCOUNT_TYPE PRIMARY KEY,
                                        Acc_Type_Description    VARCHAR2(25) NOT NULL,
                                        CONSTRAINT UNQ_ACC_TYPE UNIQUE(Acc_Type_Description)
);

CREATE TABLE DISCOVERY.ACCOUNT(
                                  Account_ID              NUMBER(10) CONSTRAINT PK_ACCOUNT PRIMARY KEY,
                                  Member_ID               NUMBER(10) NOT NULL,
                                  Currency_ID             NUMBER(10) NOT NULL,
                                  Acc_Type_ID             NUMBER(10) NOT NULL,
                                  Account_Balance         FLOAT DEFAULT 0.00,
                                  CONSTRAINT FK1_ACCOUNT FOREIGN KEY(Member_ID) REFERENCES DISCOVERY.MEMBER(Member_ID),
                                  CONSTRAINT FK2_ACCOUNT FOREIGN KEY(Currency_ID) REFERENCES DISCOVERY.CURRENCY(Currency_ID),
                                  CONSTRAINT FK3_ACCOUNT FOREIGN KEY(Acc_Type_ID) REFERENCES DISCOVERY.ACCOUNT_TYPE(Acc_Type_ID)
);

CREATE TABLE DISCOVERY.RATE (
                                Rate_ID                 NUMBER(10) CONSTRAINT PK_RATE PRIMARY KEY,
                                Currency_ID             NUMBER(10) NOT NULL,
                                Rate_Date               DATE NOT NULL,
                                Rate_Conversion         FLOAT NOT NULL,
                                CONSTRAINT FK_RATE FOREIGN KEY(Currency_ID) REFERENCES DISCOVERY.CURRENCY(Currency_ID)
);

CREATE TABLE DISCOVERY.TRANSACTION (
                                       Transaction_ID          NUMBER(10) CONSTRAINT PK_TRANSACTION PRIMARY KEY,
                                       Account_ID              NUMBER(10) NOT NULL,
                                       Rate_ID                 NUMBER(10) NOT NULL,
                                       Transaction_Amount      FLOAT DEFAULT 0.00,
                                       Transaction_Date        DATE NOT NULL,
                                       CONSTRAINT FK1_TRANSACTION FOREIGN KEY(Account_ID) REFERENCES DISCOVERY.ACCOUNT(Account_ID),
                                       CONSTRAINT FK2_TRANSACTION FOREIGN KEY(Rate_ID) REFERENCES DISCOVERY.RATE(Rate_ID)
);

CREATE SEQUENCE DISCOVERY.ACCOUNT_SEQ
    START WITH 0123456789
    INCREMENT BY 1
    NOCACHE;

CREATE SEQUENCE DISCOVERY.ACCOUNT_TYPE_SEQ
    START WITH 0223456789
    INCREMENT BY 1
    NOCACHE;

CREATE SEQUENCE DISCOVERY.CURRENCY_SEQ
    START WITH 0113456789
    INCREMENT BY 1
    NOCACHE;

CREATE SEQUENCE DISCOVERY.MEMBER_SEQ
    START WITH 0123456781
    INCREMENT BY 1
    NOCACHE;

CREATE SEQUENCE DISCOVERY.RATE_SEQ
    START WITH 0123451789
    INCREMENT BY 1
    NOCACHE;

CREATE SEQUENCE DISCOVERY.TRANSACTION_SEQ
    START WITH 0123456759
    INCREMENT BY 1
    NOCACHE;
