package com.bayamp.team.advanceddatastructures.programs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetUtils {

	public static void foo1() {

		System.out.println("\n Create and Print Treet Set");

		Set<String> myFruitsTreeSet = new TreeSet<String>();
		myFruitsTreeSet.add("oranges");
		myFruitsTreeSet.add("watermelon");
		myFruitsTreeSet.add("apples");
		myFruitsTreeSet.add("apples");
		myFruitsTreeSet.add("grapes");
		myFruitsTreeSet.add("banana");

		// int treeSetSize = myFruitsTreeSet.size();
		// System.out.println("The size of tree set :" + myFruitsTreeSet);

		System.out.println("The size of tree set :" + myFruitsTreeSet.size());

		for (String fruit : myFruitsTreeSet) {

			System.out.println(fruit);

		}

	}

	static public void foo2() {
		System.out.println("\n Create and Print Hash Set");

		Set<String> myFruitsHashSet = new HashSet<String>();
		myFruitsHashSet.add("oranges");
		myFruitsHashSet.add("watermelon");
		myFruitsHashSet.add("apples");
		myFruitsHashSet.add("apples");
		myFruitsHashSet.add("grapes");
		myFruitsHashSet.add("banana");

		// int treeSetSize = myFruitsTreeSet.size();
		// System.out.println("The size of tree set :" + myFruitsTreeSet);

		System.out.println("The size of hash set :" + myFruitsHashSet.size());

		for (String fruit : myFruitsHashSet) {

			System.out.println(fruit);

		}
	}

}
