package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyj {
    public int a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;

    public hyj() {
    }

    public final void a(jis jisVar) {
        if (jisVar != null) {
            this.d = jisVar;
            return;
        }
        throw new NullPointerException("Null rangingTechnologiesPriority");
    }

    public final void b(lim limVar) {
        if (limVar != null) {
            this.c = limVar;
            return;
        }
        throw new NullPointerException("Null vendorData");
    }

    public final void c(int i) {
        this.c = Optional.of(Integer.valueOf(i));
    }

    public hyj(byte[] bArr, byte[] bArr2) {
        this.c = Optional.empty();
        this.d = Optional.empty();
    }
}
