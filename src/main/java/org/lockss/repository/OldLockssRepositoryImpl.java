/*

Copyright (c) 2000-2019 Board of Trustees of Leland Stanford Jr. University,
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

package org.lockss.repository;

import java.io.*;
import java.net.*;
import java.util.*;

import org.apache.commons.lang3.SystemUtils;
import org.lockss.app.*;
import org.lockss.config.*;
import org.lockss.plugin.*;
import org.lockss.util.*;

/**
 * LockssRepository is used to organize the urls being cached.
 * It keeps a memory cache of the most recently used nodes as a
 * least-recently-used map, and also caches weak references to the instances
 * as they're doled out.  This ensures that two instances of the same node are
 * never created, as the weak references only disappear when the object is
 * finalized (they go to null when the last hard reference is gone, then are
 * removed from the cache on finalize()).
 */
public class OldLockssRepositoryImpl
  extends BaseLockssDaemonManager implements OldLockssRepository {
  
  public void setAuConfig(Configuration auConfig) {
  }

  public RepositoryNode getNode(String url) throws MalformedURLException {
    return null;
  }

  public RepositoryNode createNewNode(String url) throws MalformedURLException {
    return null;
  }

  public void deleteNode(String url) throws MalformedURLException {
  }

  public void deactivateNode(String url) throws MalformedURLException {
  }

  public void nodeConsistencyCheck() {
  }

}
