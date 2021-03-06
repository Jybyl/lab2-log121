package com.ets.lab2.JUnitTests;

import com.ets.lab2.GameFrameWork.Score;
import com.ets.lab2.GameFrameWork.ScoreComparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreTest {
    Score score;
    @BeforeEach
    void setup(){
         score = new Score(0);
    }

    @Test
    void getScoreTest(){
        assertEquals(score.getPoints(), 0);
    }

    @Test
    void setScoreTest(){
        score.setPoints(10);
        assertEquals(score.getPoints(), 10);
    }

    @Test
    void calculateScore(){
        score.calculateScore(10);
        assertEquals(score.getPoints(), 10);
    }

    @Test
    void compareScore(){
        ScoreComparator sc = new ScoreComparator();
        Score s1 = new Score(20);
        Score s2 = new Score(30);
        Score s3 = new Score(20);

        assertEquals(sc.compareScore(s1,s2),-1);
        assertEquals(sc.compareScore(s2,s1),1);
        assertEquals(sc.compareScore(s1,s3),0);
    }
}
