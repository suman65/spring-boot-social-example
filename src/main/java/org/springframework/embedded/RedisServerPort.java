/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.embedded;

import org.springframework.beans.factory.annotation.Value;

import java.lang.annotation.*;

/**
 * A convenience for finding the Redis Server port when using {@link EnableEmbeddedRedis}. For example:
 *
 * <pre>
 * {@literal @Configuration}
 * {@literal @EnableEmbeddedRedis}
 * public class RedisHttpSessionConfig {
 *
 *     {@literal @Bean}
 *     public JedisConnectionFactory connectionFactory({@literal @RedisServerPort} int port) throws Exception {
 *         JedisConnectionFactory connection = new JedisConnectionFactory();
 *         connection.setPort(port);
 *         return connection;
 *     }
 *
 * }
 * </pre>
 *
 * @author Rob Winch
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Value("${"+EmbeddedRedisConfiguration.SERVER_PORT_PROP_NAME+"}")
public @interface RedisServerPort { }
