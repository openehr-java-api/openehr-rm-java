package org.openehr.rm.ehr_extract.common;

import org.openehr.base_base_types.identification.HierObjectId;
import org.openehr.rm_common.archetyped.Locatable;
import org.openehr.rm_ehr_extract.common.ExtractSpec;
import org.openehr.rm_ehr_extract.common.ExtractUpdateSpec;

/**
 * Generic model of a Request for an Extract, containing an Extract specification.
 */
public interface ExtractRequest extends Locatable {
  /**
   * Specification details of the request.
   */
  ExtractSpec getExtractSpec();

  /**
   * Update details of the request.
   */
  ExtractUpdateSpec getUpdateSpec();

  /**
   * Identifier of this Request, generated by requestor.
   */
  HierObjectId getUid();
}
