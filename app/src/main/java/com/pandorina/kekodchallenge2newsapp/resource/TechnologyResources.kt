package com.pandorina.kekodchallenge2newsapp.resource

import com.pandorina.kekodchallenge2newsapp.fragment.BigNewsItemFragment
import com.pandorina.kekodchallenge2newsapp.fragment.SmallNewsItemFragment
import com.pandorina.kekodchallenge2newsapp.OnClickItem
import com.pandorina.kekodchallenge2newsapp.R
import com.pandorina.kekodchallenge2newsapp.model.News
import com.pandorina.kekodchallenge2newsapp.model.NewsFragmentModel

object TechnologyResources {
    fun getSportList(onClickItem: OnClickItem): List<NewsFragmentModel>{
        return listOf(
            NewsFragmentModel(
                R.id.technology_1, SmallNewsItemFragment(onClickItem), News(
                    "UZAY",
                    "5 saat önce",
                    "Kötü Haber: Beklenen Bir Güneş Fırtınası Aylar Boyunca Sürecek İnternet Kesintilerine Yol Açabilir\n",
                    "Tugay Paçalıoğlu",
                    "https://cdn.webtekno.com/media/cache/showcase_small_v2/article/114564/beklenen-gunes-firtinasi-internet-te-aylar-boyunca-surecek-kesintilere-yol-acabilir-1631035012.jpg",
                    "Kaliforniya Üniversitesi'nde görev yapan gökbilimci Abdu Joythi, yaklaşan bir Güneş fırtınasının Dünya genelinde uzun süreli internet kesintilerine sebep olabileceğini açıkladı. Joythi'ye göre, fırtınanın beraberinde getireceği elektrik kesintisi sona erse bile internet kesintileri aylarca sürebilecek.",
                    "Küresel ısınma, iklim değişikliği, yangınlar, seller ve koronavirüs pandemisi derken dünyanın sonunun geldiğine dair düşüncelere kapılmayanların sayısı azdır. Bu durumun en güncel örneği, Güneş'te gerçekleşecek bir fırtınanın Dünya'da haftalarca hatta aylarca sürebilecek internet kesintilerine sebep olabileceği gerçeği.",
                    "https://www.webtekno.com/images/editor/default/0003/25/3c8d59235f3966c7b7ba9553a8e0b8436a720293.jpeg",
                    "Kaliforniya Üniversitesi'nde görev yapan gökbilimci Abdu Joythi, SIGCOMM 2021 veri iletişimi konferansında konuşan Abdu Jyothi, 'Güneş'in Süper Fırtınaları: internet Kıyameti Senaryosu' adlı bir sunum yaptı. Joythi, sunumunda, yaklaştığı düşünülen şiddetli bir Güneş fırtınasının Dünya genelinde uzun süreli internet kesintilerine sebep olabileceğini açıkladı.",
                    null,
                    "Jyothi'nin araştırması, elektrik kesintisine neden olan bir Güneş fırtınası için ek bir nüansa işaret ediyor. Joythi, elektrik saatler veya günler içinde geri gelse bile internet hizmetinde toplu kesintilerin devam ettiği bir senaryoya dikkat çekti.\n" +
                            "\n" +
                            "Gökbilimci, \"Beni bu konuda cidden düşündüren şey, pandemide dünyanın krizlere karşı ne kadar hazırlıksız olduğunu görmemizdi.\" ifadelerini kullandı. Aylarca süreceğini tahmin ettiği bu kesintileri 'internet kıyameti' olarak tarif eden Joythi, \"Mevcut altyapımız büyük ölçekli bir Güneş fırtınasına hazır değil.\" dedi.",
                    "https://www.webtekno.com/gunes-firtinasi-internet-kesintilerine-yol-acabilir-h114564.html"
                )
            ),
            NewsFragmentModel(
                R.id.technology_2, BigNewsItemFragment(onClickItem), News(
                    "DONANIM",
                    "6 saat önce",
                    "Araştırmalara Göre Kullandığımız Çoğu Uygulama 5 Yıl İçinde 'Ücretli' Olacak: İşte Sonuçlar",
                    "Tansel Erdem",
                    "https://cdn.webtekno.com/media/cache/showcase_small_v2/article/114374/arastirmalara-gore-kullandigimiz-cogu-uygulama-5-yil-icinde-ucretli-olacak-iste-sonuclar-1630920640.jpg",
                    "Oyunlara para vermeye alışkın sayılırız, daha mobil cihazlar popülerleşmeden bunu zaten yapıyorduk. Ancak uygulamaları satın almak yahut onlara aylık abonelik bedeli ödemek çoğumuz için yeni bir alışkanlık. Ücretli uygulamaların önümüzdeki beş yılda çok daha büyük bir pazara sahip olacağı düşünülüyor. Bugün kullandığımız popüler ücretsiz uygulamalar da bu pastadan pay almak üzere...",
                    "Şöyle bir düşünün, ücretli aboneliğiniz olan uygulama sayısı kaç? Bundan beş yıl önce bu soruyu sorsak belki bir müzik servisine üyeydiniz ancak şimdi video servisleri, alışveriş platformları derken birçok hizmeti kiralar olduk.\n" +
                            "\n" +
                            "Oyunlara para vermeye alışkın sayılırız, mobil dünyadan önce de bunu yapıyorduk. Ancak uygulamaları satın almak yahut onlara aylık abonelikle kira ödemek bizim için yeni bir alışkanlık. Buna bir \"sistem\" diyecek olursak, bu sistemin değişeceğine dair de herhangi bir sinyal yok. Hatta ücretli uygulamaların önümüzdeki beş yılda çok daha büyük bir pazara sahip olacağı düşünülüyor.",
                    "https://www.webtekno.com/images/editor/default/0003/25/75d40442279d953f1859cb95656db5f6737dbdf1.png",
                    "Bu grafiği çıplak haliyle okuduğumuz zaman bize söylediği şeylerin sayısı sınırlı. Uygulamaların ve oyunların bir arada yükseldiği, pazarın 2025'te bugüne kıyasla neredeyse iki kat büyüyeceğini görüyoruz. Lacivert çubuklara yani uygulamalara odaklandığımızda ise yaşanan büyümenin oransal olarak çok daha fazla olduğu ortada. Apple App Store'da kullanıcıların harcama kalemleri arasında oyunların yeri uygulamalara kıyasla iki kat daha fazlayken 2021'de uygulamaların da adımlarını sıklaştırdığını görüyoruz.\n" +
                            "\n" +
                            "Salgın başından bu yana mobil uygulamalardan alışveriş yapmamız, görüntülü görüşmeleri hayatımızın ortasında kabul etmemiz bu yükselişte mutlaka etkili olmuştur. Salgından bağımsız düşündüğümüzde uygulamaların yükseliş sinyallerini bir süredir duymaktaydık, ancak çevremizdeki herkes bu değişime bizim kadar uyum sağladığından olsa gerek, \"mobil harcama devrimi\" hiç dikkatimizi çekmedi.",
                    "https://www.webtekno.com/images/editor/default/0003/25/5b4ac1cd987a2f1dd9d0b0da5413771c19deb614.jpeg",
                    "Tüketici açısından aşılması zor eşiklerden biri, uygulamalara düzenli olarak para verme fikri. Araştırma sonucunda ortaya çıkan beklentiler bizi uygulamalara para harcamaya mecbur bırakacak bir sistemin şimdiden doğduğunu anlatıyor, bu yüzden \"uygulamaya para vermem\" diyen kim varsa derin bir nefes alıp kredi kartı numarasını hazırlasın. Zira paranın harcanacağı kesin. Net olmayan şey, tüketiciler olarak uygulamalara harcayacağımız paralar abonelik sistemlerine mi bağlı olacak yoksa uygulama içi satın alımlarla her uygulamada ayrı bir özelliğe mi para ödeyeceğiz? Sizce daha az ödeme yaparak ihtiyaçlarımızı karşılamak adına hangisi daha mantıklı? Bakalım tahminleriniz tutacak mı, hep birlikte göreceğiz.",
                    "https://www.webtekno.com/cogu-uygulama-5-yil-icinde-ucretli-olacak-iste-sonuclar-h114374.html"
                )
            ),
            NewsFragmentModel(
                R.id.technology_3, SmallNewsItemFragment(onClickItem), News(
                    "MOBİL",
                    "7 saat önce",
                    "Daha Küçük Çentikli iPhone 13 Geliyor: Tasarımı, Özellikleri, Fiyatı ve Diğer Tüm Bilinenler\n",
                    "Okan Cnadoğan",
                    "https://cdn.webtekno.com/media/cache/showcase_small_v2/article/104507/iphone-13-fiyati-ozellikleri-1628939309.jpg",
                    "Apple'ın yeni nesil iPhone 13 ailesini tanıtmasına yalnızca birkaç hafta kaldı. iPhone 12 serisi ile birlikte ciddi satış rakamlarına ulaşan Apple’ın piyasaya sürmeye hazırlandığı iPhone 13 ne zaman tanıtılacak, özellikleri nasıl olacak, fiyat konusunda herhangi bir değişiklik olacak mı, Türkiye fiyatı ne olacak sorularını yanıtladık ve en güncel şekilde sizlere aktardık.",
                    "Apple, bir sonraki amiral gemisi akıllı telefonu iPhone 13 üzerinde yoğun bir şekilde çalışmaya devam ediyor. Bilindiği üzere, iPhone 12 serisi ile birlikte ciddi satış rakamlarına ulaşan şirket, bu başarısını iPhone 13 serisi üzerinde de sürdürmek istiyor. Özellikle tasarım konusunda oldukça yüksek beklenti oluşturan iPhone 13 serisi, en son iPhone 5s’de kullanılan keskin ve köşeli tasarıma geçiş yaparak kullanıcılardan tam not almayı başarmıştı.\n" +
                            "\n" +
                            "Yeni iPhone 13 lansmanına yalnızca birkaç hafta kalmışken telefonlara dair yeni bilgiler de gelmeye devam ediyor. iPhone 13, iPhone 13 Mini, iPhone 13 Pro, iPhone 13 Pro Max olarak piyasaya sürülmesi beklenen akıllı telefon serisi, ortaya çıkan raporlara göre özellikle ekran tarafında bazı yenilikler ile gelecek. Dilerseniz sözü daha fazla uzatmadan iddialardan yola çıkarak iPhone 13 serisinin tasarımına, teknik özelliklerine, lansman tarihine ve fiyatlara daha yakından göz atalım.",
                    "https://www.webtekno.com/images/editor/default/0003/21/cd41a152bd20b28db1c9a83973ae36b6848e1de7.jpeg",
                    "Şimdiye dek paylaşılan render görüntüleri ve sızıntılar, iPhone 13'lerin tasarım anlamında devrim niteliğinde değişiklikler sergilemeyeceğini gösteriyor. Bloomberg'e göre Apple mühendisleri, 2021 model iPhone'ları birer 'S' modeli olarak görüyor ve bu nedenle büyük tasarım değişiklikleri bu nesilde beklenmiyor. Apple, geçmiş nesil iPhone'larda daha küçük güncellemeler alan modellerini 'S' takısıyla piyasaya sürüyordu (Örneğin iPhone 5s, 6s)",
                    "https://www.webtekno.com/images/editor/default/0003/21/f67901c41e528db6dcd37d9d24d0f0c468e954e2.jpeg",
                    "Tasarım noktasında esas merak edilen sorulardan biri de çentik boyutu. Ünlü Apple analisti Ming-Chi Kuo da dahil olmak üzere birkaç güvenilir kaynak, 2021 model iPhone'larda çentik boyutunun küçüleceğini öne sürdü. Daha küçük çentik, iPhone 13'lere ait olduğu söylenen sızdırılmış ekran panellerinde de görülebiliyor. Görüntülere göre kulaklık hoparlörü de üst çerçeveye taşınmış durumda.",
                    "https://www.webtekno.com/iphone-13-fiyati-ozellikleri-h104507.html"
                )
            ),
            NewsFragmentModel(
                R.id.technology_4, SmallNewsItemFragment(onClickItem), News(
                    "YAŞAM",
                    "8 saat önce",
                    "Diyarbakır'da 50 TL'lik Kömür Torbasından 360 Bin Dolarlık Göktaşı Çıktı",
                    "Eray Kalelioğlu",
                    "https://cdn.webtekno.com/media/cache/showcase_small_v2/article/114509/50-tl-ye-1-torba-komur-alan-adam-360-bin-dolarlik-gok-tasinin-sahibi-oldu-1630937101.jpg",
                    "Diyarbakır'da yaşamını sürdüren Yakup Ermiş isimli bir vatandaş, 'göktaşı zengini' oldu. Kışın kullanmak üzere kömür alan vatandaş, torbalardan bir tanesinin içindeki taşın göktaşı olduğunu fark etti. 8 kilogramlık gök taşının yüzde 80'inin demir olduğu anlaşıldı.",
                    "Bugüne kadar sizlerle paylaştığımız bazı içeriklerimizde, evlerin bahçesine düşen ya da boş bir arazide bulunan göktaşlarının insanları nasıl zengin ettiğine dair bilgiler vermiştik. Yine böyle bir olay gerçekleşti. Bu kez Diyarbakır'ın Çınar ilçesinde yaşamını sürdüren Yakup Ermiş isimli bir vatandaş, kışın yakmak için satın aldığı kömürün içerisinde devasa büyüklükte bir göktaşı olduğunu fark etti.\n" +
                            "\n" +
                            "Yakup Ermiş, kışın kullanmak üzere Rusya menşeli bir şirketten kömür satın aldı. Torbalardan bir tanesinin içerisinde hem çok büyük hem de çok ağır olan bir taş ile karşılaşan vatandaş, önce bu olay nedeniyle şirketten şikayetçi oldu. Daha sonra konuyu bir arkadaşına açan ve bu arkadaşının şüphesi üzerine taşın bir bölümünü test için gönderen vatandaş, hayatının şokunu yaşadı. Kömür alıp göktaşı sahibi olan vatandaş, 8 kilogramlık göktaşının 1 milyon yıllık olduğunu iddia ediyor.",
                    "https://www.webtekno.com/images/editor/default/0003/25/7b0517401085888f2cc27ffb19851805a88ef996.jpeg",
                    "Ermiş, göktaşını nasıl tespit ettiğini şöyle anlattı; \"Altın ile test yaptık, sürtme sonucu elektriklenme oldu. Sonrasında televizyona yaklaştırdık renk değiştirdiğini gördük. Mıknatısı da yaklaştırdığımızda kendisini rahatlıkla tutmakta. Göktaşının 1 milyon yıllık olduğu söyleniyor. Biz bunu satacağız, faydalanalım. Yapmış olduğumuz araştırmalara göre gramı 45 dolara kadar değiştiği söylenmekte. Biz burada açgözlülük yapma peşine düşmeyeceğiz. Fazlada fiyatını düşürmeyeceğiz. Maksat biz ve çevremiz faydalansın. Numunelerde gram olarak eksildi, şu anda ham olarak net 8 kilogram. Ele alındığında kendi boyutundan daha ağır olduğunu hissedebiliyorsunuz. Kömürü aldığımda torbası 50 TL idi. İşin ilginç tarafı şaşırmakla beraber tepki gösterdim, bizi kandırdılar dedik firmayı aramak aklıma geldi, araştırma sonucu göktaşı olduğunu görünce öfkemiz yerini sevince bıraktı.\"",
                    "https://www.webtekno.com/images/editor/default/0003/25/2e29b85640f6735953a7be1361e88ec2db00a19f.jpeg",
                    "Konuyla ilgili açıklamalarda bulunan Yakup Ermiş, şu açıklamalarda bulundu: \"Kış hazırlığı yapmak için kömür siparişi verdik. Yaklaşık 6 ay önce gelen kömür siparişinden torbaları açarken bu taşın farklı olduğunu hissetim. Arkadaşlara sordurdum, normal bir taş olmadığını ve kömür de olmadığını söyledi. Daha sonra bizde kendimize göre araştırmalarımıza başladık. Kömür ticareti yapanlar Rusya’dan geldiğini söyledi. Numunesini alıp bilen insanlarla önce Ankara’ya daha sonra farklı şehirlere 8’şer gram olarak gönderdim. Laboratuvar sonuçlarında yüzde 81 oranında demir çıktı.\"",
                    "https://www.webtekno.com/diyarbakir-50-tl-komur-torbasindan-360-bin-dolarlik-goktasi-cikti-h114509.html"
                )
            ),
            NewsFragmentModel(
                R.id.technology_5, BigNewsItemFragment(onClickItem), News(
                    "OTOMOBİL",
                    "9 saat önce",
                    "Formula 1'de Çarşı Pazar Karıştı: Üvey Evlat Valtteri Bottas, Mercedes’e Veda Etti (Yerine Geçecek İsim Belli Oldu)",
                    "Çağla Tanrıverdi",
                    "https://cdn.webtekno.com/media/cache/showcase_small_v2/article/114507/valtteri-bottas-mercedesten-ayriliyor-1630934985.jpg",
                    "2017 yılından beri Mercedes koltuğunda mücadele veren F1 pilotu Valtteri Bottas, 2022 sezonu itibarıyla kariyerine Alfa Romeo ile devam edeceğini açıkladı.",
                    "Yaklaşık 5 yıldır F1 Mercedes koltuğunda mücadele veren Valtteri Bottas'ın önümüzdeki sezonda yine aynı takımla devam edip etmeyeceği merak konusu olmuştu. Ortaya atılan iddiaların arasında Hamilton'ın şampiyon olması durumunda F1'i bırakıp koltuğu George Russell'a devretmesi, aksi takdirde de Bottas'ın gitmesi bulunuyordu.\n" +
                            "\n" +
                            "Geçtiğimiz hafta sonu gerçekleşen Hollanda GP'sinde takımının sözünü dinlemeyip en hızlı tur denemesine giden Bottas'ın bu hareketi, artık Mercedes ile bir işinin kalmadığının en büyük kanıtlarından biri olmuştu ancak bugün yapılan açıklamalar, tüm bu olaylara bir netlik kazandırdı.",
                    "https://www.webtekno.com/images/editor/default/0003/25/465ad1b7855b183736725d9b215ef9507b896353.jpeg",
                    "Fin pilot, Instagram'dan paylaştığı bir gönderiyle birlikte Mercedes'e veda ettiğini duyurdu ve gelecek sezonlarda Mercedes'e başarılar dilerken, bugüne kadar unutamayacağı başarılı işlerin altına birlikte imza attıklarını belirtti. Aynı zamanda Mercedes'in takım patronu Toto Wolf, Valtteri ile yolları ayırmanın hiç de kolay bir karar olmadığını dile getirdi.",
                    null,
                    "Bottas'ın yerine geçecek ismin pek de sürpriz olmadığını söyleyebiliriz. Şu anda Williams takımı için yarışan Birleşik Krallık 1998 doğumlu George Russell, Bottas'ın koltuğunu devralacak. Yapılan açıklamalara göre Russell, Hollanda GP'sinin bitmesinin ardından Toto Wolf ile görüşerek ne kadarlık olduğu henüz açıklanmayan bir kontrat imzaladı.",
                    "https://www.webtekno.com/uvey-evlat-valtteri-bottas-mercedes-veda-etti-h114507.html"
                )
            ),
            NewsFragmentModel(
                R.id.technology_6, SmallNewsItemFragment(onClickItem), News(
                    "YAŞAM",
                    "15 saat önce",
                    "Türkiye’de Sıklıkla Görülen Asya Kaplan Sivrisineğinin Isırığında 3 Ölümcül Hastalık Olduğu Açıklandı",
                    "Eray Kalelioğlu",
                    "https://cdn.webtekno.com/media/cache/showcase_small_v2/article/114498/biri-bitmeden-digeri-basliyor-asya-kaplan-sivrisinegi-isiriginda-3-olumcul-hastalik-oldugu-aciklandi-1630924912.jpg",
                    "Medipol Mega Üniversite Hastanesi Organ Nakli Bölümünden Prof. Dr. Onur Yaprak, Türkiye'de sıklıkla görülen asya kaplan sivrisineği hakkında önemli uyarılarda bulundu. Bilim insanı, bu sivrisinek türünde 3 ölümcül hastalık bulunduğunu belirtiyor.",
                    "Yav mevsiminde hemen herkesin başına bela olan sivrisineklerle ilgili korkutucu bir açıklama yapıldı. Medipol Mega Üniversite Hastanesi Organ Nakli Bölümünden Prof. Dr. Onur Yaprak, Türkiye'de de yaygın olarak görülen asya kaplan sivrisineğinin ölümcül hastalıklara yol açabileceği konusunda uyardı. Vatandaşların, yaz mevsiminin son günlerinde daha dikkatli olmaları gerekiyor.\n" +
                            "\n" +
                            "Onur Yaprak tarafından yapılan açıklamalara göre Türkiye'de 7 cinse ait 62'den fazla sivrisinek türü bulunuyor. Bu sivrisinek türlerinden olan asya kaplan sivrisineği (Aedes albopictus) ile sarıhumma sivrisineği (Aedes aegypti), sıtma, dang, batı nil virüsü, chikungunya, sarıhumma ve zika gibi hastalıklara yol açabiliyor. Bunlardan dang, batı nil virüsü ve sarıhumma, insanların hayatlarından olmasına neden oluyor.",
                    "https://www.webtekno.com/images/editor/default/0003/25/c31910f5cb303a84172225b84a3959166015b865.jpeg",
                    "Medipol Mega Üniversite Hastanesi Organ Nakli Bölümünden Prof. Dr. Onur Yaprak tarafından yapılan açıklamalarda şu ifadelere yer verildi; \"Batı nil virüsü özellikle göçmen kuşların göç yolları üzerinde bulunan ülkelerde sık görülüyor. Hastalık mevsimsel özellik gösterdiğinden çoğunlukla yaz boyunca ve sonbaharın ilk dönemlerinde ortaya çıkıyor. Ülkemizin de bu kuşakta yer alması, üstelik havaların hala mevsim normallerinin üzerinde sıcak seyretmesi nedeniyle sivrisineklerin de hastalık bulaştırma riski sürüyor. Yapılan çalışmalar Batı Nil virüsü ile enfekte olan kişilerin yaklaşık yüzde 80’inin hafif ateşle seyrederek iyileştiğini gösteriyor. Virüsü almış yaklaşık her 5 kişiden 1’inde ateşle beraber ishal, kusma, eklem ağrıları, baş ağrısı, vücut ağrıları veya döküntü gibi diğer belirtiler gelişebilir. Çoğu kişi bu tip Batı Nil ateşi hastalığından tamamen kurtulur ancak yorgunluk ve halsizlik haftalar veya aylarca devam edebilir. Az sayıda kişide şiddetli belirtiler olabilir. Virüs bulaşmış kişilerin yüzde 1’inden azında ensefalit (beyin iltihabı) veya menenjit (beyin ve omurilik zarı iltihabı) gibi ciddi bir nörolojik hastalık gelişir ve nörolojik tablo meydana gelen hastaların yüzde 10’u hayatını kaybeder. Hatta bazı bilim adamları Büyük İskender’in de bu hastalık yüzünden öldüğünü iddia ediyor.",
                    "https://www.webtekno.com/images/editor/default/0003/25/1acf35a09c757cb78d3e28e21e660b97e9af959d.jpeg",
                    "Sarıhummanın ise karaciğer ve beyin için tehlikeli olduğunu ifade eden Onur Yaprak, sözlerine şöyle devam etti; \"Sarıhummayı taşıyan Aedes aegypti türü sivrisineklerdir. Virüs karaciğer, böbrek ve dalak gibi iç organları etkiliyor. Karaciğerde hepatite neden olarak kişide sarılık, pıhtılaşma faktörlerinde üretim eksikliği, damar içi pıhtılaşma, kanama gibi sorunlara yol açar ve nihayetinde şok tablosu gelişir. Virüse yönelik bir aşı olup endemik Afrika bölgelerine seyahatler sırasında aşı kullanılıyor. Hastalığın 3 evresi var. Birinci evrede ateş, bulantı, kusma, kas ağrıları görülür. Birkaç gün süren ve diğer enfeksiyonlardan ayırt edilemeyen tablonun ardından şikayetlerin azaldığı ikinci dönem başlar. Ancak hastaların yüzde 15’i ilk 3-6 gün sonra kan zehirlenmesi olarak bilinen, karaciğer iltihabının sarılığın ve böbrek yetmezliğinin başladığı üçüncü döneme girer. Bu dönemde hastalarda aynı koronavirüste olduğu gibi aşırı sitokin fırtınası ile beraber yaygın damar içi pıhtılaşma sorunu gelişir, cilt, burun ve bağırsaklarından kanama başlar. Neticede hasta şok ve komaya, kalp, akciğer ve beynin etkilendiği çoklu organ yetmezliğine girer. Dünya çapında her yıl yaklaşık 30 bin kişi sarıhummadan hayatını kaybediyor.\"",
                    "https://www.webtekno.com/asya-kaplan-sivrisineginin-isiriginda-3-olumcul-hastalik-oldugu-aciklandi-h114498.html",
                    divider = false
                )
            )
        )
    }
}