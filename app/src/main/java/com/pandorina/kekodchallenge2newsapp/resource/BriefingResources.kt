package com.pandorina.kekodchallenge2newsapp.resource

import com.pandorina.kekodchallenge2newsapp.fragment.BigNewsItemFragment
import com.pandorina.kekodchallenge2newsapp.fragment.SmallNewsItemFragment
import com.pandorina.kekodchallenge2newsapp.util.OnClickItem
import com.pandorina.kekodchallenge2newsapp.R
import com.pandorina.kekodchallenge2newsapp.model.News
import com.pandorina.kekodchallenge2newsapp.model.NewsFragmentModel

object BriefingResources {
    fun getBriefingList(onClickItem: OnClickItem): List<NewsFragmentModel> {
        return listOf(
            NewsFragmentModel(
                R.id.most_read_1, BigNewsItemFragment(onClickItem), News(
                    "TEKNOLOJİ",
                    "4 saat önce",
                    "BMW, Geri Dönüştürülebilir Şehir Aracı BMW i Vision Circular'ı Tanıttı",
                    "Emre Ömer Zehir",
                    "https://cdn.webtekno.com/media/cache/showcase_small_v2/article/114515/bmw-geri-donusturulebilir-sehir-araci-bmw-i-vision-circular-i-tanitti-1630950468.jpg",
                    "IAA Münih Fuarı'nda yer alan markalardan biri de Alman otomotiv devi BMW. Firmanın geleceğe dair öngörülerini gösteren i Vision Circular konsepti tamamen geri dönüştürülebilir malzemeden üretildi.",
                    "Otomotiv sektörü çok uzun zamandır daha çevreci olmak için çaba gösteriyor. Bu çalışmaların sonunda ise karbon nötr, hatta mümkünse karbon negatif araçlar üretilmesi amaçlanıyor. Firmalar da bu öngörüye uygun olarak tasarladıkları araçları tanıtıyor.\n" +
                            "\n" +
                            "Almanya'nın Münih kentinde düzenlenen IAA Fuarı'na katılan firmalardan biri de ülkenin önde gelen üreticileri arasında yer alan BMW. Rakipleri gibi hidrojen yakıtlı ya da elektrikli modellere standında yer veren firmanın gelecek öngörülerini yansıtan model ise i Vision Circular konsepti oldu.",
                    "https://www.webtekno.com/images/editor/default/0003/25/e5792d3f78e01f36d20904e079e14ed979802586.jpeg",
                    "Bu aracı yollarda görmemiz pek olası değil. Bavyera merkezli firmanın bu araçla yapmak istediği şey de 2040 yılına dair öngörülerini paylaşmak. Aracın en çok dikkat çeken özelliği ise bütün parçalarının tamamen geri dönüştürülebilir olması. \n" +
                            "\n" +
                            "Dört kişilik kompakt bir elektrikli olan BMW i Vision Circular, yaşam döngüsü sona erdiğinde her parçası tamamen geri dönüştürülebilecek şekilde tasarlandı. Tamamen dönüştürülebilir parçalar arasında günümüzde dönüşümü sorun olan bataryalar da yer alıyor. \n" +
                            "\n" +
                            "Alman firması, bu tür otomobiller sayesinde otomobillerin karbon ayak izinin gelecekte tamamen ortadan kaybolmasının sağlanabileceğine inanıyor. Yine de otomobilde kullanılan malzemeler ve tasarım farklı bir amaç taşısa da BMW kendi çizgisini de korumaya devam ediyor.",
                    "https://www.webtekno.com/images/editor/default/0003/25/c4f271928ea112d019a6a8174c6a355fb267c602.jpeg",
                    "Konsept modele baktığımız zaman fütüristik tasarıma rağmen altında yatan BMW felsefesini de görmek mümkün oluyor. Aracın ön kısmı oldukça akıcı bir tasarıma sahip ve adeta tek parçaymış gibi gözüküyor. Ön ızgara üzerinde bu tür konseptlerde alıştığımız üzere LED ışıklandırma var. Ön cam ve tavan eğimi sayesinde araç adeta bir mermi gibi ve tek parça gözüküyor. Yine de far yapısı ve genel yapısı BMW'nin tasarım dilini taşıyor. Öyle ki aracın logosunu kapatıp markasını sorsalar pek çok kişi \"BMW\" diyecektir.",
                    "https://www.webtekno.com/bmw-geri-donusturulebilir-sehir-araci-bmw-i-vision-circular-i-tanitti-h114515.html"
                )
            ),
            NewsFragmentModel(
                R.id.most_read_2, SmallNewsItemFragment(onClickItem), News(
                    "OYUN",
                    "7 saat önce",
                    "Oyun Dünyasında Geçtiğimiz Haftanın Öne Çıkan Haberleri",
                    "Okan Candoğan",
                    "https://cdn.webtekno.com/media/cache/showcase_small_v2/article/104031/haftanin-en-cok-okunan-haberleri-oyun-1630768065.jpg",
                    "Geçtiğimiz hafta oyun dünyasında pek çok önemli gelişme yaşandı. Biz de bu içeriğimizde geride bıraktığımız haftanın en dikkat çeken, en çok konuşulan haberlerini bir araya getirdik.",
                    "Geride bıraktığımız hafta hem ülkemiz hem de dünyada oyun sektörü açısından oldukça hareketli geçti. Biz de bu içeriğimizde geçtiğimiz haftanın en çok okunan, konuşulan ve öne çıkan oyun haberlerini bir araya getirdik. Gelin, tüm bu gelişmelere daha yakından göz atalım.",
                    "https://www.webtekno.com/images/editor/default/0003/25/054ecd85ce56f4f88777d6cc5abfef18f1abc870.jpeg",
                    "The Elder Scrolls V: Skyrim için geliştirilen ve oyundaki her bir işlevi kapatarak oyunu oynanmaz hale getiren NoSkyrim isimli bir mod, yayınlandığı Nexus isimli popüler mod sitesinden kaldırıldı. Modun geliştiricisi, “Skyrim bağımlılarına yardım etmek için” yarattığı modun Nexus’a geri yüklenmesi için Change.org'da kampanya başlattı.",
                    "https://www.webtekno.com/images/editor/default/0003/25/da828d1b630fc1570558c585e7cc022ed2a2aed7.jpeg",
                    "The Last of Us serisinin geliştiricisi Naughty Dog, yeni bir oyun için hazırlanıyor. Naughty Dog tarafından paylaşılan iş ilanına göre, geliştirilen multiplayer oyun “sinematik deneyim” yaşatmayı amaçlıyor. Oyunun Last of Us evreninde geçmesi ise muhtemel.",
                    "https://www.webtekno.com/haftanin-en-cok-okunan-haberleri-oyun-h104031.html"
                )
            ),
            NewsFragmentModel(
                R.id.most_read_3, SmallNewsItemFragment(onClickItem), News(
                    "KRİPTO PARA",
                    "8 saat önce",
                    "Dünya Çapında ‘30 Dolarlık Bitcoin Alın’ Çağrısı Başlatıldı: İşte Sonuçları",
                    "Şahin Kılınç",
                    "https://cdn.webtekno.com/media/cache/showcase_small_v2/article/114559/dunya-capinda-30-dolarlik-bitcoin-alin-kampanyasi-baslatildi-iste-sonuclari-1631024085.jpg",
                    "El Salvador’un Bitcoin’i resmi para birimi olarak kabul eden ilk ülke olmasının ardından Reddit’teki kripto para topluluklarında hareketlilik başladı. El Salvador’un kabulü ile birlikte ‘30 dolarlık Bitcoin alın’ çağrısı hem ünlü yatırımcılar, hem de Reddit’teki kripto para toplulukları tarafından destek gördü.",
                    "Bildiğiniz üzere El Salvador, Bitcoin’i resmi para birimi olarak kabul eden ilk ülke olarak tarihe geçti. Ancak G20 üyesi ülkeler ve uluslararası finans kuruluşları büyük oranda kripto paralara mesafeli. Türkiye’de de kripto para piyasalarını vergilendirme ve hukuki yükümlülükler içeren yasalarla düzenleme çalışmaları devam ediyor. İşte bu nedenle El Salvador, hem Türkiye hem de diğer ülkeler için deneysel bir nitelik taşıyor. \n" +
                            "\n" +
                            "Diğer taraftan bir ülkenin Bitcoin’i resmi olarak kabul etmesi, aslında “merkezi finans sistemlerine karşı merkezi olmayan, kişi ve kurumlardan bağımsız olan finans modeline geçişin” bir sinyali olarak ele alınıyor. Dolayısı ile sürekli krize gebe olan günümüz finans sistemine alternatif bekleyen milyonlarca küçük yatırımcı, El Salvador’un kararı sonrasında beklentileri yükseltti. ",
                    "https://www.webtekno.com/images/editor/default/0003/25/2e806ad968824e167879b760a7c66f6899651bcf.jpeg",
                    "El Salvador Başkanı Nayib Bukale, ülkenin Bitcoin planlarının mimarı olarak tanınıyor. Kendisi, aslında kararın duyurulduğu Haziran 2021’de 140 milyon dolarlık Bitcoin alımı yapacaklarını ve bu Bitcoin'leri halka dağıtacaklarını açıklamıştı. İşte çağrıya konu olan ‘30 dolar’ da buradan geliyor. Nüfusu 4,72 milyon olan El Salvador’un Bitcoin’i kabul etme ve yatırım kararı ile birlikte ülkedeki tüm vatandaşlar, 30 dolarlık Bitcoin sahibi olmuş durumda. \n" +
                            "\n" +
                            "Bu durumu bilen Reddit ve Twitter’daki topluluklar ise 30 dolarlık Bitcoin alın kampanyası başlattı. Kampanyaya destek verenler arasında, dünyanın en fazla Bitcoin yatırımı duyuran şirketi MicroStrategy’nin kurucu CEO’su Michael Saylor da var. Tıpkı Saylor gibi kripto para dünyasında etkisi olan yerli ve yabancı pek çok hesap destek veriyor.",
                    "https://www.webtekno.com/images/editor/default/0003/25/05a6746b1d9fff015ec2aa3b22c4a62d72731c9f.jpeg",
                    "Bu çağrının günün ilk saatlerinde piyasalara olumlu yansıdığını ve Bitcoin’in 51.800 dolardan 52.800 dolar seviyesine kadar yükseldiğini görüyoruz. Ancak yatırımcıların ağırlıkta olduğu batı ülkelerinde günün ilk saatlerine girildiğinde Bitcoin’in fiyatı 50.900 dolara kadar gerilemiş durumda. Ancak Kuzey ve Güney Amerika ülkeleri için günün yeni başladığını, yani çok sayıda yatırımcının da işlem yapacağını düşünürsek, piyasalarda biraz daha değişim görebileceğimizi söyleyebiliriz. \n" +
                            "\n" +
                            "30 dolarlık Bitcoin alma çağrısının bir nevi piyasalar için test olduğunu söylemek de mümkün. Bir ülkenin Bitcoin’i resmi olarak tanıma kararının milyonlarca yatırımcının gözünde ne anlam ifade ettiğini görmek amaçlanmış olabilir.\n" +
                            "\n" +
                            "Bu içerik yatırım tavsiyesi değildir.",
                    "https://www.webtekno.com/dunya-capinda-30-dolarlik-bitcoin-alin-cagrisi-baslatildi-h114559.html"
                )
            ),
            NewsFragmentModel(
                R.id.most_read_4, SmallNewsItemFragment(onClickItem), News(
                    "KRİPTO PARA",
                    "10 saat önce",
                    "Nasıl Ya: Yeni Açılan Bir NFT Platformunun Test Amaçlı Oluşturduğu NFT, 270 Bin Dolara Satıldı",
                    "Eray Kalelioğlu",
                    "https://cdn.webtekno.com/media/cache/showcase_small_v2/article/114551/nft-platformunun-test-amacli-olusturdugu-nft-270-bin-dolara-satildi-1631017919.jpg",
                    "FTX isimli borsanın CEO'sunun test aşamasında olan NFT pazarında oluşturduğu bir eser, tam 270 bin dolara satıldı. Herkesi şaşırtan asıl olay ise bu NFT'nin üzerinde yalnızca \"test\" yazıyor oluşuydu. FTX'in bunu reklam amacıyla yapmış olabileceği düşünülüyor.",
                    "Kripto para dünyasının son dönemlerdeki en popüler dallarından bir tanesi olan NFT, büyük bir olaya daha ev sahipliği yaptı. FTX isimli borsanın CEO'su Sam Bankman-Fried, henüz test aşamasında olan NFT pazarlarında yalnızca \"test\" yazan alelade bir içerik yükledi. Adından da anlaşılabileceği üzere test amacıyla yüklenen bu NFT, 270 bin dolara alıcı buldu.\n" +
                            "\n" +
                            "Sam Bankman-Fried, oluşturduğu NFT'de herkesin herkesin bir dijital sanat eseri oluşturabileceğini göstermek istemişti. Ancak bu içeriğin yüklenmesi üzerine bir kullanıcı, 1.100 dolarlık teklif verdi. Birkaç saat sonra başka bir kullanıcı, 270 bin dolarlık teklifle NFT'nin sahibi oldu. Konuyla ilgili yapılan açıklamalarda, \"Tarih yazıldı.\" ifadelerine yer verildi.",
                    "https://www.webtekno.com/images/editor/default/0003/25/b1e35023db66ef0f39911016e4a3e5dd303182b9.jpeg",
                    "FTX, son dönemlerde özellikle de ABD sınırlarında çok popüler olmaya başladı. Hatta bir yatırım turuna çıkan şirket, 900 bin dolarlık yatırım toplayarak kripto para tarihinde rekor kırdı. Bu yatırım turu, şirketin net değerlemesini ise 18 milyar dolara ulaştırdı. Hala da hemen her yerde boy gösteren ve reklam çalışmalarına devam eden borsanın, bu NFT satışıyla da reklam yapmaya çalışmış olabileceği düşünülüyor. Ancak bunu bilmenin tam olarak bir yolu bulunmuyor.",
                    null,
                    "Borsanın resmi Twitter hesabından yapılan açıklamalarda, \"Tarih yazılıyor. Sam Bankman-Fried’ın sadece 1 tane olan test NFT’si 270 bin dolara satıldı. Şimdi, fazladan nadir oldu gibi…\" ifadelerine yer verildi. Yapılan bu açıklama, olay reklam olsa da olmasa da şirketin yüzünü güldürmüş durumda. ",
                    "https://www.webtekno.com/nft-platformunun-test-amacli-olusturdugu-nft-270-bin-dolara-satildi-h114551.html"
                )
            ),
            NewsFragmentModel(
                R.id.most_read_5, BigNewsItemFragment(onClickItem), News(
                    "BİLİM",
                    "14 saat önce",
                    "Yaşayan Son Tazmanya Kaplanının Fotoğrafları Renklendirildi: Karşınızda Türünün Son Üyesi Olan Benjamin",
                    "Eray Kalelioğlu",
                    "https://cdn.webtekno.com/media/cache/showcase_small_v2/article/114552/yasamis-son-tazmanya-kaplani-benjamin-85-yil-sonra-renklendirildi-1631017433.jpg",
                    "Son üyesi 1936 yılında ölen tazmanya kaplanlarıyla ilgili yeni bir gelişme yaşandı. Avustralyalı yetkililer, yaşayan son tazmanya kaplanı olan Benjamin'in 1935 yılında çekilmiş olan görüntülerini renklendirmeyi başardılar. Servis edilen görüntüler, nesli tükenen hayvanın en net halini ortaya koyuyor.",
                    "Dünya tarihinde sayısız canlının nesli, değişen koşullar nedeniyle tükendi. Bu canlı türlerinden bir tanesi de tazmanya kaplanlarıydı. Yaklaşık 85 yıl öncesine kadar var olan, Avustralya ve Yeni Gine gibi bölgelerde bulunan tazmanya kaplanları, oldukça saldırgan bir yapıya sahiplerdi. Et ile beslenen ve keseli olan bu canlıların son örneği ise Benjamin'di.\n" +
                            "\n" +
                            "Benjamin, bundan yıllar önce Avustralya'daki Beaumaris Hayvanat Bahçesi'nde yaşıyordu. Bakımına büyük önem gösterilen hayvanın yıllar boyunca yaşaması için ellerinden geleni yapan yetkililer, nihai sondan kaçamadılar. Eldeki kayıtlara göre son tazmanya kaplanı olan Benjamin, 1936 yılında öldü. Ancak şimdi, nesli tükenen bu canlıyla ilgili yeni bir gelişme yaşandı.",
                    "https://www.webtekno.com/images/editor/default/0003/25/6640be918175c2ac870fdd96d972a4610e314b89.jpeg",
                    "Avustralya Ulusal Film ve Ses Arşivi, bundan bir süre önce 1935 yılında çekilmiş olan bir belgeseli ortaya çıkarmıştı. Bu belgesel, Benjamin'in kısa bir görüntüsünden ibaretti. Bu belgesel üzerinde detaylı bir çalışma yürüten yetkililer, görüntüleri renklendirmeyi başardılar. Avustralya devlet kurumu tarafından yapılan açıklamalarda, renklendirme çalışmalarına 200 saat harcandığı ifade edildi.",
                    "https://www.webtekno.com/images/editor/default/0003/25/05e04e9ce2fec7e58cb586280e5dd267aae664b3.jpeg",
                    "Tarih kayıtlarına göre Benjamin, 7 Eylül'de ölmüştü. Avustralya'da bu ölüme ithafen, 7 Eylül'ü \"Tehdit Altındaki Türler Günü\" olarak ilan etti. İşte renklendirilen görüntülerin bugün servis edilmesinin nedeni de tam olarak buydu. Hayvanın genel yapısına baktığımızda ise nispeten kurt gibi göründüğünü ancak postundaki çizgilerin onu özel kıldığını görüyoruz.\n" +
                            "\n" +
                            "Bu arada, 1935 yılında çekilmiş belgesel ile ilgili de bir detaydan bahsetmek gerekiyor. Söz konusu belgesel, David Fleay isimli bir doğa bilimci tarafından çekilmişti. Hayli zorlu bir süreçten geçen Fleay, yaşayan son tazmanya kaplanı Benjamin tarafından ısırılmıştı. Yaşanan zorluklar nedeniyle belgeselin toplam uzunluğu 80 saniyeden ibaretti.",
                    "https://www.webtekno.com/yasayan-son-tazmanya-kaplaninin-fotograflari-renklendirildi-h114552.html"
                )
            ),
            NewsFragmentModel(
                R.id.most_read_6, SmallNewsItemFragment(onClickItem), News(
                    "OTOMOBİL",
                    "15 saat önce",
                    "Görkemli Bir ‘Hidrojen’ Planı Açıklayan Hyundai, Dünyanın İlk Hidrojen Hibrit Spor Otomobilini Tanıttı",
                    "Eray Kalelioğlu",
                    "https://cdn.webtekno.com/media/cache/showcase_small_v2/article/114541/hyundai-dunyanin-ilk-hidrojen-hibrit-spor-arabasini-tanitti-1631011485.jpg",
                    "Hyundai, tamamen elektrikli hale gelmeye hazırlanan otomotiv sektörüne yeni bir bakış açısı geliştirdi. Bu bağlamda, hibrit motor sistemlerini hidrojenli hale getiren şirket, Vision FK isimli bir spor otomobili tanıttı. Şirket ayrıca, 2028 yılına kadar piyasaya süreceği tüm ticari araçlarda hidrojen seçeneği sunmaya hazırlanıyor.",
                    "Güney Koreli otomobil devi Hyundai, Hydrogen Wave etkinliği kapsamında otomobil sektörünün ilgisini çekecek bazı açıklamalarda bulundu. Şirket tarafından yapılan açıklamalarda, hidrojenle çalışan araçlara önem verildiği belirtildi. Hatta şirket, 2028 yılına geldiğimizde piyasaya sürdüğü tüm ticari araçlarına hidrojenle çalışan bir seçenek de ekleyecek. Ancak bu adım, yalnızca ticari araçlarla sınırlı kalmayacak gibi görünüyor.\n" +
                            "\n" +
                            "Hyundai, Rimac ile bir iş birliği yaptığını ve bu iş birliği kapsamında \"Vision FK\" isimli bir konsept otomobil ürettiğini açıkladı. Şirket tarafından yapılan açıklamalar, bu araçta hibrit motor bulunduğunu gözler önüne seriyor. Ancak bu hibrit motor, elektriği petrol değil, hidrojen ile birleştiriyor. Türünün tek örneği olarak karşımıza çıkan Vision FK, şirketin hidrojen yakıtı politikasının nasıl hayatımıza gireceğine ışık tutuyor.",
                    "https://www.webtekno.com/images/editor/default/0003/25/40bc89efd1e7c364c23b3774cebbf8b1e22971d8.jpeg",
                    "Hyundai tarafından yapılan açıklamalarda, 2030 yılına kadar tamamen elektrikli otomobillerle fiyat rekabeti sağlayacak hidrojen destekli hibrit modellere yatırım yapılacağı ifade ediliyor. Şirket bu sayede, otomotiv sektöründe yeni bir sayfa açacak gibi görünüyor. Üstelik hidrojen yakıtı, bataryalara kıyasla çok kısa sürede doldurulabildiği için (yaklaşık 5 dakika), tamamen elektrik motorlu araçlardan daha popüler olabilir gibi görünüyor.\n" +
                            "\n" +
                            "Vision FK'ya baktığımızda ise arkadan itişli bu spor araca güç veren motorun 670 beygir gücünde olduğunu görüyoruz. Elektrik gücünü sağlayan bataryalar ile hidrojen tankları tam dolu olduğunda 600 kilometre yol alabilen araç, 100 km/sa hıza ise 4 saniyenin altında ulaşıyor. Aracın sahip olduğu yüksek gücü kontrol altında tutabilmek için özel sistemler geliştirdiğinden bahseden Hyundai, viraja girildiği an veya araç sürüklenirse, otomatik tork yönetimi yapıyor. Araç bu sayede, yüksek hızda bile yüksek bir yol tutuşu sağlıyor.",
                    "https://www.webtekno.com/images/editor/default/0003/25/ab92d0ae0167c1991abf5c69bb462871469b08c5.jpeg",
                    "Hyundai ile Kia'nın üst düzey yöneticiliğini üstlenen Albert Biermann, Vision FK'yı \"aşırı\" olarak nitelendiriyor. Aracın tanıtımında bu ifadeyi birkaç kez kullanan Biermann, yine de Vision FK'nın harika bir otomobil olduğunu söylüyor. Peki Hyundai Vision FK, ne zaman yollara inecek? İşte bu sorunun cevabı yok. Henüz konsept aşamasında olan spor otomobilin ne zaman seri üretime geçeceği şimdilik bilinmiyor.",
                    "https://www.webtekno.com/hyundai-dunyanin-ilk-hidrojen-hibrit-spor-arabasini-tanitti-h114541.html",
                    divider = false
                )
            )
        )

    }
}