```json
{
  "title": "Eşya Taşımacılığı",
  "icon": "oritech:item_filter_block",
  "category": "oritech:logistics",
  "associated_items": [
    "oritech:item_pipe",
    "oritech:item_filter_block"
  ]
}
```

Oritech, eşya lojistiği ihtiyaçlarınızı karşılamak için eşya taşıma boruları ve eşya filtre blokları içerir. Eşya boruları birbirlerine ve tüm
komşu envanterlere bağlanır.

;;;;;

Diğer boruların aksine, eşya borularının bir envanteri yoktur. Bu, diğer blokların (huni gibi)
boru ağına kendi başlarına eşya ekleyemeyeceği anlamına gelir.
Bunun yerine, bir eşya borusu yakındaki bir envanterden çıkartmaya ayarlanabilir. Bunu yapmak için,
sadece bir boru bloğuna (bir şeye bağlı olan) sağ tıklayın.
Aynı boru bloğuna bağlı birden fazla envanteriniz varsa,
tüm bağlantıların çıkartma moduna döndüğünü fark edeceksiniz.

;;;;;

Bu, oritech borularının mevcut bir sınırlamasıdır. Bir boru bloğunu çıkarmak için ayarlarsanız, bu boru bloğuna
bağlı olan tüm bloklardan çıkarmaya çalışacaktır. Yani herhangi bir şeyi gerçekten taşımak için boru ağının en az 2 bloktan oluşması gerekir.

Çıkarılan eşyalar ağın ilerisindeki **en yakın** envantere yerleştirilecektir.

;;;;;

Maksimum aktarım menzili 64 bloktur. Bundan daha uzun herhangi bir ağın bölünmesi gerekir.


Borular her zaman bir envanterdeki boş olmayan ilk yuvadan çıkar. Eğer eşya boru ağının bir envanterine yerleştirilemiyorsa, borunun
o envanterden çıkarılmasını engelleyecektir.

;;;;;

**Eşya Filtreleri**
<block;oritech:item_filter_block>
Hangi eşyaların nereye gideceğini filtrelemek için eşya filtrelerini kullanabilirsiniz. Hedef envanterin yanına yerleştirebileceğiniz bloklardır. 5 giriş tarafı vardır, 
ve her zaman baktığı tarafa çıktı verir.
Yalnızca UI aracılığıyla ayarlanan filtreyle eşleşen eşyaları

;;;;;

kabul eder ve bunları otomatik olarak hedef envantere gönderir.


Ancak, komşu envanterlerden eşyaları otomatik olarak çıkarmayacaktır.
