package org.springframework.data.gremlin.object.tests.janus.core;

import org.junit.Test;
import org.springframework.data.gremlin.object.core.domain.Likes;
import org.springframework.data.gremlin.object.core.repository.AbstractEdgeRepositoryTest;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(classes = Janus_Core_TestConfiguration.class)
public class Janus_Core_EdgeRepositoryTest extends AbstractEdgeRepositoryTest
{

    @Test
    @Override
    public void should_find_by_query()
    {
        Likes likes = new Likes(lara, graham);
        likesRepository.save(likes);
//        assertTrue(query.hasNext());
//        assertEquals(likes, query.next());
//        assertFalse(query.hasNext());
    }

}
