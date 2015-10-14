/*
 * Copyright 2014-2015 by Cloudsoft Corporation Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package brooklyn.clocker.example;

import org.apache.brooklyn.api.catalog.Catalog;
import org.apache.brooklyn.api.catalog.CatalogConfig;
import org.apache.brooklyn.api.entity.ImplementedBy;
import org.apache.brooklyn.config.ConfigKey;
import org.apache.brooklyn.util.core.flags.SetFromFlag;

import brooklyn.entity.container.docker.application.VanillaDockerApplication;

/**
 * Dockerfile Microservice.
 */
@Catalog(name = "Dockerfile Microservice",
        description = "A container microservice defined by a Dockerfile")
@ImplementedBy(MicroserviceImpl.MicroserviceDockerfileImpl.class)
public interface MicroserviceDockerfile extends Microservice {

    @CatalogConfig(label = "Dockerfile URL", priority = 80)
    @SetFromFlag("dockerfileUrl")
    ConfigKey<String> DOCKERFILE_URL = VanillaDockerApplication.DOCKERFILE_URL;

}
