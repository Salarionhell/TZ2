#!/bin/bash

# Передача токена и chat_id через аргументы скрипта
TELEGRAM_TOKEN=$1
TELEGRAM_CHAT_ID=$2

if [ $3 -eq 0 ]; then
    MESSAGE="Всё ок"
else
    MESSAGE="Тесты не пройдены"
fi

# Отправка сообщения через Telegram API
curl -s -X POST https://api.telegram.org/bot$TELEGRAM_TOKEN/sendMessage -d chat_id=$TELEGRAM_CHAT_ID -d text="$MESSAGE"
