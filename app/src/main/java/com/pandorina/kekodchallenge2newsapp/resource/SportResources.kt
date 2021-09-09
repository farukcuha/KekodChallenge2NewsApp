package com.pandorina.kekodchallenge2newsapp.resource

import com.pandorina.kekodchallenge2newsapp.fragment.BigNewsItemFragment
import com.pandorina.kekodchallenge2newsapp.fragment.SmallNewsItemFragment
import com.pandorina.kekodchallenge2newsapp.util.OnClickItem
import com.pandorina.kekodchallenge2newsapp.R
import com.pandorina.kekodchallenge2newsapp.model.News
import com.pandorina.kekodchallenge2newsapp.model.NewsFragmentModel

object SportResources {
    fun getTechnologyList(onClickItem: OnClickItem): List<NewsFragmentModel>{
        return listOf(
            NewsFragmentModel(R.id.sport_1, SmallNewsItemFragment(onClickItem),  News(
                "SPOR",
                "3 saat önce",
                "Galatasaray Kerem Aktürkoğlu ve Mostafa Mohamed'i kurtarmaya çalışıyor",
                "Ahmet Çakar",
                "https://i.pstimaj.com/img/78/740x0/61370bdf66a97c0fc296fdca.jpg",
                "Galatasaray'da Kerem Aktürkoğlu'nun Marcao'nun affedilmesiyle beraber psikolojik olarak kötü etkilenmesinin önüne geçilmek isteniyor. 23 yaşındaki oyuncunun maaşına zam yapmayı planlayan yönetim, Fatih Terim'in de onayıyla bu planı devreye sokacak. Mostafa Mohamed'e ise özel hayatıyla ilgili uyarı geldi.",
                "Galatasaray iki genç oyuncusunun formunu yeniden artırmaya çalışıyor. Geçen sezon yedeğin de yedeği olan ancak yeteneğiyle kısa sürede as takıma yükselen Kerem Aktürkoğlu, en çok beklenti içerisinde olunan oyunculardan biri.\n" +
                        "\n" +
                        "Marcao ile yaşadığı tatsız olayın ardından moral olarak düşen oyuncunun menajeri de bu durumu itiraf etmişti.",
                "https://i.pstimaj.com/img/78/0x448/6135d37f66a97cd1be78d837.jpg",
                "Menajer Erkut Söğüt, \"Marcao olayından sonra Kerem'in babası rahatsızlık geçirdi. Oğlunuzun böyle bir şey yaşamasına yürek dayanmaz. Bir kulübün duruşunun sportif başarıdan daha önemli olduğunu düşünüyorum. Değerlerin de daima çıkarlardan önce geldiğine inanıyorum. Kerem'e şımarık diyorlar ama benim gördüğüm en terbiyeli oyunculardan. Bana her zaman önceliğinin Galatasaray olduğunu söylüyor\" demişti.",
                "https://i.pstimaj.com/img/78/0x416/61370be7ae298b355c498ea0.jpg",
                "Galatasaray ise ihtiyaç duyduğu için Marcao'yu affetti. İstenen bedele satılamayan Marcao'yu kulüpten dışlamak yerine kazanmak isteyen kulüp, Kerem Aktürkoğlu'nu da kaybetmek istemiyor. Sabah'tan Mehmtt Özcan'ın haberine göre, 900 bin lira olan maaşına zam yapılacak olan Kerem'in yeni maaşının 4 milyon lira olması bekleniyor.",
                "https://www.posta.com.tr/galatasaray-kerem-akturkoglu-ve-mostafa-mohamedi-kurtarmaya-calisiyor-haber-fotograf-2371779-5"
            )),
            NewsFragmentModel(R.id.sport_2, SmallNewsItemFragment(onClickItem),  News(
                "SPOR",
                "4 saat önce",
                "Hagi'nin oğlunun testi pozitif çıktı, Galatasaray'ın yıldızı Cicaldau apar topar karantinaya alındı",
                "Sinan Engin",
                "https://foto.haberler.com/manset/2021/09/07/hagi-nin-oglunun-testi-pozitif-cikti-g-saray-in_14380956_3044_z1.jpg",
                "Romanya formasıyla, 2022 Dünya Kupası Elemeleri'nde Kuzey Makedonya'ya karşı oynayacak Galatasaray'ın yeni transferi Alexandru Cicaldau koronavirüs şüphesiyle karantinaya alındı. Ianis Hagi'nin koronavirüs testinin pozitif çıkması sonrası futbolcuyla yakın temasta olan Cicaldau'ya PCR testi yapıldı. Sonuç negatif çıkmasına rağmen sarı-kırmızılıların yeni transferi pandemi kuralları nedeniyle akşam antrenmanına katılamadı.",
                "Galatasaray'ın yeni transferi Cicaldau, koronavirüse yakalanan Hagi'nin oğlu Ianis'le yakın temasta olduğu için Romanya Milli Takımı'yla antrenmana çıkamadı.",
                "https://foto.haberler.com/haber/2021/09/07/hagi-nin-oglunun-testi-pozitif-cikti-galatasaray-14380956_310_o.jpg",
                "Sporx'in haberine göre; Gheorghe Hagi'nin oğlu Ianis Hagi, baş ağrısı nedeniyle kendisini iyi hissetmediğini milli takım doktorlarına bildirdi. Ianis Hagi'ye yapılan koronavirs testinin ardından sonuç pozitif çıktı. Ianis Hagi ile yakın temasta olan Alexandru Cicaldau, Razvan Marin ve Dragoş Nedelcu'ya da test yapıldı. Üç futbolcunun ilk testleri negatif geldi. ",
                null,
                "Kuzey Makedonya'daki pandemi kurallarına göre üç futbolcu da akşam antrenmanına katılamadı. Cicaldau ve diğer iki isme PCR testi yapıldı. Maç saatine kadar test sonuçlarının negatif gelmesi halinde üç isim karşılaşmada forma giyebilecek.",
                "https://www.haberler.com/hagi-nin-oglunun-testi-pozitif-cikti-galatasaray-14380956-haberi/"
            )),
            NewsFragmentModel(R.id.sport_3, BigNewsItemFragment(onClickItem),  News(
                "SPOR",
                "7 saat önce",
                "Fenerbahçe bombayı patlatıyor! Real Madrid'in dünyaca ünlü yıldızı Marcelo için teklif yapıldı",
                "Rasim Ozan Kütahyalı",
                "https://foto.haberler.com/manset/2021/09/07/fenerbahce-transferin-bitimine-saatler-kala_14379237_5265_z1.jpg",
                "Fenerbahçe, İspanyol devi Real Madrid'den ayrılmayı kafasına koyan 33 yaşındaki Brezilyalı yıldız Marcelo için kulübüne ve menajerine teklifte bulundu. Real Madrid yönetiminin Sarı-lacivertli ekibin teklifini değerlendirmeye aldığı ve en kısa sürede dönüş yapacağı öğrenildi.\n",
                "Yaz transfer sezonunun son günlerini çok hareketli geçiren Fenerbahçe sol bek transferi için de ciddi bir mesai harcıyor. Sarı-Lacivertliler, sol bek transferi için mesai harcarken gelen bir haber camia içinde büyük bir heyecana neden oldu. Bu heyecanın nedeni ise Brezilyalı yaldız Marcelo oldu.",
                "https://foto.haberler.com/haber/2021/09/07/fenerbahce-bombayi-patlatiyor-real-madrid-in-14379237_8832_m.jpg",
                "Real Madrid yönetiminin Fenerbahçe'nin bu teklifini değerlendirmeye aldığı ve en kısa sürede dönüş yapacakları öğrenildi. Akşam gazetesinin haberine göre olumlu cevap gelirse transfer sezonu bir dünya starı ile tamamlanacak.",
                "https://foto.haberler.com/haber/2021/09/07/fenerbahce-bombayi-patlatiyor-real-madrid-in-14379237_9530_o.jpg",
                "Fenerbahçe yönetimi daha önce temas kurduğu sol bek adaylarıyla olan temaslarını da devam ediyor. Bugün ya da yarın Fenerbahçe'nin yeni sol beki kesinlik kazanmış olacak.",
                "https://www.haberler.com/fenerbahce-bombayi-patlatiyor-real-madrid-in-14379237-haberi/"
            )),
            NewsFragmentModel(R.id.sport_4, SmallNewsItemFragment(onClickItem),  News(
                "SPOR",
                "8 saat önce",
                "Mesut Özil'in menajeri Erkut Söğüt'ten transfer iddialarına yanıt: Katar'a kendi ticari işleri ve sponsorluk görüşmeleri için gitti",
                "Erman Toroğlu",
                "https://foto.haberler.com/manset/2021/09/07/mesut-ozil-katar-a-mi-gidiyor-menajeri-olay_14379915_1816_z1.jpg",
                "Fenerbahçe'nin yıldız futbolcusu Mesut Özil geçtiğimiz günlerde Katar'ı ziyaret etmiş ve görüntülerin basına sızmasıyla transfer dedikoduları ortaya atılmıştı. İddialarla ilgili konuşan Özil'in menajeri Erkut Söğüt, \"Mesut daha 3 yıl Fenerbahçe'de futbol oynayacak. Bundan kimsenin şüphesi olmasın. Katar'a kendi ticari işleri ve sponsorluk görüşmeleri için gitti\" ifadelerini kullandı.",
                "Söğüt, Katar seyehati sonrası bu ülkeye transfer olacağı iddia edilen yıldız futbolcu ile ilgili olarak net konuştu:\"Mesut Özil, Fenerbahçe sevgisi ile büyüdü ve şimdi o formayı giymenin duygusunu yaşıyor. Çok mutlu ve her zaman Fenerbahçe'nin başarısı için görev verildiği anda elinden geleni veren bir topçu. Bazı futbolcular vardır başka kulüp bulamadıkları için Türkiye'ye gelirler. Mesut ise her zaman planladığı ve istediği için geldi. Para için değil.Katar seyahatine gelince, Mesut daha 3 yıl Fenerbahçe'de futbol oynayacak. Bunda kimsenin şüphesi olmasın. Katar'a kendi ticari işleri ve sponsorluk görüşmeleri için gitti.\"",
                "https://foto.haberler.com/haber/2021/09/07/mesut-ozil-in-menajeri-erkut-sogut-ten-transfer-14379915_1530_m.jpg",
                "Fanatik'e konuşan Söğüt, yıldız futbolcunun herkes gibi ilk 11'de oynamak istediğini söyleyerek, \"Zaten doğal olan da budur. Eğer bir futbolcu 11'de oynamadığında mutlu ise bir sorun var demektir. Mesut, Fenerbahçe'de şampiyonluk yaşamak için sahada her şeyi yapmaya hazır\" dedi.",
                "https://foto.haberler.com/haber/2021/09/07/mesut-ozil-in-menajeri-erkut-sogut-ten-transfer-14379915_5670_o.jpg",
                "Geçtiğimiz günlerde Katar'ı ziyaret eden 32 yaşındaki yıldız, Katar Emiri Şeyh Temim bin Hamed Al Sani ile bir araya gelmişti. Ülkedeki yerel medyada geçen haberlerde, Şeyh Temim'in Özil'i Emirlik Divanı'nda kabul ettiği belirtildi. Özil, Katar'ı ziyareti sırasında ülkedeki birçok spor tesisinde incelemelerde bulunurken, başkent Doha'daki Aspetar Spor Hastanesi'ni de ziyaret etmişti.",
                "https://www.haberler.com/mesut-ozil-in-menajeri-erkut-sogut-ten-transfer-14379915-haberi/"
            )),
            NewsFragmentModel(R.id.sport_5, SmallNewsItemFragment(onClickItem),  News(
                "SPOR",
                "12 saat önce",
                "Cebelitarık'taki kadroyu unutun! İşte kritik Hollanda maçında A Milli Takım'ın muhtemel 11'i",
                "Sergen Yalçın",
                "https://foto.haberler.com/manset/2021/09/07/cebelitarik-taki-kadroyu-unutun-iste-kritik_14378867_7860_z1.jpg",
                "A Milli Takım, 2022 Dünya Kupası yolunda en kritik maçlarından birine Hollanda karşısında çıkacak. Maça grup lideri olarak başlayacak Ay-Yıldızlılar olası bir puan kaybında zirveyi kaptırabilir. Teknik direktör Şenol Güneş'in de bu maç öncesi sahaya süreceği ilk 11 netleşmeye başladı. Deneyimli hoca, Cebelitarık maçında sahaya sürdüğü takımdan birçok isme bu maçta şans vermeyecek. Orta sahada Ozan Tufan-Okay ikilisinin oynaması beklenirken Kenan Karaman yeniden 11'e dönecek.",
                "Sabah'ın haberine göre; Karadağ maçında özellikle yediği frikik golünde hatalı bulunan Altay Bayındır'ın yerine Cebelitarık karşısında olduğu gibi Uğurcan Çakır ile kalede devam edilecek. Uğurcan'ın önündeki defans dörtlüsünü Zeki-Merih-Çağlar-Mert Müldür oluşturacak. Ön liberoda ise Okay oynayacak. Sağda Cengiz, solda Kenan, 10 numara pozisyonunda Hakan ve ileri uçta sarı kart cezasını tamamlayan ve Hollanda'ya karşı oynamasında sorun olmayan Burak'ın yeri garanti. Orta sahada Okay Yokuşlu'yu tamamlayacak son formayı Ozan Tufan giyecek. Premier Lig ekibi Watford'a transfer olan 26 yaşındaki başarılı futbolcu, Ada'daki oturma izni sorununu çözüp dün kamptaki yerini aldı. Ozan, Hollanda maçında ilk 11'de olacak.",
                "https://foto.haberler.com/haber/2021/09/07/cebelitarik-taki-kadroyu-unutun-iste-kritik-14378867_1124_m.jpg",
                "Cebelitarık maçına Uğurcan, Zeki, Kaan, Çağlar, Mert Müldür, Efecan, Taylan, Orkun, Kerem, Yusuf ve Enes ilk 11'yle başlayan A Milli Takım, Hollanda karşılaşmasına tam 8 değişiklikle çıkacak. Buna göre kritik Hollanda maçında ilk 11'imizde sahaya Uğurcan Çakır, Zeki, Merih, Çağlar, Mert Müldür, Ozan Tufan, Okay Yokuşlu, Cengiz, Kenan, Hakan ve Burak çıkacak.",
                "https://foto.haberler.com/haber/2021/09/07/cebelitarik-taki-kadroyu-unutun-iste-kritik-14378867_6890_o.jpg",
                "Türkiye, 2022 Dünya Kupası Elemeleri G Grubu 6. maçında Hollanda'ya konuk olacak. A Milli Takım'ın liderlik koltuğunu korumak için çıkacağı maçta ilk 11'imiz belli oldu.",
                "https://www.haberler.com/cebelitarik-taki-kadroyu-unutun-iste-kritik-14378867-haberi/"
            )),
            NewsFragmentModel(R.id.sport_6, SmallNewsItemFragment(onClickItem),  News(
                "SPOR",
                "15 saat önce",
                "Lyon'dan olay yaratan paylaşım! Taraftarlar, Karim Benzema'nın transfer edildiğini sandı",
                "Ahmet Çakar",
                "https://foto.haberler.com/manset/2021/09/06/lyon-dan-olay-yaratan-paylasim-taraftarlar_14378834_7969_z1.jpg",
                "2022 Dünya Kupası Elemeleri D Grubu'nda Fransa, Lyon'un maçlarını oynadığı Groupama Stadyumu'nda Finlandiya'yla karşılaşacak. Mücadele öncesinde Lyon kulübü eski futbolcusu Benzema için, \"Evine hoş geldin\" paylaşımında bulundu. Paylaşımı gören Fransız taraftarlar, dünyaca ünlü golcünün takımlarına transfer olduğunu sanarak büyük şaşkınlık yaşadı.",
                "Fransa, 2022 Dünya Kupası Elemeleri D Grubu maçında yarın Finlandiya'yla karşılaşacak. Fransa Ligue 1'de Lyon'un maçlarını oynadığı Groupama Stadyumu'nda oynanacak maç öncesi, Fransız ekibinin paylaşımı kısa süreli heyecan yarattı.",
                "https://foto.haberler.com/haber/2021/09/06/lyon-dan-olay-yaratan-paylasim-taraftarlar-14378834_6434_m.jpg",
                "Bir dönem Fransız ekibinde forma giyen Benzema'nın milli maç için yeniden Groupama çimlerine çıkmasına göndermede bulunan Lyon, \"Evine hoş geldin\" paylaşımında bulundu. Bu paylaşımı gören taraftarlar kısa süreli bir şok yaşayarak dünyaca ünlü golcünün takımlarına transfer olduğunu sandı. Gerçeğin hemen fark edilmesi sonrası taraftarlar paylaşımın altına binlerce yorum yazarak, hayal kırıklığı yaşadıklarını belirtti.",
                null,
                "",
                "https://www.haberler.com/lyon-dan-olay-yaratan-paylasim-taraftarlar-14378834-haberi/",
                divider = false
            )),


        )

    }
}