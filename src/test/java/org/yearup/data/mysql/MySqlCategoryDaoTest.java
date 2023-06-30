package org.yearup.data.mysql;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.yearup.models.Category;

import static org.junit.jupiter.api.Assertions.*;

class MySqlCategoryDaoTest extends BaseDaoTestClass {

    private MySqlCategoryDao dao;

    @BeforeEach
    public void setUp() {
        dao = new MySqlCategoryDao(dataSource);
    }

    @Test
    public void getById_shouldReturn_correctCategory () {

        //arrange
        int categoryId = 3;

        Category expected = new Category()
        {{
            setCategoryId(3);
            setName("Electronics");
            setDescription("Find the best prices for all of electronics.");
        }};

        // act
        var actual = dao.getById(categoryId);

        // assert
        assertEquals(expected.getName(), actual.getName(), "Did this work correctly?");
    }

}
