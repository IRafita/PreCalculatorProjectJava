package src.System.Modes;

/* El Controlador superior */
import src.System.ControlerSystem;

// Aquest pot asustar pel nombre que pot arribar a qui?
// El plantejament de makejar es curios. ja veurem que arribarem a fer
/* Els sub Controladors */
import src.System.Modes.Type.Normal;
import src.System.Modes.Type.WriteTyped;

public class ControlerModes
{
/* Els objectes que necessito per aquest controlador */
	private ControlerSystem	up;
	private Normal		normal;
	private WriteTyped	WT;

	public ControlerModes (ControlerSystem e)
	{
		System.out.println ("Controler Modes: No fa RES");
		up	= e;
		normal	= new Normal		(this);
		WT	= new WriteTyped	(this);
	}

	public char ReadKey		() { return up.ReadKey (); }
	public void ShowWindows (String e) { up.ShowWindows (e); }
	public void NormalNormalKey	() { normal.NormalKey (); }
	public void WriteTypedKey	() { WT.NormalKey (); }
}
