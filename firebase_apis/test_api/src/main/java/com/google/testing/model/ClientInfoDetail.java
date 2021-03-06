/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.testing.model;

/**
 * Key-value pair of detailed information about the client which invoked the test. Examples:
 * {'Version', '1.0'}, {'Release Track', 'BETA'}.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClientInfoDetail extends com.google.api.client.json.GenericJson {

  /**
   * Required. The key of detailed client information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Required. The value of detailed client information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Required. The key of detailed client information.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Required. The key of detailed client information.
   * @param key key or {@code null} for none
   */
  public ClientInfoDetail setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Required. The value of detailed client information.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Required. The value of detailed client information.
   * @param value value or {@code null} for none
   */
  public ClientInfoDetail setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public ClientInfoDetail set(String fieldName, Object value) {
    return (ClientInfoDetail) super.set(fieldName, value);
  }

  @Override
  public ClientInfoDetail clone() {
    return (ClientInfoDetail) super.clone();
  }

}
