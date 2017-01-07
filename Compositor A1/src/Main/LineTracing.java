package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex Nelson
 */
public class LineTracing extends GeneralTracing{
    

    public LineTracing(double start, double end, double m, double c) {
        super();
        tabArray.clear();
        setEquation(start, end, m, c);
    }
    //The information required to get the equation of a line finite at both ends
    public final void setEquation(double start, double end, double m, double c){
        tabArray.add(new DragTab(start, (m*start)+c));
        tabArray.add(new DragTab(end, (m*end)+c));
    }
}
