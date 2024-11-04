package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ags {
    public final ArrayList a = new ArrayList();

    public final int a() {
        return this.a.size();
    }

    public final Object b() {
        return this.a.remove(a() - 1);
    }

    public final void c() {
        this.a.clear();
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final boolean e() {
        if (!d()) {
            return true;
        }
        return false;
    }

    public final void f(Object obj) {
        this.a.add(obj);
    }
}
