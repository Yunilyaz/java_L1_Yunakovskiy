public class SwitchExample {
    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

    public static void main(String[] args) {
        // Для int
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            default:
                System.out.println("Default case");
        }

        // Для char
        char c = 'A';
        switch (c) {
            case 'A':
                System.out.println("c is A");
                break;
            case 'B':
                System.out.println("c is B");
                break;
            default:
                System.out.println("Default case");
        }

        //Для перечисления 
        Day today = Day.MONDAY;
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday");
                break;
            case TUESDAY:
        	System.out.println("It's Tuesday");
        	break;
            default:
                System.out.println("Default case");
        }

        // Для string
        String fruit = "Apple";
        switch (fruit) {
            case "Apple":
                System.out.println("It's an apple");
                break;
            case "Banana":
                System.out.println("It's a banana");
                break;
            default:
                System.out.println("Unknown fruit");
        }

        // Типы-обёртки для целых чисел (Byte, Short, Integer, Character)
	Integer value = 10;
	switch (value) {
    	case 5:
        	System.out.println("Value is 5");
        	break;
    	case 10:
        	System.out.println("Value is 10");
        	break;
    	default:
        	System.out.println("Default case");
	}
    }
}