package com.example.myrecycleview;

import java.util.ArrayList;

public class DataAnime {



    private static String[] urutan = {
            "1. ",
            "2. ",
            "3. ",
            "4. ",
            "5. ",
            "6. ",
            "7. ",
            "8. ",
            "9. ",
            "10. "
    };

    private static String[] sinopsis = {"Death Note adalah sebuah seri manga shōnen Jepang yang " +
            "ditulis oleh Tsugumi Ohba dan diilustrasikan oleh Takeshi Obata. Ceritanya mengisahkan " +
            "tentang Light Yagami, seorang remaja jenius yang menemukan buku catatan asing misterius" +
            " yang disebut \"Death Note\"—yang dimiliki oleh Shinigami bernama Ryuk, dan memberikan" +
            " penggunanya kemampuan supernatural untuk membunuh siapa pun yang namanya tertulis pada buku tersebut. Seri ini berpusat pada usaha Light menggunakan Death Note demi mengubah dunia menjadi komunitas utopia tanpa kejahatan dengan menyamar sebagai sosok dewa penegak keadilan bernama \"Kira\" (\"キラ\", alih aksara Jepang dari kata bahasa Inggris killer) serta upaya dari sebuah pasukan khusus elit penegakan hukum, yang terdiri dari para anggota kepolisian Jepang pimpinan L—seorang detektif internasional aneh yang masa lalunya diliputi dengan misteri, demi menangkap dan mengakhiri teror dari Kira."
    ,"Dragon Ball Z adalah sebuah seri televisi animasi Jepang yang diproduksi oleh Toei Animation." +
            " Dragon Ball Z adalah sekuel untuk anime Dragon Ball dan mengadaptasi 325 bab terakhir" +
            " dari 519 bab original seri manga Dragon Ball yang dibuat oleh Akira Toriyama yang" +
            " dipublikasikan dari 1988 sampai 1995 di Weekly Shonen Jump. Dragon Ball Z pertama" +
            " kali ditayangkan di Jepang di Fuji TV dari 25 April 1989 sampai 31 Januari 1996 sebelum" +
            " disulihsuarakan di beberapa negara di seluruh dunia termasuk United States, Australia," +
            " Eropa, India dan Amerika Latin.\n" +
            "Dragon Ball Z mengikuti petualangan dari sang protagonis Goku, yang bersama dengan " +
            "sahabat-sahabatnya melindungi bumi dari musuh-musuh yang berkeliaran menggunakan pesawat" +
            " tempur antargalaksi, android yang bertenaga luar biasa dan makhluk sihir yang tidak " +
            "dapat dimusnahkan. Sebagaimana anime original Dragon Ball yang mengikuti Goku dari masa" +
            " kecil sampai masa dewasanya, Dragon Ball Z adalah kelanjutan masa dewasanya, tetapi " +
            "pada saat yang sama berjajaran dengan perkembangan anak-anaknya, Gohan dan Goten juga " +
            "evolusi dari saingannya Piccolo dan Vegeta dari musuh menjadi sekutu."
    , "Naruto adalah sebuah serial manga karya Masashi Kishimoto yang diadaptasi menjadi serial anime. Manga Naruto bercerita seputar kehidupan tokoh utamanya, Naruto Uzumaki, seorang ninja yang hiperaktif, periang, dan ambisius yang ingin mewujudkan keinginannya untuk mendapatkan gelar Hokage, pemimpin dan ninja terkuat di desanya. Serial ini didasarkan pada komik one-shot oleh Kishimoto yang diterbitkan dalam edisi Akamaru Jump pada Agustus 1997.\n" +
            "Manga Naruto pertama kali diterbitkan di Jepang oleh Shueisha pada tahun 1999 dalam edisi ke-43 majalah Shonen Jump. Di Indonesia, manga ini diterbitkan oleh Elex Media Komputindo. Popularitas dan panjang seri Naruto sendiri (terutama di Jepang) menyaingi Dragon Ball karya Akira Toriyama, sedangkan serial anime Naruto, diproduksi oleh Studio Pierrot dan Aniplex, disiarkan secara perdana di Jepang oleh jaringan TV Tokyo dan juga oleh jaringan televisi satelit khusus anime, seperti Animax dan stasiun televisi lainnya, pada 3 Oktober 2002 sampai sekarang. Seri pertama terdiri atas 9 musim dan berlangsung 220 episode. Musim pertama dari seri kedua mulai ditayangkan pada tanggal 15 Februari 2007. "
    , "One Piece adalah sebuah seri manga Jepang yang ditulis dan diilustrasikan oleh Eiichiro Oda. Manga ini telah dimuat di majalah Weekly Shōnen Jump milik Shueisha sejak tanggal 22 Juli 1997, dan telah dibundel menjadi 91 volume tankōbon. Ceritanya mengisahkan petualangan Monkey D. Luffy, seorang anak laki-laki yang memiliki kemampuan tubuh elastis seperti karet setelah memakan Buah Iblis secara tidak disengaja. Dengan kru bajak lautnya, yang dinamakan Bajak Laut Topi Jerami, Luffy menjelajahi Grand Line untuk mencari harta karun terbesar di dunia yang dikenal sebagai \"One Piece\" dalam rangka untuk menjadi Raja Bajak Laut yang berikutnya.\n" +
            "Manga ini telah diadaptasi menjadi sebuah animasi video asli (OVA) yang diproduksi oleh Production I.G pada tahun 1998, dan sebuah serial anime yang diproduksi oleh Toei Animation, yang mulai tayang di Jepang pada tahun 1999. Sebagai tambahan, Toei juga telah memproduksi tiga belas film animasi, satu OVA dan sebelas episode khusus televisi. Beberapa perusahaan telah mengembangkan berbagai jenis pernak-pernik seperti permainan kartu dagang dan beberapa permainan video. "
    , "Shingeki no Kyojin, yang diterbitkan di Indonesia dengan judul Attack on Titan, adalah sebuah seri manga Jepang yang ditulis dan diilustrasikan oleh Hajime Isayama. Manga ini pertama kali dimuat dalam majalah Bessatsu Shōnen Magazine terbitan Kodansha sejak tanggal 9 September 2009, dan telah dibundel menjadi 28 volume tankōbon hingga bulan April 2019. Ceritanya berlatar di dunia tempat umat manusia hidup di kota yang dikelilingi tembok besar, yang melindungi mereka dari makhluk pemakan manusia berukuran raksasa yang dikenal sebagai titan.\n" +
            "Attack on Titan meraih kesuksesan kritis dan komersial. Hingga bulan April 2019, manga ini telah terjual sebanyak 90 juta kopi dalam bentuk cetak di seluruh dunia (80 juta di Jepang dan 10 juta di luar Jepang), membuatnya menjadi salah satu seri manga terlaris. Adaptasi anime-nya diterima dengan baik oleh para kritikus, dan tiga musim pertamanya mendapatkan pengakuan kritikus yang memuji cerita, animasi, musik, dan sulih suaranya. Anime-nya juga terbukti sangat sukses di AS dan Jepang, dan meningkatkan popularitas seri ini. Meskipun seri ini juga meraih ketenaran di negara Asia lainnya, interpretasi politik atas seri ini menimbulkan kontroversi di Tiongkok dan Korea Selatan."
    , "Fullmetal Alchemist adalah sebuah anime dan manga karya Hiromu Arakawa. Fullmetall Alchemist diterbitkan dalam majalah manga Monthly Shonen Gangan sejak tahun 2002 dan dalam bentuk tankobon oleh Square Enix. Di Indonesia, komik ini diterbitkan Elex Media Komputindo sejak Mei 2007.\n" +
            " Bercerita tentang Vico Edward Elric dan Alphonse Elric awalnya hidup bahagia dengan orang tua mereka. Tetapi karena pekerjaan ayahnya adalah alkemist (ahli kimia), ayahnya yang bernama Van Hohenheim sering bepergian keluar rumah, sehingga Ed dan Al hanya tinggal bersama ibunya, Trisha Elric. Karena terlalu lelah mengurus rumah sendirian, Trisha jatuh sakit dan akhirnya meninggal. Ed dan Al yang saat itu masih kecil, namun sudah mewarisi bakat ayahnya sebagai alkemist mencoba menghidupkan kembali sang ibu. Namun, usaha mereka gagal. Tubuh Al dan kaki kiri Ed diambil sebagai \"biaya masuk\" karena transmutasi manusia adalah hal tabu dalam alkimia. Ed yang panik akhirnya memindahkan roh Al ke dalam baju zirah dengan bayaran tangan kanannya."
    , "Fairy Tail adalah sebuah seri manga Jepang yang ditulis dan diilustrasikan oleh Hiro Mashima. Manga ini dimuat dalam majalah Weekly Shōnen Magazine sejak tanggal 2 Agustus 2006 hingga 26 Juli 2017, dan telah dibundel dan diterbitkan menjadi 63 volume tankōbon oleh Kodansha. Ceritanya mengisahkan tentang Natsu Dragneel, anggota dari guild penyihir[4] populer bernama Fairy Tail, yang bertualang di Earth-land dalam tujuannya untuk mencari seekor naga bernama Igneel.\n" +
            "Manga ini telah diadaptasi menjadi sebuah seri anime yang diproduksi oleh A-1 Pictures, Dentsu Inc., Satelight, Bridge, serta CloverWorks, dan mulai ditayangkan di Jepang sejak tanggal 12 Oktober 2009. Selain itu, A-1 Pictures telah memproduksi sembilan animasi video orisinal dan dua film animasi. Musim pertama berakhir pada tanggal 30 Maret 2013. Musim kedua disiarkan di TV Tokyo sejak tanggal 5 April 2014, dan berakhir pada tanggal 26 Maret 2016. Musim ketiga tayang sejak tanggal 7 Oktober 2018, dan direncanakan untuk tayang sebanyak 51 episode.Seri ini juga menjadi inspirasi dari beberapa manga spin-off, termasuk sebuah sekuel yang berada di bawah pengawasan Mashima, bertajuk Fairy Tail: 100 Years Quest, yang dirilis pada tanggal 25 Juli 2018."
    , "Bleach adalah sebuah seri manga shōnen Jepang yang ditulis dan diilustrasikan oleh Tite Kubo. Alur ceritanya mengisahkan petualangan remaja keras kepala bernama Ichigo Kurosaki yang mewarisi takdir orang tuanya, setelah ia mendapatkan kekuatan Shinigami (死神 Shinigami, terj. har. \"Dewa Kematian\")—sebuah personifikasi kematian yang mirip dengan Malaikat Maut—dari Shinigami lainnya, Rukia Kuchiki. Kekuatan baru ini memaksanya untuk melakukan tugas melindungi manusia dari roh-roh jahat dan menuntun jiwa-jiwa yang mati ke alam baka, dan membawanya ke petualangan-petualangan di berbagai alam spiritual yang ada.\n" +
            "Bleach telah dimuat berseri dalam majalah manga Jepang bertajuk Weekly Shōnen Jump sejak bulan Agustus 2001 hingga Agustus 2016, dan bab-babnya telah dibundel menjadi 74 volume tankōbon. Seri ini telah menghasilkan sebuah waralaba media yang terdiri dari seri anime yang diproduksi oleh Studio Pierrot sejak tahun 2004 hingga 2012, dua episode animasi video asli, empat film animasi, sepuluh panggung musikal, dan sejumlah permainan video, begitu pula dengan banyaknya jenis pernak-pernik terkait Bleach. Sebuah adaptasi film laga hidup (live-action) dirilis pada tahun 2018. Bleach dirilis dalam bahasa Inggris oleh Viz Media, yang telah menerbitkan beberapa volume dari manga ini setiap tahun sejak tahun 2004, dan menerbitkan bab-bab Bleach dalam majalah Shonen Jump milik mereka sejak bulan November 2007. "
    , "Naruto Shippuden adalah sebuah seri anime yang diadaptasi dari bagian II manga Naruto. Serial ini disutradarai oleh Hayato Date dan diproduksi oleh Studio Pierrot dan TV Tokyo. Pada bagian ini, pergerakan organisasi Akatsuki semakin terlihat. Naruto Shippuden juga telah dibuat versi movie-nya dengan judul Naruto Shippuden The Movie yang dirilis di Jepang pada Agustus 2007. Film ini menceritakan tentang usaha ninja jahat dalam membangkitkan Mouryou, roh jahat yang telah dikalahkan 20 tahun yang lalu. Setelah Naruto Shippuden The Movie dirilis, hadir pula Naruto Shippuden The Movie 2: Bond. Film ini menceritakan serangan kelompok ninja dari Negara Langit kepada Konoha. Kemudian Naruto Shippūden The Movie 3: Inheritors of the Will of Fire. Di sini diceritakan Konoha dituduh sebagai dalang penyebabnya para ninja dengan Kekkei Genkai menghilang dari Sunagakure, Kirigakure, Kumogakure dan Iwagakure. Di Indonesia, Naruto Shippuden sempat ditayangkan di Indosiar dan saat ini ditayangkan di GTV."
    , "Hunter × Hunter adalah sebuah seri manga shōnen Jepang yang ditulis dan diilustrasikan oleh Yoshihiro Togashi. Manga ini mulai dimuat dalam majalah Weekly Shōnen Jump sejak tanggal 16 Maret 1998, meskipun seringkali mengalami hiatus berkepanjangan sejak tahun 2006. Hingga bulan Oktober 2018, 380 bab telah dibundel menjadi 36 volume oleh Shueisha. Ceritanya berfokus pada seorang bocah lelaki bernama Gon Freecss, yang mengetahui bahwa ayahnya yang sudah meninggalkannya sejak masih kecil, sebenarnya merupakan seorang Hunter ternama di dunia, sebuah profesi berlisensi bagi mereka yang berspesialisasi dalam—tetapi tidak terbatas pada—pencarian tak lazim layaknya menemukan spesies hewan langka atau tidak dikenal, berburu harta karun, mengunjungi wilayah-wilayah yang belum terjamah, atau memburu individu yang melanggar hukum. Meskipun ditinggalkan oleh ayahnya, Gon berangkat untuk mengikuti jejaknya, mengikuti Ujian Hunter yang ketat, dan akhirnya menemukan ayahnya. Sepanjang perjalanan, Gon bertemu para Hunter lainnya, termasuk para karakter utama seperti Kurapika, Leorio, dan Killua, dan juga bertemu paranormal. Inspirasi asli untuk manga ini berasal dari hobi Togashi yang suka mengoleksi."};


    private static String[] animeName ={
            "Death Note",
            "Dragon Ball Z",
            "Naruto",
            "One Piece",
            "Attack on Titan",
            "Fullmetal Alchemist",
            "Fairy Tail",
            "Bleach",
            "Naruto Shippuden",
            "Hunter × Hunter"
    };


    private static String[] videoId ={
            "Amag3NrjBc0",
            "aOPJ6y3HWII",
            "j2hiC9BmJlQ",
            "yhxJDAgjyYE",
            "MGRm4IzK1SQ",
            "BOm_PAI2goo",
            "BaIWwk-sAlw",
            "oZ67d9XSjFs",
            "thh7bVCgDHs",
            "d6kBeJjTGnY"
    };

    private static int[] heroPhoto = {R.drawable.deathnote,
            R.drawable.dbz,
            R.drawable.naruto,
            R.drawable.onepiece,
            R.drawable.aot,
            R.drawable.fma,
            R.drawable.ft,
            R.drawable.bleach,
            R.drawable.narushi,
            R.drawable.dnt};

    static ArrayList<Anime> getHeroData(){
        ArrayList<Anime> list = new ArrayList<>();

        for (int p = 0; p < animeName.length; p++){
            Anime anime = new Anime();
            anime.setName(animeName[p]);
            anime.setPhoto(heroPhoto[p]);
            anime.setSinopsis(sinopsis[p]);
            anime.setUrutan(urutan[p]);
            anime.setVideoId(videoId[p]);
            list.add(anime);
        }
        return list;
    }
}
