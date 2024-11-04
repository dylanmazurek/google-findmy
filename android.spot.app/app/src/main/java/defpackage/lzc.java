package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzc {
    public static final lzc a = new lzc(new lyz(1), lyz.a);
    private final ConcurrentMap b = new ConcurrentHashMap();

    public lzc(lzb... lzbVarArr) {
        for (int i = 0; i < 2; i++) {
            lzb lzbVar = lzbVarArr[i];
            this.b.put(lzbVar.b(), lzbVar);
        }
    }
}
