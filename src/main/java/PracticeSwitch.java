
public class PracticeSwitch {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};

        for (int number : numbers) {
            switch (number) {
                case 1:
                    System.out.println("勇者");
                    break;
                case 2:
                    System.out.println("バトルマスター");
                    break;
                case 3:
                    System.out.println("パラディン");
                    break;
                case 4:
                    System.out.println("海賊");
                    break;
                case 5:
                    System.out.println("魔法剣士");
                    break;
                default:
                    System.out.println("無職");
                    break;
            }
        }

	}

}
