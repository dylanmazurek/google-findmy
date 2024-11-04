package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aio {
    public static final void a(aip aipVar, int i, int i2) {
        int i3 = 1 << i;
        if ((aipVar.g & i3) != 0) {
            ael.b("Already pushed argument ".concat(aipVar.a().a(i)));
        }
        aipVar.g |= i3;
        aipVar.c[(aipVar.d - aipVar.a().b) + i] = i2;
    }

    public static final void b(aip aipVar, int i, Object obj) {
        int i2 = 1 << i;
        if ((aipVar.h & i2) != 0) {
            ael.b("Already pushed argument ".concat(aipVar.a().c(i)));
        }
        aipVar.h |= i2;
        aipVar.e[(aipVar.f - aipVar.a().c) + i] = obj;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
