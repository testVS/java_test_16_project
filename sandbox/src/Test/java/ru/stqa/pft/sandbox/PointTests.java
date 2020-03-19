package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.stqa.pft.sandbox.MyFirstProgram.distance;


@Test
public class PointTests {

    public void coordTest(){
        Point p1 = new Point(5,4);
        Assert.assertEquals(p1.coord() , 20.0);
    }

    public void distanceTest(){
        Point p1 = new Point(10,5);
        Point p2 = new Point(5.3,4);
        Assert.assertEquals(distance(p1,p2) , 8.0);

    }
}
