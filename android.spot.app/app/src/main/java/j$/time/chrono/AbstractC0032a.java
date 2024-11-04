package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceLoader;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0032a implements n {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final /* synthetic */ int c = 0;

    static {
        new Locale("ja", "JP", "JP");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n k(String str) {
        Objects.a(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = a;
            n nVar = (n) concurrentHashMap.get(str);
            if (nVar == null) {
                nVar = (n) b.get(str);
            }
            if (nVar != null) {
                return nVar;
            }
            if (concurrentHashMap.get("ISO") == null) {
                q qVar = q.o;
                n(qVar, qVar.l());
                x xVar = x.d;
                n(xVar, xVar.l());
                C c2 = C.d;
                n(c2, c2.l());
                I i = I.d;
                n(i, i.l());
                Iterator it = ServiceLoader.load(AbstractC0032a.class, null).iterator();
                while (it.hasNext()) {
                    AbstractC0032a abstractC0032a = (AbstractC0032a) it.next();
                    if (!abstractC0032a.l().equals("ISO")) {
                        n(abstractC0032a, abstractC0032a.l());
                    }
                }
                u uVar = u.d;
                n(uVar, uVar.l());
            } else {
                Iterator it2 = ServiceLoader.load(n.class).iterator();
                while (it2.hasNext()) {
                    n nVar2 = (n) it2.next();
                    if (str.equals(nVar2.l()) || str.equals(nVar2.v())) {
                        return nVar2;
                    }
                }
                throw new RuntimeException("Unknown chronology: ".concat(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n n(AbstractC0032a abstractC0032a, String str) {
        String v;
        n nVar = (n) a.putIfAbsent(str, abstractC0032a);
        if (nVar == null && (v = abstractC0032a.v()) != null) {
            b.putIfAbsent(v, abstractC0032a);
        }
        return nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [j$.time.chrono.k] */
    @Override // j$.time.chrono.n
    public InterfaceC0042k A(Temporal temporal) {
        try {
            ZoneId R = ZoneId.R(temporal);
            try {
                temporal = L(Instant.T(temporal), R);
                return temporal;
            } catch (j$.time.c unused) {
                return m.R(R, null, C0038g.R(this, D(temporal)));
            }
        } catch (j$.time.c e) {
            throw new RuntimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ".concat(String.valueOf(temporal.getClass())), e);
        }
    }

    @Override // j$.time.chrono.n
    public InterfaceC0036e D(Temporal temporal) {
        try {
            return E(temporal).z(j$.time.j.T(temporal));
        } catch (j$.time.c e) {
            throw new RuntimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(String.valueOf(temporal.getClass())), e);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return l().compareTo(((n) obj).l());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AbstractC0032a) && l().compareTo(((AbstractC0032a) obj).l()) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ l().hashCode();
    }

    public final String toString() {
        return l();
    }
}
