package com.yazici;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.yazici.controller.CategoryControllerTest;
import com.yazici.repository.CategoryRepository;
import com.yazici.service.CategoryServiceIntegrationTest;

@RunWith(Suite.class)
@Suite.SuiteClasses ({CategoryServiceIntegrationTest.class,CategoryControllerTest.class})
public class AddCategoryFeatureTestSuite {

}
