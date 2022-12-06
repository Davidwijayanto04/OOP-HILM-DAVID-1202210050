public class kapal extends transportasiair {
    protected String mesin;
    
    public kapal(int jumlahkursi, int biaya, String mesin){
        super(jumlahkursi, biaya, mesin );
        this.mesin = mesin;
        }
    
    public void informasi(){
        System.out.println("Transportasi air jenis kapal dengankursi berjumlah"+ jumlahKursi+ "dengan biaya sebesar Rp.100000");
         System.out.println("Transportasi air dengan jenis kapal sedang berlayar menggunakan mesih diser dengan kecepatan yang tidak stabil");


         }
    public void kecepatan(){
        System.out.println("Transportasi air jenis kapal sedamg berlayar mengunakan mesin disel dengan kecepatan stabil di kisaran"+mesin+ "knot");


    }
    public void berlabuh(){
        System.out.println("Transportasi air jenis kapal berlabuh di pantai");
    }


    }

