package atividade06;

public class Smartphone implements Processador, Aparelho, Bateria {
	
	private boolean carregado;
	private int porcentagem;
	private String marca; 
	
	
	
	public Smartphone(String marca) {
		this.setCarregado(false);
		this.setMarca(marca);
		this.setPorcentagem(0);
	}
	
	
	
	@Override
	public int getMAH() {
		return 8800;
	}

	@Override
	public void carregar() {
		System.out.println("smartphone carregado!");
		this.setCarregado(true);
		this.setPorcentagem(100);
	}

	@Override
	public int porcentagem() {
		return this.getPorcentagem();
	}

	@Override
	public String getTipoTela() {
		return "touch 7 pol";
	}

	@Override
	public String getTipoAparelho() {
		return "smartphone x";
	}

	@Override
	public String getModeloProcessador() {
		return "snapdragon 16g";
	}

	@Override
	public String getPotencia() {
		return "4.0 ";
	}

	public boolean getCarregado() {
		return carregado;
	}

	public void setCarregado(boolean carregado) {
		this.carregado = carregado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getPorcentagem() {
		return porcentagem;
	}



	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}



	@Override
	public String toString() {
		return "smartphone [carregado=" + carregado + ", porcentagem=" + porcentagem + ", marca=" + marca
				+ "]";
	}

}
