package graphql.java_client.examples.hello_world.domain;

import java.util.List;

/**
 * @author generated by graphql-maven-plugin
 */
public interface Character  {

	public void setId(String id);

	public String getId();

	public void setName(String name);

	public String getName();

	public void setFriends(List<Character> friends);

	public List<Character> getFriends();

	public void setAppearsIn(List<Episode> appearsIn);

	public List<Episode> getAppearsIn();
}
