package io.github.sornerol.speedrunrankingsapi.util.typeconverter

import org.jooq.Converter

class UUIDByteArrayToStringConverter implements Converter<byte[], String> {
    @Override
    String from(byte[] bytes) {
        bytes?.encodeHex()?.toString()
    }

    @Override
    byte[] to(String s) {
        s?.decodeHex()
    }

    @Override
    Class<byte[]> fromType() {
        byte[].class
    }

    @Override
    Class<String> toType() {
        String.class
    }
}
