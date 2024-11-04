package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class u extends AbstractC0032a implements Serializable {
    public static final u d = new u();
    private static final long serialVersionUID = -1440403870442975015L;

    private u() {
    }

    public static boolean q(long j) {
        if ((3 & j) == 0 && (j % 100 != 0 || j % 400 == 0)) {
            return true;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.AbstractC0032a, j$.time.chrono.n
    public final InterfaceC0042k A(Temporal temporal) {
        return ZonedDateTime.R(temporal);
    }

    @Override // j$.time.chrono.AbstractC0032a, j$.time.chrono.n
    public final InterfaceC0036e D(Temporal temporal) {
        return LocalDateTime.S(temporal);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0033b E(Temporal temporal) {
        return j$.time.g.T(temporal);
    }

    @Override // j$.time.chrono.n
    public final j$.time.temporal.s K(j$.time.temporal.a aVar) {
        return aVar.k();
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0042k L(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.S(instant, zoneId);
    }

    @Override // j$.time.chrono.n
    public final o O(int i) {
        if (i != 0) {
            if (i == 1) {
                return v.CE;
            }
            throw new RuntimeException("Invalid era: " + i);
        }
        return v.BCE;
    }

    @Override // j$.time.chrono.n
    public final String l() {
        return "ISO";
    }

    @Override // j$.time.chrono.n
    public final String v() {
        return "iso8601";
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }
}
