package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class C extends AbstractC0032a implements Serializable {
    public static final C d = new C();
    private static final long serialVersionUID = 1039765215346859963L;

    private C() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0033b E(Temporal temporal) {
        if (temporal instanceof E) {
            return (E) temporal;
        }
        return new E(j$.time.g.T(temporal));
    }

    @Override // j$.time.chrono.n
    public final j$.time.temporal.s K(j$.time.temporal.a aVar) {
        int i = B.a[aVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return aVar.k();
                }
                j$.time.temporal.s k = j$.time.temporal.a.YEAR.k();
                return j$.time.temporal.s.j(k.e() - 1911, k.d() - 1911);
            }
            j$.time.temporal.s k2 = j$.time.temporal.a.YEAR.k();
            return j$.time.temporal.s.k(k2.d() - 1911, (-k2.e()) + 1912);
        }
        j$.time.temporal.s k3 = j$.time.temporal.a.PROLEPTIC_MONTH.k();
        return j$.time.temporal.s.j(k3.e() - 22932, k3.d() - 22932);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0042k L(Instant instant, ZoneId zoneId) {
        return m.S(this, instant, zoneId);
    }

    @Override // j$.time.chrono.n
    public final o O(int i) {
        if (i != 0) {
            if (i == 1) {
                return F.ROC;
            }
            throw new RuntimeException("Invalid era: " + i);
        }
        return F.BEFORE_ROC;
    }

    @Override // j$.time.chrono.n
    public final String l() {
        return "Minguo";
    }

    @Override // j$.time.chrono.n
    public final String v() {
        return "roc";
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }
}
