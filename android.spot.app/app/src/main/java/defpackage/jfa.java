package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfa implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ kru b;

    public jfa(kru kruVar, CharSequence charSequence) {
        this.a = charSequence;
        this.b = kruVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.c(this.a);
    }

    public final String toString() {
        jen jenVar = new jen(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        jenVar.e(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
