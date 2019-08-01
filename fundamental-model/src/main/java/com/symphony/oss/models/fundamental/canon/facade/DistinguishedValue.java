/**
 * Copyright 2019 Symphony Communication Services, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *----------------------------------------------------------------------------------------------------
 * Proforma generated from
 *		Template groupId		 org.symphonyoss.s2.canon
 *           artifactId canon-template-java
 *		Template name		   proforma/java/Object/_.java.ftl
 *		Template version	   1.0
 *  At                  2019-04-15 06:38:48 GMT-07:00
 *----------------------------------------------------------------------------------------------------
 */

package com.symphony.oss.models.fundamental.canon.facade;

import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.common.immutable.ImmutableByteArray;

import org.symphonyoss.s2.common.dom.json.ImmutableJsonObject;
import org.symphonyoss.s2.common.dom.json.MutableJsonObject;
import org.symphonyoss.s2.common.hash.Hash;
import org.symphonyoss.s2.canon.runtime.IEntity;
import org.symphonyoss.s2.canon.runtime.IModelRegistry;

import com.symphony.oss.models.fundamental.canon.facade.DistinguishedValue;
import com.symphony.oss.models.fundamental.canon.facade.IDistinguishedValue;
import com.symphony.oss.models.fundmental.canon.DistinguishedValueEntity;
import com.symphony.oss.models.fundmental.canon.DistinguishedValueType;
import com.symphony.oss.models.fundmental.canon.IDistinguishedValueEntity;
import com.symphony.oss.models.fundmental.canon.FundamentalModel;

/**
 * Facade for Object ObjectSchema(DistinguishedValue)
 *
 * Special values which can be used where a hash is required to have special meaning.
 * Generated from ObjectSchema(DistinguishedValue) at #/components/schemas/DistinguishedValue
 */
@Immutable
@SuppressWarnings("unused")
public class DistinguishedValue extends DistinguishedValueEntity implements IDistinguishedValue
{
  /** The hash representing a request regarding the caller's datafeed sequence */
  public static final Hash USER_CONTENT_SEQUENCE = new DistinguishedValue.Builder()
      .withType(DistinguishedValueType.USER_CONTENT_SEQUENCE).build().getAbsoluteHash();

  /** The hash representing a request regarding the caller's at-mention sequence */
  public static final Hash USER_MENTION_SEQUENCE = new DistinguishedValue.Builder()
      .withType(DistinguishedValueType.USER_MENTION_SEQUENCE).build().getAbsoluteHash();
  
  /**
   * Constructor from builder.
   * 
   * @param builder A mutable builder containing all values.
   */
  public DistinguishedValue(AbstractDistinguishedValueBuilder<?,?> builder)
  {
    super(builder);
  }
  
  /**
   * Constructor from serialised form.
   * 
   * @param jsonObject An immutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public DistinguishedValue(ImmutableJsonObject jsonObject, IModelRegistry modelRegistry)
  {
    super(jsonObject, modelRegistry);
  }
  
  /**
   * Constructor from mutable JSON object.
   * 
   * @param mutableJsonObject A mutable JSON object containing the serialized form of the object.
   * @param modelRegistry A model registry to use to deserialize any nested objects.
   */
  public DistinguishedValue(MutableJsonObject mutableJsonObject, IModelRegistry modelRegistry)
  {
    super(mutableJsonObject, modelRegistry);
  }
   
  /**
   * Copy constructor.
   * 
   * @param other Another instance from which all attributes are to be copied.
   */
  public DistinguishedValue(IDistinguishedValue other)
  {
    super(other);
  }
  
}
/*----------------------------------------------------------------------------------------------------
 * End of template proforma/java/Object/_.java.ftl
 * End of code generation
 *------------------------------------------------------------------------------------------------- */