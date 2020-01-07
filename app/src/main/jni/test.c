//
// Created by wpzhou on 1/7/2020.
//

#include <jni.h>
#include <stdio.h>
#include <string.h>
#include "test.h"

void getStr(char *name) {
    char str[10] = "abcdefg\n";
    memcpy(name, str, strlen(str));
}

int add(int a, int b) {
    return a+b;
}
