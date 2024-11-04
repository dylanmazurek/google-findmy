package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkw implements Iterable {
    public final List a;

    public dkw(List list) {
        this.a = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.a.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dkw b() {
        return new dkw(new ArrayList(this.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(dso dsoVar) {
        return this.a.contains(new dkv(dsoVar, dti.b));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public dkw() {
        this(new ArrayList(2));
    }
}
