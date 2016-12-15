/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.qualityontime.commons;

import java.util.Properties;

/**
 * Bean with inner bean.
 *
 * @version $Id$
 */
public class BeanWithInnerBean {
	private final InnerBean innerBean = new InnerBean();

	public BeanWithInnerBean() {
	}

	public InnerBean getInnerBean() {
		return innerBean;
	}

	public class InnerBean {
		private final Properties fish = new Properties();

		public String getFish(final String key) {
			return fish.getProperty(key);
		}

		public void setFish(final String key, final String value) {
			fish.setProperty(key, value);
		}
	}
}
