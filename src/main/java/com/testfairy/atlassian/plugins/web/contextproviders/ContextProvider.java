package com.testfairy.atlassian.plugins.web.contextproviders;

import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.jira.issue.Issue;
import com.atlassian.jira.plugin.webfragment.contextproviders.AbstractJiraContextProvider;
import com.atlassian.jira.plugin.webfragment.model.JiraHelper;
import com.atlassian.jira.user.ApplicationUser;

import java.util.HashMap;
import java.util.Map;

public class ContextProvider extends AbstractJiraContextProvider {
    public Map getContextMap(ApplicationUser applicationUser, JiraHelper jiraHelper) {
        HashMap<String, Object> contextMap = new HashMap<String, Object>(5);
        Issue issue = (Issue)jiraHelper.getContextParams().get("issue");
        contextMap.put("user", applicationUser);
        contextMap.put("issue", issue);
        contextMap.put("helper", jiraHelper);
//        contextMap.put("url", "http://www.testfairy.com");
        contextMap.put("url", ComponentAccessor.getCustomFieldManager().getCustomFieldObjectByName("Issue TestFairy Session URL").getValue(issue) + "?iframe");
        return contextMap;
    }
}
