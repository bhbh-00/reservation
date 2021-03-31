# 데이터베이스 생성
DROP DATABASE IF EXISTS reservation;
CREATE DATABASE reservation;
USE reservation;

# ============================================== article

# 게시물 테이블 생성
CREATE TABLE article (
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    boardId INT(10) UNSIGNED NOT NULL,
    memberId INT(10) UNSIGNED NOT NULL,	
    title CHAR(100) NOT NULL,
    `body` TEXT NOT NULL
);
