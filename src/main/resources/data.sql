INSERT INTO USER (USERNAME,PASSWORD) VALUES ('ridvan','$2a$11$6vR0ejUq1IxlM8PxYqeaIeH0FGtBKXDHXOFhyUlKrnMY2AJJ//SdK'); --password=password
INSERT INTO USER (USERNAME,PASSWORD) VALUES ('username','$2a$11$6vR0ejUq1IxlM8PxYqeaIeH0FGtBKXDHXOFhyUlKrnMY2AJJ//SdK'); --password=password

INSERT INTO AUTH_USER_GROUP (USERNAME,AUTH_GROUP) VALUES ('ridvan','USER');
INSERT INTO AUTH_USER_GROUP (USERNAME,AUTH_GROUP) VALUES ('ridvan','ADMIN');
INSERT INTO AUTH_USER_GROUP (USERNAME,AUTH_GROUP) VALUES ('username','USER');

INSERT INTO CATEGORY (NAME) VALUES ('Tech Category');


INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 1','Content 1',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 2','Content 2',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 3','Content 3',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 4','Content 4',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 5','Content 5',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 6','Content 6',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 7','Content 7',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 8','Content 8',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 9','Content 9',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 10','Content 10',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 11','Content 11',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 12','Content 12',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 13','Content 13',1,CURRENT_TIMESTAMP());
