package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikg {
    public static final Long a = 10L;
    public static final Long b = 60000L;
    private final ConcurrentMap c = new ConcurrentHashMap();

    @Deprecated
    public ikg() {
    }

    public static jer a(FileChannel fileChannel, boolean z) {
        try {
            return jer.i(new ike(fileChannel.lock(0L, Long.MAX_VALUE, z), 1));
        } catch (IOException e) {
            if (e.getMessage().contains("Resource deadlock would occur")) {
                return jdl.a;
            }
            throw e;
        }
    }

    public final Semaphore b(String str) {
        Semaphore semaphore = (Semaphore) this.c.get(str);
        if (semaphore == null) {
            this.c.putIfAbsent(str, new Semaphore(1));
            return (Semaphore) this.c.get(str);
        }
        return semaphore;
    }
}
