import java.util.*;

public class Node {
	private String name;
	private Set<Node> neighborNodes;

	public Node(String name) {
		this.name = name;
		this.neighborNodes = new HashSet<Node>();
	}

	public void connectTo(Node otherNode) {
		neighborNodes.add(otherNode);
	}

	public int hashCode() {
		return name.hashCode();
	}

	public boolean equals(Node other) {
		return (this == other);
	}
}
