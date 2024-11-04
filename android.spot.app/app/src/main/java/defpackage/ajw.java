package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajw extends mlo implements Map, ajd {
    public static final ajw a = new ajw(akn.a, 0);
    public final akn b;
    public final int c;

    public ajw(akn aknVar, int i) {
        this.b = aknVar;
        this.c = i;
    }

    @Override // defpackage.mlo, java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return this.b.l(i, obj, 0);
    }

    @Override // defpackage.mlo
    public final int d() {
        return this.c;
    }

    public final ajw e(Object obj, Object obj2) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        akm d = this.b.d(i, obj, obj2, 0);
        if (d == null) {
            return this;
        }
        return new ajw(d.a, d() + d.b);
    }

    @Override // defpackage.mlo
    public final /* synthetic */ Collection f() {
        return new akk(this);
    }

    @Override // defpackage.mlo
    public final Set g() {
        return new akg(this);
    }

    @Override // defpackage.mlo, java.util.Map
    public Object get(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return this.b.k(i, obj, 0);
    }

    @Override // defpackage.mlo
    public final /* synthetic */ Set h() {
        return new aki(this);
    }
}
