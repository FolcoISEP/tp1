package algoprogra;
import java.awt.Color;
import java.awt.Shape;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.ShapeUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
public class ArrayMinimum extends ApplicationFrame{


public ArrayMinimum (String applicationTitle, String chartTitle ) {
	
	super(applicationTitle);
    JFreeChart xylineChart = ChartFactory.createScatterPlot(
       chartTitle ,
       "Time in milliseconds" ,
       "Number of values" ,
       createDataset() ,
       PlotOrientation.HORIZONTAL ,
       true , false , false);
       
    Shape cross = ShapeUtilities.createDiagonalCross(3, 1);
    
    ChartPanel chartPanel = new ChartPanel( xylineChart );
    chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
    final XYPlot plot = xylineChart.getXYPlot( );
    XYItemRenderer renderer = plot.getRenderer( );
    renderer.setSeriesPaint( 0 , Color.YELLOW );
    renderer.setSeriesShape(0, cross);

    plot.setDomainCrosshairVisible(true);
    plot.setRangeCrosshairVisible(true);
     
    setContentPane( chartPanel ); 
	
	
}

private XYDataset createDataset(){
	//List<Integer> minValueTimeArray = new ArrayList<Integer>();
	   final XYSeries arr_mini = new XYSeries( "array minimum" ); 

	for( int i = 5000 ; i < 100000 ; i = i+5000 ){
		int[] array = RandomData.generate1d(i, 0, 500 );
		long startTime = System.nanoTime();
		MergeSort.sort(array);
		System.out.println(Arrays.toString(array));
		long endTime = System.nanoTime();	
		long resultTime = endTime-startTime;
		//System.out.println("Took "+resultTime + " ns");
		//Integer intResultTime = (int) (long) resultTime;
		//minValueTimeArray.add(intResultTime);
		arr_mini.add(resultTime,i);          

	} 

   final XYSeriesCollection dataset = new XYSeriesCollection( );          
   dataset.addSeries( arr_mini );
   return dataset;
}
	public static int getMinValue(int[] numbers){  
		int minValue = numbers[0];  
		for(int i=1;i < numbers.length;i++){  
			if(numbers[i] < minValue){  
				minValue = numbers[i];  
			}  
		}  
		return minValue; 
	} 


	public static void main(String[] args) {
		

		ArrayMinimum chart = new ArrayMinimum("Algorithm execution time", "How long does it take to run your algo?");
	      chart.pack( );          
	      RefineryUtilities.centerFrameOnScreen( chart );          
	      chart.setVisible( true );
	}

}
