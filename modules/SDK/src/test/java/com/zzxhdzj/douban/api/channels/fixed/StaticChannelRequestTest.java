package com.zzxhdzj.douban.api.channels.fixed;

import com.zzxhdzj.douban.Constants;
import com.zzxhdzj.douban.api.BaseAuthApiRequestTestCase;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: yangning.roy
 * Date: 11/27/13
 * Time: 12:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class StaticChannelRequestTest extends BaseAuthApiRequestTestCase{
    private StaticChannelRequest request;
    private int start, limit;

    @Before
    public void setUp() throws Exception {
        start = 1;
        limit = 1;
        request = new StaticChannelRequest(start, limit, Constants.HOT_CHANNELS,context);
    }

    @Test
    public void shouldHaveRequestUrl() {
        String url = request.getUrlString();
        assertThat(url, equalTo("http://douban.fm/j/explore/hot_channels?start=1&limit=1"));
    }
}