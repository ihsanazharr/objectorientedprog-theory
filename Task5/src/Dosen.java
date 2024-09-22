class Dosen extends Person {
    private String kodeDosen;
    private MataKuliah mataKuliah;

    public Dosen(String nama, String alamat, String kodeDosen, MataKuliah mataKuliah) {
        super(nama, alamat, kodeDosen);
        this.kodeDosen = kodeDosen;
        this.mataKuliah = mataKuliah;
    }

    public String getkodeDosen() {
        return kodeDosen;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    @Override
    public void displayPerson() {
        super.displayPerson();
        System.out.println("kodeDosen: " + kodeDosen);
        System.out.println("Mata Kuliah: " + mataKuliah.getNamaMataKuliah());
    }
}