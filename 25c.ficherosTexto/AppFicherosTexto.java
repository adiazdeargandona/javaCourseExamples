/** @author David Contreras */	
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class AppFicherosTexto
{
	public static void main(String args[])
	{
		AppFicherosTexto.escribeFicheroTexto();
		AppFicherosTexto.leeFicheroTexto();
	}

	private static void escribeFicheroTexto()
	{
		try
		{
			//No es necesario, sólo si deseamos añadir
			//FileWriter fw = new FileWriter("fichero.html", true); //APPEND
			PrintWriter pw = new PrintWriter("fichero.html");
			pw.println("<html>");
			pw.println("<h1>Coches</h1>");
			pw.println("<ul>");
			pw.println("<li>Mercedes</li>");
			pw.println("<li>Seat</li>");
			pw.println("<li>Ford</li>");
			pw.println("<li>Audi</li>");
			pw.println("<li>Jeep</li>");
			pw.println("</ul></html>");
			pw.close();
		}
		catch(IOException e)
		{
			//System.out.println("ERROR");
			e.printStackTrace();
		}
	}

	private static void leeFicheroTexto()
	{
		StringBuilder sb = new StringBuilder();
		try
		{
			FileReader fr = new FileReader("fichero.html");
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while(linea!=null)
			{
				if(linea.contains("<li>"))
					sb.append(linea.toUpperCase() + "\n");
				linea = br.readLine();
			}
			System.out.println(sb.toString());
			br.close();
			fr.close();
		}
		catch(IOException e)
		{
			//System.out.println("ERROR");
			e.printStackTrace();
		}
	}

}
