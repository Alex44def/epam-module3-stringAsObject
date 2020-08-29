package ru.epam.jonline.module3.string_as_object;

public class Tasks {

//	Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем

	public static void firstTask(String str) {
		System.out.printf("%nAnswer firstTask: %n");
		System.out.println(str);

		int max = 0;
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 32) {
				count++;
			} else {
				if (count > max) {
					max = count;
				}
				count = 0;
			}
		}
		if (count > max) {
			max = count;
		}

		System.out.printf("Max количество пробелов рано %d %n", max);
	}

//  В строке вставить после каждого символа 'a' символ 'b'

	public static void secondTask(String str) {
		System.out.printf("%nAnswer secondTask: %n");
		System.out.println(str);

		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == 'a') {
				sb.insert((i + 1), "b");
			}
		}
		str = sb.toString();

		System.out.println(str);
	}

//    Проверить, является ли заданное слово палиндромом

	public static void thirdTask(String str) {
		System.out.printf("%nAnswer thirdTask: %n");
		System.out.println(str);

		StringBuilder sb = new StringBuilder(str);

		if (sb.equals(sb.reverse())) {
			System.out.println("Строка полиндром");
		} else {
			System.out.println("Строка не полиндром");
		}
	}

//    С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”

	public static void fourthTask() {
		System.out.printf("%nAnswer fourthTask: %n");

		String originalString = "информатика";

		String str;

		str = String.valueOf(originalString.charAt(originalString.indexOf("т")))
				+ originalString.charAt(originalString.indexOf("о"))
				+ originalString.charAt(originalString.indexOf("р"))
				+ originalString.charAt(originalString.indexOf("т"));

		System.out.println(str);
	}

//    Подсчитать, сколько раз среди символов заданной строки встречается буква “а”

	public static void fifthTask(String str) {
		System.out.printf("%nAnswer fifthTask: %n");
		System.out.println(str);

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == 'a')) {
				count++;
			}
		}

		System.out.println("Буква " + "а " + "встречается " + count + " раз(а)");
	}

//    Из заданной строки получить новую, повторив каждый символ дважды

	public static void sixthTask(String str) {
		System.out.printf("%nAnswer sixthTask: %n");
		System.out.println(str);

		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++) {
			sb.insert(i, sb.charAt(i));
			i++;
		}

		System.out.println(sb.toString());
	}

//    Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
//    Например, если было введено "abc cde def", то должно быть выведено "abcdef"

	public static void seventhTask(String str) {
		System.out.printf("%nAnswer seventhTask: %n");
		System.out.println(str);

		str = str.trim().replace(" ", "");

		StringBuilder sb = new StringBuilder(str);

		for (int i = 1; i < sb.length(); i++) {
			String ch = String.valueOf(sb.charAt(i - 1));
			while (sb.indexOf(ch, i) != -1) {
				sb.deleteCharAt(sb.indexOf(ch, i));
			}
		}

		System.out.println(sb.toString());
	}

//    Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
//    Случай, когда самых длинных слов может быть несколько, не обрабатывать

	public static void eighthTask(String str) {
		System.out.printf("%nAnswer eighthTask: %n");
		System.out.println(str);

		String[] strArr = str.split(" ");
		String longestWord = strArr[0];

		for (int i = 1; i < strArr.length; i++) {
			longestWord = (strArr[i].length() > longestWord.length()) ? strArr[i] : longestWord;
		}

		System.out.println("Самое длинное слово: " + longestWord);
	}

//    Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы

	public static void ninthTask(String str) {
		System.out.printf("%nAnswer ninthTask: %n");
		System.out.println(str);

		int smallLatter = 0;
		int largeLetter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				largeLetter++;
			} else {
				smallLatter++;
			}
		}

		System.out.println("Количество прописных букв: " + largeLetter);
		System.out.println("Количество строчных букв: " + smallLatter);
	}

//    Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком. 
//    Определить количество предложений в строке X

	public static void tenthTask(String str) {
		System.out.printf("%nAnswer tenthTask: %n");
		System.out.println(str);

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == '?' || str.charAt(i) == '!' || str.charAt(i) == '.')) {
				count++;
			}
		}

		System.out.println("Количество предложений: " + count);
	}

	/*----------------------------*/

}
