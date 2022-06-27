# LcWaikiki Test Case
## Lc Waikiki Proje Ödevine ait çalışma.

Cucumber/Java kullanılarak BDD yaklaşımıyla Lc Waikiki sitesinin uçtan uca test edilmesini içeren proje.
_______

## Projenin İsterleri:



- Bir yeni müşteri kaydı oluşturulacak.
- Login olduktan sonra;  Kategoriler ---Kadın---Giyim---bluz bölümüne girip,
- Filtreleme bölümünden renk seçeneği **siyah** seçilecek.
- Sonuçlar listele yapılıp ,gelen ürün sonuçlarından biri seçilip ,üstüne tıklanacak.
- Beden medium seçilecek, sepete ekle butonuna tıklanacak.
- Sepetim’e gidilecek ,ürünün adı ,adeti ,bedeni kontrol edilecek.
- Ödeme yap butonuna tıklayıp, ödeme ekranına gidildiği, doğru ekrana yönlendirildiği kontrol edilecek.

## Projenin Dosya Yapısı


Proje dosya yapısına ait ekran görüntüsü:

![projeDosyası](https://github.com/yasinTru/Lc-Waikiki-WebProject/blob/master/LcWaikikiProject-Web/src/main/resources/webSs/ProjectFolder.PNG)


### Projenin;
-----------



> src/main/java/Framework 

konumunda lod yapısına ait yardımcı sınıflar mevcut bulunmaktadır. Bu sınıflar driverı ayağa kaldırma, kod içinde yardımcı elementlerin tanımlanması, hookların tanımlanmasını içermektedir.

--------

>src/test/java

konumunda Feature dosyaları, Runner sınıfı, Projeye ait sayfalar ve bu sayfalara ait Step Definiton sınıfları bulunmakta. 

Runner sınıfının kod yapısı:

![Runner](https://github.com/yasinTru/Lc-Waikiki-WebProject/blob/master/LcWaikikiProject-Web/src/main/resources/webSs/TestRunner.PNG)

---------

>src/test/resources 

konumunda ise projenin koşmasını/çalışmasını sağlayan Test Suite dosyası ve projenin temel kuralllarını sağlayan config.properties bulunmakta.

ParallelRunner.xml ekran görüntüsü:

![suiteSs](https://github.com/yasinTru/Lc-Waikiki-WebProject/blob/master/LcWaikikiProject-Web/src/main/resources/webSs/RunInXml.PNG)

__Proje; Test Suites/ParallelRunner.xml dosyasının çalıştırılması ile test işlemlerine başlamaktadır.__





---------------

## Projede Kullanılan Teknolojiler:

- Java
- Selenium
- İntellij Idea
- Allure
- Cucumber

---------
## Test Raporları

Projede Allure kütüphanesi ve Cucumber reports yardımı ile raporlama işlemleri gerçekleştirildi.



Allure Report grafikleri:

![AllureGraphs](https://github.com/yasinTru/Lc-Waikiki-WebProject/blob/master/LcWaikikiProject-Web/src/main/resources/webSs/AllureGraphs.PNG)


Allure Overview: 

![AllureOverview](https://github.com/yasinTru/Lc-Waikiki-WebProject/blob/master/LcWaikikiProject-Web/src/main/resources/webSs/AllureOverview.PNG)

-------------

Cucumber End to end testinin Rapor çıktıları:

![cucumberEnd2end](https://github.com/yasinTru/Lc-Waikiki-WebProject/blob/master/LcWaikikiProject-Web/src/main/resources/webSs/endToEndCucumber.PNG)

Üye ol sayfasının raporlaması: 

![register](https://github.com/yasinTru/Lc-Waikiki-WebProject/blob/master/LcWaikikiProject-Web/src/main/resources/webSs/registerSs.PNG)
