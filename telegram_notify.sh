#!/bin/bash

# Передача токена и chat_id через аргументы скрипта
TELEGRAM_BOT_TOKEN=$1
TELEGRAM_CHAT_ID=$2

if [ $3 -eq 0 ]; then
    MESSAGE="Тесты успешно пройдены! 🎉"
else
    MESSAGE="Тесты не пройдены. Проверьте логи для получения дополнительной информации."
fi

# Отправка сообщения через Telegram API
curl -s -X POST https://api.telegram.org/bot$TELEGRAM_BOT_TOKEN/sendMessage -d chat_id=$TELEGRAM_CHAT_ID -d text="$MESSAGE"
