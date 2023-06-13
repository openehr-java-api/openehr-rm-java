package org.openehr.rm.common.archetyped;

import org.openehr.rm.data_types.text.DvText;
import org.openehr.rm.data_types.uri.DvEhrUri;

/**
 * The `LINK` type defines a logical relationship between two items, such as two `ENTRYs` or an `ENTRY` and a `COMPOSITION`. Links can be used across compositions, and across EHRs. Links can potentially be used between interior (i.e. non archetype root) nodes, although this probably should be prevented in archetypes. Multiple `LINKs` can be attached to the root object of any archetyped structure to give the effect of a 1->N link.
 */
public interface Link {
  /**
   * Used to describe the relationship, usually in clinical terms, such as  in response to  (the relationship between test results and an order),  follow-up to  and so on. Such relationships can represent any clinically meaningful connection between pieces of information. Values for meaning include those described in Annex C, ENV 13606 pt 2 under the categories of  generic ,  documenting and reporting ,  organisational ,  clinical ,  circumstancial , and  view management .
   */
  DvText getMeaning();

  /**
   * The type attribute is used to indicate a clinical or domain-level meaning for the kind of link, for example  problem  or  issue . If type values are designed appropriately, they can be used by the requestor of EHR extracts to categorise links which must be followed and which can be broken when the extract is created.
   */
  DvText getType();

  /**
   * The logical  to  object in the link relation, as per the linguistic sense of the meaning attribute.
   */
  DvEhrUri getTarget();
}
