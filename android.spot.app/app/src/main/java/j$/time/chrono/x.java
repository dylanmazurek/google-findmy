package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class x extends AbstractC0032a implements Serializable {
    public static final x d = new x();
    private static final long serialVersionUID = 459996390165777884L;

    private x() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0033b E(Temporal temporal) {
        if (temporal instanceof z) {
            return (z) temporal;
        }
        return new z(j$.time.g.T(temporal));
    }

    @Override // j$.time.chrono.n
    public final j$.time.temporal.s K(j$.time.temporal.a aVar) {
        switch (w.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new RuntimeException("Unsupported field: ".concat(String.valueOf(aVar)));
            case 5:
                return j$.time.temporal.s.k(A.y(), 999999999 - A.m().o().a0());
            case 6:
                return j$.time.temporal.s.k(A.v(), j$.time.temporal.a.DAY_OF_YEAR.k().d());
            case 7:
                return j$.time.temporal.s.j(z.d.a0(), 999999999L);
            case 8:
                return j$.time.temporal.s.j(A.d.getValue(), A.m().getValue());
            default:
                return aVar.k();
        }
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0042k L(Instant instant, ZoneId zoneId) {
        return m.S(this, instant, zoneId);
    }

    @Override // j$.time.chrono.n
    public final o O(int i) {
        return A.t(i);
    }

    @Override // j$.time.chrono.n
    public final String l() {
        return "Japanese";
    }

    @Override // j$.time.chrono.n
    public final String v() {
        return "japanese";
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }
}
