package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjy extends jht {
    final /* synthetic */ Iterable a;
    final /* synthetic */ jei b;

    public jjy(Iterable iterable, jei jeiVar) {
        this.a = iterable;
        this.b = jeiVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new jke(this.a.iterator(), this.b);
    }
}
