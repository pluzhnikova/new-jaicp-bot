require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
       q!: $regex</start>
        a: Начнём.

    state: /hello
        intent!: /hello
        a: Привет привет
        
    state: /weather
        intent!: /weather
        q!: *~погода*
        a: Сегодня солнечно
    
    state: /currency
        intent!: /currency
        q!: *(~курс/~валюта)*
        a: 1 Доллар США = 100 Рублей

    state: /NoMatch
        event!: noMatch
        a: Я не понял :(. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: ААААААААА {{$context.intent.answer}}