package atividade06;

public class Main {
	
	public static void main(String[] args) {

		Smartphone x = new Smartphone ("ASUS");
	
		System.out.println(x.getTipoAparelho());
		x.carregar();
		System.out.println(x.toString());
		System.out.println("Bateria: mAh" + x.getMAH());
		System.out.println(x.getModeloProcessador());
		System.out.println("Potencia: " + x.getPotencia());
		System.out.println("Tela: " + x.getTipoTela());
	
}

}
