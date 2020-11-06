package com.gildedrose;

import com.gildedrose.items.BackstagePass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void should_double_increase_backstage_pass_quality_close_to_expiration(){
        Item backstagePass = new BackstagePass(11, 20);
        backstagePass.passOneDay();
        assertThat(backstagePass.quality,is(21));
        backstagePass.passOneDay();
        assertThat(backstagePass.quality, is(23));

    }

}