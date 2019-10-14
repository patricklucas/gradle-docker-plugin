package com.bmuschko.gradle.docker

import groovy.transform.CompileStatic
import org.gradle.api.model.ObjectFactory

/**
 * The extension for configuring a Spring Boot application via the {@link DockerSpringBootApplicationPlugin}.
 * <p>
 * Enhances the extension {@link DockerExtension} as child DSL element.
 * <p>
 * The following example demonstrates the use of the extension in a build script using the Groovy DSL:
 * <pre>
 * docker {
 *     springBootApplication {
 *         baseImage = 'openjdk:8-alpine'
 *         maintainer = 'Benjamin Muschko "benjamin.muschko@gmail.com"'
 *         ports = [9090, 8080]
 *         tag = 'awesome-spring-boot:1.115'
 *         jvmArgs = ['-Dspring.profiles.active=production', '-Xmx2048m']
 *     }
 * }
 * </pre>
 *
 * @since 3.4.5
 */
@CompileStatic
class DockerSpringBootApplication extends DockerConventionApplicationExtension {

    DockerSpringBootApplication(ObjectFactory objectFactory) {
        super(objectFactory)
    }
}
