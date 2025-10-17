package maquinas;

public class MaquinaVending {
	
		private final int maximoRefrescos;
		private final int maximoGominolas;
		private int numeroGominolas;
		private int numeroRefrescos;
		
		public MaquinaVending (int maximoGominolas, int maximoRefrescos) { //Crea la maquina con nº gominolas y nº refrescos
			this.maximoGominolas = maximoGominolas;
			this.maximoRefrescos = maximoRefrescos;
			
			System.out.println("Se ha creado una maquina con " + maximoGominolas + " gominolas y " + maximoRefrescos + " refrescos");
		}
		
		public void comprarResfrescos(int refrescosComprados) { //Compra x número de refrescos
			this.numeroRefrescos = this.maximoRefrescos - refrescosComprados;
			System.out.println("Has comprado " + refrescosComprados + " refrescos con éxito, aún quedan " + this.numeroRefrescos + " refrescos en la máquina.");
		}
		
		public void comprarGominolas(int gominolasCompradas) { //Compra x número de gominolas
			this.numeroGominolas = this.maximoGominolas - gominolasCompradas;
			System.out.println("Has comprado " + gominolasCompradas + " gominolas con éxito, aún quedan " + this.numeroGominolas + " gominolas en la máquina.");
		}
		
		public void reponerGominolas(int gominolasRellenas) { //Repone las gominolas hasta su máximo
			if (this.numeroGominolas < this.maximoGominolas) {
				this.numeroGominolas = this.maximoGominolas;
				System.out.println("Has repuesto las gominolas, vuelve a haber " + this.maximoGominolas);
			}
		}
		
		public void reponerRefrescos(int refrescosRellenos) { //Repone los refrescos hasta su máximo
			if (this.numeroRefrescos < this.maximoRefrescos) {
				this.numeroRefrescos = this.maximoRefrescos;
				System.out.println("Has repuesto los refrescos, vuelve a haber " + this.maximoRefrescos);
			}
		}
		
		public void reponerMaquinaEntera(int refrescosRellenos, int gominolasRellenas) { //Rellena la máquina a su máximo.
			if (this.numeroRefrescos < this.maximoRefrescos) {
				this.numeroRefrescos = this.maximoRefrescos;
				}
			if (this.numeroGominolas < this.maximoGominolas) {
				this.numeroGominolas = this.maximoGominolas;
				}
			System.out.println("Has repuesto la máquina al completo, vuelve a haber " + this.maximoRefrescos + " refrescos y " + this.maximoGominolas + " gominolas.");
		}
		
		
		public void estadoMaquina() {
			System.out.println("La máquina actualmente tiene " + this.numeroGominolas + " gominolas y " + this.numeroRefrescos + " refrescos.");
		}
		
		public int getGominolas() {
			return numeroGominolas;
		}
		
		public int getRefrescos() {
			return numeroRefrescos;
		}
}
