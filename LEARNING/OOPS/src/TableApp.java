
public class TableApp {

	public static void main(String[] args) {
		Table t1 = new Table();
		t1.seatingCapecity=6;
		t1.cost=4500;
		t1.color="Brown";
		t1.brand="Greenply";
		t1.allowToSit();
		t1.allowToWrite();
		System.out.println("t1.seatingCapecity"+" "+t1.cost+" "+t1.color+" "+t1.brand);
	}

}
