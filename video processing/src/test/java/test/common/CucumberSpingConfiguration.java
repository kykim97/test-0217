package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.VideoProcessingApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { VideoProcessingApplication.class })
public class CucumberSpingConfiguration {}
