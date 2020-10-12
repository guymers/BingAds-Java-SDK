package com.microsoft.bingads.v13.api.test.entities.adgroup.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;

public class BulkAdGroupReadFromRowValuesAdGroupTypeTest extends BulkAdGroupTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test AdGroup Type", "Test AdGroup Type"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Ad Group Type", this.datum, this.expectedResult, new Function<BulkAdGroup, String>() {
            @Override
            public String apply(BulkAdGroup c) {
                return c.getAdGroup().getAdGroupType();
            }
        });
    }
}
