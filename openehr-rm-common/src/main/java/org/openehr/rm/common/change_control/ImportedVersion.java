package org.openehr.rm.common.change_control;

import org.openehr.base_base_types.identification.ObjectVersionId;
import org.openehr.rm_common.change_control.OriginalVersion;
import org.openehr.rm_common.change_control.Version;
import org.openehr.rm_data_types.text.DvCodedText;

/**
 * Versions whose content is an `ORIGINAL_VERSION` copied from another location; this class inherits `_commit_audit_` and `_contribution_` from `VERSION<T>`, providing imported versions with their own audit trail and Contribution, distinct from those of the imported `ORIGINAL_VERSION`.
 */
public interface ImportedVersion extends Version {
  /**
   * The `ORIGINAL_VERSION` object that was imported.
   */
  OriginalVersion getItem();

  /**
   * Computed version of inheritance precursor, derived as `_item.uid_`.
   */
  ObjectVersionId uid();

  /**
   * Computed version of inheritance precursor, derived as `_item.preceding_version_uid_`.
   */
  ObjectVersionId precedingVersionUid();

  /**
   * Lifecycle state of the content item in wrapped `ORIGINAL_VERSION`, derived as `_item.lifecycle_state_`; coded by openEHR vocabulary `version lifecycle state`.
   */
  DvCodedText lifecycleState();

  /**
   * Original content of this Version.
   */
  T data();
}
