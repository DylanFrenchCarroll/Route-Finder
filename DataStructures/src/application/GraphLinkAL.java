package application;

public class GraphLinkAL {
	public GraphNodeAL2<?> destNode; // Could also store source node if required
	public int distance; // Other link attributes could be similarly stored
	public int ease;
	public int safety;
	
	public GraphLinkAL(GraphNodeAL2<?> destNode, int distance, int ease, int safety) {
		this.destNode = destNode;
		this.distance = distance;
		this.ease = ease;
		this.safety = safety;
		
	}
}