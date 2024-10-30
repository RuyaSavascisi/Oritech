```json
{
  "title": "Makine Şasileri",
  "icon": "oritech:machine_frame_block",
  "category": "oritech:interaction",
  "associated_items": [
    "oritech:machine_frame_block",
    "oritech:destroyer_block",
    "oritech:placer_block",
    "oritech:fertilizer_block"
  ],
  "ordinal": 0
}
```

*[Blok yerleştirici](^oritech:interaction/block_placer), [blok yok edici](^oritech:interaction/block_destroyer) ve [gübreleyici](^oritech:interaction/fertilizer)* makine şasileri ile inşa edilmiş bir kızak üzerinde çalışır. Makine çerçevesi,
makinelerin çalıştığı alanı belirler. Dikdörtgen şeklinde ve içi boş olmalıdır.

Makineler her zaman şasinin **altındaki** blokları hedef alır.

Herhangi bir sayıda makine aynı makine şasisi üzerinde çalışabilir. Bunu yapmak

;;;;;

için, şasiye birden fazla makine yerleştirmeniz yeterlidir. Makineler her zaman şasi alanındaki tüm blokları yineler. 

Makine şasileri üzerinde çalışan tüm makineler çoğu eklentiyi kullanabilir. 

Hız eklentisi hem hareket hem de çalışma hızını artırır.

<block;oritech:machine_speed_addon>
