CREATE TABLE ISSUESLISTS
(
	ID  SERIAL AUTO_INCREMENT PRIMARY KEY,
    NAME   VARCHAR(100)
);

CREATE TABLE ISSUES
(
	ID  SERIAL AUTO_INCREMENT PRIMARY KEY,
    ISSUESLIST_ID  BIGINT UNSIGNED NOT NULL,
    USER_ID_ASSIGNEDTO BIGINT UNSIGNED NOT NULL,
    SUMMARY   VARCHAR(100),
    DESCRIPTION VARCHAR(400),
    FOREIGN KEY (USER_ID_ASSIGNEDTO) REFERENCES USERS(ID),
    FOREIGN KEY (ISSUESLIST_ID) REFERENCES ISSUESLISTS(ID)
);


INSERT INTO `kodilla_course`.`ISSUESLISTS` (`NAME`) VALUES ('ToDo');
INSERT INTO `kodilla_course`.`ISSUESLISTS` (`NAME`) VALUES ('In progress');
INSERT INTO `kodilla_course`.`ISSUESLISTS` (`NAME`) VALUES ('Done');


INSERT INTO `kodilla_course`.`ISSUES` (`ISSUESLIST_ID`, `USER_ID_ASSIGNEDTO`, `SUMMARY`, `DESCRIPTION`) VALUES ('1', '1', 'FooBar', 'Bla bla');
INSERT INTO `kodilla_course`.`ISSUES` (`ISSUESLIST_ID`, `USER_ID_ASSIGNEDTO`, `SUMMARY`, `DESCRIPTION`) VALUES ('2', '2', 'FooBar2', 'bla bla bla');
INSERT INTO `kodilla_course`.`ISSUES` (`ISSUESLIST_ID`, `USER_ID_ASSIGNEDTO`, `SUMMARY`, `DESCRIPTION`) VALUES ('2', '3', 'FooBar3', 'test');
INSERT INTO `kodilla_course`.`ISSUES` (`ISSUESLIST_ID`, `USER_ID_ASSIGNEDTO`, `SUMMARY`, `DESCRIPTION`) VALUES ('3', '1', 'FooBar4', 'test2');
INSERT INTO `kodilla_course`.`ISSUES` (`ISSUESLIST_ID`, `USER_ID_ASSIGNEDTO`, `SUMMARY`, `DESCRIPTION`) VALUES ('3', '2', 'FooBar5', 'Test');