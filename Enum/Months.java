package enumPackage;

public enum Months {
	JAN(1), FEB(2), MARCH(3), APR(4), MAY(5), JUN(6), JULY(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);
	  private int enumIndex;
	Months(int name)// Parameterized constructor
	{
		enumIndex=name;
	}

	public static void main(String[] args)
	{
		System.out.println(Months.MARCH.enumIndex);
		System.out.println(Months.MARCH);
	}
	
}
