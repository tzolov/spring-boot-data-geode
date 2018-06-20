/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package example.geode.cache;

import org.apache.geode.cache.CacheLoader;
import org.apache.geode.cache.CacheLoaderException;
import org.apache.geode.cache.LoaderHelper;
import org.springframework.geode.cache.support.CacheLoaderSupport;

/**
 * The {@link EchoCacheLoader} class is an implementation of {@link CacheLoader} that echos the key as the value.
 *
 * @author John Blum
 * @see org.apache.geode.cache.CacheLoader
 * @see org.springframework.geode.cache.support.CacheLoaderSupport
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public class EchoCacheLoader implements CacheLoaderSupport<String, String> {

	public static final EchoCacheLoader INSTANCE = new EchoCacheLoader();

	@Override
	public String load(LoaderHelper<String, String> helper) throws CacheLoaderException {
		return helper.getKey();
	}
}