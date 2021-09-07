package be.uantwerpen.ansymo.missionspecification.ui.editor.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class MissionSpecificationAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	// only knows of tokens
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		String defaultVal = super.calculateId(tokenName, tokenType);
		//System.out.println(tokenName + "  " + tokenType);
		if("RULE_STRING".equals(tokenName)) {
			return MissionSpecificationHighlightingConfiguration.ATTRIBUTE;
		}
		return defaultVal;
	}
}

/*package be.uantwerpen.ansymo.missionspecification.ui.editor.syntaxcoloring;
 

import org.eclipse.swt.SWT; 
import org.eclipse.swt.graphics.RGB; 
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration; 
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor; 
import org.eclipse.xtext.ui.editor.utils.TextStyle; 

@SuppressWarnings("all") 
public class CharacterScriptHighlightingConfiguration extends DefaultHighlightingConfiguration { 
	public final static String FEATURE_KEYWORD = "featureKeyword"; 

	public final static String MY_COMMENT_ID = "myComment"; 

	public void configure(final IHighlightingConfigurationAcceptor acceptor) { 
		super.configure(acceptor); 
		TextStyle _myCommentTextStyle = this.myCommentTextStyle(); 
		acceptor.acceptDefaultHighlighting(CharacterScriptHighlightingConfiguration.MY_COMMENT_ID, "SemanticComment", _myCommentTextStyle); 
		TextStyle _featureKeywordTextStyle = this.featureKeywordTextStyle(); 
		acceptor.acceptDefaultHighlighting(CharacterScriptHighlightingConfiguration.FEATURE_KEYWORD, "FeatureKeyword", _featureKeywordTextStyle); 
	} 

	public TextStyle featureKeywordTextStyle() { 
		TextStyle _xblockexpression = null; 
		{ 
			TextStyle _textStyle = new TextStyle(); 
			TextStyle textStyle = _textStyle; 
			RGB _rGB = new RGB(129, 62, 0); 
			textStyle.setColor(_rGB); 
			textStyle.setStyle(SWT.ITALIC); 
			_xblockexpression = (textStyle); 
		} 
		return _xblockexpression; 
	} 

	private TextStyle myCommentTextStyle() { 
		TextStyle _textStyle = new TextStyle(); 
		final TextStyle textStyle = _textStyle; 
		RGB _rGB = new RGB(88, 88, 88); 
		textStyle.setColor(_rGB); 
		textStyle.setStyle(SWT.ITALIC); 
		return textStyle; 
	} 
}*/

//public static final String EXP_ELT = "exp"; 
//
//public void configure(IHighlightingConfigurationAcceptor acceptor) { 
//	addType(acceptor, "exp"); 
//} 
//
//public void addType( IHighlightingConfigurationAcceptor acceptor, String s)  { 
//	TextStyle textStyle = new TextStyle(); 
//	textStyle.setBackgroundColor(new RGB(255, 255, 255)); 
//	textStyle.setColor(new RGB(50, 0, 0)); 
//	textStyle.setStyle(SWT.BOLD); 
//	acceptor.acceptDefaultHighlighting(s, s, textStyle); 
//} 
//} 