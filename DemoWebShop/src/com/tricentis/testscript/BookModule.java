package com.tricentis.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.tricentis.generic.ListnerImplementation.class)
public class BookModule {
@Test
public void bookClone() {
	System.out.println("github book clone");
}
}
