package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class I extends AbstractC0032a implements Serializable {
    public static final I d = new I();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private I() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0033b E(Temporal temporal) {
        if (temporal instanceof K) {
            return (K) temporal;
        }
        return new K(j$.time.g.T(temporal));
    }

    @Override // j$.time.chrono.n
    public final j$.time.temporal.s K(j$.time.temporal.a aVar) {
        int i = H.a[aVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return aVar.k();
                }
                j$.time.temporal.s k = j$.time.temporal.a.YEAR.k();
                return j$.time.temporal.s.j(k.e() + 543, k.d() + 543);
            }
            j$.time.temporal.s k2 = j$.time.temporal.a.YEAR.k();
            return j$.time.temporal.s.k((-(k2.e() + 543)) + 1, k2.d() + 543);
        }
        j$.time.temporal.s k3 = j$.time.temporal.a.PROLEPTIC_MONTH.k();
        return j$.time.temporal.s.j(k3.e() + 6516, k3.d() + 6516);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0042k L(Instant instant, ZoneId zoneId) {
        return m.S(this, instant, zoneId);
    }

    @Override // j$.time.chrono.n
    public final o O(int i) {
        if (i != 0) {
            if (i == 1) {
                return L.BE;
            }
            throw new RuntimeException("Invalid era: " + i);
        }
        return L.BEFORE_BE;
    }

    @Override // j$.time.chrono.n
    public final String l() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.n
    public final String v() {
        return "buddhist";
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }
}
