package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class StatisticsServiceTest {
        @Test
        void findMax() {
            StatisticsService service = new StatisticsService();

            long[] incomesInBillions = {5, 8, 4, 12, 5, 3, 8, 6, 11, 11, 12};
            long expected = 12;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }
    }


