package id.web.twinstation.belajarrecycler;

import java.util.ArrayList;

public class GuppiesData {
    private static String[] namaIkan = {
        "Blue Moscow",
        "Black Moscow",
        "Blue Japan",
        "Metal Lace Thailand",
        "Red Mozaic",
        "Super Red Singapore",
        "Cobra",
        "Tuxedo",
        "Platinum Half-Moon",
        "Metal Yellow Lace",
        "Blue Grass",
        "Cherry Grass",
        "Young Pair Champion Purple",
        "Red Blonde",
        "Platinum Crown Tail"
    };
    private static String[] detailIkan = {
            "Sesuai namanya, jenis ikan guppy satu ini berasal dari Moscow dan terkenal akan warna birunya yang sangat indah. Selain warnanya, ekor dari ikan guppy jenis ini juga menjuntai indah menambah daya tariknya. Warna biru pekat dari ikan guppy Blue Moscow memiliki kecenderungan warna lebih gelap pada tubuh dan bagian ujung dari ekornya. Terlihat eksotis, ikan guppy jenis ini wajib dimiliki para pecinta ikan guppy.",
            "Sama-sama berasal dari Moscow, ikan guppy jenis Black Moscow juga memiliki tampilan eksotis tak kalah cantik. Warna tubuhnya yang hitam pekat menjadikannya tampil kontras saat dicampurkan bersama ikan-ikan guppy lainnya.",
            "Guppy Japan Blue yang terkenal akan warna biru muda yang terang. Kini, jenis ikan guppy ini telah memiliki lebih banyak variasi warna biru akibat persilangan dengan jenis guppy lainnya. Nama lain dari jenis ikan ini adalah Albino Sky Blue atau Blue Topaz",
            "Ikan guppy jenis Metal Lace Thailand adalah jenis guppy yang berasa dari Thailand dan terkenal akan warna putih terang dengan pola bergaris-garis padat yang membuat tampilannya sangat menarik dibandingkan jenis-jenis guppy pada umumnya.",
            "Ciri khas dari ikah guppy Red Mozaic adalah warna merah pada ekornya yang berhias corak bintik-bintik kehitaman yang sangat eksotis. Meskipun mudah ditemukan di Indonesia, tak mengurangi daya tarik para pecinta ikan guppy terhadap jenis ikan guppy satu ini.",
            "Karakteristik utama dari jenis guppy ini sangat mudah dikenali, yakni memiliki warna merah mencolok pada seluruh bagian tubuh dan juga ekor yang menjuntai. Warna merah yang kontras inilah yang membuat banyak kolektor sangat menggemari jenis ikan guppy asal Singapura ini. Ikan ini sering dijumpai dengan nama lain Albino Full Red",
            "Dinamakan ikan guppy jenis Cobra dikarenakan ikan ini memiliki pola tubuh menyerupai pola kulit ular. Kombinasi warna hitam, putih, dan kuning yang membentuk pola eksotis bak ular membuat tampilan ikan guppy ini sangat menarik.",
            "Tampilan dari jenis ikan guppy satu ini sangatlah unik dan tak boleh dilewatkan para pecinta ikan guppy. Ikan guppy jenis Tuxedo memiliki ciri khas warna putih pada bagian sirip dan ekor serta bagian tubuh hitam. Komposisi warnanya yang kontras inilah yang menjadikan jenis ikan guppy Tuxedo sangat disukai. Karena warna sirip dan ekernya putih sehingga ikan ini juga sering diebri nama White Tuxedo atau HB White",
            "Bagi para kolektor ikan guppy, jenis guppy platinum half-moon wajib masuk dalam daftar koleksi. Meskipun tergolomng salah satu jenis guppy dengan harga paling mahal, namun keindahan dari ikan hias ini tentu sebanding dengan harganya.",
            "Metal Yellow Lace memiliki karakter yang sangat menyerupai jenis guppy Metal Lace. Pembedanya adalah pada jenis Matal Yellow Lace, warna dari ikan guppy terdapat sedikit pola kekuningan, khususnya pada bagian ekor dan sirip ikan.",
            "Keindahan dari jenis ikan guppy satu ini adalah warna biru cerah dengan pola titik-titik hitam pada bagian ekor dan siripnya. Ikan guppy jenis ini juga termasuk salah satu yang memiliki harga mahal dibandingkan jenis-jenis guppy lainnya.",
            "Jika melihat kecantikan warna dari jenis ikan guppy  ini, rasanya tak heran jika ikan guppy Cherry Grass dihargai hingga ratusan ribu untuk satu ekornya. Karakteristik khas dari jenis guppy ini adalah corak pink pada tubuh hingga ekor yang berpadu dengan warna-warna terang lainnya pada ikan guppy.",
            "Young Pair Champion Purple adalah salah satu jenis ikan guppy termahal di dunia. Memiliki corak warna gradasi biru dengan bagian kepala lebih terang dan semakin menggelap pada bagian ekor, jenis ikan guppy yang langka ini bisa dihargai hingga satu juta rupiah per ekornya.",
            "Jenis ikan guppy terbaik yang juga mudah ditemukan di Indonesia adalah jenis Red Blonde. Ciri dari jenis ikan guppy ini adalah ekornya yang berwarna kemerahan namun tubuh yang berwarna lebih putih sehingga terlihat belang atau kontras.",
            "Dibandingkan jenis-jenis guppy lainnya, jenis ikan guppy selanjutnya terbilang sangat unik karena daya tariknya datang bentuk ekor dan siripnya yang berbentuk terputus-putus layaknya sisir sehingga dinamakan crown tail. Keunikan dari ikan guppy jenis ini menjadikannya buruan para kolektor ikan guppy."
    };

    private static int[] gambarIkan = {
            R.drawable.guppy_1,
            R.drawable.guppy_2,
            R.drawable.guppy_3,
            R.drawable.guppy_4,
            R.drawable.guppy_5,
            R.drawable.guppy_6,
            R.drawable.guppy_7,
            R.drawable.guppy_8,
            R.drawable.guppy_9,
            R.drawable.guppy_10,
            R.drawable.guppy_11,
            R.drawable.guppy_12,
            R.drawable.guppy_13,
            R.drawable.guppy_14,
            R.drawable.guppy_15
    };

    static ArrayList<Guppy> getListIkan(){
        ArrayList<Guppy> list = new ArrayList<>();
        for (int position = 0; position < namaIkan.length; position++){
            Guppy guppy = new Guppy();
            guppy.setNama(namaIkan[position]);
            guppy.setDetail(detailIkan[position]);
            guppy.setPhoto(gambarIkan[position]);
            list.add(guppy);
        }
        return list;
    }
}
