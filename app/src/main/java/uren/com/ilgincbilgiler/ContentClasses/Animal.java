package uren.com.ilgincbilgiler.ContentClasses;

public class Animal {

    String[] ANIMAL_INFO = new String[]{
            "Bir yılan 3 yıl uyuyabilir.",
            "Ördeğin sesi yankı yapmaz.",
            "Denizyıldızlarının beyni yoktur.",
            "Karınca iki hafta su altında yaşayabilir.",
            "Baykuş mavi rengi görebilen tek kuştur.",
            "Bir devekuşunun gözü beyninden büyüktür.",
            "Bir hamamböceği kafası koptuktan sonra açlıktan ölmeden dokuz gün yaşayabiliyor.",
            "Bir karınca kendi ağırlığının elli kati ağırlığı kaldırabilir.",
            "Bir karıncanın koku alma yeteneği en az bir kopeğinki kadar gelişmiştir.",
            "Bir timsahın gözlerinin arasındaki mesafe, ayaklarının büyüklüğüne eşittir.",
            "Atların insanlardan 18 tane fazla kemiği vardır.",
            "Ayı inlerinin girişleri her zaman kuzeye bakar.",
            "Bukalemunların dilleri, vücutlarından iki kat daha uzundur.",
            "Dalmaçyalılar gut olmayan tek köpek cinsidir.",
            "Dünyada insan başına düşen karınca sayısı bir milyondur.",
            "Fareler kusamaz.",
            "Filler zıplayamayan tek memelidir.",
            "Köpek balıkları 94 litre su içerisindeki bir damla kanı fark edebilirler ve 5 km uzaktan bir kan damlasını hissedebilirler.",
            "Mavi balinaların dillerinin ağırlığı yetişkin bir filin ağırlığı kadardır.",
            "Kara sinekler \"Fa\" notasıyla vızıldarlar.",
            "Pireler kendilerinin 100 katı kadar yükseğe zıplayabilirler.",
            "Kunduzların dişlerinin uzaması hiçbir zaman durmaz. Dişlerinin uzunluklarını dengede tutmak için ağaçların dallarında ve gövdelerinde onları törpülerler.",
            "İstiridyeler yaşamları boyunca birçok kez kendi cinsiyetlerini değiştirirler.",
            "Corixidae böceği penisini karnına sürterek 105 desibel ses çıkartabilir.",
            "Alouatta maymunu karada yaşayan hayvanların en gürültücüsüdür. Attığı çığlık 5 km uzaktan duyulabilir.",
            "Mavi balinalar 805 km uzaktan algılanabilen alçak frekansta ses dalgaları üreten en gürültücü memelidir",
            "Alpheidae karidesi yaşayan canlılar arasındaki en gürültücü hayvandır. Diğerinden daha büyük olan kıskacını kullanarak suyu 100 km hızla itebilir ve bu 200 desibel ses meydana getirir. Bu şiddette birlikte kurbanını şaşkına çevirir ve öldürür",
            "Çitalar 0'da 96 km hıza 3 saniyede erişir.",
            "Erkek imparator pengueni birşey yemeden kuluçkada 2 ay boyunca dişisinin yemek getirmesini bekler. Bu 2 ay boyunca dişi penguen her avlanma için 80 km yol kat eder ve başarabilirse bu süre sonunda ağzına kadar dolu mide ile yeni doğan yavrusuna döner",
            "Deniz atları tek eşli canlılardır. Hayatları boyunca sadece tek bir eşleri olur. Ayrıca deniz atları yeryüzünde erkekleri doğum yapa tek canlılardır.",
            "Kutup ayılarının güneş ışınlarını daha iyi emsin diye beyaz tüylerinin altında siyah derileri vardır.",
            "\"Jaguar\" kelimesinin yerli Amerikan dilindeki anlamı \"bir sıçramada öldürür\"dür.",
            "Su aygırları güneş kremi ve nemlendirici olarak kendi ciltlerinden kırmızı yağlı bir madde salgılarlar.",
            "Bütün palyaço balıkları erkek olarak doğar ve sonradan sadece baskın dişi olmak için cinsiyet değiştirirler.",
            "Dünyanın en zehirli denizanası olan Physalia physalis 4 ayrı organizmadan meydana gelmektedir.",
            "5 cm'lik zehirli ok kurbağası 10 yetişkin adamı öldürebilecek zehre sahiptir.",
            "Elektrikli yılan balığı 600 volta kadar elektrik verebilir ve bu bir atı nallarını havaya dikmesi için yeterlidir.",
            "Boz ayılar 48 km hızla koşabilirler.",
            "En uzun yaşayan Galapagos kaplumbağası 152. yaşına girmiştir.",
            "Galapagos kaplumbağaları günde 16 saat uyur ve bir şey yiyip içmeden 1 yıl dayanabilirler.",
            "Çöl çekirge sürüleri 1.200 km kare alan genişliğinde olabilir ve günde 191 milyon kg bitki tüketirler.",
            "\"Denizin çöp sepeti\" olarak adlandırılan kaplan köpek balığının midesinde eski araba plaka ve lastikleri bulunmuştur.",
            "Uçak yılanlar havada 100 metre mesafe katedebilirler ve havadayken dönüş yapabilirler.",
            "Akrepler inanılmaz derecede dayanıklı hayvanlardır. Bilim insanlarının bulduğu donmuş akrep buzu çözüldükten sonra yürümeye başlamış.",
            "Hamilelik süresi en uzun olan memeli 2 yıl ile Afrika filidir.",
            "Yetişkin bir panda günün 12 saatini yemek yemeye harcar ve bu süre boyunca 12 kg bambu yer.",
            "En büyük dev mürekkep balığı 18 metre uzunluğundadır ve gözleri deniz topu büyüklüğündedir.",
            "Hemen hemen bütün puffer balıkları insanlara göre siyanürden 1200 kat daha ölümcül olan tetradoksin denilen bir toksin içerir. Buna rağmen fugu denilen pufferbalıkları Japonya'da yenilmektedir.",
            "Karıncayiyenler günde 35 bin karınca yerler.",
            "Kar leoparları bir seferde 15 metre ileriye zıplayabilirler.",
            "Vampir yarasalar sadece kan ile beslenirler ve 100 yarasalık bir koloni yılda 25 ineğin kanını içer.",
            "Komodo ejderlerinin salyalarında 50'den fazla bakteri türü yaşar. Ejderin ısırdığı hayvanlar 24 saat içinde kan zehirlenmesinden ölürler, tabii daha önceden yenmezlerse.",
            "Dev istiridyeler sığ kayalıklar üzerinde bir yer bulurlar ve bir daha oradan kıpırdamazlar.",
            "Üç tırnaklı tembel hayvanlar güde 20 saat uyurlar ve sırtlarında yosunlar büyür.",
            "Kurtlar günde 9 kg et yerler.",
            "Keçi ve koyunların neredeyse 360 derecelik çevrelerini görebilmelerini sağlayan dikdörtgen şeklinde gözbebekleri vardır.",
            "Devekuşları koşarken bir adımda 5 metre ilerlerler ve 69 km hıza ulaşabilirler.",
            "Spring peeper kurbağaları kış uykusunda vücudunun çoğunun donmasına izin verirler buna rağmen sonradan hayatta kalabilirler.",
            "Deri değiştiren tarantulalar mide zarı, dişi genitallerini, hatta kayıp uzuvlarını bile değiştirebilirler.",
            "Tarantulalar sindirim enzimleri salgılayarak avlarını sıvılaştırırlar ve bu şekilde onları içerler.",
            "Çiftleşme sonrası erkek tarantula dişiden olabildiğince uzağa kaçar, çünkü dişi onu yiyecektir.",
            "Filler suyun kokusunu kilometrelerce uzaktan alabilirler.",
            "Deniz hıyarları savunma mekanizması olarak iç organlarının birazını anüsünden dışarı çıkartır.",
            "Kral kobra bir fili öldürebilecek zehre sahiptir. Ayrıca kral kobra 5.4 metre ile en uzun zehirli yılandır ve kendisini 1.8 metre yukarıya kaldırabilir.",
            "Narvalların 2 tane dişi vardır. Erkeklerde bu dişlerden birisi 2.7 metre fildişi gibi uzayabilir.",
            "Bukalemunlar çevrelerine uyum sağlamak için renk değiştirmezler, bunu duygularını ve belirli tepkileri göstermek için yaparlar.",
            "Hiçbir kaplanın çizgileri birbirine benzemez.",
            "Morsların hayatları boyunca uzayan 1 metrelik uzun dişleri aslında köpek dişleridir.",
            "Coelacanth'lar 1935'te tekrar keşfedilene kadar 65 milyon yıl önce dinozorlarla birlikte soyu tükendiği düşünülüyordu.",
            "Kar baykuşu yılda 1600 sıçan yer, bu günde 3-5 tane yapar.",
            "Anakondalar çiftleşeceği zaman, bir kaç rakip erkek dişinin etrafında top halini alır ve 1 ay süren bir yarışma yaparlar.",
            "Kraliçe arı öldüğü zaman, işçi arılar bir dişi arıyı onu daha verimli hale getirecek olan \"arı sütü\" ile besleyerek yeni bir kraliçe meydana getirirler.",
            "Tek hörgüçlü develer nadiren terlerler ve 15 dakikadan daha az bir sürede 113 litre su içerler.",
            "Su samurları uyurken birbirlerinden ayrı düşmemek için el ele tutuşurlar.",
            "Sincaplar toprağın altına sakladıkları meşe palamutlarını nereye koyduklarını unuttukları için her yıl binlerce ağacın yetişmesine vesile olurlar.",
            "Kaplumbağalar makatlarından nefes alabilirler.",
            "Çin'de bir pandayı öldürmenin cezası ölümdür.",
            "İsveç'te \"Kaninhoppning\" olarak adlandırılan tavşan zıplatma müsabakaları vardır.",
            "Domuzların orgazmı 30 dakika kadar sürer.",
            "Müziğin etkilerini araştıran bir çalışmaya göre, inekler sakinleştirici müzik dinlediklerinde daha fazla süt üretiyorlar. En fazla üretimi ise R.E.M grubunun “Everybody Hurts\" şarkısını dinlerken yapıyorlar.",
            "İstiridyeler çiftleşme için hangi cinsiyet daha uygunsa cinsiyetlerini ona göre değiştirebilirler.",
            "Civcivler yumurtadan çıkmadan önce birbirleriyle ve anneleriyle bir ses sistemi kullanarak iletişim kurabilirler.",
            "Köpeklerin burun izleri, insanların parmak izleri gibi eşsizdir ve birbirlerinin kimliklerini bu şekilde tespit ederler.",
            "\"Turritopsis nutricula\" denizanaları dünya üzerinde ölümsüz olduğu bilinen tek canlıdır.",
            "Kuş gözlemcisi ve doğa yazarı Candace Savage, kargaların birbirlerine şakalar yapabilecek kadar zeki hayvanlar olduklarını gözlemlemiştir.",
            "Kelebeklerin tat alma duyuları ayaklarındadır.",
            "Keçilerin de insanlar gibi aksanları vardır.",
            "Sincaplar, diğer sincapların terk ettikleri bebekleri sahiplenirler.",
            "Neotrogla cinsinden olan dişi haşerelerin penisi bulunuyor ve 70 saate kadar seks yapabiliyorlar.",
            "Yılanların iki tane penisi var çünkü üreme organları, kol ve bacaklarının olması gereken noktada oluşuyor.",
            "Karıncalar uyumaz.",
            "Yunuslar gözleri açık uyurlar.",
            "Aslanlar bir günde 50 kez sevişebilirler.",
            "Atlar bir ay kadar ayakta kalabilirler.",
            "Hayvanlar aleminde sadece domuzlar güneşten yanabilir.",
            "Hamamböcekleri yaklaşık olarak 250 milyon yıldır dünyada yaşıyorlar.",
            "Timsahlar renk körüdür.",
            "Erkek Peygamber Devesi dişinin kokusunu 7 mil öteden duyabilir.",
            "Yarım kilo bal yapabilmek için arılar iki milyondan fazla çiçekten bitki özü toplamak zorundadırlar.",
            "Sümüklüböceklerin dört tane burnu vardır.",
            "Bir inek hayatı boyunca yaklaşık 200.000 bardak süt üretir.",
            "Tarantulalar iki buçuk yıl yiyeceksiz yaşayabilirler.",
            "Sadece dişi sivrisinekler ısırır.",
            "Kediler 100 değişik ses, köpekler ise 10 ses çıkartabilirler.",
            "Yalnızca tavşanlar ve papağanlar, kafalarını çevirmeden arkalarını görebilirler.",
            "İpek böcekleri, 56 günde kendi ağırlıklarının 86.000 katı kadar beslenirler.",
            "Yusufçukların ömürleri yaklaşık 24 saattir.",
            "Yarasalar, bir mağaradan çıktıklarında her zaman sola dönerler.",
            "Sivrisineklerin dişleri vardır.",
            "Yalnızca insanların değil, koalaların da özgün parmak izleri vardır."
    };

    public Animal() {

    }

    public String[] getANIMAL_INFO() {
        return ANIMAL_INFO;
    }
}