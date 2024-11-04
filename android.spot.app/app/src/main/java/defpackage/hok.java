package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hok {
    final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final kru c = kru.f('/');
    private static final Pattern b = Pattern.compile("^(\\*[a-z]+\\*).*");

    static String a(String str) {
        List d = c.d(str);
        if (d.size() != 3) {
            ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "sanitizeSyncName", 56, "HashingNameSanitizer.java")).u("malformed sync name: %s", str);
            return "MALFORMED";
        }
        return (String) d.get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ndo b(defpackage.hoj r14, defpackage.ndo r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hok.b(hoj, ndo):ndo");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ndo c(ndo ndoVar) {
        ndj ndjVar = ndoVar.d;
        if (ndjVar == null) {
            ndjVar = ndj.d;
        }
        if ((ndjVar.a & 1) != 0) {
            ndj ndjVar2 = ndoVar.d;
            if (ndjVar2 == null) {
                ndjVar2 = ndj.d;
            }
            ljh ljhVar = (ljh) ndjVar2.z(5);
            ljhVar.w(ndjVar2);
            Long l = (Long) this.a.get(Long.valueOf(((ndj) ljhVar.b).b));
            l.getClass();
            ljh ljhVar2 = (ljh) ndoVar.z(5);
            ljhVar2.w(ndoVar);
            long longValue = l.longValue();
            if (!ljhVar.b.y()) {
                ljhVar.t();
            }
            ndj ndjVar3 = (ndj) ljhVar.b;
            ndjVar3.a |= 1;
            ndjVar3.b = longValue;
            if (!ljhVar2.b.y()) {
                ljhVar2.t();
            }
            ndo ndoVar2 = (ndo) ljhVar2.b;
            ndj ndjVar4 = (ndj) ljhVar.q();
            ndjVar4.getClass();
            ndoVar2.d = ndjVar4;
            ndoVar2.a |= 4;
            return (ndo) ljhVar2.q();
        }
        return ndoVar;
    }
}
