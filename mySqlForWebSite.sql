DROP DATABASE IF EXISTS mybooklibrary;
CREATE DATABASE mybooklibrary DEFAULT CHARACTER SET 'utf8';
USE mybooklibrary;
CREATE TABLE books
(
  book_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 author TEXT,
 title TEXT,
 ISBM TEXT,
 shortDescription TEXT,
 coverImage MEDIUMBLOB,
 host INT,
 count_of_downloads INT
 );
  CREATE TABLE books_host1
(
 book_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 author TEXT,
 title TEXT,
 ISBM TEXT,
 book_file LONGBLOB
 );

  CREATE TABLE books_host2
(
 book_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 author TEXT,
 title TEXT,
 ISBM TEXT,
 book_file LONGBLOB
 );


