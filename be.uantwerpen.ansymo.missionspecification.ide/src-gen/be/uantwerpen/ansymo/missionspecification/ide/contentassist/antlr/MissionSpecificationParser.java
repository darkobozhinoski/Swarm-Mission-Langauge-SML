/*
 * generated by Xtext 2.10.0
 */
package be.uantwerpen.ansymo.missionspecification.ide.contentassist.antlr;

import be.uantwerpen.ansymo.missionspecification.ide.contentassist.antlr.internal.InternalMissionSpecificationParser;
import be.uantwerpen.ansymo.missionspecification.services.MissionSpecificationGrammarAccess;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class MissionSpecificationParser extends AbstractContentAssistParser {

	@Inject
	private MissionSpecificationGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMissionSpecificationParser createParser() {
		InternalMissionSpecificationParser result = new InternalMissionSpecificationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getScopeAccess().getAlternatives(), "rule__Scope__Alternatives");
					put(grammarAccess.getPatternAccess().getAlternatives(), "rule__Pattern__Alternatives");
					put(grammarAccess.getOccurenceAccess().getAlternatives(), "rule__Occurence__Alternatives");
					put(grammarAccess.getOrderAccess().getAlternatives(), "rule__Order__Alternatives");
					put(grammarAccess.getPropositionAccess().getAlternatives(), "rule__Proposition__Alternatives");
					put(grammarAccess.getBooleanExpressionAccess().getAlternatives(), "rule__BooleanExpression__Alternatives");
					put(grammarAccess.getBinaryExpressionAccess().getAlternatives(), "rule__BinaryExpression__Alternatives");
					put(grammarAccess.getInstanceAccess().getAlternatives(), "rule__Instance__Alternatives");
					put(grammarAccess.getInstanceDeclAccess().getAlternatives_0(), "rule__InstanceDecl__Alternatives_0");
					put(grammarAccess.getAssociationAccess().getAlternatives(), "rule__Association__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getBoolLiteralAccess().getValueAlternatives_0(), "rule__BoolLiteral__ValueAlternatives_0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getScopeAccess().getGroup_0(), "rule__Scope__Group_0__0");
					put(grammarAccess.getScopeAccess().getGroup_1(), "rule__Scope__Group_1__0");
					put(grammarAccess.getScopeAccess().getGroup_2(), "rule__Scope__Group_2__0");
					put(grammarAccess.getScopeAccess().getGroup_3(), "rule__Scope__Group_3__0");
					put(grammarAccess.getScopeAccess().getGroup_4(), "rule__Scope__Group_4__0");
					put(grammarAccess.getUniversalityAccess().getGroup(), "rule__Universality__Group__0");
					put(grammarAccess.getAbsenceAccess().getGroup(), "rule__Absence__Group__0");
					put(grammarAccess.getExistenceAccess().getGroup(), "rule__Existence__Group__0");
					put(grammarAccess.getBoundedExistenceAccess().getGroup(), "rule__BoundedExistence__Group__0");
					put(grammarAccess.getPrecedenceAccess().getGroup(), "rule__Precedence__Group__0");
					put(grammarAccess.getPrecedenceAccess().getGroup_13(), "rule__Precedence__Group_13__0");
					put(grammarAccess.getResponseAccess().getGroup(), "rule__Response__Group__0");
					put(grammarAccess.getResponseAccess().getGroup_2(), "rule__Response__Group_2__0");
					put(grammarAccess.getResponseAccess().getGroup_8(), "rule__Response__Group_8__0");
					put(grammarAccess.getPropositionAccess().getGroup_0(), "rule__Proposition__Group_0__0");
					put(grammarAccess.getPropositionAccess().getGroup_1(), "rule__Proposition__Group_1__0");
					put(grammarAccess.getPropositionAccess().getGroup_1_1(), "rule__Proposition__Group_1_1__0");
					put(grammarAccess.getAtomicPropositionAccess().getGroup(), "rule__AtomicProposition__Group__0");
					put(grammarAccess.getAtomicPropositionAccess().getGroup_1(), "rule__AtomicProposition__Group_1__0");
					put(grammarAccess.getAtomicPropositionAccess().getGroup_1_2(), "rule__AtomicProposition__Group_1_2__0");
					put(grammarAccess.getAtomicPropositionAccess().getGroup_2(), "rule__AtomicProposition__Group_2__0");
					put(grammarAccess.getAtomicPropositionAccess().getGroup_2_2(), "rule__AtomicProposition__Group_2_2__0");
					put(grammarAccess.getAtomicPropositionAccess().getGroup_2_2_2(), "rule__AtomicProposition__Group_2_2_2__0");
					put(grammarAccess.getBooleanExpressionAccess().getGroup_2(), "rule__BooleanExpression__Group_2__0");
					put(grammarAccess.getBinaryExpressionAccess().getGroup_0(), "rule__BinaryExpression__Group_0__0");
					put(grammarAccess.getBinaryExpressionAccess().getGroup_1(), "rule__BinaryExpression__Group_1__0");
					put(grammarAccess.getBinaryExpressionAccess().getGroup_2(), "rule__BinaryExpression__Group_2__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup(), "rule__UnaryExpression__Group__0");
					put(grammarAccess.getInstanceDeclAccess().getGroup(), "rule__InstanceDecl__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup_0(), "rule__Association__Group_0__0");
					put(grammarAccess.getAssociationAccess().getGroup_1(), "rule__Association__Group_1__0");
					put(grammarAccess.getAssociationAccess().getGroup_2(), "rule__Association__Group_2__0");
					put(grammarAccess.getAssociationAccess().getGroup_3(), "rule__Association__Group_3__0");
					put(grammarAccess.getAssociationAccess().getGroup_4(), "rule__Association__Group_4__0");
					put(grammarAccess.getAssociationAccess().getGroup_5(), "rule__Association__Group_5__0");
					put(grammarAccess.getAssociationAccess().getGroup_6(), "rule__Association__Group_6__0");
					put(grammarAccess.getAssociationAccess().getGroup_7(), "rule__Association__Group_7__0");
					put(grammarAccess.getAssociationAccess().getGroup_8(), "rule__Association__Group_8__0");
					put(grammarAccess.getAssociationAccess().getGroup_9(), "rule__Association__Group_9__0");
					put(grammarAccess.getAssociationAccess().getGroup_10(), "rule__Association__Group_10__0");
					put(grammarAccess.getAssociationAccess().getGroup_11(), "rule__Association__Group_11__0");
					put(grammarAccess.getAssociationAccess().getGroup_12(), "rule__Association__Group_12__0");
					put(grammarAccess.getAssociationAccess().getGroup_13(), "rule__Association__Group_13__0");
					put(grammarAccess.getAssociationAccess().getGroup_14(), "rule__Association__Group_14__0");
					put(grammarAccess.getAssociationAccess().getGroup_15(), "rule__Association__Group_15__0");
					put(grammarAccess.getAssociationAccess().getGroup_16(), "rule__Association__Group_16__0");
					put(grammarAccess.getAssociationAccess().getGroup_17(), "rule__Association__Group_17__0");
					put(grammarAccess.getSignedIntAccess().getGroup(), "rule__SignedInt__Group__0");
					put(grammarAccess.getSignedRealAccess().getGroup(), "rule__SignedReal__Group__0");
					put(grammarAccess.getMissionSpecificationAccess().getPropertiesAssignment(), "rule__MissionSpecification__PropertiesAssignment");
					put(grammarAccess.getPropertyAccess().getScopeAssignment_0(), "rule__Property__ScopeAssignment_0");
					put(grammarAccess.getPropertyAccess().getPatternAssignment_2(), "rule__Property__PatternAssignment_2");
					put(grammarAccess.getScopeAccess().getRAssignment_1_2(), "rule__Scope__RAssignment_1_2");
					put(grammarAccess.getScopeAccess().getQAssignment_2_2(), "rule__Scope__QAssignment_2_2");
					put(grammarAccess.getScopeAccess().getQAssignment_3_2(), "rule__Scope__QAssignment_3_2");
					put(grammarAccess.getScopeAccess().getRAssignment_3_5(), "rule__Scope__RAssignment_3_5");
					put(grammarAccess.getScopeAccess().getQAssignment_4_2(), "rule__Scope__QAssignment_4_2");
					put(grammarAccess.getScopeAccess().getRAssignment_4_5(), "rule__Scope__RAssignment_4_5");
					put(grammarAccess.getUniversalityAccess().getPAssignment_6(), "rule__Universality__PAssignment_6");
					put(grammarAccess.getAbsenceAccess().getPAssignment_6(), "rule__Absence__PAssignment_6");
					put(grammarAccess.getExistenceAccess().getPAssignment_0(), "rule__Existence__PAssignment_0");
					put(grammarAccess.getBoundedExistenceAccess().getPAssignment_0(), "rule__BoundedExistence__PAssignment_0");
					put(grammarAccess.getBoundedExistenceAccess().getNAssignment_4(), "rule__BoundedExistence__NAssignment_4");
					put(grammarAccess.getPrecedenceAccess().getPAssignment_1(), "rule__Precedence__PAssignment_1");
					put(grammarAccess.getPrecedenceAccess().getSAssignment_12(), "rule__Precedence__SAssignment_12");
					put(grammarAccess.getResponseAccess().getPAssignment_1(), "rule__Response__PAssignment_1");
					put(grammarAccess.getResponseAccess().getSAssignment_7(), "rule__Response__SAssignment_7");
					put(grammarAccess.getPropositionAccess().getPropsAssignment_1_0(), "rule__Proposition__PropsAssignment_1_0");
					put(grammarAccess.getPropositionAccess().getPropsAssignment_1_1_2(), "rule__Proposition__PropsAssignment_1_1_2");
					put(grammarAccess.getAtomicPropositionAccess().getInstAssignment_0(), "rule__AtomicProposition__InstAssignment_0");
					put(grammarAccess.getAtomicPropositionAccess().getCondAssignment_1_1(), "rule__AtomicProposition__CondAssignment_1_1");
					put(grammarAccess.getAtomicPropositionAccess().getCondAssignment_1_2_1(), "rule__AtomicProposition__CondAssignment_1_2_1");
					put(grammarAccess.getAtomicPropositionAccess().getAssocAssignment_2_0(), "rule__AtomicProposition__AssocAssignment_2_0");
					put(grammarAccess.getAtomicPropositionAccess().getInst2Assignment_2_1(), "rule__AtomicProposition__Inst2Assignment_2_1");
					put(grammarAccess.getAtomicPropositionAccess().getCond2Assignment_2_2_1(), "rule__AtomicProposition__Cond2Assignment_2_2_1");
					put(grammarAccess.getAtomicPropositionAccess().getCond2Assignment_2_2_2_1(), "rule__AtomicProposition__Cond2Assignment_2_2_2_1");
					put(grammarAccess.getBooleanExpressionAccess().getAttrAssignment_2_1(), "rule__BooleanExpression__AttrAssignment_2_1");
					put(grammarAccess.getBinaryExpressionAccess().getAttrAssignment_0_1(), "rule__BinaryExpression__AttrAssignment_0_1");
					put(grammarAccess.getBinaryExpressionAccess().getValAssignment_0_3(), "rule__BinaryExpression__ValAssignment_0_3");
					put(grammarAccess.getBinaryExpressionAccess().getAttrAssignment_1_1(), "rule__BinaryExpression__AttrAssignment_1_1");
					put(grammarAccess.getBinaryExpressionAccess().getValAssignment_1_4(), "rule__BinaryExpression__ValAssignment_1_4");
					put(grammarAccess.getBinaryExpressionAccess().getAttrAssignment_2_1(), "rule__BinaryExpression__AttrAssignment_2_1");
					put(grammarAccess.getBinaryExpressionAccess().getValAssignment_2_4(), "rule__BinaryExpression__ValAssignment_2_4");
					put(grammarAccess.getUnaryExpressionAccess().getAttrAssignment_2(), "rule__UnaryExpression__AttrAssignment_2");
					put(grammarAccess.getInstanceDeclAccess().getTypeAssignment_1(), "rule__InstanceDecl__TypeAssignment_1");
					put(grammarAccess.getInstanceDeclAccess().getNameAssignment_2(), "rule__InstanceDecl__NameAssignment_2");
					put(grammarAccess.getInstanceRefAccess().getRefAssignment(), "rule__InstanceRef__RefAssignment");
					put(grammarAccess.getTypeAccess().getNameAssignment(), "rule__Type__NameAssignment");
					put(grammarAccess.getAttributeAccess().getNameAssignment(), "rule__Attribute__NameAssignment");
					put(grammarAccess.getIntLiteralAccess().getValueAssignment(), "rule__IntLiteral__ValueAssignment");
					put(grammarAccess.getRealLiteralAccess().getValueAssignment(), "rule__RealLiteral__ValueAssignment");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
					put(grammarAccess.getBoolLiteralAccess().getValueAssignment(), "rule__BoolLiteral__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMissionSpecificationParser typedParser = (InternalMissionSpecificationParser) parser;
			typedParser.entryRuleMissionSpecification();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MissionSpecificationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MissionSpecificationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
