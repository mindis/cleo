/*
 * Copyright (c) 2011 LinkedIn, Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package cleo.search;

import java.io.Serializable;

/**
 * Element
 * 
 * @author jwu
 * @since 01/12, 2011
 */
public interface Element extends Serializable, Comparable<Element> {
  
  public int getElementId();
  
  public void setElementId(int id);
  
  public long getTimestamp();
  
  public void setTimestamp(long timestamp);
  
  public String[] getTerms();
  
  public void  setTerms(String... terms);
  
  public float getScore();
  
  public void setScore(float score);
  
}