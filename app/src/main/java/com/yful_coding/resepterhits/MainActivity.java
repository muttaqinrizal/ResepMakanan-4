package com.yful_coding.resepterhits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView listHistory;
    LinearLayoutManager linear;

    List<PolaItem> items;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listHistory = (RecyclerView)findViewById(R.id.list);

        linear = new LinearLayoutManager(this);
        listHistory.setLayoutManager(linear);

        items = new ArrayList<>();
        items.add(new PolaItem(R.drawable.gambar1,"Tahu petis","Tahu petis menu hidangan anak hits","\n" +
                "\n" +
                "    5 potong tahu putih\n" +
                "\n" +
                "    Minyak secukupnya, untuk menumis dan menggoreng\n" +
                "\n" +
                "    100 gr petis udang, larutkan dengan 250 ml air hangat\n" +
                "\n" +
                "    3 siung bawang putih, cincang\n" +
                "\n" +
                "    3 buah cabai rawit\n" +
                "\n" +
                "    3 batang daun bawang, ambil bagian putih, iris halus\n" +
                "\n" +
                "    5 lembar daun jeruk\n" +
                "\n" +
                "    Garam secukupnya \n" +
                "\n" +
                "    1/4 sdt merica bubuk\n"
                ,"   Goreng tahu hingga matang, angkat, tiriskan. Iris melintang pada bagian tengah tetapi jangan sampai terpotong.\n" +
                "    Cincang halus bawang putih, iris halus cabai rawit dan daun bawang.\n" +
                "    Panaskan 2 sdm minyak, bawang putih, cabai rawit dan daun bawang hingga harum..\n" +
                "    Masukkan larutan petis, masak sambil terus diaduk hingga saus mendidih dan kental. Angkat, dinginkan. Isi tahu dengan saus petis. Sajikan dengan cabai rawit hijau..\n" ));
        items.add(new PolaItem(R.drawable.gambar2,"Pempek ","Pempek menu hidangan anak hits","\n" +
                "    1 Cangkir (1 bagian) ikan tenggiri giling\n" +
                "    1 Cangkir (1 bagian) Air putih\n" +
                "    Garam secukupnya\n" +
                "    2 sdm minyak goreng\n" +
                "    Tepung kanji secukupnya\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSaus Cuko:\n" +
                "\n" +
                "    1 kg gula merah yang bagus,potong-potong\n" +
                "    cabai rawit sesuai selera\n" +
                "    200 g bawang putih\n" +
                "    3 sdm cuka putih/air asam/air jeruk nipis\n" +
                "    garam secukupnya\n" +
                "    2 liter air\n"
                ,"\n" +
                "    PCampur ikan giling dengan air dan garam hingga benar-benar larut dan cukup asinnya.\n" +
                "    Tambahkan tepung kanji secukupnya sampai adonan bisa diuleni (banyak sedikit tepung kanji tergantung pada kekenyalan yang diinginkan). Jika suka yang kenyal bisa dipakai lebih banyak.\n" +
                "    Adonan pempek siap dibentuk sesuai selera. Untuk pempek kapal selam, ambil adonan secukupnya, bentuk seperti mangkuk, isi dengan telur ayam mentah lalu rekatkan agar tidak bocor.\n" +
                "    Rebus dalam air mendidih dengan api sedang hingga mengapung.\n" +
                "    Angkat, tiriskan.\n" +
                "    Masukkan dalam air dingin.\n" +
                "    Untuk pempek lenjer, bentuk adonan seperti silinder dan rebus sampai mengambang kemudian angkat dan masukkian dalam air dingin.\n" +
                "    Untuk andaan, ambil adonan secukupnya, tambahkan sedikit bawang goreng atau daun bawang iris seta telur, aduk rata.\n" +
                "    Bentuk adonan menjadi bola-bola dan goreng dalam minyak panas dengan api kecil hingga mengapung dan matang.\n" +
                "\n" ));
        items.add(new PolaItem(R.drawable.gambar3,"Cireng ","Cireng menu hidangan anak hits","\n" +
                "Tepung kanji 300 gram (usahakan tepung tersebut berkualitas baik)\n" +
                "Tepung terigu 150 gram\n" +
                "Bawang putih 2 siung yang sudah dihaluskan\n" +
                "Merica bubuk ¼ sdt\n" +
                "Garam halus 1 sdm\n" +
                "Gula pasir secukupnya\n" +
                "Isi pada bagian dalam cireng (Anda dapat menggunakan daging ayam, bakso, keju, sesuai selera)\n" +
                "Penyedap rasa secukupnya (sesuai selera)\n" +
                "Air yang mendidih secukupnya\n" +
                "Minyak goreng secukupnya untuk menggoreng\n" ,"\n" +
                "Siapkan wadah untuk membuat adonan.\n" +
                "Selanjutnya campurkan semua bahan yang telah disiapkan, seperti tepung kanji, tepung tapioka, merica bubuk, gula garam, dan bawang putih yang sudah dihaluskan. Aduk hingga adonan tercampur dengan rata.\n" +
                "Tuangkan air sedikit demi sedikit kedalam adonan tepung.\n" +
                "Uleni menggunakan tangan adonan tersebut sehingga kalis dan legit agar nantinya mudah untuk dibentuk.\n" +
                "Ambilah adonan, kemudian dibentuk dengan cetakan (sesuai selera Anda).\n" +
                "Setelah dicetak, iris bagian pinggirnya dan masukkan isinya (misalnya ayam, keju, dll sesuai selera).\n" +
                "Panaskan minyak goreng dengan api sedang, lalu goreng cireng dengan dibolak-balik dan tunggu sampai matang secara merata sampai bagian dalamnya.\n" +
                "Jika sudah matang, tiriskan untuk menghilangkan minyak yang berlebih.\n" +
                "Jika sudah, cireng siap untuk dihidangkan.\n" ));
        items.add(new PolaItem(R.drawable.gambar4,"Martabak ","Martabak menu hidangan anak hits","\n" +
                "Tepung Terigu 6 ons\n" +
                "Gula 6 sendok makan\n" +
                "Telur ayam 4 butir\n" +
                "Vanili 2 sendok teh\n" +
                "Fermipan 2 sendok teh\n" +
                "Air matang secukupnya\n" +
                "2 sendok teh Baking Powder\n" +
                "Pelengkap\n" +
                "Susu Putih\n" +
                "Meises dan keju parut secukupnya\n" ,"\n" +
                "\n" +
                "Siapkan wadah kemudian masukkan tepung, gula, telur, vanili dan fermipan, aduk semua bahan sambil menuangkan air sedikit demi sedikit, lakukan sampai adonan lembut.\n" +
                "Setelah dirasa lembut diamkan 1/2 jam dan beri penutup kain/serbet di atas wadah agar adonan dapat mengembang maksimal. \n" +
                "Kemudian tuangkan baking powder dan aduk kembali. .\n" +
                " Panaskan loyang menggunakan api sedang lalu olesi bagian dalam dengan margarin. \n" +
                "Setelah loyang panas segera tuangkan adonan sesuai ukuran loyang, tunggu hingga matang dan lakukan hal yang sama hingga adonan habis. \n" +
                "Angkat kue dan biarkan sampai 1 menit, setelah itu langsung saja sentuh dengan olesan susu, dilanjutkan dengan taburan keju dan meisis\n" ));
        items.add(new PolaItem(R.drawable.gambar5,"Seblak","Seblak menu hidangan anak hits","\n" +
                "2 ons kerupuk aci sumber sari\n" +
                "air secukupnya\n" +
                "minyak untuk menumis\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tHaluskan\n" +
                "2 butir bawang merah\n" +
                "2 siung bawang putih\n" +
                "½ ruas jari kencur\n" +
                "6 buah cabe rawit merah (cabai setan/ cengek domba)\n" +
                "garam dan kaldu bubuk secukupnya\n" ,"\n" +
                "\n" +
                "Didihkan air, masukkan kerupuk, rebus hingga lembek atau rendam air panas saja lalu angkat dan tiriskan.\n" +
                "Panaskan minyak, tumis bumbu halus hingga harum. Beri sedikit air, tambahkan garam dan kaldu bubuk secukupnya, aduk rata.\n" +
                "Masukkan kerupuk yang telah direbus lalu aduk lagi hingga rata. Masak hingga matang, angkat dan sajikan.\n"         ));
        items.add(new PolaItem(R.drawable.gambar6,"Pisang Coklat","Pisang Coklat menu hidangan anak hits","\n" +
                "pisang kepok atau pisang oli yang sudah matang\n" +
                "kulit lumpia\n" +
                "gula secukupnya\n" +
                "keju sesuaikan selera\n" +
                "meses sesuaikan selera\n" +
                "tape singkong sesuaikan selera\n" +
                "putih telur\n" +
                "minyak untuk menggoreng\n"
                ,"\n" +
                "\n" +
                "Potong-potong pisang kepok yang sudah matang, (Kalau saya biasanya potong 2 memanjang)\n" +
                "Siapkan kulit lumpia, letakkan potongan pisang kepok tadi di salah satu ujung dan beri sedikit gula, meses atau keju ( Kombinasi keduanya juga boleh). Oleskan putih telur di kedua bagian ujungnya, kemudian gulung dan tekan bagian ujungnya biar tertutup.\n" +
                "Selanjutnya, gorang pisang coklat sampai berubah warna menjadi kecoklatan dan angkat…\n" +
                "Sajikan cemilan piscok ini sebagai teman ngopi dan menikmati teh di sore hari.. Yummii.."));


        adapter = new Adapter(this,items);
        listHistory.setAdapter(adapter);
    }
}
