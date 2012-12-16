package fr.doan.achilles.entity.metadata;

import static org.fest.assertions.api.Assertions.assertThat;
import org.junit.Test;

import fr.doan.achilles.entity.metadata.SimpleMeta;

public class SimpleMetaTest {

    @Test
    public void should_cast_value_to_correct_type() throws Exception {
        SimpleMeta<String> meta = new SimpleMeta<String>();
        meta.setValueClass(String.class);

        Object testString = "test";

        Object casted = meta.get(testString);

        assertThat(casted).isInstanceOf(String.class);
    }
}