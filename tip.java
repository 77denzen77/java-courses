public class tip {
	public static void main(String[] args) {
		byte b = 8; // Вот тут будет ошибка, т.к. у нас диапазон от -128 до 127!
		short s = 1337;
		int i = 1488;
		long l = 2147483648L; // Постфикс l или L обозначает литералы типа long
		System.out.println(l);
		System.out.println(s);
		System.out.println(i);
		System.out.println(b);
	}
}