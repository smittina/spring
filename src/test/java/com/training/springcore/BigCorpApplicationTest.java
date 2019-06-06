package com.training.springcore;

import com.training.springcore.service.measure.MeasureServiceConfigurationTest;
import com.training.springcore.utils.OutputCapture;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes={MeasureServiceConfigurationTest.class})
public class BigCorpApplicationTest {

    @Rule
    public OutputCapture output = new OutputCapture();

    private BigCorpApplication application = new BigCorpApplication();

    @Test
    public void run() {
        application.run();
        assertThat(output.toString(), containsString("==============================="));
    }
}