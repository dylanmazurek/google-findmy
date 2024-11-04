package defpackage;

import j$.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdt extends kll {
    public static final Set a = (Set) kgs.a(new kcb(7));
    public final kdp b;
    public final kdq c;
    public final kdr d;
    public final kds e;
    public final kag f;
    public final knb g;

    public kdt(kdp kdpVar, kdq kdqVar, kdr kdrVar, kag kagVar, kds kdsVar, knb knbVar) {
        this.b = kdpVar;
        this.c = kdqVar;
        this.d = kdrVar;
        this.f = kagVar;
        this.e = kdsVar;
        this.g = knbVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kdt)) {
            return false;
        }
        kdt kdtVar = (kdt) obj;
        if (!Objects.equals(kdtVar.b, this.b) || !Objects.equals(kdtVar.c, this.c) || !Objects.equals(kdtVar.d, this.d) || !Objects.equals(kdtVar.f, this.f) || !Objects.equals(kdtVar.e, this.e) || !Objects.equals(kdtVar.g, this.g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(kdt.class, this.b, this.c, this.d, this.f, this.e, this.g);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.b, this.c, this.d, this.f, this.e, this.g);
    }
}
