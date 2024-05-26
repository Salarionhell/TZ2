#!/bin/bash

# Передача токена и chat_id через аргументы скрипта
TELEGRAM_TOKEN=$1
TELEGRAM_CHAT_ID=$2

mvn test > test_output.txt

ERRORS=$(grep -i "ERROR" test_output.txt)

if [ $3 -eq 0 ]; then
    MESSAGE="Всё ок"
else
    MESSAGE="Тесты не пройдены. Ошибки:\n$ERRORS"
fi

# Отправка сообщения через Telegram API
curl -s -X POST https://api.telegram.org/bot$TELEGRAM_TOKEN/sendMessage -d chat_id=$TELEGRAM_CHAT_ID -d text="$MESSAGE"
