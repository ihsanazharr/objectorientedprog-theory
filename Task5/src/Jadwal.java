class Jadwal {
    private String hari;
    private String jam;
    private Ruangan ruangan;
    private Dosen dosen;

    public Jadwal(String hari, String jam, Ruangan ruangan, Dosen dosen) {
        this.hari = hari;
        this.jam = jam;
        this.ruangan = ruangan;
        this.dosen = dosen;
    }

    public void display() {
        System.out.println("Hari: " + hari);
        System.out.println("Jam: " + jam);
        System.out.println("Ruangan: " + ruangan.getNamaRuangan());
        System.out.println("Dosen: " + dosen.getNama());
        System.out.println("Mata Kuliah: " + dosen.getMataKuliah().getNamaMataKuliah());
    }

    public String getHari() {
        return hari;
    }

    public String getJam() {
        return jam;
    }

    public Ruangan getRuangan() {
        return ruangan;
    }

    public Dosen getDosen(){
        return dosen;
    }
}