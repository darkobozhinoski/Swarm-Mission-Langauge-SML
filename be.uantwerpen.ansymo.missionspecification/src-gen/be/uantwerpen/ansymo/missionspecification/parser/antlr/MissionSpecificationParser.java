/*
 * generated by Xtext 2.10.0
 */
package be.uantwerpen.ansymo.missionspecification.parser.antlr;

import be.uantwerpen.ansymo.missionspecification.parser.antlr.internal.InternalMissionSpecificationParser;
import be.uantwerpen.ansymo.missionspecification.services.MissionSpecificationGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MissionSpecificationParser extends AbstractAntlrParser {

	@Inject
	private MissionSpecificationGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMissionSpecificationParser createParser(XtextTokenStream stream) {
		return new InternalMissionSpecificationParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MissionSpecification";
	}

	public MissionSpecificationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MissionSpecificationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
