package org.openehr.rm.ehr.entry;

import org.openehr.rm.data_structures.item_structure.ItemStructure;

/**
 * Entry type for evaluation statements. Used for all kinds of statements which evaluate other information, such as interpretations of observations, diagnoses, differential diagnoses, hypotheses, risk assessments, goals and plans.
 */
public interface Evaluation extends CareEntry {
  /**
   * The data of this evaluation, in the form of a spatial data structure.
   */
  ItemStructure getData();
}
