package com.book.basicTypes;


public class HostNumber {
    private static int hostNumber = 1;

    public static int getHostNumber() {
        return hostNumber;
    }

    public static void setHostNumber(int hostNumber) {
        HostNumber.hostNumber = hostNumber;
    }
}
