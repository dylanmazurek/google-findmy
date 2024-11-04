package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0033b;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class p {
    private j$.time.temporal.l a;
    private DateTimeFormatter b;
    private int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(j$.time.temporal.l lVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.n nVar;
        j$.time.chrono.n b = dateTimeFormatter.b();
        if (b != null) {
            j$.time.chrono.n nVar2 = (j$.time.chrono.n) lVar.B(j$.time.temporal.k.e());
            ZoneId zoneId = (ZoneId) lVar.B(j$.time.temporal.k.k());
            InterfaceC0033b interfaceC0033b = null;
            b = Objects.equals(b, nVar2) ? null : b;
            Objects.equals(null, zoneId);
            if (b != null) {
                if (b != null) {
                    nVar = b;
                } else {
                    nVar = nVar2;
                }
                if (b != null) {
                    if (lVar.g(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC0033b = nVar.E((Temporal) lVar);
                    } else if (b != j$.time.chrono.u.d || nVar2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.B() && lVar.g(aVar)) {
                                throw new RuntimeException("Unable to apply override chronology '" + String.valueOf(b) + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + String.valueOf(lVar));
                            }
                        }
                    }
                }
                lVar = new o(interfaceC0033b, lVar, nVar, zoneId);
            }
        }
        this.a = lVar;
        this.b = dateTimeFormatter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final s b() {
        return this.b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale c() {
        return this.b.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.temporal.l d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long e(j$.time.temporal.o oVar) {
        int i = this.c;
        j$.time.temporal.l lVar = this.a;
        if (i > 0 && !lVar.g(oVar)) {
            return null;
        }
        return Long.valueOf(lVar.w(oVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object f(a aVar) {
        j$.time.temporal.l lVar = this.a;
        Object B = lVar.B(aVar);
        if (B == null && this.c == 0) {
            throw new RuntimeException("Unable to extract " + String.valueOf(aVar) + " from temporal " + String.valueOf(lVar));
        }
        return B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.c++;
    }

    public final String toString() {
        return this.a.toString();
    }
}
