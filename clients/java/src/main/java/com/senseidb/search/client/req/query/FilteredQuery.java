package com.senseidb.search.client.req.query;

import com.senseidb.search.client.json.CustomJsonHandler;
import com.senseidb.search.client.req.filter.Filter;
import com.senseidb.search.client.req.filter.FilterJsonHandler;

/**
 * <p>
 * A query that applies a filter to the results of another query. This query
 * maps to Sensei <code>FilteredQuery</code>.
 * </p>
 *
 *
 * <p>
 * The filter object can hold only filter elements, not queries. Filters can be
 * much faster compared to queries since they don’t perform any scoring,
 * especially when they are cached.
 * </p>
 *
 *
 */
@SuppressWarnings("unused")
@CustomJsonHandler(value = QueryJsonHandler.class)
public class FilteredQuery extends Query {

  private final Query query;
  @CustomJsonHandler(value = FilterJsonHandler.class, flatten = false)
  private final Filter filter;
  private double boost;

  public FilteredQuery(Query query, Filter filter, double boost) {
    super();
    this.query = query;
    this.filter = filter;
  }

}
