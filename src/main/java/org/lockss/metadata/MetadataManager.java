/*

 Copyright (c) 2021 Board of Trustees of Leland Stanford Jr. University,
 all rights reserved.

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL
 STANFORD UNIVERSITY BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR
 IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

 Except as contained in this notice, the name of Stanford University shall not
 be used in advertising or otherwise to promote the sale, use or other dealings
 in this Software without prior written authorization from Stanford University.

 */

package org.lockss.metadata;

import org.lockss.config.Configuration;

/**
 * Constants from old MetadataManager class that are referenced by plugins
 */
public class MetadataManager {

  /** prefix for config properties */
  public static final String PREFIX = Configuration.PREFIX + "metadataManager.";

  /**
   * Determines whether indexing should be enabled. If indexing is not enabled,
   * AUs are queued for indexing, but the AUs are not reindexed until the
   * process is re-enabled. This parameter can be changed at runtime.
   */
  public static final String PARAM_INDEXING_ENABLED = PREFIX
      + "indexing_enabled";

  /**
   * Default value of MetadataManager indexing enabled configuration parameter;
   * <code>false</code> to disable, <code>true</code> to enable.
   */
  public static final boolean DEFAULT_INDEXING_ENABLED = false;

}
