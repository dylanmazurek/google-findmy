package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzw {
    public static final lzw a;
    public final ConcurrentNavigableMap b;
    public final ConcurrentMap c;
    public final ConcurrentMap d;

    static {
        Logger.getLogger(lzw.class.getName());
        a = new lzw();
    }

    public lzw() {
        new ConcurrentSkipListMap();
        this.b = new ConcurrentSkipListMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static void a(Map map, lzy lzyVar) {
    }

    public static void b(Map map, lzy lzyVar) {
    }
}
