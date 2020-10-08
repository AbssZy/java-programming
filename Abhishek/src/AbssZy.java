import java.util.*; 
import java.lang.*; 
import java.io.*; 

class TrainDetails 
{ 
	int trainNo , distance; 
	String trainName, source, destination; 

	public TrainDetails(int trainNo, String trainName, String source, String destination,int distance) 
	{ 
		this.trainName = trainName; 
		this.trainNo = trainNo; 
		this.distance = distance; 
		this.source = source;
		this.destination = destination;
	} 
	public String toString() 
	{ 
		return this.trainNo + " " + this.trainName + " " + this.source + " " + this.destination + " " + this.distance; 
	} 
} 

class SortbyTrainNo implements Comparator<TrainDetails> 
{ 
	public int compare(TrainDetails a, TrainDetails b) 
	{ 
		return a.trainNo - b.trainNo; 
	} 
} 

class AbssZy
{ 
	public static void main (String[] args) 
	{ 
		String trainName; 
		int flag = 1; 
		int m; 
		int trainNo; 
		int distance; 
		String source;
		String destination;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<TrainDetails> ar = new ArrayList<TrainDetails>();
		while(flag == 1){
			System.out.println("Press the following\n1. Add Train \n2. View Trains \n3. View Sorted Trains \n4. Quit");
			m = sc.nextInt();
			
			switch(m){
				case 1:
				System.out.println("Enter the details (Train No, Train Name, Source, Destination, Distance:\n ");
				trainNo = sc.nextInt();
				trainName = sc.nextLine();
				trainName = sc.nextLine();
				source = sc.nextLine();
				destination = sc.nextLine();
				distance = sc.nextInt();
				
				
				ar.add(new TrainDetails(trainNo, trainName, source, destination, distance));
				break;
				case 2:
				for (int i=0; i<ar.size(); i++) 
					System.out.println(ar.get(i)); 
				break;
				case 3:
				Collections.sort(ar, new SortbyTrainNo()); 

				System.out.println("\nSorted by TrainNo"); 
				for (int i=0; i<ar.size(); i++) 
					System.out.println(ar.get(i));
				break;
				case 4:
				flag = 0;
			}
		}
	
	} 
} 
