package ru.epam.jonline.module3.string_as_object;

public class Main {

	public static void main(String[] args) {

		System.out.println("Strings. Строка как объект типа String или StringBuilder");

		String str = "First there was the word and the word was with God and the word was God";
		String phrase = "Да! Нет. Почему?";

		Tasks.firstTask("   23  plus 2   equals  25 or 26 ?     .");
		Tasks.secondTask(str);
		Tasks.thirdTask("Live not on evil ");
		Tasks.fourthTask();
		Tasks.fifthTask(str);
		Tasks.sixthTask(str);
		Tasks.seventhTask("a*b*cd -dc&19a –1 sb3> 3-5 z");
		Tasks.eighthTask(str);
		Tasks.ninthTask(str);
		Tasks.tenthTask(phrase);

	}

}
