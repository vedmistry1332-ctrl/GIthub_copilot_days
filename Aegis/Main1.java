/* Create an interface named DataStorage with the following methods:
saveData(String data)- A method to save data.
loadData()- A method to load data.
deleteData()- A method to delete data.
Create a class that implements this interface and calls its appropriate methods.*/

interface DataStorage {
	void saveData(String Data);
	void loadData();
	void deleteData();
}
class FileStorage implements DataStorage{
	String givenData ;
	public void saveData(String Data){
		givenData=Data;
		System.out.println("stored data :"+ Data);
	}
	
	public void loadData(){
		if(givenData!= null)
		{
			System.out.println("loaded data :" + givenData);
		}
		else {
			System.out.println("no Data found");
		}
	}
	public void deleteData(){
		givenData=null;
		System.out.println("no data found");
	}
}
public class Main1{
	public static void main(String [] args){
		DataStorage d =new FileStorage();
		d.saveData("i am the best");
		d.loadData();
		d.deleteData();
	}
}