/*
 * generated by Xtext 2.10.0
 */
package be.uantwerpen.ansymo.missionspecification.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MissionSpecificationAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("be/uantwerpen/ansymo/missionspecification/parser/antlr/internal/InternalMissionSpecification.tokens");
	}
}