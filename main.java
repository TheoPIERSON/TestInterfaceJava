package animaux;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yassine yassine = new Yassine();
		yassine.crier();
		Chat minouche = new Chat("minouche", "3arbi",8);
		minouche.crier();
		minouche.vieillir(4);
		
		System.out.println(minouche.getAge());
		minouche.vieillir();
		
		System.out.println(minouche.getAge());
		//Chien medor = new Chien();
		//medor.crier();
	}

}

