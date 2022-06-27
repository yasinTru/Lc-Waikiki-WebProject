@UserEndToEnd
  Feature: User does everything in this case


    @EndToEndTest
    Scenario Outline: User logins website and clicks login button
      Given User opens Lc Waikiki web page
      When  User clicks Giris Yap avatar button
      And   User enters "<loginEmail>" email
      And   User enters "<loginPassword>" password
      And   User clicks Giris Yap button
      Then  User should see marketplace landing
      When  User hovers mouse over Kadin products category
      When  User clicks Bluz product
      Then  User should see "<quickFilter>" Hizli Filtre text visible
      Then  User should see product list visible
      When  User clicks Renk Ara search input
      And   User writes "<colorBlack>" color to search input
      And   User clicks filtered color
      Then  User should see "<colorInContainer>" filtered color in container
      When  User clicks 2th item of listed products
      When  User clicks medium size of product
      When  User clicks Sepete Ekle button
      When  User clicks Sepetim button
      Then  User should see product image
      Then  User should see product title
      Then  User should see "<mediumSizeTxt>" product size
      Then  User should see product color
      Then  User should see product quantity
      When  User clicks Odeme Adimina Gec button
      Then  User should see "<deliveryMethod>" Teslimat yontemi text
      Then  User should see Siparis Ozeti container

      Examples:
        |loginEmail|loginPassword|quickFilter|colorInContainer|colorBlack|mediumSizeTxt|deliveryMethod|
        |ikincimail61@gmail.com   |yd998snn13            |Hızlı Filtre |Siyah|siyah|M|1. Teslimat yönteminizi seçiniz.|

