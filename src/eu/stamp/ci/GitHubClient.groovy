@Grab('org.eclipse.jgit:org.eclipse.jgit:5.2.0.201812061821-r')
import org.eclipse.egit.github.core.PullRequest
import org.eclipse.egit.github.core.Repository
import org.eclipse.egit.github.core.client.GitHubClient
import org.eclipse.egit.github.core.service.RepositoryService

void createPullRequest() {
    GitHubClient client = new GitHubClient();
    // client.setOAuth2Token();
    client.setHeaderAccept("application/vnd.github.machine-man-preview+json");
}
