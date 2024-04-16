require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
       q!: $regex</start>
        a: Начнём.

    state: /hello
        intent!: /привет
        a: Привет привет
        
    state: /weather
        intent!: /погода
        q!: *~погода*
        a: Сегодня солнечно
    
    state: /currency
        intent!: /currency
        q!: *(~курс/~валюта)*
        a: 1 Доллар США = 100 Рублей

    state: /NoMatch
        event!: noMatch
        a: Я не понял :(. Вы сказали: {{$request.query}}

    #state: Match
    #    event!: match
    #    a: {{$context.intent.answer}}