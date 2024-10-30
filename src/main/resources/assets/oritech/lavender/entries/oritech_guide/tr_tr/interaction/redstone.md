```json
{
  "title": "Redstone",
  "icon": "oritech:energy_pipe",
  "category": "oritech:interaction",
  "associated_items": [
    "oritech:machine_redstone_addon",
    "minecraft:redstone"
  ]
}
```

Taşınabilir tank ve taşınabilir enerji deposu gibi bazı Oritech makineleri redstone ile doğrudan etkileşime girebilir. Taşınabilir tankların içeriği bir karşılaştırıcı kullanılarak ölçülebilir, 
ve taşınabilir enerji depolarının çıkışı bir redstone sinyali ile devre dışı bırakılabilir. Diğer tüm bloklar için bir “Redstone Eklenti Denetleyicisi” gereklidir.

;;;;;

Redstone eklenti denetleyicisi, diğer eklentiler gibi eklenebilir ve UI aracılığıyla yapılandırılabilir. Yapılandırıldığında, veriler bir karşılaştırıcı kullanılarak okunabilir. Karşılaştırıcı sinyali
makinenin kendisinden değil, eklentiden çıkacaktır. Makine, eklentiye gönderilen bir redstone sinyali ile de devre dışı bırakılabilir.