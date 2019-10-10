package application;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
//@SuppressWarnings("all")
public class FXController implements Initializable {

	@FXML private ComboBox<City> combo1;
	@FXML private ComboBox<City> combo2;
	@FXML private ImageView mapImageView;
	@FXML private Button showButton;
	@FXML private TextArea mainTextArea;
	@FXML private AnchorPane pane;
	CityList cityList2; 
	ArrayList<GraphNodeAL2<City>> cityNodeList;
	ArrayList<City> cityList;
	GraphNodeAL2<City> bravosNode ;
	City norvos;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		File file = new File("files/map.png");
		Image image = new Image(file.toURI().toString());
		mapImageView.setImage(image);
		
		cityList = new ArrayList<>();
		cityNodeList = new ArrayList<>();
		
		City bravos = new City("Bravos", 58, 48);
		cityList.add(bravos);
		 City lorath = new City("Lorath", 157, 73);
		 cityList.add(lorath);
		  norvos = new City("Norvos", 194, 189);
		  cityList.add(norvos);
		 City pentos = new City("Pentos", 63, 262);
		 cityList.add(pentos);
		 City myr = new City("Myr", 107, 395);
		 cityList.add(myr);
		 City tyrosh = new City("Tyrosh", 7, 417);
		 cityList.add(tyrosh);
		 City volantis = new City("Volantis", 289, 521);
		 cityList.add(volantis);
		 City arNoy = new City("Ar Noy", 269, 302);
		 cityList.add(arNoy);
		 City nySar = new City("Ny Sar", 205, 286);
		 cityList.add(nySar);
		 City saath = new City("Saath", 451, 103);
		 cityList.add(saath);
		 City morosie = new City("Morosie", 495, 63);
		 cityList.add(morosie);
		 City sorrows= new City("The Sorrows", 229, 385);
		 cityList.add(sorrows);
		 City essaria = new City("Essaria", 424, 258);
		 cityList.add(essaria);
		 City qohor = new City("Qohor", 316, 262);
		 cityList.add(qohor);
		 City selHorys = new City("SelHorys", 246, 452);
		 cityList.add(selHorys);
		 City mantarys = new City("Mantarys", 456, 498);
		 cityList.add(mantarys);
		 City tolos = new City("Tolos", 512, 530);
		 cityList.add(tolos);
		 City elyria = new City("Elyria", 480, 537);
		 cityList.add(elyria);
		 City mereen = new City("Mereen", 687, 458);
		 cityList.add(mereen);
		 City hesh = new City("Hesh", 774, 461);
		 cityList.add(hesh);
		 City sarnath = new City("Sarnath", 562, 282);
		 cityList.add(sarnath);
		 City yunkai = new City("Yunkai", 652, 489);
		 cityList.add(yunkai);
		 City drohe = new City("Drohe", 131, 247);
		 cityList.add(drohe);
		 City sarvs = new City("Sarvs", 516, 99);
		 cityList.add(sarvs);
		 City lys = new City("Lys", 68, 516);
		 cityList.add(lys);
		 City valysar = new City("Valysar", 239, 480);
		 cityList.add(valysar);
		 City volonTherys = new City("Volon Therys", 255, 509);
		 cityList.add(volonTherys);
		 City sarMell = new City("Sar Mell", 261, 489);
		 cityList.add(sarMell);
		 City bhorash = new City("Bhorash", 575, 463);
		 cityList.add(bhorash);
		 City lhazosh = new City("Lhazosh", 811, 511);
		 cityList.add(lhazosh);
		 City kosrak = new City("Kosrak", 864, 459);
		 cityList.add(kosrak);
		 City ghardoq = new City("Ghardoq", 826, 396);
		 cityList.add(ghardoq);
		 City vatsMeghah = new City("Vats Meghah", 868, 386);
		 cityList.add(vatsMeghah);
		 City vaesEfe = new City("Vaes Efe", 895, 352);
		 cityList.add(vaesEfe);
		 City hazdahnNo= new City("Hazdahn No", 678, 355);
		 cityList.add(hazdahnNo);
		 City vaesDothrak = new City("Vaes Dothrak", 927, 202);
		 cityList.add(vaesDothrak);
		 City sathar = new City("Sathar", 701, 282);
		 cityList.add(sathar);
		 City kasath = new City("Kasath", 639, 262);
		 cityList.add(kasath);
		 City gornath = new City("Gornath", 691, 236);
		 cityList.add(gornath);
		 City salksh = new City("Salksh", 666, 205);
		 cityList.add(salksh);
		 City vaesleisi = new City("Vaesleisi", 798, 67);
		 cityList.add(vaesleisi);
		 City newIbbish= new City("New Ibbish", 942, 7);
		 cityList.add(newIbbish);
	
		bravosNode = new GraphNodeAL2<>(bravos);
		 cityNodeList.add(bravosNode);
		 
			GraphNodeAL2<City> lorathNode = new GraphNodeAL2<>(lorath);
			cityNodeList.add(lorathNode);
				GraphNodeAL2<City> norvosNode = new GraphNodeAL2<>(norvos);
				cityNodeList.add(norvosNode);
			GraphNodeAL2<City> pentosNode = new GraphNodeAL2<>(pentos);
			cityNodeList.add(pentosNode);
		 GraphNodeAL2<City> myrNode = new GraphNodeAL2<>(myr);
		 cityNodeList.add(myrNode);
			GraphNodeAL2<City> tyroshNode = new GraphNodeAL2<>(tyrosh);
			cityNodeList.add(tyroshNode);
			GraphNodeAL2<City> volantisNode = new GraphNodeAL2<>(volantis);
			cityNodeList.add(volantisNode);
			GraphNodeAL2<City> arNoyNode = new GraphNodeAL2<>(arNoy);
			cityNodeList.add(arNoyNode);
			GraphNodeAL2<City> nySarNode = new GraphNodeAL2<>(nySar);
			cityNodeList.add(nySarNode);
			GraphNodeAL2<City> saathNode = new GraphNodeAL2<>(saath);
			cityNodeList.add(saathNode);
			GraphNodeAL2<City> moroshNode = new GraphNodeAL2<>(morosie);
			cityNodeList.add(moroshNode);
			GraphNodeAL2<City> sorrowsNode = new GraphNodeAL2<>(sorrows);
			cityNodeList.add(sorrowsNode);
			GraphNodeAL2<City> droheNode = new GraphNodeAL2<>(drohe);
			cityNodeList.add(droheNode);
			GraphNodeAL2<City> essariaNode = new GraphNodeAL2<>(essaria);
			cityNodeList.add(essariaNode);
			GraphNodeAL2<City> qohorNode = new GraphNodeAL2<>(qohor);
			cityNodeList.add(qohorNode);
			GraphNodeAL2<City> selHorysNode = new GraphNodeAL2<>(selHorys);
			cityNodeList.add(selHorysNode);
			GraphNodeAL2<City> mantarysNode = new GraphNodeAL2<>(mantarys);
			cityNodeList.add(mantarysNode);
			GraphNodeAL2<City> tolosNode = new GraphNodeAL2<>(tolos);
			cityNodeList.add(tolosNode);
			GraphNodeAL2<City> elyriaNode = new GraphNodeAL2<>(elyria);
			cityNodeList.add(elyriaNode);
			GraphNodeAL2<City> mereenNode = new GraphNodeAL2<>(mereen);
			cityNodeList.add(mereenNode);
			GraphNodeAL2<City> heshNode = new GraphNodeAL2<>(hesh);
			cityNodeList.add(heshNode);
			GraphNodeAL2<City> sarnathNode = new GraphNodeAL2<>(sarnath);
			cityNodeList.add(sarnathNode);
			GraphNodeAL2<City> yunkaiNode = new GraphNodeAL2<>(yunkai);
			cityNodeList.add(yunkaiNode);
			GraphNodeAL2<City> sarvsNode = new GraphNodeAL2<>(sarvs);
			cityNodeList.add(sarvsNode);
			GraphNodeAL2<City> lysNode = new GraphNodeAL2<>(lys);
			cityNodeList.add(lysNode);
			GraphNodeAL2<City> valysarNode = new GraphNodeAL2<>(valysar);
			cityNodeList.add(valysarNode);
			GraphNodeAL2<City> volonTherysNode = new GraphNodeAL2<>(volonTherys);
			cityNodeList.add(volonTherysNode);
			GraphNodeAL2<City> sarMellNode = new GraphNodeAL2<>(sarMell);
			cityNodeList.add(sarMellNode);
			GraphNodeAL2<City> bhorashNode = new GraphNodeAL2<>(bhorash);
			cityNodeList.add(bhorashNode);
			GraphNodeAL2<City> lhazoshNode = new GraphNodeAL2<>(lhazosh);
			cityNodeList.add(lhazoshNode);
			GraphNodeAL2<City> kosrakNode = new GraphNodeAL2<>(kosrak);
			cityNodeList.add(kosrakNode);
			GraphNodeAL2<City> ghardoqNode = new GraphNodeAL2<>(ghardoq);
			cityNodeList.add(ghardoqNode);
			GraphNodeAL2<City> vatsMeghahNode = new GraphNodeAL2<>(vatsMeghah);
			cityNodeList.add(vatsMeghahNode);
			GraphNodeAL2<City> vaesEfeNode = new GraphNodeAL2<>(vaesEfe);
			cityNodeList.add(vaesEfeNode);
			GraphNodeAL2<City> hazdahnNoNode = new GraphNodeAL2<>(hazdahnNo);
			cityNodeList.add(hazdahnNoNode);
			GraphNodeAL2<City> vaesDothrakNode = new GraphNodeAL2<>(vaesDothrak);
			cityNodeList.add(vaesDothrakNode);
			GraphNodeAL2<City> satharNode = new GraphNodeAL2<>(sathar);
			cityNodeList.add(satharNode);
			GraphNodeAL2<City> kasathNode = new GraphNodeAL2<>(kasath);
			cityNodeList.add(kasathNode);
			GraphNodeAL2<City> gornathNode = new GraphNodeAL2<>(gornath);
			cityNodeList.add(gornathNode);
			GraphNodeAL2<City> salkshNode = new GraphNodeAL2<>(salksh);
			cityNodeList.add(salkshNode);
			GraphNodeAL2<City> vaesleisiNode = new GraphNodeAL2<>(vaesleisi);
			cityNodeList.add(vaesleisiNode);
			GraphNodeAL2<City> newIbbishNode = new GraphNodeAL2<>(newIbbish);
			cityNodeList.add(newIbbishNode);
	
			bravosNode.connectToNodeUndirected(lorathNode, 5, 1, 8);//distance, ease , safety
			bravosNode.connectToNodeUndirected(pentosNode, 5, 1, 8);
			bravosNode.connectToNodeUndirected(droheNode, 5, 1, 8);		
			
			//pentosNode.connectToNodeUndirected(bravosNode, 1, 1, 8);
			pentosNode.connectToNodeUndirected(droheNode, 1, 1, 8);
			
			droheNode.connectToNodeUndirected(norvosNode, 1, 1, 8);
			droheNode.connectToNodeUndirected(nySarNode, 1, 1, 8);
			
			norvosNode.connectToNodeUndirected(nySarNode, 1, 1, 8);
			norvosNode.connectToNodeUndirected(lorathNode, 1, 1, 8);
			
			nySarNode.connectToNodeUndirected(myrNode, 1, 1, 8);
			nySarNode.connectToNodeUndirected(arNoyNode, 1, 1, 8);
			nySarNode.connectToNodeUndirected(sorrowsNode, 1, 1, 8);
			
			arNoyNode.connectToNodeUndirected(sorrowsNode, 1, 1, 8);
			arNoyNode.connectToNodeUndirected(qohorNode, 1, 1, 8);
			
			qohorNode.connectToNodeUndirected(norvosNode, 1, 1, 8);
			qohorNode.connectToNodeUndirected(essariaNode, 1, 1, 8);
			
		    essariaNode.connectToNodeUndirected(saathNode, 1, 1, 8);
		    essariaNode.connectToNodeUndirected(sarnathNode, 1, 1, 8);
		    
		    saathNode.connectToNodeUndirected(moroshNode, 1, 1, 8);
		    saathNode.connectToNodeUndirected(sarvsNode, 1, 1, 8);
		    sarvsNode.connectToNodeUndirected(moroshNode, 1, 1, 8);
		    
		    sarnathNode.connectToNodeUndirected(kasathNode, 1, 1, 8);
		    
		    kasathNode.connectToNodeUndirected(salkshNode, 1, 1, 8);
		    kasathNode.connectToNodeUndirected(satharNode, 1, 1, 8);
		    
		    satharNode.connectToNodeUndirected(gornathNode, 1, 1, 8);
		    
		    gornathNode.connectToNodeUndirected(salkshNode, 1, 1, 8);
		    
		    satharNode.connectToNodeUndirected(vaesDothrakNode, 1, 1, 8);
		    satharNode.connectToNodeUndirected(hazdahnNoNode, 1, 1, 8);
		    
		    vaesDothrakNode.connectToNodeUndirected(newIbbishNode, 1, 1, 8);
		    vaesDothrakNode.connectToNodeUndirected(vaesleisiNode, 1, 1, 8);
		    vaesDothrakNode.connectToNodeUndirected(vaesEfeNode, 1, 1, 8);
		    
		    vaesEfeNode.connectToNodeUndirected(vatsMeghahNode, 1, 1, 8);
		    
		    hazdahnNoNode.connectToNodeUndirected(mereenNode, 1, 1, 8);
		    
		    vatsMeghahNode.connectToNodeUndirected(ghardoqNode, 1, 1, 8);
		    vatsMeghahNode.connectToNodeUndirected(kosrakNode, 1, 1, 8);
		    
		    ghardoqNode.connectToNodeUndirected(heshNode, 1, 1, 8);
		    
		    heshNode.connectToNodeUndirected(kosrakNode, 1, 1, 8);
		    heshNode.connectToNodeUndirected(lhazoshNode, 1, 1, 8);
		    
		    kosrakNode.connectToNodeUndirected(lhazoshNode, 1, 1, 8);
		    heshNode.connectToNodeUndirected(mereenNode, 1, 1, 8);
		    
		    ghardoqNode.connectToNodeUndirected(mereenNode, 1, 1, 8);
		    
		    mereenNode.connectToNodeUndirected(yunkaiNode, 1, 1, 8);
		    mereenNode.connectToNodeUndirected(bhorashNode, 1, 1, 8);
		    
		    myrNode.connectToNodeUndirected(sorrowsNode, 1, 1, 8);
		    myrNode.connectToNodeUndirected(tyroshNode, 1, 1, 8);
		    myrNode.connectToNodeDirected(lysNode, 1, 1, 8);
		    
		    sorrowsNode.connectToNodeUndirected(selHorysNode, 1, 1, 8);
		    
		    mereenNode.connectToNodeUndirected(bhorashNode, 1, 1, 8);
		    
		    selHorysNode.connectToNodeUndirected(valysarNode, 1, 1, 8);
		    
		    valysarNode.connectToNodeUndirected(sarMellNode, 1, 1, 8);
		    
		    sarMellNode.connectToNodeUndirected(volantisNode, 1, 1, 8);
		    sarMellNode.connectToNodeDirected(volonTherysNode, 1, 1, 8);
		    
		    volantisNode.connectToNodeUndirected(mantarysNode, 1, 1, 8);
		    
		    mantarysNode.connectToNodeUndirected(elyriaNode, 1, 1, 8);
		    mantarysNode.connectToNodeUndirected(tolosNode, 1, 1, 8);
		    mantarysNode.connectToNodeUndirected(bhorashNode, 1, 1, 8);
		    
		    tolosNode.connectToNodeUndirected(bhorashNode, 1, 1, 8);
	
		//-----------
		
		CostedPath cpE = findEasiestPathDijkstra(bravosNode, lorath);
		for (GraphNodeAL2<?> n : cpE.pathList)
			mainTextArea.appendText(n.data.toString());
		mainTextArea.appendText("\nThe total path cost is: " + cpE.pathCost);

		CostedPath cpS = findSafestPathDijkstra(bravosNode, lorath);
		for (GraphNodeAL2<?> n : cpS.pathList)
			mainTextArea.appendText(n.data.toString());
		mainTextArea.appendText("\nThe total path cost is: " + cpS.pathCost);
		
		cityList2 = new CityList();
		cityList2.addingAllCitiestoDatabase();
		showGraph();
		
		combo1.setItems(FXCollections.observableArrayList(cityList2.cityList));
		combo2.setItems(FXCollections.observableArrayList(cityList2.cityList));

	}

	@FXML
	public void show() {
		mapImageView.toFront(); //refresh map and text
		showGraph();
		mainTextArea.setText("");
		City citycombo1 = combo1.getSelectionModel().getSelectedItem();
		City citycombo2 =combo2.getSelectionModel().getSelectedItem();
		
		//Find original source node and dest city objects
		GraphNodeAL2<?> sourceNode=null;
		City destCity=null;
		for(GraphNodeAL2<City> n : cityNodeList)
			if(n.data.getCityName().equals(citycombo1.getCityName())) {
					sourceNode=n;
					break;
				}
		
		for(City c : cityList)
			if(c.getCityName().equals(citycombo2.getCityName())) {
					destCity=c;
					break;
				}
		
		//check if either null - abort if so
		
	 //GraphNodeAL2<City> nodechoice = cityNodeList.get(0);
		CostedPath cpD = findShortestPathDijkstra(sourceNode,   destCity);
		for (GraphNodeAL2<?> n : cpD.pathList)
			mainTextArea.appendText(n.data.toString());
		mainTextArea.appendText("\nThe total path cost is: " + cpD.pathCost + cpD.pathList.size());

		//-----------
		
		ArrayList<GraphNodeAL2<?>> pathCopy=new ArrayList<>(cpD.pathList);
		City city1=null,city2;
		while(pathCopy.size()>0) {
			
			if(city1==null)  //first city
				city1=(City)((pathCopy.remove(0)).data);
			city2=(City)((pathCopy.remove(0)).data);	
			line(city1.xCord ,city1.yCord,city2.xCord,city2.yCord);
			city1=city2;
			
		}
	}

	private void showGraph() {
		 
		for(City city : cityList2.cityList) {
				int x = city.getxCord();
				int y = city.getyCord();
				displayCity(x + 100, y);			
			}
		
		
		
		
	//	line( city1x, cit1y, city2x, city2y   )
			
		}
	
	
	public void displayCity(int x, int y) { //displays city
		 Rectangle square = new Rectangle(x, y, 10, 10); //makes highlight square
		 square.setStroke(Color.BLUE); //sets stroke
		 square.setFill(Color.BLUE); //sets fill
		 square.setOpacity(0.5); //set opacity
		 pane.getChildren().add(square); //adds square to pane
	}
	
	public void line(int x1 , int y1, int x2, int y2) { // creates line between points
		Line line = new Line(x1+100, y1+10, x2+100, y2+10); //makes line
		line.setStroke(Color.RED); //sets stroke
		line.setStrokeWidth(5); //sets width
		//line.setOpacity(0.5); //sets opacity 
		pane.getChildren().add(line); //adds line to pane
	} 

	public static int distance(int x1, int y1, int x2, int y2) { //finds distance between to points
		int resultX; //x2-x1
		int resultY; //y2-y1
		int resultXSquare; //squares X
		int resultYSquare; //squares Y
		int sum; //finds X squared + Y squared
		int root; // finds square root of X squared and Y Squared
		
		//simple maths
		resultX = x2 - x1;
		resultY = y2 - y1;
		resultXSquare = resultX * resultX;
		resultYSquare = resultY * resultY;
		
		sum = resultXSquare + resultYSquare;
		root = (int) Math.sqrt(sum); //finds square root
		return root;
	}

	
	///////////////// Dont touch me /////////////////

	public static class CostedPath {
		public int pathCost = 0;
		public List<GraphNodeAL2<?>> pathList = new ArrayList<>();
	}

	public static <T> CostedPath findShortestPathDijkstra(GraphNodeAL2<?> startNode, T lookingfor) {
		CostedPath cp = new CostedPath(); // Create result object for cheapest path
		List<GraphNodeAL2<?>> encountered = new ArrayList<>(), unencountered = new ArrayList<>();       // Create
																								     	// encountered/unencountered
																										// lists
		startNode.nodeValue = 0; 																		// Set the starting node value to zero
		unencountered.add(startNode); 																    // Add the start node as the only value in the unencountered list to start
		GraphNodeAL2<?> currentNode;
		do { 																							// Loop until unencountered list is empty
			currentNode = unencountered.remove(0); 														// Get the first unencountered node (sorted list, so will have lowest
																										// value)
			encountered.add(currentNode); 																// Record current node in encountered list
			if (currentNode.data.equals(lookingfor)) { 													// Found goal - assemble path list back to start and return it
				cp.pathList.add(currentNode); 															// Add the current (goal) node to the result list (only element)
				cp.pathCost = currentNode.nodeValue;												    // The total cheapest path cost is the node value of the
																										// current/goal node
				while (currentNode != startNode) { 														// While we're not back to the start node...
					boolean foundPrevPathNode = false; 													// Use a flag to identify when the previous path node is
																										// identified
					for (GraphNodeAL2<?> n : encountered) {												// For each node in the encountered list...
						for (GraphLinkAL e : n.adjList) 												// For each edge from that node...
							if (e.destNode == currentNode && currentNode.nodeValue - e.distance == n.nodeValue) { 	// If
																													// that
																													// edge
																													// links
																													// to
																													// the
																													// current node and the difference in node values is the cost of the edge ->
																													// found path node!
								cp.pathList.add(0, n);																// Add the identified path node to the front of the result list
								currentNode = n; 																	// Move the currentNode reference back to the identified path node
								foundPrevPathNode = true; 															// Set the flag to break the outer loop
								break; 																				// We've found the correct previous path node and moved the currentNode
																													// reference
																													// back to it so break the inner loop
							}
						if (foundPrevPathNode)
							break; 																					// We've identified the previous path node, so break the inner loop to continue
					}
				}
																													// Reset the node values for all nodes to (effectively) infinity so we can
																													// search again (leave no footprint!)
				for (GraphNodeAL2<?> n : encountered)
					n.nodeValue = Integer.MAX_VALUE;
				for (GraphNodeAL2<?> n : unencountered)
					n.nodeValue = Integer.MAX_VALUE;
				return cp; 																							// The costed (cheapest) path has been assembled, so return it!
			}
																													// We're not at the goal node yet, so...
			for (GraphLinkAL e : currentNode.adjList) 																// For each edge/link from the current node...
				if (!encountered.contains(e.destNode)) {															// If the node it leads to has not yet been encountered (i.e.
																													// processed)
					e.destNode.nodeValue = Integer.min(e.destNode.nodeValue, currentNode.nodeValue + e.distance); 	// Update
																													// the
																													// node
																													// value
																													// at
																													// the
																													// end
																													// of the edge to the minimum of its current value or the total of the current
																													// node's value plus the cost of the edge
					unencountered.add(e.destNode);
				}
			Collections.sort(unencountered, (n1, n2) -> n1.nodeValue - n2.nodeValue); 								// Sort in ascending node value
																													// order
		} while (!unencountered.isEmpty());	
		return null; 																								// No path found, so return null
	}

	public static <T> CostedPath findEasiestPathDijkstra(GraphNodeAL2<?> startNode, T lookingfor) {
		CostedPath cp = new CostedPath(); // Create result object for cheapest path
		List<GraphNodeAL2<?>> encountered = new ArrayList<>(), unencountered = new ArrayList<>(); // Create
																									// encountered/unencountered
																									// lists
		startNode.nodeValue = 0; // Set the starting node value to zero
		unencountered.add(startNode); // Add the start node as the only value in the unencountered list to start
		GraphNodeAL2<?> currentNode;
		do { // Loop until unencountered list is empty
			currentNode = unencountered.remove(0); // Get the first unencountered node (sorted list, so will have lowest
													// value)
			encountered.add(currentNode); // Record current node in encountered list
			if (currentNode.data.equals(lookingfor)) { // Found goal - assemble path list back to start and return it
				cp.pathList.add(currentNode); // Add the current (goal) node to the result list (only element)
				cp.pathCost = currentNode.nodeValue; // The total cheapest path cost is the node value of the
														// current/goal node
				while (currentNode != startNode) { // While we're not back to the start node...
					boolean foundPrevPathNode = false; // Use a flag to identify when the previous path node is
														// identified
					for (GraphNodeAL2<?> n : encountered) { // For each node in the encountered list...
						for (GraphLinkAL e : n.adjList) // For each edge from that node...
							if (e.destNode == currentNode && currentNode.nodeValue - e.ease == n.nodeValue) { // If that
																												// edge
																												// links
																												// to
																												// the
								// current node and the difference in node values is the cost of the edge ->
								// found path node!
								cp.pathList.add(0, n); // Add the identified path node to the front of the result list
								currentNode = n; // Move the currentNode reference back to the identified path node
								foundPrevPathNode = true; // Set the flag to break the outer loop
								break; // We've found the correct previous path node and moved the currentNode
										// reference
								// back to it so break the inner loop
							}
						if (foundPrevPathNode)
							break; // We've identified the previous path node, so break the inner loop to continue
					}
				}
				// Reset the node values for all nodes to (effectively) infinity so we can
				// search again (leave no footprint!)
				for (GraphNodeAL2<?> n : encountered)
					n.nodeValue = Integer.MAX_VALUE;
				for (GraphNodeAL2<?> n : unencountered)
					n.nodeValue = Integer.MAX_VALUE;
				return cp; // The costed (cheapest) path has been assembled, so return it!
			}
			// We're not at the goal node yet, so...
			for (GraphLinkAL e : currentNode.adjList) // For each edge/link from the current node...
				if (!encountered.contains(e.destNode)) { // If the node it leads to has not yet been encountered (i.e.
															// processed)
					e.destNode.nodeValue = Integer.min(e.destNode.nodeValue, currentNode.nodeValue + e.ease); // Update
																												// the
																												// node
																												// value
																												// at
																												// the
																												// end
					// of the edge to the minimum of its current value or the total of the current
					// node's value plus the cost of the edge
					unencountered.add(e.destNode);
				}
			Collections.sort(unencountered, (n1, n2) -> n1.nodeValue - n2.nodeValue); // Sort in ascending node value
																						// order
		} while (!unencountered.isEmpty());
		return null; // No path found, so return null
	}

	public static <T> CostedPath findSafestPathDijkstra(GraphNodeAL2<?> startNode, T lookingfor) {
		CostedPath cp = new CostedPath(); // Create result object for cheapest path
		List<GraphNodeAL2<?>> encountered = new ArrayList<>(), unencountered = new ArrayList<>(); // Create
																									// encountered/unencountered
																									// lists
		startNode.nodeValue = 0; // Set the starting node value to zero
		unencountered.add(startNode); // Add the start node as the only value in the unencountered list to start
		GraphNodeAL2<?> currentNode;
		do { // Loop until unencountered list is empty
			currentNode = unencountered.remove(0); // Get the first unencountered node (sorted list, so will have lowest
													// value)
			encountered.add(currentNode); // Record current node in encountered list
			if (currentNode.data.equals(lookingfor)) { // Found goal - assemble path list back to start and return it
				cp.pathList.add(currentNode); // Add the current (goal) node to the result list (only element)
				cp.pathCost = currentNode.nodeValue; // The total cheapest path cost is the node value of the
														// current/goal node
				while (currentNode != startNode) { // While we're not back to the start node...
					boolean foundPrevPathNode = false; // Use a flag to identify when the previous path node is
														// identified
					for (GraphNodeAL2<?> n : encountered) { // For each node in the encountered list...
						for (GraphLinkAL e : n.adjList) // For each edge from that node...
							if (e.destNode == currentNode && currentNode.nodeValue - e.safety == n.nodeValue) { // If
																												// that
																												// edge
																												// links
																												// to
																												// the
								// current node and the difference in node values is the cost of the edge ->
								// found path node!
								cp.pathList.add(0, n); // Add the identified path node to the front of the result list
								currentNode = n; // Move the currentNode reference back to the identified path node
								foundPrevPathNode = true; // Set the flag to break the outer loop
								break; // We've found the correct previous path node and moved the currentNode
										// reference
								// back to it so break the inner loop
							}
						if (foundPrevPathNode)
							break; // We've identified the previous path node, so break the inner loop to continue
					}
				}
				// Reset the node values for all nodes to (effectively) infinity so we can
				// search again (leave no footprint!)
				for (GraphNodeAL2<?> n : encountered)
					n.nodeValue = Integer.MAX_VALUE;
				for (GraphNodeAL2<?> n : unencountered)
					n.nodeValue = Integer.MAX_VALUE;
				return cp; // The costed (cheapest) path has been assembled, so return it!
			}
			// We're not at the goal node yet, so...
			for (GraphLinkAL e : currentNode.adjList) // For each edge/link from the current node...
				if (!encountered.contains(e.destNode)) { // If the node it leads to has not yet been encountered (i.e.
															// processed)
					e.destNode.nodeValue = Integer.min(e.destNode.nodeValue, currentNode.nodeValue + e.safety); // Update
																												// the
																												// node
																												// value
																												// at
																												// the
																												// end
					// of the edge to the minimum of its current value or the total of the current
					// node's value plus the cost of the edge
					unencountered.add(e.destNode);
				}
			Collections.sort(unencountered, (n1, n2) -> n1.nodeValue - n2.nodeValue); // Sort in ascending node value
																						// order
		} while (!unencountered.isEmpty());
		return null; // No path found, so return null
	}

}
