package com.dennis.api.common;

public interface UtilService {
    int createRandomInteger(int start, int gapBetweenStartAndEnd);
    double createRandomDouble(int start, int gapBetweenStartAndEng);

    String createRandomUsername();
    String createRandomName();
    String createRandomTitle();
    String createRandomContent();
}
