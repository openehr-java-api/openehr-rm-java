package org.openehr.rm.data_structures.history;

import java.util.List;

import org.openehr.rm.data_structures.DataStructure;
import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.date_time.DvDateTime;
import org.openehr.rm.data_types.date_time.DvDuration;

/**
 * Root object of a linear history, i.e. time series structure. This is a generic class whose type parameter must be a descendant of `ITEM_STRUCTURE`, ensuring that each Event in the `_events_` of a given instance is of the same structural type, i.e. `ITEM_TREE`, `ITEM_LIST` etc.
 */
public interface History extends DataStructure {
  /**
   * Time origin of this event history. The first event is not necessarily at the origin point.
   */
  DvDateTime getOrigin();

  /**
   * Period between samples in this segment if periodic.
   */
  DvDuration getPeriod();

  /**
   * Duration of the entire History; either corresponds to the duration of all the events, and/or the duration represented by the summary, if it exists.
   */
  DvDuration getDuration();

  /**
   * Optional summary data that aggregates, organizes, reduces and transforms the event series. This may be a text or image that presents a graphical presentation, or some data that assists with the interpretation of the data.
   */
  ItemStructure getSummary();

  /**
   * The events in the series. This attribute is of a generic type whose parameter must be a descendant of `ITEM_SUTRUCTURE`.
   */
  List getEvents();

  /**
   * Indicates whether history is periodic.
   */
  Boolean isPeriodic();
}
