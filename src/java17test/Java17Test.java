package java17test;

import java.util.Objects;
import jdk.incubator.foreign.Addressable;

public class Java17Test {

	public static void main(String[] args) {
		Objects.nonNull("");

		Addressable addr  = jdk.incubator.foreign.MemoryAddress.NULL;
		
		System.out.println("Hello World!");
	}
}
