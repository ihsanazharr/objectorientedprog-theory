class Person {
    private String nama;
    private String email;
    private String alamat;

    public Person(String nama, String email, String alamat) {
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void displayPerson() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + alamat);
    }
}