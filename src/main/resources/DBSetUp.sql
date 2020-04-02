-- -------------------------------
-- Table Structure for DemoUser
-- -------------------------------
DROP TABLE IF EXISTS `DemoUser`;
CREATE TABLE DemoUser
(
    id       int(10) not null,
    username varchar(255) default NULL,
    password varchar(255) default NULL,
    constraint DemoUser_pk
        primary key (id)
);

-- -------------------------------
-- Preset Records for DemoUser
-- -------------------------------
INSERT INTO `DemoUser`
VALUES ('10000001', 'Karaya_12', 'password1');
INSERT INTO `DemoUser`
VALUES ('10000002', 'ShiZhi Xu', 'password2');
INSERT INTO `DemoUser`
VALUES ('10000003', 'Panzer_Odyssey', 'password3');