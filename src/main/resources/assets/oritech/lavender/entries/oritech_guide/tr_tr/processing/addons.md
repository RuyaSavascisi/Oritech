```json
{
  "title": "Eklentiler",
  "icon": "oritech:machine_extender",
  "category": "oritech:processing",
  "associated_items": [
    "oritech:machine_extender",
    "oritech:capacitor_addon_extender",
    "oritech:machine_speed_addon",
    "oritech:machine_efficiency_addon",
    "oritech:machine_capacitor_addon",
    "oritech:machine_fluid_addon",
    "oritech:machine_yield_addon",
    "oritech:crop_filter_addon",
    "oritech:quarry_addon",
    "oritech:machine_acceptor_addon",
    "oritech:machine_inventory_proxy_addon"
  ],
  "ordinal": 2
}
```

Oritech'te makineleri yükseltmek için eklentiler kullanılır. Makinenin kendisine veya bağlı bir makine genişleticisine eklenmesi gereken bloklardır. Eklentiler hızı, enerji
verimliliğini artırmak, belirli envanter yuvalarına erişim sağlamak ve çok daha fazlası gibi çeşitli şeyler yapabilir.

;;;;;

Makineler yalnızca belirli konumlardaki eklentileri kabul edebilir. Bunları görüntülemek için ya “eklentiler” UI sayfasını kontrol edin ya da makine üzerinde bu işaretleri arayın:
![makine_işareti](oritech:textures/book/addon_marker.png,fit)

;;;;;

Makineye sağ tıklandığında eklentiler etkinleştirilecektir. Bunu belirtmek için, bir eklentinin pembe kısımları kullanımdayken maviye döner. Mevcut eklenti yuvası sayısını artırmak için
makine genişleticileri kullanabilirsiniz. Bunlar, makineyi doğrudan etkilemeyen, ancak üzerlerine eklentilerin yerleştirilmesine izin veren ve daha sonra bağlı oldukları makineye sayılan belirli eklentilerdir.

;;;;;

Kullanabileceğiniz maksimum makine genişletici katmanları makine kalitesine bağlıdır. Çekirdek kalitesi 1 olan bir makineniz varsa, herhangi bir genişletici kullanamazsınız. Her bir ilave genişletici
başka bir genişleticiden **geçmesi** çekirdek kalitesinde 1'lik bir artış gerektirir.

Çekirdek kalitesi, aktif makine genişleticilerinizin miktarını asla doğrudan saymaz. Bunun yerine, bir eklentinin makineye
bağlanmak için kaç genişleticiye gitmesi gerektiğini sayar.

;;;;;

Bu sayı çekirdek kalitesinden büyükse, eklenti bağlanmayacaktır. Küçük bir gösterim için bu resme bakın:
![makine_eklentileri](oritech:textures/book/extenders.png,fit)

;;;;;

Daha önce de belirtildiği gibi, yalnızca bir makine ile bir eklenti arasındaki genişletici sayısı sayılır. Bu, genişleticileri dallandırabileceğiniz ve her şeyin çalışacağı anlamına gelir:
![eklenti_dallanması](oritech:textures/book/addon_branching.png,fit)
