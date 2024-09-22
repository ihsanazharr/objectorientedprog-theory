class Mahasiswa extends Person {
    private String NIM;
    private String jurusan;

    public Mahasiswa(String nama, String alamat, String NIM, String jurusan) {
        super(nama, alamat, jurusan);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    public String getNIM() {
        return NIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    @Override
    public void displayPerson() {
        super.displayPerson();
        System.out.println("NIM: " + NIM);
        System.out.println("Jurusan: " + jurusan);
    }
}
