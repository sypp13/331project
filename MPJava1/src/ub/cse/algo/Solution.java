package ub.cse.algo;

import java.util.ArrayList;
import java.util.HashMap;


public class Solution {

    private Info info;
    private Graph graph;
    private ArrayList<Client> clients;
    private ArrayList<Integer> bandwidths;

    /**
     * Basic Constructor
     *
     * @param info: data parsed from input file
     */
    public Solution(Info info) {
        this.info = info;
        this.graph = info.graph;
        this.clients = info.clients;
        this.bandwidths = info.bandwidths;
    }

    /**
     * Method that returns the calculated 
     * SolutionObject as found by your algorithm
     *
     * @return SolutionObject containing the paths, priorities and bandwidths
     */
    public SolutionObject outputPaths() {
        SolutionObject sol = new SolutionObject();
        /* TODO: Your solution goes here */
        //TEST FOR GITHUB
        //poopoo kaka
        sol.paths = Traversals.bfsPaths(graph, clients);

        //populate priority array
        for (int i = 0; i < clients.size(); i++){
            sol.priorities.put(clients.get(i).id, clients.get(i).priority);
        }
        //bandwidths
        sol.bandwidths = bandwidths;

        return sol;
    }
}
