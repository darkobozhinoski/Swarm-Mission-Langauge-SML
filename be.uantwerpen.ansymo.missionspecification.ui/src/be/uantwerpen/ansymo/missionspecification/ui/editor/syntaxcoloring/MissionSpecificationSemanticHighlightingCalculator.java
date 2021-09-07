/**
 * 
 */
package be.uantwerpen.ansymo.missionspecification.ui.editor.syntaxcoloring;

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.emf.ecore.EObject;
import be.uantwerpen.ansymo.missionspecification.missionSpecification.*;

/**
 * @author Bart
 *
 */
public class MissionSpecificationSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {
	
	private static boolean debug;

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator arg2) {
	    if (resource == null) return;
	    
	    INode root = resource.getParseResult().getRootNode();
		BidiTreeIterator<INode> iter = root.getAsTreeIterable().iterator();
	    while (iter.hasNext()) {
	        INode node = iter.next();
	        //System.out.println(node.getClass().getName());
	        if (node instanceof CompositeNodeWithSemanticElement) {
		        EObject element = node.getSemanticElement();
	        	//System.out.println(node.getSemanticElement().getClass().getName());
		        if (element instanceof Type) {
		        	acceptor.addPosition(node.getOffset(), node.getLength(), MissionSpecificationHighlightingConfiguration.CLASS);
		        } else if (element instanceof InstanceDecl) {
	        		INode lastChild = ((CompositeNodeWithSemanticElement) node).getLastChild();
	        		if (lastChild.getSemanticElement() instanceof InstanceDecl) {
	        			acceptor.addPosition(lastChild.getOffset(), lastChild.getLength(), MissionSpecificationHighlightingConfiguration.VARIABLE);
	        		}
		        } else if (element instanceof InstanceRef) {
		        	acceptor.addPosition(node.getOffset(), node.getLength(), MissionSpecificationHighlightingConfiguration.VARIABLE);
		        } else if (element instanceof BinaryExpression) {
		        	INode lastChild = ((CompositeNodeWithSemanticElement) node).getLastChild();
		        	/*System.out.println("*****");
        			System.out.println(lastChild.getText());
	        		System.out.println(lastChild.getTotalTextRegionWithLineInformation());
	        		System.out.println(lastChild.getSemanticElement());
	        		System.out.println(lastChild.getGrammarElement());
	        		System.out.println(node.getText());
	        		System.out.println(node.getTotalTextRegionWithLineInformation());
	        		System.out.println(node.getGrammarElement());*/
	        		ArithmeticExpression val = ((BinaryExpression) element).getVal();
	        		if (val instanceof IntLiteral || val instanceof RealLiteral || val instanceof BoolLiteral) {
	        			acceptor.addPosition(lastChild.getOffset(), lastChild.getLength(), MissionSpecificationHighlightingConfiguration.NUMBER_ID);
	        		} else if (val instanceof StringLiteral) {
	        			acceptor.addPosition(lastChild.getOffset(), lastChild.getLength(), MissionSpecificationHighlightingConfiguration.STRING_ID);
	        		}
		        } else if (element instanceof Attribute) {
		        	acceptor.addPosition(node.getOffset(), node.getLength(), MissionSpecificationHighlightingConfiguration.ATTRIBUTE);
		        } else if (element instanceof Proposition) {
		        	_highlightTextLeafs(acceptor, node, MissionSpecificationHighlightingConfiguration.PROPOSITION);
		        } else if (element instanceof Scope) {
	                acceptor.addPosition(node.getOffset(), node.getLength(), MissionSpecificationHighlightingConfiguration.TEMPORAL_PATTERN);
		        } else if (element instanceof Pattern) {
		        	_highlightTextLeafs(acceptor, node, MissionSpecificationHighlightingConfiguration.TEMPORAL_PATTERN);
		        } else if (element instanceof Property) {
		        	//_highlightTextLeafs(acceptor, node, MissionSpecificationHighlightingConfiguration.TEMPORAL_PATTERN);
		        }
	        }
	        
	    }
	}
	
	private void _highlightTextLeafs(IHighlightedPositionAcceptor acceptor, INode node, String style) {
		for (INode child : ((CompositeNodeWithSemanticElement) node).getChildren()) {
    		if (child.hasDirectSemanticElement()) {
    			if (debug) {
    				System.out.println(child.getSemanticElement() + ": \"" + child.getText() + "\" " + child.getOffset() + "  " + node.getLength());
    			}
    		} else if (!child.hasDirectSemanticElement() && !(node instanceof HiddenLeafNode)) {
    			if (debug) {
    				System.out.println(child + ": \"" + child.getText() + "\" " + child.getOffset() + "  " + node.getLength());
    			}
	        	acceptor.addPosition(child.getOffset(), child.getLength(), style);
    		}
    	}
	}

}
