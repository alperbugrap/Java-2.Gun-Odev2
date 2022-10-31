package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
		krediUI.KrediHesapla(new TarimKrediManager());
	}

}
