package org.example.kuy7;

public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
        return nBlue < 2 ? 0 : (nBlue - 1) * 2;
    }
}
