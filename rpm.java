package rpm;

import java.io.IOException;

public class rpm {
	public static void main(String[] args) throws IOException
	{
		if(args[0] == "-i")
		{
			String file = args[1];
			String install = "sh -c bsdtar -xf " + file + " -C /";
			Runtime.getRuntime().exec(install);
			System.out.println("Installation completed!");
		}
	}
}
