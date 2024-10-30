```json
{
  "title": "Büyüleme",
  "icon": "oritech:enchanter_block",
  "category": "oritech:arcane",
  "associated_items": [
    "oritech:enchantment_catalyst_block",
    "oritech:enchanter_block"
  ]
}
```

Oritech'in büyü uygulamak için iki yöntemi vardır. Tüm Oritech ekipman ve aletleri büyülenebilir. İlk seçenek, ekipmana “normal” büyülerin uygulanmasına izin veren stabilize büyülendiricidir.
İkinci seçenek ise büyülü bir kitaptaki herhangi bir büyüyü herhangi bir seviyedeki herhangi bir eşyaya uygulayabilen arcane katalizördür.

;;;;;

<block;oritech:enchanter_block>

Stabilize büyülendirici tek bir eşya üzerinde çalışabilir. Bir eşya eklendiğinde, GUI'den uygulanacak büyüyü seçebilirsiniz. 
Büyü sonraki eşyalar için saklanır, ancak değiştirilebilir.
Çalışmak için hem enerji hem de ruhlar gereklidir. Büyülendirici ruhları kendisi toplamaz.

;;;;;

Bunun yerine, içlerinde ruh saklanan yakındaki büyü katalizörlerine ihtiyaç vardır. 
Gerekli katalizör sayısı büyünün seviyesine bağlıdır. Yalnızca depolanmış ruhları olan katalizörler sayılır.

;;;;;

<block;oritech:enchantment_catalyst_block>

Arcane katalizör bloğu ruhları depolayabilir ve onları stabilize büyülendiriciye verebilir. Ayrıca kitapları kullanarak eşyaları büyüleyebilir. Kullanılan kitabın büyünün maksimum seviyesinde olması gerekir.
Herhangi bir eşyaya herhangi bir büyü uygulayabilir.

;;;;;

*Hiper Büyüleme*:
Bir alet halihazırda uygulanan büyünün maksimum veya daha yüksek seviyesindeyse, hiper büyülenecektir. Bu, büyü maliyetini büyük ölçüde artırır, ancak varsayılan maksimum seviyenin üzerine çıkmanıza izin verir.

;;;;;

*Stabilizasyon*:
Arcane katalizör varsayılan olarak yalnızca 50 ruh depolayabilir. Bununla birlikte, hiper büyüleme 50 den fazla ruh gerektirecektir. Enderik lazerleri kullanarak arcane katalizörü stabilize edebilirsiniz. Her lazer
depolanabilecek ruh miktarını artırır. Bununla birlikte, ruhlar depolanırken stabilizasyon kaybedilirse sonuçlar felaket olabilir.
