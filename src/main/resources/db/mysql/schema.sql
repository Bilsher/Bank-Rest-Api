CREATE TABLE IF NOT EXISTS Users(
    userID integer AUTO_INCREMENT PRIMARY Key,
    login varchar(255) not NULL,
    password varchar(255) NOT NULL,
    role varchar(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS Cards(
    cardId integer AUTO_INCREMENT PRIMARY Key,
    Number varchar(16) not NULL,
    Owner varchar(255) not NULL,
    Duration integer not NULL,
    Status varchar(255) not NULL,
    Balance DECIMAL(10,2) not NULL,
    userID integer not NULL,
    FOREIGN key (userID) REFERENCES Users(userID)
);
