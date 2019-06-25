package br.unilasalle;

public class PedalPop extends UrbanBike{
	private double taxa;
	private double aux;
	
	@Override
	protected double creditar(double creditar) {
		this.addCredito = creditar;
		carteira = (carteira + creditar) - (creditar * taxa);
		if(creditar >= 100) {
			System.out.println("Parabens, voce agora eh premium!");
			premium = true;
		}else premium = false;
		return carteira;
	}
	
	@Override
	protected double pedalar(double pedalar) {
		carteira = carteira - pedalar;
		return carteira;
	}
	
	protected void setTaxa(double tax) {
		this.taxa = tax;
		taxa = taxa/100;
		aux = taxa;
		System.out.println("Voce aplicou uma taxa de " + aux *100 + "%, sobre compras e vendas!");
	}
}
