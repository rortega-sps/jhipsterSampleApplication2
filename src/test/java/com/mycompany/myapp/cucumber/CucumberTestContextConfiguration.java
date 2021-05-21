package com.mycompany.myapp.cucumber;

import com.mycompany.myapp.JhipsterSampleApplication2App;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JhipsterSampleApplication2App.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
