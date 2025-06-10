DROP DATABASE  IF EXISTS tutorials;
CREATE DATABASE IF NOT EXISTS tutorials;
USE tutorials;

CREATE TABLE tutorials (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    description TEXT,
    published BOOLEAN
);

INSERT INTO tutorials (title, description, published) VALUES
('Introduction to Java', 'Learn the basics of Java programming.', true),
('Spring Boot Guide', 'Comprehensive guide to building REST APIs with Spring Boot.', true),
('Understanding JPA', 'A tutorial on Java Persistence API with examples.', false),
('Hibernate Relationships', 'Explore OneToMany and ManyToOne relationships in Hibernate.', true),
('Deploying to Heroku', 'Step-by-step guide for deploying Spring Boot apps on Heroku.', false);