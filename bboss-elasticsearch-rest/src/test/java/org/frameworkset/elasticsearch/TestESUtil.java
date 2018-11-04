package org.frameworkset.elasticsearch;
/**
 * Copyright 2008 biaoping.yin
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.frameworkset.elasticsearch.template.ESUtil;
import org.junit.Test;

/**
 * <p>Description: </p>
 * <p></p>
 * <p>Copyright (c) 2018</p>
 * @Date 2018/11/4 21:20
 * @author biaoping.yin
 * @version 1.0
 */
public class TestESUtil {
	@Test
	public void testRtrim(){
		System.out.println(ESUtil.rtrim("    ").length());
		System.out.println(ESUtil.rtrim("aaaaa    ").length());
		System.out.println(ESUtil.rtrim("  aaaaa    ").length());

	}

	@Test
	public void testLtrim(){
		System.out.println(ESUtil.ltrim("    ").length());
		System.out.println(ESUtil.ltrim("aaaaa    ").length());
		System.out.println(ESUtil.ltrim("  aaaaa    ").length());
	}
}
