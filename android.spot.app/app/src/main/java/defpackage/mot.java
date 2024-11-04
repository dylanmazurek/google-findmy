package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mot implements Serializable, mpb {
    protected final Object a;
    private final Class b;
    private final String c = "invoke";
    private final String d = "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;";
    private final boolean e = false;
    private final int f = 2;
    private final int g = 4;

    public mot(Object obj, Class cls) {
        this.a = obj;
        this.b = cls;
    }

    @Override // defpackage.mpb
    public final int bQ() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mot)) {
            return false;
        }
        mot motVar = (mot) obj;
        boolean z = motVar.e;
        int i = motVar.f;
        int i2 = motVar.g;
        if (amr.i(this.a, motVar.a) && amr.i(this.b, motVar.b) && this.c.equals(motVar.c) && this.d.equals(motVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + 1237) * 31) + 2) * 31) + 4;
    }

    public final String toString() {
        return mpd.d(this);
    }
}
