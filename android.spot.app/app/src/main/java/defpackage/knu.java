package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knu {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final knw f;
    public final Set g;

    public knu(String str, Set set, Set set2, int i, int i2, knw knwVar, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = knwVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static knt a(kon konVar) {
        return new knt(konVar, new kon[0]);
    }

    public static knt b(Class cls) {
        return new knt(cls, new Class[0]);
    }

    public static knt c(Class cls) {
        knt b = b(cls);
        b.b = 1;
        return b;
    }

    public static knu d(Object obj, Class cls) {
        knt c = c(cls);
        c.c = new kns(obj, 1);
        return c.a();
    }

    @SafeVarargs
    public static knu e(Object obj, Class cls, Class... clsArr) {
        knt kntVar = new knt(cls, clsArr);
        kntVar.c = new kns(obj, 0);
        return kntVar.a();
    }

    public final boolean f() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
