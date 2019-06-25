package br.unilasalle;

public class PedalPop extends UrbanBike implements Imprimivel{
	private double taxa;
	private double aux;
	
	@Override
	protected double creditar(double creditar) {
		this.addCredito = creditar;
		
		if(carteira < creditar + (creditar * taxa)) {
			System.out.println("Valor creditado insuficiente! Favor, colocar mais creditos...");
		}else carteira = (carteira + creditar) - (creditar * taxa);
		
		if(creditar >= 100) {
			System.out.println("Parabens, voce agora eh premium!");
			premium = true;
		}else premium = false;
		
		return carteira;
	}
	
	@Override
	protected double pedalar(double pedalar) {
		this.km = pedalar;
		if(premium != true){
			if(carteira < pedalar + (pedalar * taxa)) {
				System.out.println("Valor creditado insuficiente! Favor, colocar mais creditos...");
			}else carteira = carteira - (pedalar + (pedalar * taxa));
		}
		return carteira;
	}
	
	protected void setTaxa(double tax) {
		this.taxa = tax;
		taxa = taxa/100;
		aux = taxa;
		System.out.println("Voce aplicou uma taxa de " + aux *100 + "%, sobre compras e vendas!");
	}

	public void mostraDados() {
		if(premium != true) {
			System.out.println("ID: " + getNumeroConta() + ".");
			System.out.println("Saldo: R$" + getCarteira() + ".");
			System.out.println("Tipo de conta: POP.");
		}
	}
}
