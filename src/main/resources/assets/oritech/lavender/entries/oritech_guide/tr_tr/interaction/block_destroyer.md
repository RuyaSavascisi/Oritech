```json
{
  "title": "Blok Yok Edici",
  "icon": "oritech:destroyer_block",
  "category": "oritech:interaction",
  "associated_items": [
    "oritech:destroyer_block"
  ],
  "ordinal": 3
}
```

<block;oritech:destroyer_block[machine_assembled=true]>

Blok yok edici, tahmin ettiğiniz gibi blokları yok etmek için kullanılır. Bir [makine şasisi](^oritech:interaction:machine_frames) üzerinde çalışan ve şasinin hemen altındaki blok katmanını hedef alan bir [çoklu-bloktur](^oritech:processing/multiblocks).

;;;;;

Bir bloğu kırmak için gereken zaman ve enerji, blokların sertliğine bağlıdır. Blok yok edici altındaki tüm blokları yok etmeye çalışır. Çiftçilik kullanımına izin vermek için ekin filtresi eklentisi kurulabilir.
Bu, blok yok edicinin bitmemiş tüm mahsulleri atlamasına neden olacaktır.

<block;oritech:crop_filter_addon>

;;;;;

Maden ocağı eklentileri eklenerek blok yok edici aynı zamanda bir maden ocağı olarak da kullanılabilir. Her maden ocağı eklentisi menzili 8 ile çarpar. 

Bu, bir eklentinin 8 menzil, 2 eklentinin 64 menzil ve 3 eklentinin 512 menzil verdiği anlamına gelir.

<block;oritech:quarry_addon>