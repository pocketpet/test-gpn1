require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Bye
        intent!: /пока
        a: Пока пока
        

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}

    state: привет
        q!: $regex</start>
        a: привет || htmlEnabled = false, html = "привет"
        event: noMatch || onlyThisState = false, toState = "/NewState_4"
