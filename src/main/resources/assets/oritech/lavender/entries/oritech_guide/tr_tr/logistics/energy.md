```json
{
  "title": "Enerji",
  "icon": "oritech:energy_pipe",
  "category": "oritech:logistics",
  "associated_items": [
    "oritech:energy_pipe",
    "oritech:small_storage_block",
    "oritech:large_storage_block"
  ]
}
```

Oritech tüm makinelerine güç sağlamak için {gold}**RF**{} kullanır. Bunu yapmak için Reborn Energy API'sini kullanır. Bu, Oritech'in Tech Reborn enerji
sistemini kullanan tüm modlarla uyumlu olduğu anlamına gelir, bu da şu anda temel olarak tüm fabric enerji kullanan modları içerir.

{gold}10bin RF/t{} kadar aktarım yapabilen yalnızca 1 kablo katmanı mevcuttur.

;;;;;

Jeneratörler her zaman enerji çıkarır ve diğer tüm makineler
her taraftan enerji kabul eder (ve tekrar çıkarmaz). Eğer enerji çıkışı yapamazsa, kablolar her makine bağlantısında 10bin RF'ye kadar depolar.

;;;;;

Enerjiyi arabelleğe almak ve depolamak için enerji depolama bloklarını kullanabilirsiniz. Bunlar 2 büyüklükte mevcuttur ve eklentiler kullanılarak büyük ölçüde genişletilebilir.
Enerji depolama blokları {green}yeşil bağlantı noktasıyla{}her taraftan enerji kabul eder, ve yalnızca tek bir {red}kırmızı bağlantı noktasına{} çıkış yapabilir.

;;;;;

Bir redstone sinyali tüm enerji çıkışını devre dışı bırakacaktır.

<block;oritech:small_storage_block>

;;;;;

Enerji, enderik lazer kullanılarak kablosuz olarak da aktarılabilir. Bkz. [enderik lazer](^oritech:interaction/enderic_laser)

![enderik lazer](oritech:textures/book/enderic_laser.png,fit)
