package arrayTes;

public class ArrayExample {
	public static void main (String[] args) {
		String [] dataProdi= new String[10];
		dataProdi[0]="Administrasi";
		dataProdi[1]="Agroteknologi";
		dataProdi[2]="Teknik Elektro";
		dataProdi[3]="Bahasa Arab";
		dataProdi[4]="Bahasa Inggris";
		dataProdi[5]="Teknik Informatika";
		dataProdi[6]="Fisika";
		dataProdi[7]="Kimia";
		dataProdi[8]="Biologi";
		dataProdi[9]="Manajemen";
		
		System.out.println("Data pada index ke 1, 3, dan 5 adalah:");
		System.out.println("Index ke 1: "+dataProdi[1]);
		System.out.println("Index ke 3: "+dataProdi[3]);
		System.out.println("Index ke 5: "+dataProdi[5]);
		
		System.out.println();
		System.out.println("Menampilkan data kecuali data ke 3 yaitu Bahasa Arab");
		
		for(int x=0; x<dataProdi.length; x++) {
			if(dataProdi[x].equals("Bahasa Arab"))
				continue;
			System.out.println(dataProdi[x]);
		}
	}
}
