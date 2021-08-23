/*
Author Name: Jason Kellie
Date: 08/23/2021
Assignment Number: 01
*/

import java.io.File;

public class Main {
	public static void main(String[] args) {
		String folderpath = "/Users/jkellie/Movies";
		File folder = new File((folderpath));

		if (folder.exists() && folder.isDirectory()) {
			File[] array = folder.listFiles();
			System.out.println("Files from this folder: " + folder);
			treePrint(array, 0, 0);
		}

	}

	 static void treePrint(File[] array, int index, int level) {
		if (index == array.length)
			return;

		for (int i = 0; i < level; i++)
			System.out.print("\t");

		if (array[index].isFile()) {
			System.out.println(array[index].getName());
		} else if (array[index].isDirectory()) {
			System.out.println("[" + array[index].getName() + "]");
			treePrint(array[index].listFiles(), 0, level + 1);
		}

		treePrint(array, ++index, level);
	}
}
