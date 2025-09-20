INSERT IGNORE INTO Users(userID,login,password,role) VALUES (1,'Ivan', '1234','USER');
INSERT IGNORE INTO Users(userID,login,password,role) VALUES (2,'Petr', '2454','USER');
INSERT IGNORE INTO Users(userID,login,password,role) VALUES (3,'Sasha', '3665','ADMIN');

INSERT IGNORE INTO Cards(cardId,Number,Owner,Duration,Status,Balance,userID) VALUES (1,1111222233334444, 'Ivan',2027,'ACTIVE',100.00,1);
INSERT IGNORE INTO Cards(cardId,Number,Owner,Duration,Status,Balance,userID) VALUES (2,1212232334344545, 'Petr',2023,'EXPIRED',1500.00,2);