package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbl implements jei {
    final /* synthetic */ jbe a;
    final /* synthetic */ jei b;

    public jbl(jbe jbeVar, jei jeiVar) {
        this.a = jbeVar;
        this.b = jeiVar;
    }

    @Override // defpackage.jei
    public final Object a(Object obj) {
        jbe e = jbu.e(jbu.f(), this.a);
        try {
            return this.b.a(obj);
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
