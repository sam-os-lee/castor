/*
 * Copyright 2011 Jakub Narloch
 *
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
package org.exolab.castor.xml;

import org.xml.sax.InputSource;

import javax.xml.transform.sax.SAXSource;
import java.io.StringReader;

/**
 * Tests the {@link Unmarshaller} class when unmarshalling from {@link SAXSource}.
 *
 * @author <a herf="mailto:jmnarloch AT gmail DOT com">Jakub Narloch</a>
 * @version 1.3.3
 * @since 1.3.3
 */
public class UnmarshallerSAXSourceTest extends BaseUnmarshallerTest {

  @Override
  protected Object unmarshal(Unmarshaller unmarshaller, String xml) throws Exception {

    return unmarshaller.unmarshal(new SAXSource(new InputSource(new StringReader(xml))));
  }
}
