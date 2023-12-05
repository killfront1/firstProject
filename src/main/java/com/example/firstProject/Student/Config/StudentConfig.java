package com.example.firstProject.Student.Config;

import com.example.firstProject.Student.Model.Student;
import com.example.firstProject.Student.DataAccess.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student andrew = new Student( "Andrew", "Andrew@yandex.ru", LocalDate.of(2000, OCTOBER, 21));
            Student ivan = new Student( "Ivan", "Ivan@mail.ru", LocalDate.of(1997, FEBRUARY, 4));
            repository.saveAll(List.of(andrew,ivan));
        };
    }
}
