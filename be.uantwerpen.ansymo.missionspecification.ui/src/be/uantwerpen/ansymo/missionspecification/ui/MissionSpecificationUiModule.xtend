/*
 * generated by Xtext 2.10.0
 */
package be.uantwerpen.ansymo.missionspecification.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import be.uantwerpen.ansymo.missionspecification.ui.editor.syntaxcoloring.MissionSpecificationHighlightingConfiguration
import be.uantwerpen.ansymo.missionspecification.ui.editor.syntaxcoloring.MissionSpecificationAntlrTokenToAttributeIdMapper
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator
import be.uantwerpen.ansymo.missionspecification.ui.editor.syntaxcoloring.MissionSpecificationSemanticHighlightingCalculator

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class MissionSpecificationUiModule extends AbstractMissionSpecificationUiModule {
	def Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return MissionSpecificationHighlightingConfiguration
	}
	
	/*def Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return MissionSpecificationAntlrTokenToAttributeIdMapper
	}*/
	
	def Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return MissionSpecificationSemanticHighlightingCalculator
	}
}
