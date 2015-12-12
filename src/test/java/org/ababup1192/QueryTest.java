package org.ababup1192;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryTest {

    @Test
    public void testFieldName() throws Exception{
        TestClass testClass = new TestClass();

        assertThat(Db.from(testClass).filter("id").is(3).select(), is("id = 3"));
        assertThat(Db.from(testClass).filter("name").is("abc").select(), is("name = abc"));
        assertThat(Db.from(testClass).filter("content").is("def").select(), is("content = def"));
        assertThat(Db.from(testClass).filter("id").
                is(1).and("name").is("abc").select(), is("id = 1, name = abc"));

        assertThat(Db.from(testClass).filter("id").
                is(1).and("name").isNull().select(), is("id = 1, name = null"));

    }



}
