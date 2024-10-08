class Ruangan {
    private String kodeRuangan;
    private String namaRuangan;

    public Ruangan(String kodeRuangan, String namaRuangan) {
        this.kodeRuangan = kodeRuangan;
        this.namaRuangan = namaRuangan;
    }

    public String getKodeRuangan() {
        return kodeRuangan;
    }

    public void setKodeRuangan(String kodeRuangan) {
        this.kodeRuangan = kodeRuangan;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }

    public void display() {
        System.out.println("Kode Ruangan: " + kodeRuangan);
        System.out.println("Nama Ruangan: " + namaRuangan);
    }
}
