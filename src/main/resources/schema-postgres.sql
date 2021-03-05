
DROP TABLE IF EXISTS questions;
CREATE TABLE questions(
    id serial PRIMARY KEY,
    question VARCHAR(200) NOT NULL,
    correctAnswer VARCHAR(100) NOT NULL,
    incorrectAnswer1 VARCHAR(100) NOT NULL,
    incorrectAnswer2 VARCHAR(100) NOT NULL,
    incorrectAnswer3 VARCHAR(100) NOT NULL
);