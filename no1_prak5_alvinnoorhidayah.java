public class no1_prak5_alvinnoorhidayah {
    public static void main(String[] args) {
//        inisilisasi class manajer dan programer
        Pegawai manajer_1 = new manajer();
        Pegawai programmer_1 = new programmer();

//        memanggil method dari class manajer
        System.out.println(">>>MANAJER<<<");
        manajer_1.infoPegawai("Sucipto");
        manajer_1.infoGaji(2500000);
        ((manajer) manajer_1).infoTunjangan(1000000);

//        memanggil method class dari programmer
        System.out.println(">>>PROGRAMER<<<");
        programmer_1.infoPegawai("Suprayitno");
        programmer_1.infoGaji(35000000);
        ((programmer) programmer_1).infoBonus(110000000);



    }
}

abstract class Pegawai {
//    pembuatan class abstrac dari pegawai
    public static void infoPegawai(String nama) {
        System.out.println("Nama : " + nama);
    }
    public void infoGaji(int gaji) {
        System.out.println("Gaji : " + "Rp. " + gaji);
    };
}

class manajer extends Pegawai {
//    pembuatan class manajer yang mewarisi meethoddari class pegawai

    public int infoTunjangan(int tunjangan) {
        System.out.println("Tunjangan : " + "Rp. " + tunjangan + "\n");
        return tunjangan;
    }
}

class programmer extends Pegawai {

    public int infoBonus(int bonus) {
        System.out.println("Bonus : " + "Rp. " + bonus);
        return bonus;
    }
}
