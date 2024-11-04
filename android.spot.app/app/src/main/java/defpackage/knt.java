package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knt {
    public String a = null;
    public int b;
    public knw c;
    private final Set d;
    private final Set e;
    private int f;
    private final Set g;

    @SafeVarargs
    public knt(kon konVar, kon... konVarArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(konVar);
        for (kon konVar2 : konVarArr) {
            amr.p(konVar2, "Null interface");
        }
        Collections.addAll(this.d, konVarArr);
    }

    public final knu a() {
        boolean z;
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        kne.x(z, "Missing required property: factory.");
        Set set = this.d;
        return new knu(this.a, new HashSet(set), new HashSet(this.e), this.f, this.b, this.c, this.g);
    }

    public final void b(koc kocVar) {
        if (!this.d.contains(kocVar.a)) {
            this.e.add(kocVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public final void c() {
        boolean z;
        if (1 != (this.f ^ 1)) {
            z = false;
        } else {
            z = true;
        }
        kne.x(z, "Instantiation type has already been set.");
        this.f = 1;
    }

    @SafeVarargs
    public knt(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.f = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(new kon(kom.class, cls));
        for (Class cls2 : clsArr) {
            amr.p(cls2, "Null interface");
            this.d.add(new kon(kom.class, cls2));
        }
    }
}
