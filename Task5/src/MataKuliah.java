class MataKuliah {
    private String kodeMataKuliah;
    private String namaMataKuliah;
    private int sks;

    public MataKuliah(String kodeMataKuliah, String namaMataKuliah, int sks) {
        this.kodeMataKuliah = kodeMataKuliah;
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
    }

    public String getKodeMataKuliah() {
        return kodeMataKuliah;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public int getSKS() {
        return sks;
    }

    public void display() {
        System.out.println("Kode Mata Kuliah: " + kodeMataKuliah);
        System.out.println("Nama Mata Kuliah: " + namaMataKuliah);
        System.out.println("SKS: " + sks);
    }
}
