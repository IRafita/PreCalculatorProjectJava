package src;

/* Els objectes que farem anar */
import src.System.ControlerSystem;
import src.Intermedia.ControlerIntermedia_HumaMaquina_;

/**
  * Tronc principal de tot el programa
  *
  * Comunica basicament de Entrada Sortida als objectes que faran totes les operacions desitjades
  */
public class InicialitzadorCentral
{
/* Els objectes que necessito per aquest controlador */
	private ControlerSystem		system;
	private ControlerIntermedia	intermedia;

/**
  * Inicialitza tot el sistema
  */
	public InicialitzadorCentral ()
	{
		System.out.println ("ControlerCentral: Sistema arrancant");
		system		= new ControlerSystem		(this);
		intermedia	= new ControlerIntermedia	(this);
		System.out.println ("ControlerCentral: Adeu, Ja ha finalitzat");
	}

	public void Begin () { system.Normal (); }
}