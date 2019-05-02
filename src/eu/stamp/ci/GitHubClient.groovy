@GrabConfig(systemProperties='httpProxy.host=proxy.eng.it,httpProxy.port=3128,httpsProxy.host=proxy.eng.it,httpsProxy.port=3128')
@Grab(group='org.eclipse.jgit', module='org.eclipse.jgit', version='5.2.0.201812061821-r')
import org.eclipse.egit.github.core.PullRequest
import org.eclipse.egit.github.core.Repository
import org.eclipse.egit.github.core.client.GitHubClient
import org.eclipse.egit.github.core.service.RepositoryService

void createPullRequest() {
    GitHubClient client = new GitHubClient();
    // client.setOAuth2Token();
    client.setHeaderAccept("application/vnd.github.machine-man-preview+json");
}

