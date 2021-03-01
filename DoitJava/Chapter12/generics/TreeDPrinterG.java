package generics;

public class TreeDPrinterG <T extends Material>{ //water를 사용하지 못하게 하기위해
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
		
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
