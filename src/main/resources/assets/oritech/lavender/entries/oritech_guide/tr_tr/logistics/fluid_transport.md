```json
{
  "title": "Sıvılar",
  "icon": "oritech:fluid_pipe",
  "category": "oritech:logistics",
  "associated_items": [
    "oritech:fluid_pipe",
    "oritech:small_tank_block"
  ]
}
```

Sıvı boruları madde borularına benzer şekilde davranır. Bununla birlikte, küçük bir dahili depolama alanına da sahiptirler (her bağlantıda). Eşya boruları gibi,
çıkartmaya ayarlandıklarında, tüm komşu bloklardan çıkarırlar. Bununla birlikte, eşya borularından farklı olarak, bloklar da
sıvıları bir boruya itebilir ve boru daha sonra bir sonraki mevcut

;;;;;

sıvı deposuna taşınır. Sıvıları depolamak için bir sıvı tankı kullanabilirsiniz. Küçük sıvı tankları *256* kovaya kadar sıvı depolar. Kırıldığında, küçük tank tüm içeriğini
eşya nbt'sinde tutar. Bir karşılaştırıcı çıkışı tankların doluluk durumunu yansıtacaktır.

;;;;;

İstiflenmiş tanklar otomatik olarak sıvının aşağı akmasına izin verecektir.

<block;oritech:small_tank_block>
