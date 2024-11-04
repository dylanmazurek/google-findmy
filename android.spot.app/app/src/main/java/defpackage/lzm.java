package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzm {
    static final jen a = jen.b(',');
    public static final lzm b = new lzm(lyz.a, false, new lzm(new lyz(1), true, new lzm()));
    public final Map c;
    public final byte[] d;

    private lzm() {
        this.c = new LinkedHashMap(0);
        this.d = new byte[0];
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, lzk] */
    private lzm(lzk lzkVar, boolean z, lzm lzmVar) {
        String b2 = lzkVar.b();
        hwx.K(!b2.contains(","), "Comma is currently not allowed in message encoding");
        int size = lzmVar.c.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(lzmVar.c.containsKey(lzkVar.b()) ? size : size + 1);
        for (lzl lzlVar : lzmVar.c.values()) {
            String b3 = lzlVar.b.b();
            if (!b3.equals(b2)) {
                linkedHashMap.put(b3, new lzl(lzlVar.b, lzlVar.a));
            }
        }
        linkedHashMap.put(b2, new lzl(lzkVar, z));
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.c = unmodifiableMap;
        jen jenVar = a;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((lzl) entry.getValue()).a) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.d = jenVar.c(DesugarCollections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}
