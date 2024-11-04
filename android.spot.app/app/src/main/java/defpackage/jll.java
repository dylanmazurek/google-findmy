package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jll extends jlk {
    final /* synthetic */ jlm a;

    public jll(jlm jlmVar) {
        this.a = jlmVar;
    }

    @Override // defpackage.jlk
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.a();
    }
}
