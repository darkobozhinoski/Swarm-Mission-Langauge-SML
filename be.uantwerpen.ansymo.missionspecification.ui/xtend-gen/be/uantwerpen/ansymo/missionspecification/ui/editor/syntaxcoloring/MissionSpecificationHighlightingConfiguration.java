package be.uantwerpen.ansymo.missionspecification.ui.editor.syntaxcoloring;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class MissionSpecificationHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public final static String TEMPORAL_PATTERN = "temporal_pattern";
  
  public final static String SCOPE = "scope";
  
  public final static String PROPOSITION = "proposition";
  
  public final static String CLASS = "class";
  
  public final static String ATTRIBUTE = "attribute";
  
  public final static String VARIABLE = "variable";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    super.configure(acceptor);
    TextStyle _temporalPatternTextStyle = this.temporalPatternTextStyle();
    acceptor.acceptDefaultHighlighting(MissionSpecificationHighlightingConfiguration.TEMPORAL_PATTERN, "Temporal Pattern", _temporalPatternTextStyle);
    TextStyle _temporalPatternTextStyle_1 = this.temporalPatternTextStyle();
    acceptor.acceptDefaultHighlighting(MissionSpecificationHighlightingConfiguration.SCOPE, "Scope", _temporalPatternTextStyle_1);
    TextStyle _propositionTextStyle = this.propositionTextStyle();
    acceptor.acceptDefaultHighlighting(MissionSpecificationHighlightingConfiguration.PROPOSITION, "Proposition", _propositionTextStyle);
    TextStyle _classTextStyle = this.classTextStyle();
    acceptor.acceptDefaultHighlighting(MissionSpecificationHighlightingConfiguration.CLASS, "Class", _classTextStyle);
    TextStyle _attributeTextStyle = this.attributeTextStyle();
    acceptor.acceptDefaultHighlighting(MissionSpecificationHighlightingConfiguration.ATTRIBUTE, "Attribute", _attributeTextStyle);
    TextStyle _variableTextStyle = this.variableTextStyle();
    acceptor.acceptDefaultHighlighting(MissionSpecificationHighlightingConfiguration.VARIABLE, "Variable", _variableTextStyle);
  }
  
  public TextStyle temporalPatternTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    textStyle.setStyle(1);
    RGB _rGB = new RGB(177, 0, 115);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  public TextStyle propositionTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    textStyle.setStyle(1);
    RGB _rGB = new RGB(127, 0, 85);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  public TextStyle classTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    textStyle.setStyle(0);
    RGB _rGB = new RGB(55, 30, 155);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  public TextStyle attributeTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    textStyle.setStyle(2);
    RGB _rGB = new RGB(55, 155, 30);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  public TextStyle variableTextStyle() {
    TextStyle _defaultTextStyle = this.defaultTextStyle();
    final TextStyle textStyle = _defaultTextStyle.copy();
    textStyle.setStyle(2);
    RGB _rGB = new RGB(30, 105, 15);
    textStyle.setColor(_rGB);
    return textStyle;
  }
}
