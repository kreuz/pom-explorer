package fr.lteconsulting.pomexplorer.web.commands;

import fr.lteconsulting.pomexplorer.PomAnalyzer;
import fr.lteconsulting.pomexplorer.WorkingSession;

public class AnalyzeCommand
{
	@Help( "analyse all the pom files in a directory, recursively" )
	public String directory( WorkingSession session, String directory )
	{
		PomAnalyzer analyzer = new PomAnalyzer();
		analyzer.analyze( directory, session );

		return "Analyzis completed for '" + directory + "'.";
	}
}
