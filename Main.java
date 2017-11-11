package net.ukr.kaminskiy;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        TextOperation.saveEqualsWords(new File("fileOne.txt"), new File("fileTwo.txt"), new File("fileTo.txt"));
    }

}

