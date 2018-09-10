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
package org.dataconservancy.pass.notification.dispatch.impl.email;

import org.dataconservancy.pass.notification.model.Notification;
import org.dataconservancy.pass.notification.model.config.template.TemplatePrototype;

import java.io.InputStream;
import java.util.Map;

/**
 * @author Elliot Metsger (emetsger@jhu.edu)
 */
public interface TemplateParameterizer {

    String parameterize(TemplatePrototype.Name templateName, Map<Notification.Param, String> paramMap,
                        InputStream template);

}
