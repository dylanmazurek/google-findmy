package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0033b;

/* loaded from: classes2.dex */
final class o implements j$.time.temporal.l {
    final /* synthetic */ InterfaceC0033b a;
    final /* synthetic */ Object b;
    final /* synthetic */ j$.time.chrono.n c;
    final /* synthetic */ ZoneId d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(InterfaceC0033b interfaceC0033b, j$.time.temporal.l lVar, j$.time.chrono.n nVar, ZoneId zoneId) {
        this.a = interfaceC0033b;
        this.b = lVar;
        this.c = nVar;
        this.d = zoneId;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.l, java.lang.Object] */
    @Override // j$.time.temporal.l
    public final Object B(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.k.e()) {
            return this.c;
        }
        if (qVar == j$.time.temporal.k.k()) {
            return this.d;
        }
        if (qVar == j$.time.temporal.k.i()) {
            return this.b.B(qVar);
        }
        return qVar.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.l, java.lang.Object] */
    @Override // j$.time.temporal.l
    public final boolean g(j$.time.temporal.o oVar) {
        InterfaceC0033b interfaceC0033b = this.a;
        if (interfaceC0033b != null && oVar.B()) {
            return interfaceC0033b.g(oVar);
        }
        return this.b.g(oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int n(j$.time.temporal.o oVar) {
        return j$.time.temporal.k.a(this, oVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.l, java.lang.Object] */
    @Override // j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        InterfaceC0033b interfaceC0033b = this.a;
        if (interfaceC0033b != null && oVar.B()) {
            return interfaceC0033b.r(oVar);
        }
        return this.b.r(oVar);
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.b);
        String str2 = "";
        j$.time.chrono.n nVar = this.c;
        if (nVar == null) {
            str = "";
        } else {
            str = " with chronology ".concat(String.valueOf(nVar));
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone ".concat(String.valueOf(zoneId));
        }
        return valueOf + str + str2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.l, java.lang.Object] */
    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        InterfaceC0033b interfaceC0033b = this.a;
        if (interfaceC0033b != null && oVar.B()) {
            return interfaceC0033b.w(oVar);
        }
        return this.b.w(oVar);
    }
}
