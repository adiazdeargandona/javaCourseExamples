package practica07.ui;

import practica07.dominio.Figura;

import java.awt.Canvas;
import java.awt.Graphics;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;

public class Lienzo extends Canvas
{
	private java.util.HashMap<String, Collection<Figura>> figuras = new java.util.HashMap<String, Collection<Figura>>();

	public void pintar(String grupo, Figura figura)
	{
		Collection<Figura> figurasGrupo = figuras.get(grupo);
		if(figurasGrupo==null)
			figurasGrupo = new ArrayList<Figura>();

		figurasGrupo.add(figura);
		figuras.put(grupo, figurasGrupo);
	}

	public void setVisibleGrupo(String grupo, boolean visible)
	{
		Collection<Figura> figurasGrupo = figuras.get(grupo);
		if(figurasGrupo!=null)
		{
			for(Figura figura:figurasGrupo)
				figura.setVisible(visible);
		}
	}	

	public void setVisibleTodasFiguras(boolean visible)
	{
		for(Collection<Figura> figuras:figuras.values())
			for(Figura figura:figuras)
				figura.setVisible(visible);
	}

	@Override
	public void paint(Graphics g)
	{
		for(Collection<Figura> figuras:figuras.values())
			for(Figura figura:figuras)
				if(figura.isVisible())
					figura.pintar(g);
	}
}
