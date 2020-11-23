package com.epam.jwd.app;

import com.epam.jwd.model.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static void main(String[] args) {

        static final Logger logger = LogManager.getLogger(Main.class);

        Point[] pointArray = new Point[5];

        for (int i = 0; i<5; i++){
            pointArray[i] = new Point(i,i*2);
        }

        for (int i = 0; i<5; i++){
            logger.debug(pointArray[i].toString());
        }
    }
}
