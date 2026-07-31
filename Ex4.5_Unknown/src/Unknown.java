
public class Unknown {

	public static void main(String[] args) {
		int table[] = { -5, 2, -8, 31, 15, 4};
		
		displayTab(table);
		fonction(table);
		displayTab(table);
	}
	
	static void fonction(int[] tab) {
		int temp = 0;
		for( int i = 0; i < tab.length; i++) {
			
			for(int j = 1; j < (tab.length -i); j++) {
				
				if (tab[j - 1] > tab[j]) {
					
					temp = tab[j-1];
					tab[j - 1] = tab[j];
					tab[j] = temp;
				}
			}
		}
	}
	static void displayTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i] + " ");
		}
		System.out.println();
	}
}
