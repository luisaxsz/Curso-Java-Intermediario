package Enumeradores;

public class TesteDocumento {

	public static void main(String[] args) {
		for (TipoDocumento doc : TipoDocumento.values()) {
			System.out.println(doc + ": " + doc.geraNumeroTeste());
		}
		
		Pessoa pf = new Pessoa();
		pf.setTipoDocumento(TipoDocumento.CPF);
		pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
		
		Pessoa pj = new Pessoa();
		pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
		
		System.out.println(pf);
		System.out.println(pj);
	}

}
