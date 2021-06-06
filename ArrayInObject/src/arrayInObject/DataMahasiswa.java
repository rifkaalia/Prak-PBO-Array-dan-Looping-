package arrayInObject;

public class DataMahasiswa {
	public static void main (String[] args) {
		//TODO Auto-generated method stub
		int maxSize=100;
		ManageMahasiswa obj= new ManageMahasiswa(maxSize);
		obj.insert("1167050000", "Andre", 24);
		obj.insert("1167050001", "Parto", 29);
		obj.insert("1167050002", "Sule", 27);
		obj.insert("1167050003", "Aziz", 20);
		obj.insert("1167050004", "Nunung", 20);
		System.out.println("Data Mahasiswa: ");
		obj.display();
	}
}
