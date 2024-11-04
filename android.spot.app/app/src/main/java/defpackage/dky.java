package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dky implements dir {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final dir g;
    private final Map h;
    private final div i;
    private int j;

    public dky(Object obj, dir dirVar, int i, int i2, Map map, Class cls, Class cls2, div divVar) {
        bsc.q(obj);
        this.b = obj;
        amr.p(dirVar, "Signature must not be null");
        this.g = dirVar;
        this.c = i;
        this.d = i2;
        bsc.q(map);
        this.h = map;
        amr.p(cls, "Resource class must not be null");
        this.e = cls;
        this.f = cls2;
        bsc.q(divVar);
        this.i = divVar;
    }

    @Override // defpackage.dir
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dir
    public final boolean equals(Object obj) {
        if (obj instanceof dky) {
            dky dkyVar = (dky) obj;
            if (this.b.equals(dkyVar.b) && this.g.equals(dkyVar.g) && this.d == dkyVar.d && this.c == dkyVar.c && this.h.equals(dkyVar.h) && this.e.equals(dkyVar.e) && this.f.equals(dkyVar.f) && this.i.equals(dkyVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dir
    public final int hashCode() {
        int i = this.j;
        if (i == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
            this.j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.h.hashCode();
            this.j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
            this.j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f.hashCode();
            this.j = hashCode5;
            int hashCode6 = (hashCode5 * 31) + this.i.hashCode();
            this.j = hashCode6;
            return hashCode6;
        }
        return i;
    }

    public final String toString() {
        div divVar = this.i;
        Map map = this.h;
        dir dirVar = this.g;
        Class cls = this.f;
        Class cls2 = this.e;
        return "EngineKey{model=" + this.b.toString() + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + cls2.toString() + ", transcodeClass=" + cls.toString() + ", signature=" + dirVar.toString() + ", hashCode=" + this.j + ", transformations=" + map.toString() + ", options=" + divVar.toString() + "}";
    }
}
