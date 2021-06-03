package ro.ase.cts.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.GetPromovabilitateTests;
import ro.ase.cts.categorii.NormalTests;
import ro.ase.cts.test.GrupaTest;
import ro.ase.cts.test.GrupaTestSetUp;
import ro.ase.cts.test.GrupaTestWithDummy;
import ro.ase.cts.test.GrupaTestWithFake;
import ro.ase.cts.test.GrupaTestWithStub;

@RunWith(Categories.class)
@SuiteClasses({GrupaTest.class,GrupaTestSetUp.class,GrupaTestWithDummy.class,GrupaTestWithFake.class, GrupaTestWithStub.class})
@IncludeCategory({GetPromovabilitateTests.class})
@ExcludeCategory({NormalTests.class})
public class SuitaCustom {

}
