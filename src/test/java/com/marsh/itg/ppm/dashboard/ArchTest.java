package com.marsh.itg.ppm.dashboard;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.marsh.itg.ppm.dashboard");

        noClasses()
            .that()
            .resideInAnyPackage("com.marsh.itg.ppm.dashboard.service..")
            .or()
            .resideInAnyPackage("com.marsh.itg.ppm.dashboard.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..com.marsh.itg.ppm.dashboard.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
