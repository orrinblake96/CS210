package ut1;

import java.util.*;

public class Graph{
    public static void main(String[] args){
    Scanner myscanner = new Scanner(System.in);
    System.out.println("Enter size: ");
	int size=myscanner.nextInt();
	int[][] array = new int[size][size];
	System.out.println("Fill array: ");
	for(int i=0;i<size;i++){ //load up the data into array
	            for(int j=0;j<size;j++){
	                array[i][j]=myscanner.nextInt();
            	} 
            }
	
int furthestdistance=0; //keep track of the longest path found so far
        String furthestroute="";
       
for(int i=0;i<size;i++){ //loop through all possible starting positions
int visited=0; //how many vertices have been visited so

Vertex[] vertices = new Vertex[size]; //initiate the vertex objects

for(int j=0;j<size;j++){
vertices[j]=new Vertex(""+(char)(97+i));
}
vertices[i].visited=true; //we visit the starting
visited++; //we've visited one vertex so far 
vertices[i].distance=0; //set this vertex as starting

for(int j=0;j<size;j++){ //update distances from 
	if(array[j][i]>0){ //only update those that can be
    vertices[j].distance=array[j][i];
	}
}

while(visited<size){ //while not all vertices visited 
	int minvalue=Integer.MAX_VALUE; //set to infinity as
                int minvertex=-1;   //a default which will crash if it

for(int j=0;j<size;j++){ //find the next vertex to
	if(vertices[j].visited==false){ //if it has
		if(vertices[j].distance<minvalue){
			minvalue=vertices[j].distance;
			minvertex=j;    //we are choosing the
			}
		} 
	}
vertices[minvertex].visited=true;
visited++;
	for(int j=0;j<size;j++){ //update distances from
	
	if(array[j][minvertex]>0&&vertices[j].visited==false){ //if vertex is connected and not visited
	if(vertices[j].distance>vertices[minvertex].distance+array[j][minvertex]){
	vertices[j].distance=vertices[minvertex].distance+array[j][minvertex]; //update if a new shorter route to this vertex has been found
	vertices[j].route=minvertex;
				}
			}
		}
	}
for(int x=0;x<size;x++){
//check for a new record
 //track the
if(vertices[x].distance>furthestdistance){ //go through all distances in the graph
furthestdistance=vertices[x].distance;
int visiting=x;
String solution=""; //build up the path taken to

while(visiting>=0){ //the starting position has
solution=vertices[visiting].label+""+solution;
visiting=vertices[visiting].route; //step back along the route generating this distance
}
solution=vertices[i].label+""+solution; //this is the starting position
furthestroute=solution;
			} 
		}
	} 
		System.out.println(furthestdistance);
		System.out.println(furthestroute);
    	}
}

  
//print out the
class Vertex{   //everything you need for a vertex
public boolean visited=false; //has it been visited?
int distance=Integer.MAX_VALUE; //the shortest route from starting position to this vertex
int route=-1; //keep track of the last step taken to reach this vertex for the shortest path - what vertex did it come from?
    String label;   //name of the vertex
public Vertex (String labelin){ //give the vertex a name when instantiated
        label=labelin;
    }
}