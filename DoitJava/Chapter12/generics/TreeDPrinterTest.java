package generics;

public class TreeDPrinterTest {

	public static void main(String[] args) {

		TreeDPrinter printer = new TreeDPrinter();
		printer.setMaterial(new Powder()); //Object�� �޾ұ� ������
		Powder powder = (Powder)printer.getMaterial(); //�ٿ� ĳ����
		
		
		//��׸� ���α׷���
		TreeDPrinterG<Powder> printerg = new TreeDPrinterG<Powder>();
		printerg.setMaterial(new Powder()); //Object�� �޾ұ� ������
		Powder powderg = printerg.getMaterial();
		System.out.println(printerg);
		
		TreeDPrinterG<Plastic> printerp = new TreeDPrinterG<Plastic>();
		printerp.setMaterial(new Plastic()); //Object�� �޾ұ� ������
		Plastic plastic = printerp.getMaterial();
		System.out.println(printerp);
		
		//water�� �ȳ����� ��
	//	TreeDPrinterG<Water> printerw = new TreeDPrinterG<Water>();
	//	printerw.setMaterial(new Water()); //Object�� �޾ұ� ������
	//	System.out.println(printerw);  
		
		
		printerp.printing();
		
		
	}

}
