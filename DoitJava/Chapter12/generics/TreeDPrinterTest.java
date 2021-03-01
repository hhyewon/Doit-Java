package generics;

public class TreeDPrinterTest {

	public static void main(String[] args) {

		TreeDPrinter printer = new TreeDPrinter();
		printer.setMaterial(new Powder()); //Object로 받았기 때문에
		Powder powder = (Powder)printer.getMaterial(); //다운 캐스팅
		
		
		//재네릭 프로그래밍
		TreeDPrinterG<Powder> printerg = new TreeDPrinterG<Powder>();
		printerg.setMaterial(new Powder()); //Object로 받았기 때문에
		Powder powderg = printerg.getMaterial();
		System.out.println(printerg);
		
		TreeDPrinterG<Plastic> printerp = new TreeDPrinterG<Plastic>();
		printerp.setMaterial(new Plastic()); //Object로 받았기 때문에
		Plastic plastic = printerp.getMaterial();
		System.out.println(printerp);
		
		//water를 안나오게 함
	//	TreeDPrinterG<Water> printerw = new TreeDPrinterG<Water>();
	//	printerw.setMaterial(new Water()); //Object로 받았기 때문에
	//	System.out.println(printerw);  
		
		
		printerp.printing();
		
		
	}

}
