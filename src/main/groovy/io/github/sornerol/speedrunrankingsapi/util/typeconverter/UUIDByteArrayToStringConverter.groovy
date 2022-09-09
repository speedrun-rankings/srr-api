package io.github.sornerol.speedrunrankingsapi.util.typeconverter

import org.jooq.Converter

import java.nio.ByteBuffer

class UUIDByteArrayToStringConverter implements Converter<byte[], UUID> {
    @Override
    UUID from(byte[] bytes) {
        if (!bytes) {
            return null
        }
        ByteBuffer bb = ByteBuffer.wrap(bytes)
        new UUID(bb.getLong(), bb.getLong())
    }

    @Override
    byte[] to(UUID uuid) {
        if (!uuid) {
            return null
        }
        ByteBuffer.wrap(new byte[16])
                .putLong(uuid.mostSignificantBits)
                .putLong(uuid.leastSignificantBits)
                .array()
    }

    @Override
    Class<byte[]> fromType() {
        byte[].class
    }

    @Override
    Class<UUID> toType() {
        UUID.class
    }
}
