package com.thedarkera.updatechecker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.thedarkera.TheDarkEra;

public class UpdateChecker
{
	public static String updates = "";
	public static boolean outdated = false;

	public static void checkForUpdates()
	{
		int currentVersion = TheDarkEra.MODVERSION;
		int nextVersion = getNewest();

		if (currentVersion < nextVersion)
		{
			updates = getUpdate(nextVersion);
			outdated = true;
		}
		else
		{
			outdated = false;
		}
	}

	public static int getNewest()
	{
		try
		{
			URL url = new URL("http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/wip-mods/2390470-the-dark-era-mod-in-progress-open-source");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setRequestProperty("Content-Language", "en-US");
			connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 5.1) AppleWebKit/535.11 (KHTML, like Gecko) Chrome/17.0.963.56 Safari/535.11");

			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);

			InputStream is = connection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line;
			StringBuffer response = new StringBuffer();

			while ((line = br.readLine()) != null)
			{
				response.append(line);

			}
			br.close();

			return Integer.parseInt(response.toString());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return -1;
	}

	private static String getUpdate(int version)
	{
		try
		{
			URL url = new URL("http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/wip-mods/2390470-the-dark-era-mod-in-progress-open-source/" + version + ".txt");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setRequestProperty("Content-Language", "en-US");
			connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 5.1) AppleWebKit/535.11 (KHTML, like Gecko) Chrome/17.0.963.56 Safari/535.11");

			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);

			InputStream is = connection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line;
			StringBuffer response = new StringBuffer();

			while ((line = br.readLine()) != null)
			{
				response.append(line);

			}
			br.close();

			return response.toString();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return "Error";
	}
}