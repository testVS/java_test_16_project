package ru.stqa.pft.homework_2;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.homework_1.P1;
import ru.stqa.pft.homework_1.P2;

import static java.lang.Math.abs;
import static java.lang.Math.round;

@Test
public class PointTest {
    public void TestP1(){
        P1 p1 = new P1(2,4);
        Assert.assertEquals(p1.coord(),4);
    }
@Test
    public void TestP2(){
        P2 p2 = new P2(4,2);
        Assert.assertEquals(p2.coord(),4);
        }
@Test
    public void TestDistance(){
        P1 p1 = new P1(4,2);
        P2 p2 = new P2(4,2);
        Assert.assertEquals(Math.floor(Math.sqrt(p1.coord() + p2.coord())),2);
}

}
