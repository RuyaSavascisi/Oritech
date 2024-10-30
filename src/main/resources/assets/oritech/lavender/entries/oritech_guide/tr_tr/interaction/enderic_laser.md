```json
{
  "title": "Enderik Lazer",
  "icon": "oritech:laser_arm_block",
  "category": "oritech:interaction",
  "associated_items": [
    "oritech:laser_arm_block",
    "oritech:fluxite",
    "minecraft:amethyst_cluster",
    "minecraft:amethyst_shard"
  ],
  "ordinal": 6
}
```

![enderik lazer](oritech:textures/book/enderic_laser.png,fit)

Enderik lazer,

;;;;;

bir lazer ışınını belirli bir yöne ateşlemek için büyük miktarda enerji kullanır.

 Çoğu durumda bu, bloğun yok edilmesiyle sonuçlanır. 
Düşen bloklar daha sonra envantere yerleştirilir. Envantere sığmayan tüm bloklar kaybolacaktır, bu nedenle eşyaları almaya devam etmek için bir [eşya borusu](^oritech:logistics/item_transport) kullanmak isteyebilirsiniz.

;;;;;

**Kontrol**

Lazerin hedef yönünü ayarlamak için [hedef belirleyici](^oritech:tools/target_designator) eşyası ile bir hedef seçin. Ardından hedefi atamak için **alttaki** lazer bloğuna shift+sağ tıklayın. Lazer, hedeflenecek bir şey olduğu sürece hedef yönünde ateş etmeye devam edecektir. 

*Sadece hedef yönünü ayarladığınızı unutmayın. Bu, lazerin hedefin önündeki ve arkasındaki blokları da yok edeceği anlamına gelir*.
Bir redstone sinyali lazeri devre dışı bırakır.

;;;;;

Maksimum menzil 64 bloktur.

;;;;;

**Fluxite Hasadı**


Enderik lazerden gelen büyük miktardaki enerji, büyümüş ametist demetlerinin yok edildiklerinde fluxite'a dönüşmesine neden olur.
<block;minecraft:amethyst_cluster>

Ayrıca tomurcuklanan ametistin kendisine yöneltildiklerinde ametistin büyümesini hızlandırırlar.

;;;;;

**Enerji Aktarımı**

Enderik lazer enerji depolayabilen bir bloğu (örneğin herhangi bir makine) hedeflediğinde, makinenin enerji deposunu dolduracaktır.
Lazer tüm giriş ve çıkış sınırlarını yok sayar ve kablolardan doğrudan enerji kabul etmeyen makinelerin enerji deposunu doldurabilir.

;;;;;

**Makine Avcı Eklentisi**

Enderik lazer bir makine avcı eklentisine sahip olduğunda, bloklar yerine yaratıkları hedef alacaktır. Eklenti yükseltmeleri yaratıkları avlarken hala çalışır: verim eklentisi
yaratıkların daha fazla ganimet düşürmesini sağlar, daha fazla avcı eklentisi hedef tarama menzilini genişletir, hız eklentileri verilen hasarı artırır (ve enerji verimliliğini azaltır)

;;;;;

ve ekin filtresi yavru hayvanları öldürmekten kaçınır.


Eğer bir [exo göğüslük](^oritech:tools/exo_armor) giyiyorsanız, enderik lazer onu sizin için şarj edecektir.

;;;;;

**Avcı Hedeflemesi**

Hedefleme modlarını değiştirmek için enderik lazer üzerinde bir [hedef belirleyici](^oritech:tools/target_designator) kullanın. Varsayılan olarak yalnızca canavarlara saldırır, ancak hayvanlara ve hatta seyyar tüccarlara da saldırmasını sağlayabilirsiniz. Nerede kullandığınıza ve hedeflemeyi nasıl ayarladığınıza dikkat edin, çünkü öldürmek istemediğiniz şeyleri öldürebilirsiniz.

;;;;;

**Daha detaylı bilgi**

Lazer ışını herhangi bir bloğu hedef alır, ancak camdan (ve yetiştirilmemiş ametistlerden) geçer. Maden ocağı eklentileri kazılan alanın genişliğini artıracaktır.

Lazerin alt kısmında yalnızca 1 eklenti yuvası bulunur. Eklentiler yalnızca blok kırma hızını ve verimliliğini etkiler, enerji aktarımı yalnızca hız yükseltmelerinden yararlanabilir.

;;;;;

Hedef blok, yok edilmese de lazerin daha fazla ilerlemesini durduracaktır.