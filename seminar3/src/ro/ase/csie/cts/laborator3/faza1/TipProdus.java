package ro.ase.csie.cts.laborator3.faza1;

public enum TipProdus {
	NOU(0), DISCOUNT(0.1f), STOC_LIMITAT(025f), VECHI(0.35f);
	
	private final float discount;
	
	private TipProdus(float discount) {
		this.discount = discount;
	}
	
	public float getDiscount() {
		return this.discount;
	}
}
