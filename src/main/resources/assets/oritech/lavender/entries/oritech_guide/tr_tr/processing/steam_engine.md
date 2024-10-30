```json
{
  "title": "Buhar Gücü",
  "icon": "oritech:steam_boiler_addon",
  "category": "oritech:processing",
  "associated_items": [
    "oritech:steam_engine_block",
    "oritech:steam_boiler_addon"
  ]
}
```

<block;oritech:steam_boiler_addon>


Tüm jeneratörler (basit jeneratör hariç) buhar üretecek şekilde yükseltilebilir. Bunu yapmak için bir buhar kazanı eklentisi ekleyin. Eklendiğinde, makine artık

;;;;;

doğrudan RF üretmeyecektir. Bunun yerine, 2:1 oranında buhar üretecektir. Buhar üretmek için su tüketilecektir. Su ve buhar sıvıları doğrudan eklentiden içeri ve dışarı pompalanabilir, ancak makinenin kendisinden pompalanamaz.

Buharı kullanmak için, ondan RF üretmek üzere bir buhar motoru kullanılabilir. Girdi olarak buhar alır ve su çıkarır. Bununla birlikte, işlem sırasında suyun yaklaşık %20'si\

;;;;;

kaybolacaktır, bu nedenle jeneratörler için sabit bir su kaynağına ihtiyaç vardır.


Birden fazla buhar motoru birbirine zincirlenebilir. Sıradaki ilk motorun enerji deposunu, su ve buhar tankını paylaşacaklardır. İşbirliği içinde çalışacaklardır.
Bir buhar motorunun hızı depolanan buhara bağlı olarak değişir. Daha fazla buhar daha fazla basınçla sonuçlanarak daha hızlı çalışmasını sağlayacaktır. 
Hız, buhar

;;;;;

tanklarının doluluk yüzdesine göre doğrusal olarak ölçeklendirilir ve tank dolduğunda maksimum çarpan 10'dur. Ancak, motorun verimliliği hıza bağlı olarak değişir. Daha yüksek bir verimlilik,
üretilen buhar birimi başına daha fazla RF ile sonuçlanır. Makine verimliliği yaklaşık %700 hızda çalışırken en yüksek seviyededir.
Bundan daha düşük veya daha yüksek herhangi bir şey daha az ideal bir verimle sonuçlanacaktır. Enerji

;;;;;

kırmızı makine yuvalarından çıkacaktır. Sıvı portları mavi ile işaretlenmiştir.
