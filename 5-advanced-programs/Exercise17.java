
public class Exercise17 {

	public static void main(String[] args) {
		int low = 1;
		int high = 20;
		while (low < high)
		{
			System.out.println(low
					+ " " + high);
			low = low + 1;
			high = high - 1;
		}
	}
}

/*
1 20
2 19
3 18
4 17
5 16
6 15
7 14
8 13
9 12
10 11
*/
