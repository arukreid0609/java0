package java0;

public class Main4 {

	public static void main(String[] args) {
		final double PI = 3.14; // 円周率
		int pie = 5; // 半径
		
		System.out.println("半径"+ pie + "cmのパイの面積は");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");
		pie = 10;
		System.out.println("半径" + pie + "cmのパイの面積は");
		System.out.println(pie * pie * PI);

	}

}
