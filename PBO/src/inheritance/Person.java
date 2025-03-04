package inheritance;//mendeklarasi package yang berisikan class

class Person { //class parent
    private String name;//deklarasi variabel
    private int age;//deklarasi variabel

    // Constructor
    public Person(String name, int age) {
        this.name = name; // Menginisialisasi variabel name dengan parameter "name".
        this.age = age; // Menginisialisasi variabel age dengan parameter "age".
        System.out.println("Objek Person dibuat: " + name); // Menampilkan pesan saat objek "Person" dibuat.
    }


    // Destructor 
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Objek Person dihapus: " + name); // Menampilkan pesan saat objek "Person" dihapus.
    }


    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person { // Mendeklarasikan class "Student" sebagai subclass dari "Person".
    private String studentId; // Variabel private untuk menyimpan ID mahasiswa.


    // Constructor
    public Student(String name, int age, String studentId) {
        super(name, age);  // Memanggil constructor dari parent class "Person".
        this.studentId = studentId; // Menginisialisasi variabel studentId dengan parameter "studentId".
        System.out.println("Objek Student dibuat: " + studentId); // Menampilkan pesan saat objek "Student" dibuat.
    }


    // Destructor
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Objek Student dihapus: " + studentId); // Menampilkan pesan saat objek "Student" dihapus.
        super.finalize(); // Memanggil finalize() dari superclass untuk membersihkan objek Person.
    }


    // Setter dan Getter StudentId 
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "S12345"); // Membuat objek Student dengan nama "Alice", umur 20, dan ID "S12345".
        //Menampilkan informasi yang telah dibuat
        System.out.println("Nama: " + student1.getName());
        System.out.println("Usia: " + student1.getAge());
        System.out.println("ID Mahasiswa: " + student1.getStudentId());

        student1 = null;
        System.gc();

        
        try {
            Thread.sleep(1000); //memberi jeda 1 detik agar Garbage Collector punya waktu untuk menjalankan finalize().
        } catch (InterruptedException e) { //menangkap kesalahan jika terjadi interupsi selama sleep.
            e.printStackTrace();
        }
    }
}


