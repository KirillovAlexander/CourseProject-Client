package ru.netology.client;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class SettingTest extends TestCase {

    private static Setting setting =  new Setting("test", 99);;

    @Test
    public void testGetAddress() {
        assertThat(setting.getAddress(), is(equalTo("test")));
    }

    @Test
    public void testGetPort() {
        assertThat(setting.getPort(), is(equalTo(99)));
    }

    @Test
    public void testTestEquals() {
        Setting sameSetting = new Setting("test", 99);
        Setting differentAddressSetting = new Setting("dif", 99);
        Setting differentPortSetting = new Setting("test", 100);

        assertThat(setting.equals(sameSetting), is(equalTo(true)));
        assertThat(setting.equals(differentAddressSetting), is(equalTo(false)));
        assertThat(setting.equals(differentPortSetting), is(equalTo(false)));
    }
}