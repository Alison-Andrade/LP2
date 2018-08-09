public class Main{
	public static void main(String[] args) {
		Celular cel = new Celular(1000);
		System.out.println(cel.getSaldo());

		cel.topUp(500);
		System.out.println(cel.getSaldo());
		cel.topUp(-400);

		cel.debitar(35);
		System.out.println(cel.getSaldo());

		cel.debitar(1500);
	}
}