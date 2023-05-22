package Models;

public class GerenciadorDeElementos {
	
	public void ObterInformacoes (Object obj) {	
		System.out.println("+------------------------------------------------------+");
		System.out.println(obj.toString());
		System.out.println("+------------------------------------------------------+");
	}
	
	public void ObterInformacoes (Object obj1 , Object obj2) {	
		System.out.println("+------------------------------------------------------+");
		System.out.println(obj1.toString());
		System.out.println("+------------------------------------------------------+");
		System.out.println();
		System.out.println("+------------------------------------------------------+");
		System.out.println(obj2.toString());
		System.out.println("+------------------------------------------------------+");
	}
	public void ObterInformacoes (Object obj1 , Object obj2, Object obj3) {	
		System.out.println("+------------------------------------------------------+");
		System.out.println(obj1.toString());
		System.out.println("+------------------------------------------------------+");
		System.out.println();
		System.out.println("+------------------------------------------------------+");
		System.out.println(obj2.toString());
		System.out.println("+------------------------------------------------------+");
		System.out.println();
		System.out.println("+------------------------------------------------------+");
		System.out.println(obj3.toString());
		System.out.println("+------------------------------------------------------+");
	}


}
