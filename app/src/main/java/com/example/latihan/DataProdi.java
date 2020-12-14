package com.example.latihan;
import java.util.ArrayList;
public class DataProdi {
    private static String[][] data = new String[][]{
            {"Teknik Komputer",
                    "Joko Widodo",
                    "https://upload.wikimedia.org/wikipedia/commons/3/3a/Ki_Hadjar_Dewantara_Mimbar_Umum_18_October_1949_p2.jpg"},
            {"Administrasi Bisnis",
                    "Prabowo Subianto",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3b/VP_Hatta.jpg/330px-VP_Hatta.jpg"}

    };

    static ArrayList<Prodi> getListData(){
        ArrayList<Prodi> list = new ArrayList<>();
        for (String[] aData : data) {
            Prodi prodi = new Prodi();
            prodi.setNamaprodi(aData[0]);
            prodi.setNamakajur(aData[1]);
            prodi.setPhoto(aData[2]);

            list.add(prodi);
        }

        return list;
    }
}

