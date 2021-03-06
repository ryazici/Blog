--user credentials
INSERT INTO USER (USERNAME,PASSWORD) VALUES ('ridvan','$2a$11$6vR0ejUq1IxlM8PxYqeaIeH0FGtBKXDHXOFhyUlKrnMY2AJJ//SdK'); --password=password
INSERT INTO USER (USERNAME,PASSWORD) VALUES ('username','$2a$11$6vR0ejUq1IxlM8PxYqeaIeH0FGtBKXDHXOFhyUlKrnMY2AJJ//SdK'); --password=password

--user roles
INSERT INTO AUTH_USER_GROUP (USERNAME,AUTH_GROUP) VALUES ('ridvan','USER');
INSERT INTO AUTH_USER_GROUP (USERNAME,AUTH_GROUP) VALUES ('ridvan','ADMIN');
INSERT INTO AUTH_USER_GROUP (USERNAME,AUTH_GROUP) VALUES ('username','USER');

--categories
INSERT INTO CATEGORY (NAME) VALUES ('Spring Boot');
INSERT INTO CATEGORY (NAME) VALUES ('Tech Category');
INSERT INTO CATEGORY (NAME) VALUES ('AngularJS');
INSERT INTO CATEGORY (NAME) VALUES ('Oracle');
INSERT INTO CATEGORY (NAME) VALUES ('Hibernate');

--posts
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 1','Content 1',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 2','Content 2',4,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 3','Content 3',3,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 4','Content 4',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 5','Content 5',5,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 6','Content 6',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 7','Content 7',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 8','Content 8',3,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 9','Content 9',4,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 10','Content 10',5,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 11','Content 11',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 12','Content 12',1,CURRENT_TIMESTAMP());
INSERT INTO POST (TITLE,CONTENT,CATEGORY_ID,DATE_CREATED) VALUES ('Post 13','Content 13',4,CURRENT_TIMESTAMP());
