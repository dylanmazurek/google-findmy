package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afx implements Iterable, aoj, mpq {
    public int b;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public HashMap i;
    public se j;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public ArrayList h = new ArrayList();

    public final int a(aav aavVar) {
        if (this.f) {
            abr.i("Use active SlotWriter to determine anchor location instead");
        }
        if (!aavVar.a()) {
            ael.a("Anchor refers to a group that was removed");
        }
        return aavVar.a;
    }

    public final afw b() {
        if (!this.f) {
            this.e++;
            return new afw(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending");
    }

    public final agb c() {
        if (this.f) {
            abr.i("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            abr.i("Cannot start a writer when a reader is pending");
        }
        this.f = true;
        this.g++;
        return new agb(this);
    }

    public final void d() {
        this.j = new se((byte[]) null);
    }

    public final void e() {
        this.i = new HashMap();
    }

    public final boolean f(aav aavVar) {
        int i;
        if (aavVar.a() && (i = afz.i(this.h, aavVar.a, this.b)) >= 0 && amr.i(this.h.get(i), aavVar)) {
            return true;
        }
        return false;
    }

    public final void g(int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList, HashMap hashMap, se seVar) {
        this.a = iArr;
        this.b = i;
        this.c = objArr;
        this.d = i2;
        this.h = arrayList;
        this.i = hashMap;
        this.j = seVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new acw(this, 0, this.b);
    }
}
