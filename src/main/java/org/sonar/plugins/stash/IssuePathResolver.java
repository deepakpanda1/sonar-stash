package org.sonar.plugins.stash;

import org.sonar.api.issue.Issue;

public interface IssuePathResolver {
    public String getIssuePath(Issue issue);
}
