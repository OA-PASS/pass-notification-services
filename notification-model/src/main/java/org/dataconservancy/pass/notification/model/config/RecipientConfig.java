/*
 * Copyright 2018 Johns Hopkins University
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
 */
package org.dataconservancy.pass.notification.model.config;

import java.util.Collection;

/**
 * Allows recipients of a notification to be overridden depending on the Notification Service mode.
 *
 * @author Elliot Metsger (emetsger@jhu.edu)
 */
public class RecipientConfig {

    /**
     * The Notification Service mode (e.g. "demo", "prod")
     */
    private String mode;

    /**
     * All notifications for {@link #mode} will be sent to this recipient
     */
    private String globalCc;

    /**
     * Whitelisted recipients for {@link #mode} will receive notifications directly.  If the recipient on the
     * {@code Notification} matches a recipient on the whitelist, then the notification is delivered.
     * <p>
     * If a whitelist does not exist in the configuration, then it is treated as "allow all", or "matching *".  Any
     * recipient configured on the {@code Notification} will have notifications delivered.  A {@code null} whitelist is
     * what would be normally desired in production: each recipient will receive notifications.
     * </p>
     * <p>
     * If a whitelist does exist, then the recipient configured on the {@code Notification} will be used <em>only</em>
     * if they are on the whitelist.  This is a handy mode for demo purposes: only the identified recipients on the
     * whitelist can receive notifications.
     * </p>
     * <p>
     * In all cases, notifications are also sent to {@link #globalCc}.
     * </p>
     */
    private Collection<String> whitelist;

}
