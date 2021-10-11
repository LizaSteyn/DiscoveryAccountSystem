
--Memember Inserts
INSERT INTO MEMBER (MEMBER_ID) VALUES(MEMBER_SEQ.nextval);
INSERT INTO MEMBER (MEMBER_ID) VALUES(MEMBER_SEQ.nextval);
INSERT INTO MEMBER (MEMBER_ID) VALUES(MEMBER_SEQ.nextval);
INSERT INTO MEMBER (MEMBER_ID) VALUES(MEMBER_SEQ.nextval);
INSERT INTO MEMBER (MEMBER_ID) VALUES(MEMBER_SEQ.nextval);
INSERT INTO MEMBER (MEMBER_ID) VALUES(MEMBER_SEQ.nextval);

--Currency Inserts
INSERT INTO CURRENCY (CURRENCY_ID, CURRENCY_TYPE) VALUES(CURRENCY_SEQ.nextval, 'Rand');
INSERT INTO CURRENCY (CURRENCY_ID, CURRENCY_TYPE) VALUES(CURRENCY_SEQ.nextval, 'MILES');
INSERT INTO CURRENCY (CURRENCY_ID, CURRENCY_TYPE) VALUES(CURRENCY_SEQ.nextval, 'PLAY');
INSERT INTO CURRENCY (CURRENCY_ID, CURRENCY_TYPE) VALUES(CURRENCY_SEQ.nextval, 'Euro');
INSERT INTO CURRENCY (CURRENCY_ID, CURRENCY_TYPE) VALUES(CURRENCY_SEQ.nextval, 'Pound');
INSERT INTO CURRENCY (CURRENCY_ID, CURRENCY_TYPE) VALUES(CURRENCY_SEQ.nextval, 'Dollar');

--Rate inserts
INSERT INTO RATE (RATE_ID, CURRENCY_ID, RATE_DATE, RATE_CONVERSION) VALUES(RATE_SEQ.nextval, 113456789, '11-10-2021', 1.00);
INSERT INTO RATE (RATE_ID, CURRENCY_ID, RATE_DATE, RATE_CONVERSION)  VALUES(RATE_SEQ.nextval, 113456790, '11-10-2021', 100.00);
INSERT INTO RATE (RATE_ID, CURRENCY_ID, RATE_DATE, RATE_CONVERSION)  VALUES(RATE_SEQ.nextval, 113456791, '11-10-2021', 1000.00);
INSERT INTO RATE (RATE_ID, CURRENCY_ID, RATE_DATE, RATE_CONVERSION)  VALUES(RATE_SEQ.nextval, 113456792, '08-10-2021', 17.2522);
INSERT INTO RATE (RATE_ID, CURRENCY_ID, RATE_DATE, RATE_CONVERSION)  VALUES(RATE_SEQ.nextval, 113456793, '08-10-2021', 20.3140);
INSERT INTO RATE (RATE_ID, CURRENCY_ID, RATE_DATE, RATE_CONVERSION)  VALUES(RATE_SEQ.nextval, 113456794, '08-10-2021', 14.9389);
INSERT INTO RATE (RATE_ID, CURRENCY_ID, RATE_DATE, RATE_CONVERSION)  VALUES(RATE_SEQ.nextval, 113456792, '11-10-2021', 17.7092);
INSERT INTO RATE (RATE_ID, CURRENCY_ID, RATE_DATE, RATE_CONVERSION)  VALUES(RATE_SEQ.nextval, 113456793, '11-10-2021', 20.9130);
INSERT INTO RATE (RATE_ID, CURRENCY_ID, RATE_DATE, RATE_CONVERSION)  VALUES(RATE_SEQ.nextval, 113456794, '11-10-2021', 15.2426);

--Account Type inserts
INSERT INTO ACCOUNT_TYPE (ACC_TYPE_ID, ACC_TYPE_DESCRIPTION) VALUES(ACCOUNT_TYPE_SEQ.nextval, 'Vitality Money Account');
INSERT INTO ACCOUNT_TYPE (ACC_TYPE_ID, ACC_TYPE_DESCRIPTION) VALUES(ACCOUNT_TYPE_SEQ.nextval, 'Discovery MILES Account');
INSERT INTO ACCOUNT_TYPE (ACC_TYPE_ID, ACC_TYPE_DESCRIPTION) VALUES(ACCOUNT_TYPE_SEQ.nextval, 'Discovery PLAY Account');
INSERT INTO ACCOUNT_TYPE (ACC_TYPE_ID, ACC_TYPE_DESCRIPTION) VALUES(ACCOUNT_TYPE_SEQ.nextval, 'Discovery Black Account');
INSERT INTO ACCOUNT_TYPE (ACC_TYPE_ID, ACC_TYPE_DESCRIPTION) VALUES(ACCOUNT_TYPE_SEQ.nextval, 'Discovery Gold Account');
INSERT INTO ACCOUNT_TYPE (ACC_TYPE_ID, ACC_TYPE_DESCRIPTION) VALUES(ACCOUNT_TYPE_SEQ.nextval, 'Discovery Platinum Account');
INSERT INTO ACCOUNT_TYPE (ACC_TYPE_ID, ACC_TYPE_DESCRIPTION) VALUES(ACCOUNT_TYPE_SEQ.nextval, 'Discovery Purple Account');

--Account inserts
INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID, CURRENCY_ID, ACC_TYPE_ID, ACCOUNT_BALANCE) VALUES(ACCOUNT_SEQ.nextval, '123456787', '113456789', '223456789', DEFAULT);
INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID, CURRENCY_ID, ACC_TYPE_ID, ACCOUNT_BALANCE) VALUES(ACCOUNT_SEQ.nextval, '123456787', '113456790', '223456790', DEFAULT);
INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID, CURRENCY_ID, ACC_TYPE_ID, ACCOUNT_BALANCE) VALUES(ACCOUNT_SEQ.nextval, '123456788', '113456794', '223456795', 500.00);
INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID, CURRENCY_ID, ACC_TYPE_ID, ACCOUNT_BALANCE) VALUES(ACCOUNT_SEQ.nextval, '123456788', '113456791', '223456791', 1159.00);
INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID, CURRENCY_ID, ACC_TYPE_ID, ACCOUNT_BALANCE) VALUES(ACCOUNT_SEQ.nextval, '123456789', '113456792', '223456793', 200.03);
INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID, CURRENCY_ID, ACC_TYPE_ID, ACCOUNT_BALANCE) VALUES(ACCOUNT_SEQ.nextval, '123456789', '113456791', '223456791', 20.00);
INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID, CURRENCY_ID, ACC_TYPE_ID, ACCOUNT_BALANCE) VALUES(ACCOUNT_SEQ.nextval, '123456790', '113456789', '223456794', 10890.51);
INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID, CURRENCY_ID, ACC_TYPE_ID, ACCOUNT_BALANCE) VALUES(ACCOUNT_SEQ.nextval, '123456791', '113456794', '223456795', 77892.25);
INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID, CURRENCY_ID, ACC_TYPE_ID, ACCOUNT_BALANCE) VALUES(ACCOUNT_SEQ.nextval, '123456791', '113456790', '223456790', 55.00);
INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID, CURRENCY_ID, ACC_TYPE_ID, ACCOUNT_BALANCE) VALUES(ACCOUNT_SEQ.nextval, '123456792', '113456790', '223456790', 8800.00);
INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID, CURRENCY_ID, ACC_TYPE_ID, ACCOUNT_BALANCE) VALUES(ACCOUNT_SEQ.nextval, '123456793', '113456790', '223456790', 66.00);
INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID, CURRENCY_ID, ACC_TYPE_ID, ACCOUNT_BALANCE) VALUES(ACCOUNT_SEQ.nextval, '123456794', '113456790', '223456790', 1290.00);
INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID, CURRENCY_ID, ACC_TYPE_ID, ACCOUNT_BALANCE) VALUES(ACCOUNT_SEQ.nextval, '123456795', '113456790', '223456790', 4193.00);
INSERT INTO ACCOUNT (ACCOUNT_ID, MEMBER_ID, CURRENCY_ID, ACC_TYPE_ID, ACCOUNT_BALANCE) VALUES(ACCOUNT_SEQ.nextval, '123456796', '113456791', '223456791', 50000.00);

--Transaction inserts
INSERT INTO TRANSACTION (TRANSACTION_ID, ACCOUNT_ID, RATE_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE) VALUES(TRANSACTION_SEQ.nextval,'123456791','123451790', +2000.00, '11-10-2021');
INSERT INTO TRANSACTION (TRANSACTION_ID, ACCOUNT_ID, RATE_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE) VALUES(TRANSACTION_SEQ.nextval,'123456798','123451790', -50.00, '02-10-2021');
INSERT INTO TRANSACTION (TRANSACTION_ID, ACCOUNT_ID, RATE_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE) VALUES(TRANSACTION_SEQ.nextval,'123456799','123451790', -200.00, '06-10-2021');
INSERT INTO TRANSACTION (TRANSACTION_ID, ACCOUNT_ID, RATE_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE) VALUES(TRANSACTION_SEQ.nextval,'123456800','123451790', +500.00, '09-10-2021');
INSERT INTO TRANSACTION (TRANSACTION_ID, ACCOUNT_ID, RATE_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE) VALUES(TRANSACTION_SEQ.nextval,'123456801','123451790', +15.00, '10-10-2021');
INSERT INTO TRANSACTION (TRANSACTION_ID, ACCOUNT_ID, RATE_ID, TRANSACTION_AMOUNT, TRANSACTION_DATE) VALUES(TRANSACTION_SEQ.nextval,'123456802','123451790', +5000.00, '01-10-2021');


