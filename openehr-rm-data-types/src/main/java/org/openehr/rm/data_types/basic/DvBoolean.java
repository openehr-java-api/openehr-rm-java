package org.openehr.rm.data_types.basic;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.rm_data_types.basic.DataValue;

/**
 * Items which are truly boolean data, such as true/false or yes/no answers. For such data, it is important to devise the meanings (usually questions in subjective data)  carefully, so that the only allowed results are in fact true or false.
 */
public interface DvBoolean extends DataValue {
  /**
   * Boolean value of this item. Actual values may be language or implementation dependent.
   */
  Boolean getValue();
}
