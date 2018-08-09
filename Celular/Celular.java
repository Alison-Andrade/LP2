public class Celular{

	private int saldo;

	public Celular(){
		saldo = 1000;
	}

	public Celular(int saldo_){
		if (saldo_ > 0) {
			this.saldo = saldo_;
		} else {
			this.saldo = 1000;
		}

	}

	public int getSaldo(){
		return this.saldo;
	}

	public void topUp(int valor){
		if (valor > 0) {
			this.saldo += valor;
		}else{
			System.out.println("Não foi possível realizar a recarga. Valor inválido!");
		}
	}

	public void debitar(int valor){
		if (valor > 0) {
			if (valor > saldo) {
				System.out.println("Não há saldo suficiente!");	
			}else{
				this.saldo -= valor;
			}
		}else {
			System.out.println("Não foi possível realizar a recarga. Valor inválido!");
		}
	}

}