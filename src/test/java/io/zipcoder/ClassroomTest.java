package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import sun.security.x509.OtherName;

public class ClassroomTest {

    @Test
    public void ClassroomConstructorTest() {
        //given
        int expectedMaxStudents = 10;
        Classroom classroom = new Classroom(expectedMaxStudents);

        //when
        int actualMaxStudents = classroom.getStudents().length;

        //then
        Assert.assertEquals(expectedMaxStudents, actualMaxStudents);

    }

    @Test
    public void getAverageExamScore(){
        //given
        Classroom classroom = new Classroom();
        Double expectedClassAverage = 10.0;

        //when
        Double actualClassAverage = classroom.getAverageExamScore();

        //then
        Assert.assertEquals(expectedClassAverage,actualClassAverage);

    }

}
