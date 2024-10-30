```json
{
  "title": "Parçacık Hızlandırıcı",
  "icon": "oritech:accelerator_ring",
  "category": "oritech:interaction",
  "associated_items": [
    "oritech:accelerator_ring",
    "oritech:accelerator_motor",
    "oritech:accelerator_controller",
    "oritech:accelerator_sensor",
    "oritech:black_hole_block"
  ],
  "ordinal": 6
}
```

<block;oritech:accelerator_ring>

Parçacık hızlandırıcı, tahmin ettiğiniz gibi, parçacıkları hızlandırmak için kullanılabilir. Parçacık, parçacık hızlandırıcı bloğundan başlar. İçine, parçacık olarak kullanılacak
herhangi bir eşya

;;;;;

ekleyebilirsiniz. Düz bir kılavuz halkanın kontrol ünitesinin hemen arkasına, yana bakacak şekilde yerleştirilmesi gerekir. Görseller eşleşmeli.


Parçacık yerleştirildikten sonra kılavuz halkalarla tanımlanan bir rota boyunca ilerleyecektir. Bir tarafa 45 derecelik bir dönüş eklemek için sağ tıklanabilirler. Başka bir kılavuz halkanın, kılavuz
halkalar tarafından tanımlanan parçacık yolunda olması gerekir.

;;;;;

Hıza bağlı olarak, kılavuz bloklar arasında izin verilen mesafe artar.


Maksimum mesafe aşağıdaki formül ile hesaplanır:

> clamp(sqrt(speed), 2, 10)

Bu temel olarak, daha yüksek hızda kılavuz bloklar arasındaki mesafenin daha büyük olabileceği anlamına gelir.

;;;;;

**Redstone Şalterleri**

Düz olmayan bir kılavuz bloğa redstone sinyali verildiğinde, bu blok bir 
şalter bloğuna dönüşecektir.
Açıldığında, parçacıkları düz bir şekilde yönlendirir ve kapatıldığında orijinal kavisli yöne yönlendirir. Bununla birlikte, bir parçacık ayrıca 'diğer' yönden girer. 
Bu, daha küçük kırmızı cam tüp ile görselleştirilir. Beyaz tüpün yolunu takip edecek ve hem kırmızı hem de beyaz tüpten girebilecektir.

;;;;;

Daha yüksek hızlarda, parçacık artık çok dar dönüşler yapamayacaktır. Son tam 90 derecelik dönüş çok yakınsa, kılavuzlu yoldan çıkacak ve bunun
yerine dünyaya fırlayacaktır. Kılavuz bloklar arasındaki mesafe çok büyükse veya bir sonraki kılavuz bulunamazsa, dünyaya da fırlayacaktır.
Dönüşler arasındaki minimum mesafe şu şekilde hesaplanır:

> sqrt(speed) / 3

;;;;;

**Etkileşimler**

Parçacığın çarptığı varlıklar, parçacığın mevcut hızına bağlı olarak hasar alacaktır. Kılavuzlu yoldan çıkarken, yolundaki varlıklara da zarar verecek ve
daha fazla momentum kalmayana kadar blokları yok edecektir. İki parçacık çarpıştığında (farklı denetleyicilerden), yeni eşyalar oluşturabilirler.


Bir hızlandırıcı motordan geçerken, parçacık 1 m/s hızlanacaktır. Bunun için motora güç verilmesi gerekir.

;;;;;

Güç gereksinimi hız ile birlikte artar.


Hem parçacık motorları hem de algılayıcılar düz kılavuz olarak kullanılabilir.

;;;;;

**Hız Algılayıcıları**

Parçacıkların hızı bir parçacık algılayıcısı ile ölçülebilir. Daha sonra parçacıkların hızına bağlı olarak bir redstone sinyali elde etmek için bir karşılaştırıcı kullanılabilir.
Aşağıdaki tabloda her bir redstone seviyesi için gerekli hız gösterilmektedir:


1. 0
2. 10
3. 50
4. 75

;;;;;

5. 100
6. 150
7. 250
8. 500
9. 750
10. 1000
11. 2500
12. 5000
13. 7500
14. 10000
15. 15000

;;;;;

**Hızlandırıcı Tasarımı**

Parçacık hızlandırıcıları, hedeflerine bağlı olarak çeşitli şekillerde inşa edilebilir. Parçacıkları bir şeye fırlatmak için düz bir motor hattı oluşturabilirsiniz. Ancak,
daha yüksek hızlara ulaşmak istiyorsanız, dairesel bir tasarım genellikle çok daha verimlidir. Belirli unsurlara ulaşmaya çalışırken, çok büyük halkalara ihtiyaç duyulabilir. Yavaş
parçacıklar kılavuz halkaların birbirine yakın

;;;;;

olmasını gerektirdiğinden, parçacığı önce küçük bir halkada başlatmak ve daha sonra onu daha büyük bir halkaya almak için redstone kullanmak genellikle mantıklıdır.

Bazı durumlar için birden fazla halka aşaması gerekebilir.

;;;;;

**Boyutsal Saldırılar**

Bazı elementler çok fazla enerjiyle çarpıştığında, uzay-zamanda bir delik açarak küçük bir boyutsal saldırı oluşturursunuz. Bunu başarmak için gereken enerji miktarı
muazzam olduğundan, bu saldırılar ve onları neyin tetiklediği hakkında çok az şey bilinmektedir. Araştırmacılar, 5000J'nin üzerinde bir çarpışma enerjisine sahip
ateş yüklerinin çarpışmasının nether'i daha da yakınlaştırdığını

;;;;;

belirtmişlerdir. Ender incileri ve 10000J'den fazlası end boyutu için aynı şeyi yapıyor gibi görünüyor. 


Bilim adamlarının, ölçülen en yüksek değerleri gölgede bırakan hızlarla
bu saldırılardan birini bombalamaya çalıştıklarına dair söylentiler vardır. Ancak, hiçbiri hikayeyi anlatacak kadar yaşamadı.


