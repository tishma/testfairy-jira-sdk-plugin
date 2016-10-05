package ut.com.testfairy.atlassian.plugins;

import org.junit.Test;
import com.testfairy.atlassian.plugins.api.MyPluginComponent;
import com.testfairy.atlassian.plugins.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}