package org.sandakith;

import ex.textfile.Ex_FileRead_LineByLine;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Ex_FileRead_LineByLine_Test extends TestCase {

    public void testFileRead_LineByLin() {
        assertTrue( Ex_FileRead_LineByLine.readTextFile("./resources/sample.txt"));
    }

}
