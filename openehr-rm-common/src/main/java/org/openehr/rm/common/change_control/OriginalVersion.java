package org.openehr.rm.common.change_control;

import java.util.List;

import org.openehr.base.base_types.identification.ObjectVersionId;
import org.openehr.rm.common.generic.Attestation;
import org.openehr.rm.data_types.text.DvCodedText;

/**
 * A Version containing locally created content and optional attestations.
 */
public interface OriginalVersion<T> extends Version<T> {
  /**
   * Stored version of inheritance precursor.
   */
  ObjectVersionId getUid();

  /**
   * Stored version of inheritance precursor.
   */
  ObjectVersionId getPrecedingVersionUid();

  /**
   * Identifiers of other versions whose content was merged into this version, if any.
   */
  List<ObjectVersionId> getOtherInputVersionUids();

  /**
   * Lifecycle state of the content item in this version; coded by openEHR vocabulary `version lifecycle state`.
   */
  DvCodedText getLifecycleState();

  /**
   * Set of attestations relating to this version.
   */
  List<Attestation> getAttestations();

  /**
   * Data content of this Version.
   */
  T getData();

  /**
   * True if this Version was created from more than just the preceding (checked out) version.
   */
  Boolean isMerged();
}
