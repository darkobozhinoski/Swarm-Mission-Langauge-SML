package be.uantwerpen.ansymo.missionspecification.ui.editor.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.SWT

public class MissionSpecificationHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public static final String TEMPORAL_PATTERN = "temporal_pattern"
	public static final String SCOPE = "scope"
	public static final String PROPOSITION = "proposition"
	public static final String CLASS = "class"
	public static final String ATTRIBUTE = "attribute"
	public static final String VARIABLE = "variable"
	
	override configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor)
		acceptor.acceptDefaultHighlighting(TEMPORAL_PATTERN, "Temporal Pattern", temporalPatternTextStyle())
		acceptor.acceptDefaultHighlighting(SCOPE, "Scope", temporalPatternTextStyle())
		acceptor.acceptDefaultHighlighting(PROPOSITION, "Proposition", propositionTextStyle())
		acceptor.acceptDefaultHighlighting(CLASS, "Class", classTextStyle())
		acceptor.acceptDefaultHighlighting(ATTRIBUTE, "Attribute", attributeTextStyle())
		acceptor.acceptDefaultHighlighting(VARIABLE, "Variable", variableTextStyle())
	}
	
	def temporalPatternTextStyle() { 
		val textStyle = defaultTextStyle().copy()
		textStyle.style = 1
		textStyle.color = new RGB(177, 0, 115)
		return textStyle
	}
	
	def propositionTextStyle() {
		val textStyle = defaultTextStyle().copy()
		textStyle.style = 1
		textStyle.color = new RGB(127, 0, 85)
		return textStyle
	}
	
	def classTextStyle() { 
		val textStyle = defaultTextStyle().copy()
		textStyle.style = 0
		textStyle.color = new RGB(55, 30, 155)
		return textStyle
	}
	
	def attributeTextStyle() { 
		val textStyle = defaultTextStyle().copy()
		textStyle.style = 2
		textStyle.color = new RGB(55, 155, 30)
		return textStyle
	}
	
	def variableTextStyle() { 
		val textStyle = defaultTextStyle().copy()
		textStyle.style = 2
		textStyle.color = new RGB(30, 105, 15)
		return textStyle
	}
}
